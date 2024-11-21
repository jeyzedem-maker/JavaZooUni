public class Hummingbird extends Bird implements Flyable, Herbivore{


    public Hummingbird(String givenName, int age) {
        this(givenName, 0, true);
    }

    public Hummingbird(String givenname, int age, boolean isFemale) {
        setName(givenname);
        setAge(age);
        female = isFemale;
    }
    public void layEggs() {
        if (female) {
            if (children == null) {
                children = new Hummingbird[4];

                children[0] = new Hummingbird("Anna", 0, true);
                children[1] = new Hummingbird("Bertha", 0, true);
                children[2] = new Hummingbird("Cesar", 0, false);
                children[3] = new Hummingbird("Donald", 0, false);
            }
        } else System.out.println("Männliche Ducks können keine Eier legen");
    }

    public void eat(HerbivoreEatable food){
        System.out.println(getName() + " is slurping some " + food);
    }
    public void fly() {
        System.out.println("Flying");
    }
}
