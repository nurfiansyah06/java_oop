package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("arif");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("VIP");
        System.out.println(level);

        Level[] levels = Level.values();
        System.out.println(levels);

        System.out.println("Print level");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
