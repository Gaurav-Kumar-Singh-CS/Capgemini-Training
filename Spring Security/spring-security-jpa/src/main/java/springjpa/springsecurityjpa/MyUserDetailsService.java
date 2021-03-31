package springjpa.springsecurityjpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import springjpa.springsecurityjpa.model.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService{
@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUserName(userName);
	user.orElseThrow(()-> new UsernameNotFoundException("not found"));
		return user.map(MyUserDetails::new).get();
	}

}
