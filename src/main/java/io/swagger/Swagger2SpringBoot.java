package io.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.model.VnfPackagesVnfPkgInfo;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages="io.swagger")
@EnableAutoConfiguration
@EnableSwagger2
@ComponentScan(basePackages = { "io.swagger", "io.swagger.api" , "io.swagger.configuration"})
public class Swagger2SpringBoot implements CommandLineRunner {

	
	@Autowired 
	VnfPackageRepository repo;
	
    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }
       
}
    @Bean
    CommandLineRunner initDatabase() {
    	
        return args -> {      
        /*VnfPackagesVnfPkgInfo first=new VnfPackagesVnfPkgInfo();
    	first.setUserDefinedData("hello");
    	first=repo.save(first);	*/};
}
}