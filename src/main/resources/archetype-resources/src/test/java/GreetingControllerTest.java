package $package;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingControllerTest {

	@Test
	public void home() throws Exception {
		GreetingController controller = new GreetingController();
		String msg = controller.home();
		assertTrue(msg.contains("Welcome"));
	}
}