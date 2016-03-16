package gdsh.controller.login;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gdsh.dto.login.LoginDto;

@RestController
@RequestMapping(value = "login")
public class LoginController {

	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
	produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST, value = "submitInfo")
	public ResponseEntity<LoginDto> loginInfo(@RequestBody LoginDto loginDto) {

		
		ResponseEntity<LoginDto> response = null;
		
		if (loginDto != null && loginDto.getUsername() != null){
			System.out.println("Good Request");
			System.out.println(loginDto);
			response = new ResponseEntity<LoginDto> (loginDto, HttpStatus.ACCEPTED);
		}else{
			System.out.println("Bad Request");
			System.out.println(loginDto);
			response = new ResponseEntity<LoginDto>(loginDto,HttpStatus.BAD_REQUEST);
		}
		
		return response;
	}

}
