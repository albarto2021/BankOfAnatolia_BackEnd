package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankOfAnatoliaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankOfAnatoliaApplication.class, args);
	}

}


@Component
class DemoCommandLineRunner implements CommandLineRunner {

	@Autowired
	private RoleRepo roleRepo;

	@Override
	public void run(String... args) throws Exception {
		Role roleAdmin = new Role();
		roleAdmin.setName("ADMIN");
		roleRepo.save(roleAdmin);

		Role roleUser = new Role();
		roleUser.setName("USER");
		roleRepo.save(roleUser);
	}
}