package $package;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingControllerTest {

	@Test
	public void home() throws Exception {
		GreetingController controller = new GreetingController();
		Greeting greeting = controller.greeting("test");
		assertEquals(greeting.getContent(), "Hello, test!");
	}
}