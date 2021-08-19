package exOver_loadRide;

public class Human extends Animal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("Human: I want to eat all day\n");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Human: I want to sleep all day");
    }

    public static void main(String[] args) {
        Human ov = new Human();
        Animal or = new Animal();
        ov.eat();
        ov.sleep();

        System.out.println("\nAnimal class");
        or.eat();
        or.sleep();
    }
}
