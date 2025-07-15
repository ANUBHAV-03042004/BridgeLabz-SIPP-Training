package hashmapandlinkedlist.libraryorganizer;

public class Genre {
	 class linkedlist{
		 String data;
		 linkedlist next;
		 linkedlist(String data){
			 this.data=data;
			 this.next=null;
		 }
	 }
	 linkedlist head=null;
//		add genre
	 public void addgenre(String data) {
		 if(head==null) {
			 head=new linkedlist(data);
			 return;
		 }
		 linkedlist temp=head;
		 while(temp.next != null)temp=temp.next;
	linkedlist newNode= new linkedlist(data);
	temp.next=newNode;
	 }
	 public void getgenre()
	 {
		 linkedlist temp=head;
		while(temp!=null) {
			System.out.println("#"+temp.data);
			temp=temp.next;
	 }
	 }
	 public static void main(String args[]) {
		 Genre g=new Genre();
		 Book b=new Book();
		 g.addgenre("horror");
		 b.addBook("horror","1920");
		 b.addBook("horror","1921");
		 g.addgenre("comedy");
		 g.addgenre("sci-fi");
		 b.addBook("comedy","hera-pheri");
		 b.getbook("comedy");
		 b.getbook("horror");
		 g.getgenre();
	 }
}
