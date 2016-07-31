package DAO.Interface;

import Model.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface IUser {
    @Select("SELECT * FROM carwashservice.users where id = #{id}")
    @ResultMap("user")
    User getUserById(Integer id);

    //void insertUsers(User user);
}
