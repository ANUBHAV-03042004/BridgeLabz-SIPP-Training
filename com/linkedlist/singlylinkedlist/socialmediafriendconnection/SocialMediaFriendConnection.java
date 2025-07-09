package linkedlist.singlylinkedlist.socialmediafriendconnection;
import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friends;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }
}

public class SocialMediaFriendConnection {
    private User head;

    public void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    private User findUser(int id) {
        User current = head;
        while (current != null) {
            if (current.userId == id) return current;
            current = current.next;
        }
        return null;
    }

    public void addFriend(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 != null && u2 != null && !u1.friends.contains(id2)) {
            u1.friends.add(id2);
            u2.friends.add(id1);
        }
    }

    public void removeFriend(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            u1.friends.remove((Integer) id2);
            u2.friends.remove((Integer) id1);
        }
    }

    public void mutualFriends(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 == null || u2 == null) return;

        Set<Integer> set = new HashSet<>(u1.friends);
        set.retainAll(u2.friends);
        System.out.println("Mutual Friends: " + set);
    }

    public void displayFriends(int id) {
        User user = findUser(id);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friends);
        }
    }

    public void searchUser(String keyword) {
        User current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(keyword) || String.valueOf(current.userId).equals(keyword)) {
                System.out.println("User Found: " + current.name + " ID: " + current.userId);
                return;
            }
            current = current.next;
        }
        System.out.println("User not found.");
    }

    public void countFriends() {
        User current = head;
        while (current != null) {
            System.out.println(current.name + " has " + current.friends.size() + " friends.");
            current = current.next;
        }
    }
}
