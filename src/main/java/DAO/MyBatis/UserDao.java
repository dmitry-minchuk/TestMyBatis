package DAO.MyBatis;

import DAO.Interface.IUser;
import DAO.MyBatis.Utils.MyBatisConnection;
import Model.User;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserDao implements IUser{
    private MyBatisConnection myBatisConnection = new MyBatisConnection();
    private SqlSessionFactory sqlSessionFactory;
    private IUser userMapper;
    private User user;

    public User getUserById(Integer id){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        userMapper = sqlSessionFactory.openSession().getMapper(IUser.class);
        user = userMapper.getUserById(id);
        return user;
    }
}
