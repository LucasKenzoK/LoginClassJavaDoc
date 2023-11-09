
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LoginScreenTest {
	@Test
	public void testSuccesfulLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.login("john","password123"));
	}
	
	@Test
	public void testFailedLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertFalse(loginScreen.login("john","wrongPassowrd123"));
	}
	
	@Test
	public void testAddUser() {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.addUser("testuser","testpassword");
		assertTrue(loginScreen.login("testuser","testpassword"));
	}
}
