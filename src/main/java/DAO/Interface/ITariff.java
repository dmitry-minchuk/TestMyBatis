package DAO.Interface;

import Model.Tariff;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface ITariff {
    @Select("SELECT * FROM carwashservice.tariffs where id = #{id}")
    @ResultMap("tariff")
    Tariff getTariffById(Integer id);

    //void insertTariff(Tariff tariff);
}
