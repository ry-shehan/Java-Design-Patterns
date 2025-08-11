package org.shehan.ry.singleton;

public class Dog {

    // 'volatile' ensures that changes to 'dog' are immediately visible to all threads,
    // preventing problems with threads seeing a partially created instance.

    private static volatile Dog dog;

    private Dog() {
    }

    public void barking() {
        System.out.println("Wof... Wof...");
    }

    public static Dog getInstance() {
        if (dog == null) {
            synchronized (Dog.class) {
                if (dog == null) {
                    dog = new Dog();
                }
            }
        }
        return dog;
    }

}
