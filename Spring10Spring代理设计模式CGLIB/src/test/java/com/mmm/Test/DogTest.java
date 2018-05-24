package com.mmm.Test;

import com.mmm.Dao.Animal;
import com.mmm.Dao.Impl.Dog;
import com.mmm.Dao.cglibproxy.CglibProxy;

import org.junit.Test;

public class DogTest {


    @Test
    public void test(){
        CglibProxy cglibProxy =new CglibProxy();
        Animal dog= (Animal) cglibProxy.createProxy(new Dog().getClass());
        dog.eat();
        System.out.println("***************");
        dog.sleep();
    }
}
