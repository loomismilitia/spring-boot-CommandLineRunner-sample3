package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootCommandLineRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCommandLineRunnerApplication.class, args);
	}
}

@Component
class SampleDataCLR implements CommandLineRunner {

	private final UserRepository userRepository;

	public SampleDataCLR(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
		Stream.of("Simon", "Loomis", "Suicmez").forEach(u -> userRepository.save(new User(u)));
		userRepository.findAll().forEach(System.out::println);
	}
}


