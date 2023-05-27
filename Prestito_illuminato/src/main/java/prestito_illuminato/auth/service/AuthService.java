package prestito_illuminato.auth.service;

import prestito_illuminato.auth.payload.LoginDto;
import prestito_illuminato.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
