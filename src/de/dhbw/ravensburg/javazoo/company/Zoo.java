package de.dhbw.ravensburg.javazoo.company;

import de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.*;
import de.dhbw.ravensburg.javazoo.classes.creature.plant.FlowerNectar;
import de.dhbw.ravensburg.javazoo.classes.creature.plant.Grass;
import de.dhbw.ravensburg.javazoo.classes.creature.animal.Worm;
import de.dhbw.ravensburg.javazoo.exeptions.MaleBirdsCannotLayEggsException;
import de.dhbw.ravensburg.javazoo.interfaces.*;

public class Zoo {
    /*    private de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.Duck[] allDucks;
          private de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.Ostrich[] allOstrich;
          private de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.Chicken[] allChicken;
          private de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.Duck freddyTheDuck;
          private de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.Duck tinaTheDuck;
          private de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.Ostrich gustelTheOstrich;
          private de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.Ostrich ossiTheOstrich;
          private de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.Chicken charlieTheChicken;
          private de.dhbw.ravensburg.javazoo.classes.creature.animal.bird.Chicken ciaraTheChicken; */
    Bird[] allBirds;

    public Zoo() {
        //Constructor für die Klasse de.dhbw.ravensburg.javazoo.company.Zoo
        allBirds = new Bird[35];
        allBirds[0] = new Duck("Freddy the Duck", 2, false);
        allBirds[1] = new Duck("Tina the Duck", 8);

        allBirds[2] = new Ostrich("Gustel the Ostrich", -5, false);
        allBirds[3] = new Ostrich("Ossi the Ostrich", 12, true);

        allBirds[4] = new Chicken("Charlie the Chicken", 2, false);
        allBirds[5] = new Chicken("Ciara the Chicken", 1);
    }

    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        System.out.println(" ----- Listing all animals -----");
        myZoo.listAllAnimals();
        System.out.println(" ----- Letting flying birds fly -----");
        myZoo.letAllFlyingBirdsFly();

        System.out.println(" ----- Feeding all animals -----");
        myZoo.feedAllAnimals();

        System.out.println(" ----- Let Ducks lay eggs -----");
        myZoo.letDucksHaveChildren();

    }

    public void listAllAnimals() {
        System.out.println("Zoo Animals:");
        for (Bird allBird : allBirds) {
            if (allBird != null) {
                allBird.sayName();

            }
        }
    }

    public void letAllOstrichSayBuu() {
        for (Bird allBird : allBirds) {
            if (allBird instanceof Ostrich ostrich) {
                ostrich.runAround();
                System.out.println("-----------------");
            }
        }
    }

    public void letAllOstrichesRun() {
        for (Bird allBird : allBirds) {
            if (allBird instanceof Ostrich ostrich) {
                ostrich.runAround();
            }
        }
    }

    public void letAllFlyingBirdsFly() {
        for (Bird allBird : allBirds) {
            if (allBird instanceof Flyable flyingCreature) {
                flyingCreature.fly();
            }
        }
    }

    public void feedAllAnimals() {
        for (Bird allBird : allBirds) {
            if (allBird instanceof Hummingbird animalToFeed) {
                animalToFeed.eat(new FlowerNectar());
            } else if (allBird instanceof Herbivore animalToFeed) {
                animalToFeed.eat(new Grass());
            } else if (allBird instanceof Carnivore animalToFeed) {
                animalToFeed.eat(new Worm());
            } else if (allBird instanceof Omnivore animalToFeed) {
                animalToFeed.eat(new Worm());
            }
        }
    }
    public void breedAllAnimals(){
        letDucksHaveChildren();
        letOstrichesHaveChildren();
    }

    public void letDucksHaveChildren() {
        for (Bird allBirds : allBirds) {
            if (allBirds instanceof Duck) {
                try {
                    Duck currentDuck = (Duck) allBirds;
                    currentDuck.layEggs();
                    currentDuck.listAllChildren();
                } catch (MaleBirdsCannotLayEggsException ex) {
                    System.out.println("Skipping " + allBirds.getName() + " as it is male");
                }

            }
        }
    }
    public void letOstrichesHaveChildren() {
        for (Bird allBird : allBirds) {
            if (allBird instanceof Ostrich currentOstrich) {
                currentOstrich.layEggs();
                currentOstrich.listAllChildren();
            }
        }
    }

}