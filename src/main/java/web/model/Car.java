package web.model;

import org.springframework.stereotype.Component;



@Component
public class Car {
    private String brand;
    private String model;
    private int releaseYear;

    public Car() {
    }

    public Car(String brand, String model, int releaseYear) {
        this.model = model;
        this.brand = brand;
        this.releaseYear = releaseYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
