package dk.digitalidentity.controller.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	private String uuid;
	private String ssn;
	private String userId;
	private String phone;
	private String email;
	private String dtrId;
}
