package DBL;

import Auth.ManagingUser;
import java.io.File;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {
        ManagingUser userObj = new ManagingUser("name", "username", "email", "98989898",
                "password", "managing");
        userObj.register();

    }
}
