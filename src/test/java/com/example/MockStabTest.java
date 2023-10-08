package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockStabTest {

    @Mock
    private Cat cat;
    @Mock
    private Dog dog;

    @Test
    public void test() {
        Mockito.when(cat.createHalfCat()).thenReturn(new Cat(2, "Я самый умный"));
        Mockito.when(dog.createHalfDog()).thenReturn(new Dog(2, "Я самый весёлый"));
// стаб, возвращающий половину кота с параметрами - 2 лапы, говорит "Я самый умный"
//        ...// стаб, возвращающий половину пса с параметрами - 2 лапы, говорит "Я самый весёлый"
        Cat halfCat = cat.createHalfCat();
        Dog halfDog = dog.createHalfDog();
        CatDog catDog = new CatDog(halfCat, halfDog);
        Assert.assertEquals(catDog.countLegs(2, 2), 4);
        Assert.assertEquals(catDog.getSound(), "Единственный в мире малыш Котопёс");
        //    ...// проверка, что у Котопса 4 лапы
        //      ...// проверка, что Котопёс говорит "Единственный в мире малыш Котопёс"
    }
}
