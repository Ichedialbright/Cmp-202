
public class Main{

    public static void main(String[] args) {
        CMP202 cmp202 = new CMP202();
        //cmp202.printUserDetails();

        Person person = new Person(); // Constructor(first method that gets called when you create an instance of a class
        person.setName("Albright");
//        System.out.println(person.getName());

        person.setPassword("123456");
//        System.out.println(person.getPassword());

        Physics physics = new Physics();
        System.out.println(physics.calculateVelocity(8, 4));
        System.out.println(physics.calculateVelocity(2,9,6));
    }
}