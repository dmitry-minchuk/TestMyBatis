import DAO.MyBatis.UserDAO;
import Model.Car;
import Model.User;

public class Main {
    public static void main(String[] args) {
        //InitDB.init();
        UserDAO userDao = new UserDAO();
        int userId = 1;

        User user = userDao.getUserById(userId);

        System.out.println("User id is: " + user.getId());
        System.out.println("User name: " + user.getName());
        for (Car car : user.getCar()){
            System.out.println(car.getModel());
        }
        System.out.println(user.getTariff());
    }
}
