package DAO.MyBatis;

import DAO.Interface.IInsurance;
import DAO.MyBatis.Utils.MyBatisConnection;
import Model.Insurance;
import org.apache.ibatis.session.SqlSessionFactory;

public class InsuranceDAO implements IInsurance{
    private MyBatisConnection myBatisConnection = new MyBatisConnection();
    private SqlSessionFactory sqlSessionFactory;
    private IInsurance insuranceMapper;
    private Insurance insurance;

    public Insurance getInsuranceById(Integer id){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        insuranceMapper = sqlSessionFactory.openSession().getMapper(IInsurance.class);
        insurance = insuranceMapper.getInsuranceById(id);
        return insurance;
    }
}
