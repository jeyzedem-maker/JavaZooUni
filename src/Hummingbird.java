public class Hummingbird extends Bird implements Flyable, Herbivore{
    public void eat(HerbivoreEatable food){
        System.out.println(getName() + " is slurping some " + food);
    }
    public void fly() {
        System.out.println("Flying");
    }
}
