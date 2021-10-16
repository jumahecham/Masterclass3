package SolucionReto3TALLER.SolucionReto3TALLER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@EntityScan(basePackages = {"model"})
@SpringBootApplication
public class SolucionReto3TallerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolucionReto3TallerApplication.class, args);
	}

}
