
public abstract class Creature {
    private int age;

    // Accessors of attribute age
    // Akzessoren
    public int getAge() {
        return age;
    }

    public void setAge(int newAge) throws AgeMustBePositiveException {
        if (newAge >= 0) {
            age = newAge;
        } else {
            throw new AgeMustBePositiveException();
        }
    }
}
