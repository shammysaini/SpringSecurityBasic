package springboot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import springboot.entity.User;
import springboot.repository.UserRepository;



@Service
public class MyUserDetailsService implements UserDetailsService {
	 
	@Autowired
	UserRepository userRepository ;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User 404");
			
		}
		return new UserPrincipal(user);
		
	}

}
