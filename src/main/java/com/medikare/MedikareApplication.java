package com.medikare;

// import java.util.HashSet;
// import java.util.Set;

// import com.medikare.model.Role;
// import com.medikare.model.User;
// import com.medikare.model.UserRole;
// import com.medikare.repository.RoleRepository;
// import com.medikare.services.UserService;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MedikareApplication implements CommandLineRunner{

	// @Autowired
    // private BCryptPasswordEncoder bCryptPasswordEncoder;

	// @Autowired
	// private RoleRepository roleRepository;

	// @Autowired
	// private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MedikareApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Role role1 = new Role();
		// role1.setId(1);
		// role1.setRole("ROLE_ADMIN");

		// Role role2 = new Role();
		// role2.setId(2);
		// role2.setRole("ROLE_USER");

		
		// roleRepository.save(role1);
		// roleRepository.save(role2);

		// User user = new User();
		// user.setEmail("admin@test.com");
		// user.setUsername("admin");
		// user.setPassword(this.bCryptPasswordEncoder.encode("admin"));
		// user.setFirstName("Mohd");
		// user.setLastName("Kaif");
     

		// Set<UserRole> roles = new HashSet<>();
		// UserRole roleAdmin = new UserRole();
		// roleAdmin.setRole(this.roleRepository.findById(1).get());
		// roles.add(roleAdmin);
		// roleAdmin.setUser(user);

		// userService.creatUser(user, roles);
		

	}

}
