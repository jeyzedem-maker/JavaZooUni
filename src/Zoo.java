public class Zoo {
    /*    private Duck[] allDucks;
          private Ostrich[] allOstrich;
          private Chicken[] allChicken;
          private Duck freddyTheDuck;
          private Duck tinaTheDuck;
          private Ostrich gustelTheOstrich;
          private Ostrich ossiTheOstrich;
          private Chicken charlieTheChicken;
          private Chicken ciaraTheChicken; */
    Bird[] allBirds;

    public Zoo() {
        //Constructor für die Klasse Zoo
        allBirds = new Bird[35];
        allBirds[0] = new Duck("Freddy the Duck", 2, false);
        allBirds[1] = new Duck("Tina the Duck", 8);

        allBirds[2] = new Ostrich("Gustel the Ostrich", 10, false);
        allBirds[3] = new Ostrich("Ossi the Ostrich", 12);

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
        myZoo.letDucksHaveChildren();
    }

    public void listAllAnimals() {
        System.out.println("Zoo Animals:");
        for (int i = 0; i < allBirds.length; i++) {
            if (allBirds[i] != null) {
                allBirds[i].sayName();

            }
        }
    }

    public void letAllOstrichSayBuu() {
        for (int i = 0; i < allBirds.length; i++) {
            if (allBirds[i] instanceof Ostrich ostrich) {
                ostrich.runAround();
                System.out.println("-----------------");
            }
        }
    }

    public void letAllOstrichesRun() {
        for (int i = 0; i < allBirds.length; i++) {
            if (allBirds[i] instanceof Ostrich) {
                Ostrich ostrich = (Ostrich) allBirds[i];
                ostrich.runAround();
            }
        }
    }

    public void letAllFlyingBirdsFly() {
        for (int i = 0; i < allBirds.length; i++) {
            if (allBirds[i] instanceof Flyable) {
                Flyable flyingCreature = (Flyable) allBirds[i];
                flyingCreature.fly();
            }
        }
    }

    public void feedAllAnimals() {
        for (int i = 0; i < allBirds.length; i++) {
            if (allBirds[i] instanceof Hummingbird) {
                Hummingbird animalToFeed = (Hummingbird) allBirds[i];
                animalToFeed.eat(new FlowerNectar());
            } else if (allBirds[i] instanceof Herbivore) {
                Herbivore animalToFeed = (Herbivore) allBirds[i];
                animalToFeed.eat(new Grass());
            } else if (allBirds[i] instanceof Carnivore) {
                Carnivore animalToFeed = (Carnivore) allBirds[i];
                animalToFeed.eat(new Worm());
            } else if (allBirds[i] instanceof Omnivore) {
                Omnivore animalToFeed = (Omnivore) allBirds[i];
                animalToFeed.eat(new Worm());
            }
        }
    }

    public void letDucksHaveChildren() {
        for (int i = 0; i < allBirds.length; i++) {
            if (allBirds[i] instanceof Duck) {
                Duck currentDuck = (Duck) allBirds[i];
                currentDuck.layEggs();
                currentDuck.listAllChildren();
            }
        }
    }

}