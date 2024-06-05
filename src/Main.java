import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Car", 1923);
        Car c2 = new Car("Car", 1912);
        Car c3 = new Car("Car", 1924);
        Car c4 = new Car("Car", 2013);
        Car c5 = new Car("Car", 1993);
        Car c6 = new Car("Car", 1951);
        Car c7 = new Car("Car", 2023);
        Car c8 = new Car("Car", 2000);
        Car c9 = new Car("Car", 2001);
        Car c10 = new Car("Car", 1999);

        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);


        Collections.sort(cars);
        for (Car o : cars)
            System.out.printf("%s, %d\n", o.name, o.productionYear);
    }
}