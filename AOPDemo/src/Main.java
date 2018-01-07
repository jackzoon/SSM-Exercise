import jdkproxy.UserInvocationHandler;
import jdkproxy.UserService;
import jdkproxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        InvocationHandler handler = new UserInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), handler);

        userServiceProxy.calName("Halen");

    }

}
