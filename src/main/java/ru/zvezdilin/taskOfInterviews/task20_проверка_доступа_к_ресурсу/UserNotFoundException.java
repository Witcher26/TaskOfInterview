package Home_Task_Netology.TwelveИсключения.ПроверкаДоступаКресурсу;

import java.io.IOException;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message );
    }
}
