import com.halen.controller.UserController;
import com.halen.entity.User;
import com.halen.entity.UserFather;
import com.halen.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("./com/halen/resource/application-context.xml");
        User user = context.getBean(User.class);
        /*System.out.println(user.getId());
        System.out.println(user.getName());
        UserFather userFather = context.getBean(UserFather.class);
        System.out.println(userFather.getFatherName());
        System.out.println(userFather.getUser().getName());
*/
        UserController userController = context.getBean(UserController.class);
        UserService userService = userController.getUserService();
        userService.say("Halen");
    }
}
