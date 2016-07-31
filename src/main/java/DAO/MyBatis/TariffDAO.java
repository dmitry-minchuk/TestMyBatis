package DAO.MyBatis;

import DAO.Interface.ITariff;
import DAO.MyBatis.Utils.MyBatisConnection;
import Model.Tariff;
import org.apache.ibatis.session.SqlSessionFactory;

public class TariffDAO implements ITariff{
    final static String[] DESCRIPTION = {"100$ tariff", "150$ tariff", "200$ tariff"};

    private MyBatisConnection myBatisConnection = new MyBatisConnection();
    private SqlSessionFactory sqlSessionFactory;
    private ITariff tariffMapper;
    private Tariff tariff;
/*
    public void fillTariffTable(){
        for (int i=1; i <= DESCRIPTION.length; i++) {
            Tariff tariff = new Tariff();
            tariff.setId(i);
            tariff.setDescription(DESCRIPTION[i-1]);
            insertTariff(tariff);
        }
    }

    public void insertTariff(Tariff tariff){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        tariffMapper = sqlSessionFactory.openSession().getMapper(ITariff.class);
        tariffMapper.insertTariff(tariff);
    }
*/
    public Tariff getTariffById(Integer id){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        tariffMapper = sqlSessionFactory.openSession().getMapper(ITariff.class);
        tariff = tariffMapper.getTariffById(id);
        return tariff;
    }
}
