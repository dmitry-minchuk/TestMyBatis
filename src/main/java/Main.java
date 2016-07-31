import DAO.MyBatis.UserDAO;
import Model.User;

public class Main {
    public static void main(String[] args) {
        //InitDB.init();
        UserDAO userDao = new UserDAO();
        int userId = 1;

        User user = userDao.getUserById(userId);

        System.out.println("User id is: " + user.getId());
        System.out.println("User name: " + user.getName());
        System.out.println(user.getCar());
        System.out.println(user.getTariff());
    }
}
