package Homework.Test;

import Homework.Collection.PetCollection;
import Homework.Object.Person;
import Homework.Object.Pet;
import Homework.Object.Sex;
import org.junit.Test;

public class PetTest {
    @Test
    public void test() {

        PetCollection pets = new PetCollection();
        pets.add(new Pet(0, "Bobik", new Person("Anton", 21, new Sex(true)), 52));
        pets.add(new Pet(1, "Persik", new Person("Igor", 22, new Sex(true)), 12));
        pets.add(new Pet(2, "Gigok", new Person("Katya", 23, new Sex(false)), 20));
        pets.add(new Pet(2, "Gigok", new Person("Katya", 23, new Sex(false)), 20));
        pets.sortPet();
        pets.changPetById(2, "Pashtet");
    }
}
