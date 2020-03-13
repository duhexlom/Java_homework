package Homework.Collection;

import Homework.Context.PetContext;
import Homework.Exception.PetException;
import Homework.Object.Person;
import Homework.Object.Pet;
import Homework.Sorting.Bubble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PetCollection implements Collection<Pet> {
    private List<Pet> petList;

    public PetCollection() {
        this.petList = new ArrayList<>();
    }

    @Override
    public int size() {
        return this.petList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.petList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.petList.contains(o);
    }

    @Override
    public Iterator<Pet> iterator() {
        return this.petList.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.petList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return this.petList.toArray(ts);
    }

    @Override
    public boolean add(Pet pet) {
        try {
            if (this.petList.get(pet.getId()) != null)
                throw new PetException();
        } catch (IndexOutOfBoundsException ignored) {
            this.petList.add(pet.getId(), pet);
        } catch (PetException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public Pet find(String petName) {
        for (Pet pet : this.petList) {
            if (pet.getName().equals(petName)) {
                return pet;
            }
        }
        return null;
    }

    public Pet find(Integer petId) {
        for (Pet pet : this.petList) {
            if (pet.getId().equals(petId)) {
                return pet;
            }
        }
        return null;
    }

    public Pet find(Person petOwner) {
        for (Pet pet : this.petList) {
            if (pet.getOwner().equals(petOwner)) {
                return pet;
            }
        }
        return null;
    }

    public void sortPet() {
        this.petList = new Bubble<Pet>().sort(this.petList, new PetContext());
        for(Pet pet : this.petList){
            System.out.println(pet);
        }
    }

    public void changPetById(Integer id, Person petOwner){
        this.find(id).setOwner(petOwner);
    }

    public void changPetById(Integer id, String petName){
        this.find(id).setName(petName);
    }

    public void changPetById(Integer id, Integer petWeight){
        this.find(id).setWeight(petWeight);
    }



    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }
}
