public abstract class Bird extends Animal {
    private boolean female;

    public abstract void layEggs() throws MaleBirdsCannotLayEggsException;

    public boolean getFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public boolean isFemale() {
        return female;
    }

    public void flapWings(int flapCount) {
        for (int i = 0; i < flapCount; i++) {
            System.out.println("Flap");
        }
    }

}
