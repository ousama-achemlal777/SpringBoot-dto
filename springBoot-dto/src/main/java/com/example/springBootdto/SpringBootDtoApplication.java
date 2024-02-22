package com.example.springBootdto;

import com.example.springBootdto.model.Location;
import com.example.springBootdto.model.User;
import com.example.springBootdto.repository.LocationRepository;
import com.example.springBootdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDtoApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LocationRepository locationRepository;
	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Rabat");
		location.setDescription("Rabat city");
		location.setLongitude(40.05);
		location.setLatitude(55.7);
		locationRepository.save(location);

		User user1 = new User();
		user1.setEmail("oussama.achemlal7@gmail.com");
		user1.setLastName("ach");
		user1.setFirstName("oussama");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setEmail("ahmed.achemlal7@gmail.com");
		user2.setLastName("ach");
		user2.setFirstName("ahmed");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);


	}
}
