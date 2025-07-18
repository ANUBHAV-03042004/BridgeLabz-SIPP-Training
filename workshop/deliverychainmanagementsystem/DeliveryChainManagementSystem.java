package deliverychainmanagementsystem;
import java.util.*;
public class DeliveryChainManagementSystem {
	    // Node class for linked list
	    public class Node {
	        String data;
	        Node next;

	        Node(String data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Linked list heads with descriptive names
	    Node packageContentsHead;
	    Node packageStatusHead;
	    Node packageIdHead;
	    Node packageCheckpointHead;

	    // Constructor
	    DeliveryChainManagementSystem() {
	        this.packageContentsHead = null;
	        this.packageStatusHead = null;
	        this.packageIdHead = null;
	        this.packageCheckpointHead = null;
	    }

	    // Add package content
	    public void addPackageContent(String content) {
	        Node newNode = new Node(content);
	        newNode.next = packageContentsHead;
	        packageContentsHead = newNode;
	    }

	    // Add package status
	    public void addPackageStatus(String status) {
	        Node newNode = new Node(status);
	        newNode.next = packageStatusHead;
	        packageStatusHead = newNode;
	    }

	    // Add package ID
	    public void addPackageId(String id) {
	        Node newNode = new Node(id);
	        newNode.next = packageIdHead;
	        packageIdHead = newNode;
	    }

	    // Add package checkpoint
	    public void addPackageCheckpoint(String checkpoint) {
	        Node newNode = new Node(checkpoint);
	        newNode.next = packageCheckpointHead;
	        packageCheckpointHead = newNode;
	    }

	    // Check order status by ID
	    public void checkOrderStatus(String userPackageId, String userName) {
	        Node idNode = packageIdHead;
	        Node statusNode = packageStatusHead;
	        boolean found = false;

	        while (idNode != null && statusNode != null) {
	            if (idNode.data.equals(userPackageId)) {
	                System.out.println(userName + ", your package with ID: " + idNode.data);
	                System.out.println("Status: " + statusNode.data);
	                found = true;

	                if (statusNode.data.equalsIgnoreCase("lost")) {
	                    Node idTemp = packageIdHead;
	                    Node checkpointTemp = packageCheckpointHead;

	                    while (idTemp != null && checkpointTemp != null) {
	                        if (idTemp.data.equals(userPackageId)) {
	                            System.out.println("Package was lost at checkpoint: " + checkpointTemp.data);
	                            break;
	                        }
	                        idTemp = idTemp.next;
	                        checkpointTemp = checkpointTemp.next;
	                    }
	                }
	                break;
	            }
	            idNode = idNode.next;
	            statusNode = statusNode.next;
	        }

	        if (!found) {
	            System.out.println("Your package was not found. It may be lost.");
	        }
	    }

	    // Check package checkpoint and contents
	    public void checkPackageDetails(String userPackageId) {
	        Node idNode = packageIdHead;
	        Node checkpointNode = packageCheckpointHead;
	        Node contentNode = packageContentsHead;

	        while (idNode != null && checkpointNode != null && contentNode != null) {
	            if (idNode.data.equals(userPackageId)) {
	                System.out.println("Package contains: " + contentNode.data);
	                System.out.println("Checkpoint: " + checkpointNode.data);
	                break;
	            }
	            idNode = idNode.next;
	            checkpointNode = checkpointNode.next;
	            contentNode = contentNode.next;
	        }
	    }

	    // Main method
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        DeliveryChainManagementSystem  tracker = new DeliveryChainManagementSystem ();

	        System.out.println("User: Enter your name:");
	        String userName = sc.nextLine();

	        System.out.println("User: Enter your package ID:");
	        String userPackageId = sc.nextLine();

	        System.out.println("Delivery Agent: Enter total number of packages:");
	        int totalPackages = sc.nextInt();
	        sc.nextLine(); // consume newline

	        while (totalPackages-- > 0) {
	            System.out.println("Enter package ID:");
	            String id = sc.nextLine();
	            tracker.addPackageId(id);

	            System.out.println("Enter package contents:");
	            String contents = sc.nextLine();
	            tracker.addPackageContent(contents);

	            System.out.println("Enter package status:");
	            String status = sc.nextLine();
	            tracker.addPackageStatus(status);

	            System.out.println("Enter package checkpoint:");
	            String checkpoint = sc.nextLine();
	            tracker.addPackageCheckpoint(checkpoint);
	        }

	        tracker.checkOrderStatus(userPackageId, userName);
	        tracker.checkPackageDetails(userPackageId);
	    }
	}