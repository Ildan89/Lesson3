package fruits;

import java.util.*;

public class Box<F extends Fruit> {
    private ArrayList<F> fruits = new ArrayList<>();

    public void add(F ... fruits){
        Collections.addAll(this.fruits, fruits);
    }

    public void add(Collection<F> fruits) {
        this.fruits.addAll(fruits);
    }

    public void transferFruitsToBox(Box<F> box) {
        if(box != this){
            box.add(fruits);
            fruits = new ArrayList<>();
        }
    }

    public float getWeight() {
        //в общем случае фрукты весят по разному, поэтому просуммируем все веса
        OptionalDouble weight = fruits.stream().mapToDouble(F::getWeight).reduce(Double::sum);
        return weight.isPresent() ? (float) weight.getAsDouble() : 0;
    }

    public boolean compare(Box<?> box) {
        //Числа double и float нельзя сравнивать оператором ==
        float delta = 1E-3f;
        double difference = Math.abs(this.getWeight() - box.getWeight());
        return difference < delta;
    }

    public void printInfo() {
        if(fruits.size() == 0) {
            System.out.println("box is empty");
        } else {
            System.out.printf("In the box there are %s fruits. Weight = %s%n", fruits.size(), getWeight());
        }
    }

}
