package $package;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "<h2>Welcome to $artifactId!</h2>" +
				"\n" +
				"Your " +
				"<a href=\"https://github.com/sabram/bootstart\">bootstart</a> generated project has started successfully";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
}