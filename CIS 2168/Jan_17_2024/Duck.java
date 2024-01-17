package Jan_17_2024;

public class Duck {
    int age;
    String name;

    public Duck(int initAge, String name) {
        age = initAge;
        this.name = name;

    }

    void quack() {
        System.out.print("quack, quack!");

    }

    public String toString() {
        return "This is a duck named " + this.name + "\n" + "The duck's age is " + this.age;
    }
}
