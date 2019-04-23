package com.javasampleapproach.springrest.mongodb;






import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.javasampleapproach.springrest.mongodb.controller.CustomerController;
import com.javasampleapproach.springrest.mongodb.model.Customer;
import com.javasampleapproach.springrest.mongodb.repo.CustomerRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRestMongoDbApplicationTests {

	@Test
	public void contextLoads() {
	}
    @Autowired
	private CustomerController cc;
    @MockBean
    private CustomerRepository cr;
   

    
    @Test
    public void getCustomersTest() {
    	when(cr.findAll()).thenReturn((List<Customer>) Stream.of(new Customer("rohit","rohit@gmail.com","frin222","1213456")).collect(Collectors.toList()));
    	assertEquals(1, cc.getAllCustomers().size());
    	System.out.println(cc.getAllCustomers().size());
    }
}

