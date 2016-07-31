package DAO.Interface;

import Model.Car;

import java.util.List;

public interface ICar {
    List<Car> getCarByUser(Integer id);
    //void insertCars(Car car);
}
