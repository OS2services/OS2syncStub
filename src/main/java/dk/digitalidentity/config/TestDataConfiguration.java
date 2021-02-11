package dk.digitalidentity.config;

import java.util.List;

import dk.digitalidentity.controller.api.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestDataConfiguration {
	private List<UserDTO> users;
}
