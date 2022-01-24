package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDockerApplication.class, args);
		System.out.println(checkIfInputIsAnEvenNumber(122));
		// Testing in the main method
	}
	public static boolean checkIfInputIsAnEvenNumber(int
			number){
		return number % 2 == 0;
	}
}

