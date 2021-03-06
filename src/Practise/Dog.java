package Practise;

/**
 * its all about practise about dogs
 */
public class Dog {
    private String breed;
    private int age;
    private String color;
    private String dogType;

    public Dog(String breed, int age, String color, String dogType) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.dogType = dogType;
    }

    public void bark() {
        System.out.println("Barking Practise.Dog: Bow wow");
    }
    /*
    * function for overloading
    */
    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            bark();
        }
    }
    private void print() {
        System.out.println("Breed: " +breed);
        System.out.println("Age: " +age);
        System.out.println("color: " +color);
        System.out.println("dogType: " +dogType);
    }

    public static void main(String[] args) {
        Dog dg = new Dog("Desi", 5, "black", "stray");
        dg.print();
        dg.bark(3);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", dogType='" + dogType + '\'' +
                '}';
    }
}
/**/
