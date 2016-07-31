package DAO.Interface;

import Model.Insurance;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface IInsurance {
    @Select("SELECT * FROM carwashservice.insurance WHERE id = #{id}")
    @ResultMap("insurance")
    Insurance getInsuranceById(Integer id);

    //void insertInsurance(Insurance insurance);
}
