package hw7;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> box = new ArrayList<>();

    public float getWeight() {
        float weight = 0.0f;
        for (T o : box) {
            weight += o.getWeight();
        }
        return weight;
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }


    public boolean compare(Box<?> anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }

    public void tasteFruit() {
        System.out.println(box.get(0).getClass());
    }

}
