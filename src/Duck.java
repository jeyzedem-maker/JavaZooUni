
public class Duck extends Bird implements Flyable, Omnivore {
    private static String speciesDescription =
            "It walks like a Duck and quaks like a duck";

    private Duck[] children;
    private Duck mother;

    public Duck(String givenName) {
        this(givenName, 0, true);
        // Alternative:
        // setName(givenName);
        // setAge(0);
    }

    public Duck(String givenName, int age) {
        this(givenName, age, true);
    }

    public Duck(String givenName, int age, boolean isFemale) {
        setName(givenName);
        setAge(age);
        setFemale(isFemale);
    }

    public Duck(String givenName, int age, boolean isFemale, Duck theMother) {
        setName(givenName);
        setAge(age);
        setFemale(isFemale);
        mother = theMother;
    }

    public void layEggs() throws MaleBirdsCannotLayEggsException {
        if (this.isFemale()) {
            if (children == null) {
                children = new Duck[4];

                children[0] = new Duck("Anna", 0, true, this);
                children[1] = new Duck("Bertha", 0, true, this);
                children[2] = new Duck("Cesar", 0, false, this);
                children[3] = new Duck("Donald", 0, false, this);
            }
        } else {
            throw new MaleBirdsCannotLayEggsException(
                    "Männliche Ducks können keine Eier legen"
            );
        }
    }

    public void printAncestors() {
        Duck currentAncestor = mother;

        while (currentAncestor != null) {
            System.out.println(currentAncestor.getName());
            currentAncestor = currentAncestor.mother;
        }
    }

    public void printAncestorsRecursive() {
        System.out.println(getName());
        if (mother != null) {
            mother.printAncestorsRecursive();
        }
    }

    public void listAllChildren() {
        System.out.println(getName() + "s Kinder sind:");
        if (children != null) {
            for (int i = 0; i < children.length; i++) {
                children[i].sayName();
            }
        }
    }

    public void eat(Eatable food) {
        System.out.println(getName() + " is eating " + food);
    }

    public void fly() {
        flapWings(4);
        System.out.println("I'm flying");
    }

    public void sayName() {
        System.out.println("Hi, my (quak) name is: " + getName());
    }

    public static void printSpeciesDescription() {
        System.out.println(speciesDescription);
    }

    public static void main(String[] args) {
        Duck tina = new Duck("Tina", 0, true);
        Duck anna = new Duck("Anna", 0, true, tina);
        Duck timo = new Duck("Timo", 0, false, anna);

        timo.printAncestorsRecursive();
    }

}
