public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("eko");
//        manager.name = "eko";
        manager.sayHello("Budi");

        var vp = new VicePresident("joko");
//        vp.name = "Joko";
        vp.sayHello("budi");
    }


}
