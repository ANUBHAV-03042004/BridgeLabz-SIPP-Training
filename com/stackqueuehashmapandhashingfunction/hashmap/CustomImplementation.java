// implement hashmap 
package stackqueuehashmapandhashingfunction.hashmap;
public class CustomImplementation
{
    public class Node{
        String key;
        int value;
        Node next;
        Node(String key,int value){
            this.key=key;
            this.value=value;
            this.next=null;
        }
    }
    Node head=null;
    final int size=16;
    Node bucket[]=new Node [size];
    
    public int getindex(String key)
    {
        // System.out.println(key.hashCode());
        return Math.abs(key.hashCode()) % size;
    }
    public void put(String key,int value)
    {
        int index=getindex(key);
        System.out.println(index);
        head=bucket[index];
        while(head!=null)
        {
            if(head.key.equals(key))
            {
                head.value=value;
                return;
            }
            head=head.next;
        }
        Node newNode=new Node(key,value);
        newNode.next=bucket[index];
        bucket[index]=newNode;
    }
    public int get(String key)
    {
        int index=getindex(key);
          System.out.println(index);
        head=bucket[index];
        while(head!=null)
        {
            if(head.key.equals(key)) return head.value;
        head=head.next;
        }
        return Integer.MIN_VALUE;
    }
    public boolean containsKey(String key)
    {
         int index=getindex(key);
           System.out.println(index);
        head=bucket[index];
        
      while(head!=null)
      {
          if(head.key.equals(key)) return true;
         head=head.next;
      }
      return false;
    }
    public boolean containsValue(String key,int value)
    {
         int index=getindex(key);
           System.out.println(index);
        head=bucket[index];
        while(head!=null)
        {
            if(head.value==value) return true;
        head=head.next;
        }
        return false;
    }
    public void remove(String key)
    {
         int index=getindex(key);
           System.out.println(index);
        head=bucket[index];
        Node prev=null;
        while(head!=null)
        {
            if(head.key.equals(key))
            {
               if(prev==null) bucket[index]=head.next;
               else prev.next=head.next;
               return;
            }
            prev=head;
            head=head.next;
        }
        
    }
    public void display(String key)
    {
        int index=getindex(key);
        head=bucket[index];
        while(head!=null)
        {
            System.out.println("data - "+head.value);
            head=head.next;
        }
    }
	public static void main(String[] args) {
		CustomImplementation hmap=new CustomImplementation();
		hmap.put("aks",21);
		hmap.put("divyansh",23);
	System.out.println("my value is "+ hmap.get("aks"));
	System.out.println("contains aks "+hmap.containsKey("aks"));
		System.out.println("contains aks value "+hmap.containsValue("aks",21));
				hmap.remove("divyansh");
		hmap.display("aks");
		
		
	}
}
