package Quiz_1;

public class House {
    public House() {
        System.out.print("h ");
    }

    public House(String name) {
        this();
        System.out.print("hm " + name);
    }

    public static void main(String[] args) {
        new House("x ");
    }

    class Building {
        public Building() {
            System.out.print("b ");
        }

        public Building(String name) {
            this();
            System.out.print("bn " + name);
        }
    }
}
