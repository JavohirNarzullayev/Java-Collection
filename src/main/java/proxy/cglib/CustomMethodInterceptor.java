package proxy.cglib;/* 
 @author: Javohir
  Date: 3/20/2022
  Time: 1:51 PM*/

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.UserCustomReader;

import java.lang.reflect.Method;

public class CustomMethodInterceptor implements MethodInterceptor {
    private final UserCustomReader userCustomReader;
    public CustomMethodInterceptor(UserCustomReader userCustomReader) {
        this.userCustomReader=userCustomReader;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equals("talk")) System.out.println("Hello work cglib");
        return method.invoke(userCustomReader,args);
    }

    public static void main(String[] args) {
        UserCustomReader userCustomReader = new UserCustomReader();
        UserCustomReader proxy = (UserCustomReader) Enhancer.create(
                userCustomReader.getClass(),
                userCustomReader.getClass().getInterfaces(),
                new CustomMethodInterceptor(userCustomReader));
        proxy.talk();

    }
}
