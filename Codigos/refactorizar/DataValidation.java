package refactorizar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidation {

	public boolean validarEmail(String email) {
		if (email == null) {
			System.out.println("Email no puede ser nulo");
		} else {
			Pattern pattern = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}
		return false;
	}

	/*
	 * Este método valida un codigo postal. Es decir un numero entre 01000 y 52999:
	 */
	public boolean validarCP(String input) {
		if (input.length() == 5 && Integer.valueOf(input) >= 1000 && Integer.valueOf(input) <= 52999) {
			return true;
		} else {
			return false;
		}

	}
}