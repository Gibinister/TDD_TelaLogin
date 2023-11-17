import static org.junit.Assert.*; 
import org.junit.Test;


public class TelaLoginTeste {
	@Test
	public void testSuccessfulLogin() {
		TelaLogin telaLogin = new TelaLogin();
		assertTrue(telaLogin.login("john","password123"));
	}
	@Test
	public void testFailedLogin() {
		TelaLogin telaLogin = new TelaLogin();
		assertFalse(telaLogin.login("john","wrongpassword"));
	}
	@Test
	public void testAddUser() {
		TelaLogin telaLogin = new TelaLogin();
		telaLogin.addUser("testuser","testpassword");
		assertTrue(telaLogin.login("testuser","testpassword"));
	}
}
