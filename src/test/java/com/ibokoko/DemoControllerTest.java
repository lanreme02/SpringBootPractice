package com.ibokoko;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;



@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoControllerTest {

    @Autowired
    MockMvc mvc;

  // @Autowired
    @Mock
    MyRepository repo;

    ObjectMapper map = new ObjectMapper();

    /*

    // failed bcos of MocitoSpring Runner
    @Test
    public void testdemo() throws Exception {

     String result =   mvc.perform(get("/")).andReturn().getResponse().getContentAsString();

     ResultParam   param = map.readValue(result, new TypeReference<ResultParam>(){});

        ResultParam  actual = new ResultParam("lanre");

        assertThat(actual, is(param));
    }
*/
    @Test
    public void Mocking(){

        MyRepository repo = Mockito.mock(MyRepository.class);
        Mockito.when(repo.count()).thenReturn(10l);

        assertThat(10l,is(repo.count()));
        Mockito.verify(repo).count();
    }

    @Test
    public void Mock(){

        Mockito.when(repo.count()).thenReturn(10l);

        assertThat(10l,is(repo.count()));
        Mockito.verify(repo).count();
    }

}
