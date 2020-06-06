package kr.ninesoft.myapplication;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
public class FooTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    Foo foo;

    @Test
    public void testF1() throws Exception {

        when(foo.f1()).thenReturn("hello!");
        String result = foo.f1();
        Assert.assertEquals("hello!", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme