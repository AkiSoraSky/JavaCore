package collectionN_Generics;

import Practise.Dog;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Map<String, Dog> dogs = new HashMap<>();

        dogs.put("Tommy",new Dog("Indian",5,"Red","Stray"));
        dogs.put("kommy",new Dog("German Shephard",3,"brown","pet"));
        dogs.put("max",new Dog("Labrador",4,"silky white","pet"));

        int size = dogs.size();
        Dog Tommy = dogs.get("Tommy");
        Dog kommy = dogs.get("kommy");
        Dog max = dogs.get("max");

        System.out.println(size);
        System.out.println(Tommy);
        System.out.println(kommy);
        System.out.println(max);
    }
}
