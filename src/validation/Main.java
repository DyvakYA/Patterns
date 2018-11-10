package validation;

import validation.validators.UserValidationImpl;

/**
 * Created by User on 5/31/2018.
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setName(null);
        user.setDescription("marcus");

        new UserValidationImpl().validate(user);

    }
}
