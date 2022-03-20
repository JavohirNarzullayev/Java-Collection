package proxy;/*
 @author: Javohir
  Date: 3/20/2022
  Time: 1:23 PM*/


import proxy.javadynamic.CustomInvocationHandler;

import java.lang.reflect.Proxy;

public class UserCustomReader implements Reader {


    @Override
    public void talk() {
        System.out.println("Bla bla");
    }


}
