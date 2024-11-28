package de.dhbw.ravensburg.javazoo.classes.creature.animal;

import de.dhbw.ravensburg.javazoo.classes.creature.Creature;

public abstract class Animal extends Creature {
    private String name;

    public void sayName() {
        System.out.println("Hi, my name is: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (name == null) {
            name = newName;
        }
    }

    public String toString() {
        return "[name: " + name + ", age: " + getAge() + "]";
    }

}
