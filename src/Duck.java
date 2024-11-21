public class Duck extends Bird implements Flyable, Omnivore{
    private static String speciesDescription =
            "It walks like a Duck and quaks like a duck";

    private boolean female;
    private Duck[] children[];

    public Duck(String givenName) {
        this(givenName, 0, true);
        // Alternative:
        // setName(givenName);
        // setAge(0);
    }

    public Duck(String givenName, int age) {
        this(givenName,0,true);
    }
    public Duck(String givenname, int age, boolean isFemale){
        setName(givenname);
        setAge(age);
        female = isFemale;
    }

    public void layEggs() {
        if (female) {
            if (children == null) {
                children = new Duck[4];

                children[0] = new Duck("Anna", 0,true);
                children[1] = new Duck("Bertha", 0, true);
                children[2] = new Duck("Cesar", 0, false);
                children[3] = new Duck("Donald", 0, false);
            }
        }else System.out.println("Männliche Ducks können keine Eier legen");
    }
    public void listAllChildren(){
        System.out.println(getName() + "s Kinder sind:");
        for (int i = 0; i < children.length; i++){
            children[i].sayName();
        
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

