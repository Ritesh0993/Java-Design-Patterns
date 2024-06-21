package com.ritesh.designpatterns.creational.builder;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		//Client has to provide director with concrete builder
		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);
	}
	
	/**
	 * This method serves the role of director in builder pattern. 
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
			   .withAddress(user.getAddress())
			   .withBirthday(user.getBirthday())
			   .build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ganesh");
		user.setLastName("Patil");
		Address address = new Address();
		address.setHouseNumber("804");
		address.setStreet("D Y Patil");
		address.setCity("Pune");
		address.setState("Maharashtra");
		address.setZipcode("412101");
		user.setAddress(address);
		return user;
	}
}
