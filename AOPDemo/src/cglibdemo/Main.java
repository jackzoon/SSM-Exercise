package cglibdemo;

import net.sf.cglib.proxy.Enhancer;

public class Main {

    public static void main(String[] args) {

        CglibProxy proxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(proxy);

        UserServiceImpl userService = (UserServiceImpl) enhancer.create();
        userService.calName("Halen  CGLIB");
    }
}
