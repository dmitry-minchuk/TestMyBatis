package DAO.MyBatis;

import DAO.Interface.ICar;
import DAO.MyBatis.Utils.MyBatisConnection;
import Model.Car;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CarDAO implements ICar{
    private MyBatisConnection myBatisConnection = new MyBatisConnection();
    private SqlSessionFactory sqlSessionFactory;
    private ICar carMapper;
    private List<Car> carList;

    public List<Car> getCarByUser(Integer id){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        carMapper = sqlSessionFactory.openSession().getMapper(ICar.class);
        carList = carMapper.getCarByUser(id);
        return carList;
    }
}
