public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("arep", "pekalongan");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("budi");

        Person person2 = new Person("budi", "jakarta");
        Person person3;
        person3 = new Person("joko", "cirebon");
    }
}
