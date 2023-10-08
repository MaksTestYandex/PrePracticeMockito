package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class MockTest {
    @Mock
    private Cat cat;
    @Mock
    private Dog dog;

    @Test
    public void test() {
        Cat halfCat = cat.createHalfCat();
        Dog halfDog = dog.createHalfDog();
        Mockito.verify(cat, Mockito.times(1)).createHalfCat();
        Mockito.verify(dog, Mockito.times(1)).createHalfDog();

    }
}
