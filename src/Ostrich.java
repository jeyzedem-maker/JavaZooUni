public class Ostrich extends Bird{

    public Ostrich(String forceName, int forceAge){
        setName(forceName);
        setAge(forceAge);
    }

    public void sayBuuu(int buuCount){
        for (int i = 0; i < buuCount; i++ ){
            System.out.println("Buuuuuu(ganz tiefe Laute)");
        }
    }
    public void runAround(){
        System.out.println(getName() + " is running around");
    }
    public  void sayName(){
        System.out.println("Hello my name (Buuuu) is: " + getName());
    }

    public void eat(HerbivoreEatable food){
        System.out.println(getName() + "is eating " + food + ". Yum!");
    }
}
