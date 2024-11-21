public class Duck extends Bird implements Flyable, Omnivore {
    private static final String speciesDescription =
            "It walks like a Duck and quaks like a duck";

    // private final boolean female;
    //public boolean female;
    private Duck[] children;
    public Duck mother;

   public Duck(String givenName){
        this(givenName, 0);
    }
    public Duck(String givenName, int age) {
        this(givenName, 0, true);
        // Alternative:
        // setName(givenName);
        // setAge(0);
    }

    public Duck(String givenName, int age, boolean isFemale) {
        this(givenName,age, isFemale, null);
    }

    public Duck(String givenname, int age, boolean isFemale, Duck theMother) {
        setName(givenname);
        setAge(age);
        setFemale(isFemale);
        mother = theMother;
    }

    public void layEggs() {
        if (getFemale()) {
            if (children == null) {
                children = new Duck[4];

                children[0] = new Duck("Anna", 0, true, this);
                children[1] = new Duck("Bertha", 0, true, this);
                children[2] = new Duck("Cesar", 0, false, this);
                children[3] = new Duck("Donald", 0, false, this);
            }
        } else System.out.println("Männliche Ducks können keine Eier legen");
    }

    public void printAncestors() {
        Duck currentAncestor = mother;

        while (currentAncestor != null){
            System.out.println(currentAncestor.getName());
            currentAncestor = currentAncestor.mother;
        }
    }

    public void printAncestorRecursive(){
        System.out.println(getName());
        if (mother != null) {
            mother.printAncestorRecursive();
        }
    }

    public void listAllChildren() {
        if (children != null) {
            System.out.println(getName() + "s Kinder sind:");
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
}

