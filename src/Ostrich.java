
public class Ostrich extends Bird implements Herbivore {
    private boolean female;
    private Ostrich[] children;

    public Ostrich(String givenName, int i, boolean b) {
        setName(givenName);
        setAge(0);
        setFemale(true);
    }

    public void listAllChildren() {
        if (children != null) {
            System.out.println(getName() + "s Kinder sind:");
            for (int i = 0; i < children.length; i++) {
                children[i].sayName();

            }
        }
    }


    public void layEggs() {
        if (female) {
            if (children == null) {
                children = new Ostrich[1];

                children[0] = new Ostrich("Aurelia", 12, false);
            }
        } else {
            System.out.println("Männliche Ostriches können keine Eier legen");
        }
    }

    public void eat(HerbivoreEatable food) {
        System.out.println(getName() + " is eating " + food + ". Yum!");
    }

    public void runAround() {
        System.out.println(getName() + " is running around");
    }









}
