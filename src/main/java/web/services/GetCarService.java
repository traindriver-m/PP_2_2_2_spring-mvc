package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.LinkedList;
import java.util.List;

@Component
public class GetCarService implements CarService {

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Car("Mitsubishi", "Pajero", 2005));
        cars.add(new Car("Toyota", "Corolla", 1992));
        cars.add(new Car("Hyundai", "Santa Fe", 2011));
        cars.add(new Car("Jeep", "Cheroke", 2000));
        cars.add(new Car("Lada", "Granta", 2018));
        if (count == null || count > cars.size()) {
            count = cars.size();
        }
        return cars.stream().limit(count).toList();
    }
}
