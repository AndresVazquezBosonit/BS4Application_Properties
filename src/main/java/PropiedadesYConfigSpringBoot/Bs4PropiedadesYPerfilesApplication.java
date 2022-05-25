package PropiedadesYConfigSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Bs4PropiedadesYPerfilesApplication {
	@Autowired
	ServiceClass serviceClass;


	public static void main(String[] args) {
		SpringApplication.run(Bs4PropiedadesYPerfilesApplication.class, args);
	}

	@PostConstruct
	public void init(){
    System.out.println(serviceClass);
	}


}
