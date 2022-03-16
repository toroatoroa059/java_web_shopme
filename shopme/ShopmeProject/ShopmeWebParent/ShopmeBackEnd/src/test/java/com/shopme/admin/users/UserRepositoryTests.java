package com.shopme.admin.users;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.shopme.common.entity.Role;
import com.shopme.common.entity.User;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateWithOneRole() {
		User user = new User("hehe@gmail.com", "ali", "adam", "xxkfig20002");
		Role roleAdmin = new Role(9);
		user.addRoles(roleAdmin);
		
		User savedUser = repo.save(user);
		System.out.println(savedUser);
		assertThat(savedUser).isNotNull();
	}
	
	@Test
	public void testCreateWithNultipleRoles() {
		User user = new User("hehe2@gmail.com", "ali2", "adam2", "xxkfig20003");
		Role role1 = new Role(8);
		Role role2 = new Role(7);
		user.addRoles(role1, role2);
		
		User savedUser = repo.save(user);
		System.out.println(savedUser);
		assertThat(savedUser).isNotNull();
	}
	
}
