public class Main {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[6];
        numbers[0] = 2;
        //comment
        numbers[1] = 8;
        numbers[2] = 10;
        numbers[3] = 12;
        numbers[4] = 2;
        numbers[5] = 1;
        Duck freddyTheDuck = new Duck("Bärbel", numbers[0]);
        Duck tinaTheDuck = new Duck("Tina", numbers[1]);
        Ostrich gustelTheOstrich = new Ostrich("Gustel", 10);
        Ostrich ossiTheOstrich = new Ostrich("Ossi", 12);
        Chicken charlieTheChicken = new Chicken("Charlie", 2);
        Chicken ciaraTheChicken = new Chicken("Ciara", 1);

        ossiTheOstrich.flapWings(2);
        freddyTheDuck.sayName();
        System.out.println("Freddy is so viele Jahre alt: " + freddyTheDuck.getAge());
        tinaTheDuck.sayName();
        System.out.println("Tina ist so viele Jahre alt: " + tinaTheDuck.getAge());
        gustelTheOstrich.sayName();
        System.out.println("Gustel ist so viele Jahre alt: " + gustelTheOstrich.getAge());
        ossiTheOstrich.sayName();
        System.out.println("Ossi ist so viele Jahre alt: " + ossiTheOstrich.getAge());
        charlieTheChicken.sayName();
        System.out.println("Charlies Alter: " + charlieTheChicken.getAge());
        ciaraTheChicken.sayName();
        System.out.println("Ciara ist so viele Jahre alt: " + ciaraTheChicken.getAge());


    }


}
