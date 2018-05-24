package com.mmm.Test;

import com.mmm.bean.Animal;
import com.mmm.bean.AnimalProxy;
import com.mmm.bean.Dog;
import org.junit.Test;

public class DogTest {


    @Test
    public void test(){
        AnimalProxy proxy =new AnimalProxy();
        Animal dog = (Animal) proxy.crrateProxy(new Dog());
        dog.eat();
        System.out.println("**********");
        dog.sleep();

    }
}
