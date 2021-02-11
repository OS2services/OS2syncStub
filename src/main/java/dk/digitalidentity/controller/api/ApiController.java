package dk.digitalidentity.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dk.digitalidentity.config.AppConfiguration;
import dk.digitalidentity.controller.api.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ApiController {

	@Autowired
	private AppConfiguration configuration;

	@GetMapping("/api/DtrId")
	public ResponseEntity<?> getUsers() {
		log.info("getUsers called");

		List<UserDTO> list = configuration.getTestData().getUsers();
		log.info("Found " + list.size() + " users with a DtrID");

		return ResponseEntity.ok(list);
	}
}
