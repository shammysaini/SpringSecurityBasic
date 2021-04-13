package springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import springboot.entity.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
