package linkedlist.singlylinkedlist.socialmediafriendconnection;

public class Main {
    public static void main(String[] args) {
    	SocialMediaFriendConnection  network = new SocialMediaFriendConnection ();

        // Adding users
        network.addUser(1, "Alice", 22);
        network.addUser(2, "Bob", 24);
        network.addUser(3, "Charlie", 21);
        network.addUser(4, "Diana", 25);

        // Add friend connections
        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.addFriend(2, 3);
        network.addFriend(3, 4);

        // Display all friends of user
        System.out.println("Friends of User 1:");
        network.displayFriends(1);

        // Search user
        System.out.println("\nSearching for 'Charlie':");
        network.searchUser("Charlie");

        // Mutual Friends between 1 and 3
        System.out.println("\nMutual Friends between User 1 and 3:");
        network.mutualFriends(1, 3);

        // Remove friend
        System.out.println("\nRemoving friendship between User 1 and 2:");
        network.removeFriend(1, 2);
        network.displayFriends(1);

        // Count friends
        System.out.println("\nFriend counts:");
        network.countFriends();
    }
}
