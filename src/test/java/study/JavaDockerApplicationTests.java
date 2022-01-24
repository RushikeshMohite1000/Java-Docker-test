package study;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaDockerApplicationTests {
	
	@Test
	public void testInputIsEven(){
		assertTrue(JavaDockerApplication.checkIfInputIsAnEvenNumber(22)); //Assertion
		}

}
