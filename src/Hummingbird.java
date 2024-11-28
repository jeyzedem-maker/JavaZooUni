
public class Hummingbird extends Bird implements Flyable, Herbivore {
    private Hummingbird[] children;

    public Hummingbird(String givenName) {
        setName(givenName);
        setAge(0);
    }

    public void layEggs() {
        if (this.isFemale()) {
            if (children == null) {
                children = new Hummingbird[1];

                children[0] = new Hummingbird("Flatterelia");
            }
        } else {
            System.out.println("Männliche Hummingbirds können keine Eier legen");
        }
    }

    public void fly() {
        flapWings(7);
        System.out.println(getName() + " flys now");
    }

    public void eat(HerbivoreEatable food) {
        System.out.println(getName() + " is slurping some " + food);
    }




}
