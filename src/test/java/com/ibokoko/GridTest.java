package com.ibokoko;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GridTest {

   @Autowired
    Grid grid;

   @MockBean
   DemoController contr;

   @Autowired
   ApplicationContext cxt;

    @Test
    public void kit(){
      // Grid grid = new Grid();

                   Yammer yam = Mockito.mock(Yammer.class);
        grid.setYammer(yam);

       Mockito.when(yam.test("lanre")).thenReturn("hello");
       assertThat(yam.test("lanre"),is("hello"));

    }

    @Test
    public void MockBean(){
      //  Grid grid = new Grid();

       // Yammer yam = Mockito.mock(Yammer.class);
       // grid.setYammer(yam);

        Mockito.when(contr.getname()).thenReturn("hello");

        DemoController contr = cxt.getBean(DemoController.class);
        assertThat("hello",is(contr.getname()));

    }
}
