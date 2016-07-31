package DAO.MyBatis;

import DAO.Interface.IInsurance;
import DAO.MyBatis.Utils.MyBatisConnection;
import Model.Insurance;
import org.apache.ibatis.session.SqlSessionFactory;

public class InsuranceDAO implements IInsurance{
    final static String[] COST = {"250$", "500$", "150$", "30$", "600$", "1500$", "1100$", "4000$"};
    final static String[] EXP_DATE = {"01-2017", "12-2015", "05-2017", "01-2016",
                                      "08-2015", "12-2018", "09-2017", "06-2016"};

    private MyBatisConnection myBatisConnection = new MyBatisConnection();
    private SqlSessionFactory sqlSessionFactory;
    private IInsurance insuranceMapper;
    private Insurance insurance;
/*
    public void fillInsuranceTable(){
        for (int i=1; i <= COST.length; i++) {
            Insurance insurance = new Insurance();
            insurance.setId(i);
            insurance.setCost(COST[i-1]);
            insurance.setExp_date(EXP_DATE[i-1]);
            insertInsurance(insurance);
        }
    }

    public void insertInsurance(Insurance insurance){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        insuranceMapper = sqlSessionFactory.openSession().getMapper(IInsurance.class);
        insuranceMapper.insertInsurance(insurance);
    }
*/
    public Insurance getInsuranceById(Integer id){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        insuranceMapper = sqlSessionFactory.openSession().getMapper(IInsurance.class);
        insurance = insuranceMapper.getInsuranceById(id);
        return insurance;
    }
}
