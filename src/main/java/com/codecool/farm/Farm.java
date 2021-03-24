package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import com.codecool.farm.animal.Pig;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Animal> animals = new ArrayList<>();

    Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        List<Animal> temp = new ArrayList<>();
        for (Animal a : this.animals) {
            if (butcher.canButcher(a)) {
                temp.add(a);
            }
        }
        animals.removeAll(temp);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    List<String> getStatus() {
        ArrayList<String> animalString = new ArrayList<>();
        for (Animal a : this.animals) {
            animalString.add("There is a " + a.getSize() + " sized "  + (a instanceof Pig ? "pig" : "cattle") +
                    " in the farm.");
        }
        return animalString;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

}
