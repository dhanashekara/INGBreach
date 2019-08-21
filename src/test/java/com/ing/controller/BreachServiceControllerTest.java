/*
 * package com.ing.controller;
 * 
 * import static org.mockito.Mockito.when; import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * 
 * import org.junit.Before; import org.junit.Test; import
 * org.junit.runner.RunWith; import org.mockito.Mock; import
 * org.mockito.junit.MockitoJUnitRunner; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.web.WebAppConfiguration; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders; import
 * org.springframework.test.web.servlet.setup.MockMvcBuilders; import
 * org.springframework.web.context.WebApplicationContext;
 * 
 * import com.ing.dto.BreachDTO; import com.ing.service.BreachService;
 * 
 * import junit.framework.TestCase;
 * 
 * @RunWith(MockitoJUnitRunner.class)
 * 
 * @ContextConfiguration(classes = { TestCase.class, BreachController.class })
 * 
 * @WebAppConfiguration public class BreachServiceControllerTest {
 * 
 * @Autowired private MockMvc mvc;
 * 
 * @Autowired private WebApplicationContext context;
 * 
 * @Mock private BreachService breachService;
 * 
 * BreachDTO breachDTO;
 * 
 * @Before public void setup() { this.mvc =
 * MockMvcBuilders.webAppContextSetup(context).build();
 * 
 * breachDTO = new BreachDTO(); breachDTO.setUserId(12345L); }
 * 
 * @Test public void createBreachTest() throws Exception {
 * 
 * // when(breachService.createBreach(breachDTO)).
 * thenReturn("Breach Created and your breach tracking id is ");
 * mvc.perform(MockMvcRequestBuilders.get("/user/breach")).andExpect(status().
 * isOk());
 * 
 * ResponseEntity<Product> result = productController.addProduct(productDto);
 * assertEquals(expResult, result); }
 * 
 * }
 */