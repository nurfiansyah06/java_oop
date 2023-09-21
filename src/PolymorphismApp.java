public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("arif");
        employee.sayHello("budi");

        employee = new Manager("eko");
        employee.sayHello("budi");

        employee = new VicePresident("arif");
        employee.sayHello("budi");

        sayHello(new Employee("arif"));
        sayHello(new Manager("arif"));
        sayHello(new VicePresident("arif"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP" + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
