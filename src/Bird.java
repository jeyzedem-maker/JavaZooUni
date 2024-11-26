public abstract class Bird extends Animal {
    public boolean getFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public boolean isFemale() {
        return female;
    }

    private boolean female;
    public Bird[] children;

    public abstract void layEggs();

    public void flapWings(int flapCount) {
        for (int i = 0; i < flapCount; i++) {
            System.out.println("Flap");
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
}
