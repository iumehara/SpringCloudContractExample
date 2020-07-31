package hello;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProducerApplication.class)
public abstract class BaseClass {
    @Autowired
    PersonController personController;

    @MockBean
    PersonService personService;

    @Before
    public void setUp() {
        standaloneSetup(personController);

        Mockito.when(personService.findPersonById(1L))
                .thenReturn(new Person(1L, "foo", "bar"));
    }
}
