package SingletonDesignPattern;

public class Test {
    public static void main(String[] args) {
        Person p1 = Person.getInstance();
        p1.setPid(100);
        p1.setName("Mubin");
        p1.setAddress("Mohakhali 67/2");
        p1.setEmail("uic.mubin@gmail.com");

        System.out.println("P1 address "+p1.hashCode());
        System.out.println(p1);

        System.out.println("------------------------------>-----------------------");
        Person p2 = Person.getInstance();
        p2.setPid(200);
        p2.setName("Kubin");
        p2.setAddress("Dhanmondi 32");
        p2.setEmail("kic.kubin@gmail.com");


        System.out.println("P2 address "+p2.hashCode());
        System.out.println(p2);




    }
}
