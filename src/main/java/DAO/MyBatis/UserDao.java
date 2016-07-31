package DAO.MyBatis;

import DAO.Interface.IUser;
import DAO.MyBatis.Utils.MyBatisConnection;
import Model.User;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserDAO implements IUser{
    final static String[] USERS = {"John Doe", "Ann Smith", "Morgan Freeman",
                                   "Just Bob", "Mickhael Jackson"};
    final static int[] TARIFF_ID = {1, 2, 1, 2, 3};

    private MyBatisConnection myBatisConnection = new MyBatisConnection();
    private SqlSessionFactory sqlSessionFactory;
    private IUser userMapper;
    private User user;
/*
    public void fillUsersTable(){
        for (int i=1; i <= USERS.length; i++) {
            User user = new User();
            user.setId(i);
            user.setName(USERS[i-1]);
            user.setTariff_id(TARIFF_ID[i-1]);
            insertUsers(user);
        }
    }

    public void insertUsers(User user){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        userMapper = sqlSessionFactory.openSession().getMapper(IUser.class);
        userMapper.insertUsers(user);
    }
*/
    public User getUserById(Integer id){
        sqlSessionFactory = myBatisConnection.getSqlSessionFactory();
        userMapper = sqlSessionFactory.openSession().getMapper(IUser.class);
        user = userMapper.getUserById(id);
        return user;
    }
}
