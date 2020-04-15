package fa.training.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import fa.training.model.User;
import fa.training.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
class Test {

	private User user ;
	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserServiceImpl userServiceImpl;

	@Before
	public void setUp() throws Exception {
		user = new User("test", "123456", "NVL");

		user.setId(1);

		when(userRepository.save(user)).thenReturn(new User());

	}

	@org.junit.jupiter.api.Test
	public void testCreateUser() {

		boolean actual = userServiceImpl.createUser(user);

		assertTrue(actual);
	}

}
