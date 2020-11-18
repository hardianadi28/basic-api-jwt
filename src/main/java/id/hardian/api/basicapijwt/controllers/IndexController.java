package id.hardian.api.basicapijwt.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/version")
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "API Version 0.0.1-SNAPSHOT";
	}

}
