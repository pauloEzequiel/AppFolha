package br.edu.infnet.appfolha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class AppfolhaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AppfolhaApplication.class, args);
	}

}
