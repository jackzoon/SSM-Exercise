package jdkproxy;

public class UserServiceImpl implements UserService {

    @Override
    public void calName(String name) {
        System.out.println(name);
    }
}
