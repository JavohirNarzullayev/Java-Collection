package object;/* 
 @author: Javohir
  Date: 5/5/2022
  Time: 12:56 AM*/

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(LocalDate.of(1990, 1, 10), "User", "Test");
        User user2 = new User(LocalDate.of(1990, 1, 10), "User", "Test");
        User user3 = new User(LocalDate.of(1992, 3, 20), "User", "Test");
        System.out.println(user2.hashCode());
        System.out.println(user1.hashCode());


        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        System.out.println(userSet.size());

        Map<User, String> users = new HashMap<>();
        users.put(user1, user1.getFirstName());
        users.put(user2, user2.getFirstName());
        users.put(user3, user3.getFirstName());

        System.out.println(users.get(user1));
        System.out.println(users.size());
        System.out.println(user1.equals(user2));
    }


}
