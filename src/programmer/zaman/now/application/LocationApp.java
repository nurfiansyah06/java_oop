package programmer.zaman.now.application;

import programmer.zaman.now.data.City;
import programmer.zaman.now.data.Location;
import programmer.zaman.now.util.MathUtil;

public class LocationApp {
    public static void main(String[] args) {
//        var location  = new Location(); ERROR
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);

        System.out.println(MathUtil.sum(1,2,3));
    }
}
