package test.mock;

import mock.Jerry;
import mock.PowerMockTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ PowerMockTest.class})
public class JerryTest {
//    @Mock
//    Jerry jerry;

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: goHome()
     */
    @Test
    public void testGoHome() throws Exception {
        Jerry jerry = Mockito.mock(Jerry.class);
        Mockito.doCallRealMethod().when(jerry).goHome();
        Mockito.doCallRealMethod().when(jerry).doSomethingA();

        jerry.goHome();

        Mockito.verify(jerry,Mockito.times(1)).doSomethingA();
        Mockito.verify(jerry, Mockito.times(1)).doSomeThingB();
    }

@Test
public void testSpy() throws Exception {
        Jerry jerry = Mockito.spy(new Jerry());
        Mockito.when(jerry.go()).thenReturn(false);
    Assert.assertFalse(jerry.go());
    Mockito.doReturn(false).when(jerry).go();
    Assert.assertFalse(jerry.go());

}

    @Test
    public void testPrivateMethod() throws Exception {
        // 模拟 private的方法
        PowerMockTest spy = PowerMockito.spy(new PowerMockTest());
        PowerMockito.doReturn(3).when(spy, "private_method", 1);
        Assert.assertEquals(3, spy.test_private_method(1));
        PowerMockito.verifyPrivate(spy, Mockito.times(1)).invoke("private_method", 1);
    }

    /**
     * Method: doSomeThingB()
     */
    @Test
    public void testDoSomeThingB() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = Jerry.getClass().getMethod("doSomeThingB"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: doSomethingA()
     */
    @Test
    public void testDoSomethingA() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = Jerry.getClass().getMethod("doSomethingA"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
