package $package;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@EnableAutoConfiguration
public class GreetingController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "<h2>Welcome to zboot!</h2>" +
				"\n" +
				"Your " +
				"<a href=\"https://github.com/sabram/bootstart\">bootstart</a> generated project has started successfully";
	}

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public @ResponseBody Greeting greeting(
			@RequestParam(value="name", required=false, defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}

}