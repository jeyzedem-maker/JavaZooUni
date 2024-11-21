public class Chicken extends Bird implements Omnivore, CarnivorEatable{
    public Chicken(String forceName,int forceAge){
        setName(forceName);
        setAge(forceAge);
    }
    public void bogBock(int bogCount){
        for (int i = 0; i < bogCount; i++ ){
                System.out.println("Bog");
        }
    }

    public void eat(Eatable food) {
        System.out.println("Eating: " + food);
    }
}
