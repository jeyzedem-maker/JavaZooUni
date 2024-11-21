public abstract class Creature {
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge > 0) {
            age = newAge;
        }
    }
}
