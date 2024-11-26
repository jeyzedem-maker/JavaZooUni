public class Chicken extends Bird implements Omnivore, CarnivorEatable {

    public Chicken[] children;

    public Chicken(String forceName, int forceAge) {
        this(forceName, forceAge, true);
    }

    public Chicken(String forceName, int forceAge, boolean isFemale) {
        setName(forceName);
        setAge(forceAge);
        setFemale(isFemale);
    }

    public void layEggs() {
        if (getFemale()) {
            if (children == null) {
                children = new Chicken[4];

                children[0] = new Chicken("Anna", 0, true);
                children[1] = new Chicken("Bertha", 0, true);
                children[2] = new Chicken("Cesar", 0, false);
                children[3] = new Chicken("Donald", 0, false);
            }
        } else System.out.println("Männliche Ducks können keine Eier legen");
    }

    public void listAllChildren() {
        if (children != null) {
            System.out.println(getName() + "s Kinder sind:");
            for (int i = 0; i < children.length; i++) {
                children[i].sayName();

            }
        }
    }

    public void bogBock(int bogCount) {
        for (int i = 0; i < bogCount; i++) {
            System.out.println("Bog");
        }
    }

    public void eat(Eatable food) {
        System.out.println("Eating: " + food);
    }
}
