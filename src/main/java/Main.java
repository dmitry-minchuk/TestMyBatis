import DAO.MyBatis.UserDao;
import Model.User;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        int userId = 1;

        User user = userDao.getUserById(userId);

        System.out.println("User id is: " + user.getId());
        System.out.println("User name: " + user.getName());
        System.out.println(user.getCar());
        System.out.println(user.getTariff());
    }
}
