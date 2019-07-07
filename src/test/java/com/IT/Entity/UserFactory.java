package com.IT.Entity;

import com.IT.Utils.Utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
    static ResourceBundle resourceBundle;

    static {
        resourceBundle = ResourceBundle.getBundle("user");
    }

    public static User getValidUser() {
        return new User(resourceBundle.getString("userName"),
                resourceBundle.getString("pass"),
                resourceBundle.getString("email"));
    }

    public static User getRandomUser() {
        return new User(Utils.String.getRandom(15),
                Utils.String.getRandom(15),
                Utils.String.getRandom(12)+"@gmail.com");
    }

    public static List<User> getRandomUsers(int count) {
        return Stream.generate (UserFactory::getRandomUser)
                .limit(count)
                .collect(Collectors.toList());
    }
}
