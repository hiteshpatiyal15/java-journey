public class Person {

    private String name;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(String name) {
        this(); // calling Default constructor constructor chaining
        this.name = name;
        System.out.println("Parameterize constructor");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Hitesh");
    }

}
