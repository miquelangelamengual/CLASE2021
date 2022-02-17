package es.hulk.entorns.refactors.magicnumbers_03;

import java.util.Random;


public class PasswordGenerator {

    public String generatePassword(int length) throws Exception {
        if (length < 6 || length > 15) {
            throw new Exception("Wrong password length: " + length);
        } else {
			Random random = new Random();
			String characters = "abcdefghijkmnopqrstuvwxyz23456789";
            String password = "";

            for (int i = 0; i < length; i++) {
                password += characters.charAt(random.nextInt(characters.length()));
            }

            return password;
        }
    }
}
