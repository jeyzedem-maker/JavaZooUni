public class Ostrich extends Bird{
   // public Ostrich[] children;

    public Ostrich(String forceName, int forceAge){
        this(forceName,forceAge,true);
    }

    public Ostrich(String forceName, int forceAge, boolean isFemale){
        setName(forceName);
        setAge(forceAge);
        female = isFemale;
    }

    public void sayBuuu(int buuCount){
        for (int i = 0; i < buuCount; i++ ){
            System.out.println("Buuuuuu(ganz tiefe Laute)");
        }
    }
    public void layEggs() {
        if (female) {
            if (children == null) {
                children = new Ostrich[4];

                children[0] = new Ostrich("Anna", 0, true);
                children[1] = new Ostrich("Bertha", 0, true);
                children[2] = new Ostrich("Cesar", 0, false);
                children[3] = new Ostrich("Donald", 0, false);
            }
        } else System.out.println("Männliche Ducks können keine Eier legen");
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
