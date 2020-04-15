package fa.training.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import fa.training.model.User;
import fa.training.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
	
	@Mock
	private UserRepository userRepository;
	
	@InjectMocks 
	private UserService userService;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCreateUser() {
		User user = new User("test", "123456", "NVL");
		
		when(userRepository.save(user)).thenReturn(user);
		
		boolean actual = userService.createUser(user);
		
		assertTrue(actual);
	}

}
