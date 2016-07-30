package DAO.MyBatis;

import DAO.Interface.ITariff;
import DAO.MyBatis.Utils.MyBatisConnection;
import Model.Tariff;
import org.apache.ibatis.session.SqlSessionFactory;

public class TariffDAO implements ITariff{
    private MyBatisConnection myBatisConnection = new MyBatisConnection();
    private SqlSessionFactory sqlSessionFactory;
    private ITariff tariffMapper;
    private Tariff tariff;

    public Tariff getTariffById(Integer id){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        tariffMapper = sqlSessionFactory.openSession().getMapper(TariffDAO.class);
        tariff = tariffMapper.getTariffById(id);
        return tariff;
    }
}
