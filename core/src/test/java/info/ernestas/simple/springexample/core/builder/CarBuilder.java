package info.ernestas.simple.springexample.core.builder;

import info.ernestas.simple.springexample.core.model.Car;

public class CarBuilder {

    private Car car = new Car();

    public CarBuilder() {
        car.setId(1);
        car.setName("Mazda Premacy");
    }

    public static CarBuilder init() {
        return new CarBuilder();
    }

    public Car build() {
        return car;
    }

    public CarBuilder withId(Integer id) {
        car.setId(id);
        return this;
    }

    public CarBuilder withName(String name) {
        this.car.setName(name);
        return this;
    }
}
