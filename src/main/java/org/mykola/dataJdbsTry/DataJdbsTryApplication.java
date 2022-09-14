package org.mykola.dataJdbsTry;

import org.mykola.dataJdbsTry.domain.BlockedSite;
import org.mykola.dataJdbsTry.repository.BlockedSitesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataJdbsTryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJdbsTryApplication.class, args);
//		ApplicationContext ctx = SpringApplication.run(DataJdbsTryApplication.class, args);
//		BlockedSitesRepository repository = ctx.getBean(BlockedSitesRepository.class);
//		repository.save(new BlockedSite("https://telegram.org/"));
//		repository.save(new BlockedSite("https://azure.microsoft.com/"));
	}

}
