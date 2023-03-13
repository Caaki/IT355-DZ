package com.dz2.Z1;

import com.dz2.Z1.models.Krug;
import com.dz2.Z1.services.KrugService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Z1Application {

	public static void main(String[] args) {

		System.out.println("Odgovor na pitanje sta je smisao zivota: " +args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Krug krug  = context.getBean("krug",Krug.class);
		KrugService krugService = context.getBean("krugService",KrugService.class);

		krugService.getKrug().setPoluprecnik(5);
		krugService.ispisiPovrsinu();
		krugService.ispisiObim();




	}

}
