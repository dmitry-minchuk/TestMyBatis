package DAO.MyBatis;

import DAO.Interface.ICar;
import DAO.MyBatis.Utils.MyBatisConnection;
import Model.Car;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CarDAO implements ICar{
    final static String[] CARS = {"Mercedes", "BMW", "Audi", "Peugeot", "Bentley", "Ferrari", "Mazeratti", "Volga"};
    final static int[] USER_ID = {1, 2, 3, 1, 5, 4, 3, 2};
    final static int[] INSURANCE_ID = {1, 2, 3, 4, 5, 6, 7, 8};

    private MyBatisConnection myBatisConnection = new MyBatisConnection();
    private SqlSessionFactory sqlSessionFactory;
    private ICar carMapper;
    private List<Car> carList;
/*
    public void fillCarsTable(){
        for (int i=1; i <= CARS.length; i++) {
            Car car = new Car();
            car.setId(i);
            car.setModel(CARS[i-1]);
            car.setInsurance_id(INSURANCE_ID[i-1]);
            car.setUser_id(USER_ID[i-1]);
            insertCars(car);
        }
    }

    public void insertCars(Car car){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        carMapper = sqlSessionFactory.openSession().getMapper(ICar.class);
        carMapper.insertCars(car);
    }
*/
    public List<Car> getCarByUser(Integer id){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        carMapper = sqlSessionFactory.openSession().getMapper(ICar.class);
        carList = carMapper.getCarByUser(id);
        return carList;
    }
}
