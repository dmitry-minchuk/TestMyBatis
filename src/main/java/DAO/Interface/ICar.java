package DAO.Interface;

import Model.Car;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ICar {
    @Select("SELECT * FROM carwashservice.cars where user = #{id}")
    @ResultMap("car")
    List<Car> getCarByUser(Integer id);

    //void insertCars(Car car);
}
