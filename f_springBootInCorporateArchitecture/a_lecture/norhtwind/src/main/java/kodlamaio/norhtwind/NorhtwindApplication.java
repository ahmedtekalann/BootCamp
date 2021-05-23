package kodlamaio.norhtwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

@EnableSwagger2 //controllerı bulup apileri bulup dokumente ederek bizim kullanmamızı sagliyor.

public class NorhtwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorhtwindApplication.class, args);
		
		
	}
	
	//uyg ıcındekı apileri bulup bizim test edebileceghimiz hale geliyor
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("kodlamaio.norhtwind"))           
                                   
          .build();                                           
    }

}
