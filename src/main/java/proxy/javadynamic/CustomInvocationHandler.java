package proxy.javadynamic;/*
 @author: Javohir
  Date: 3/20/2022
  Time: 1:27 PM*/

import proxy.Reader;
import proxy.UserCustomReader;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CustomInvocationHandler implements InvocationHandler {
    private final Reader reader;

    public CustomInvocationHandler(Reader original) {
        this.reader=original;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("talk")) {
            System.out.println("Hello");
        }else System.out.println("NO");

        return method.invoke(reader,args);
    }

    public static void main(String[] args) {
        Reader original=new UserCustomReader();
        ClassLoader classLoader = original.getClass().getClassLoader();
        Class<?>[] interfaces = original.getClass().getInterfaces();
        Reader proxyInstance=(Reader) Proxy.newProxyInstance(classLoader, interfaces,new CustomInvocationHandler(original));
        proxyInstance.talk();
    }
}
