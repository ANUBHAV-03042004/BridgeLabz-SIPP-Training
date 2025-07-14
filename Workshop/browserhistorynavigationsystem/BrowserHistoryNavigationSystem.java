package linkedlist.doublylinkedlist.browserhistorynavigationsystem;

public class BrowserHistoryNavigationSystem extends BrowserNavigation {
class Node{
	private String data;
	Node next,prev;
	Node(String data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	public String getdata() {
		return data;
	}
}

Node head=null;
@Override
public void addhistory(String data) {
	if(head==null)
	{
		Node history=new Node(data);
		head=history;
	}
	Node history=new Node(data);
	head.next=history;
	history.prev=head;
	head=history;
	showcurrenthistory();
}
@Override
public void backhistory() {
	if(head==null)
	{
		System.out.println("No history created");
	}
	head=head.prev;
	if(head.prev==null)
	{
		head=null;
		System.out.println("reached end");
	}
	else showcurrenthistory();
}
@Override
public void showcurrenthistory() {
	if(head==null) {
		System.out.println("No history created yet");
	}
	System.out.println(head.getdata());
}
public static void main(String args[]) {
	BrowserHistoryNavigationSystem history= new BrowserHistoryNavigationSystem ();
	history.addhistory("1st page");
	history.addhistory("2nd page");
	history.backhistory();
	history.backhistory();
	history.addhistory("1st page");
	
}
}
