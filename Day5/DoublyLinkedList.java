class DoublyLinkedList{
	ListNode head;
	ListNode tail;
	int length;
	
	class ListNode{
		int data;
		ListNode next;
		ListNode previous;
		
		ListNode(int data){
			this.data=data;
			
		}
		
	}
	DoublyLinkedList(){
		this.head=null;
		this.tail=null;
		this.length=0;
		
		
	}
	public boolean isEmpty(){
		
		return length==0;
	}
	
	public int length(){
		return length();
	}
	
	public void DisplayForward(){
		if (head== null){
			return;
			
		}
		ListNode temp=head;
		while (temp!=null){
			System.out.print(temp.data+"---->");
			temp=temp.next;
			
		} 
		System.out.println("null");
		
		
	}
	
	public void DisplayBackward(){
		if(tail==null){
			return;
		}
		ListNode temp=tail;
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.previous;
		}
		System.out.println("null");
	}
	
	
	public void InsertFirst(int value){
		ListNode NewNode=new ListNode(value);
		if(isEmpty()){
			tail=NewNode;
		}else{
			head.previous=NewNode;
			NewNode.next=head;
			head=NewNode;
			length++;
			
		}
		
		
	}

	public void InsertLast(int value){
		ListNode NewNode=new ListNode(value);
		if(isEmpty()){
			
			head=NewNode;
			
		}else{
			tail.next=NewNode;
			NewNode.previous=tail;
			
			tail=NewNode;
			length++;
		}
		
		
	}
	
	public ListNode deleteFirst(){
		if isEmpty(){
			throw new nosuchelementException();
		}
		ListNode temp=head;
		if (head==tail){
			tail=null;
		}
		else{
			head.next.previous=null;
		}
		head=head.next;
		temp.next=null;
		length--;
		return temp;
		
		
	}
	
	public ListNode deleteLat(){
		if isEmplty(){
			throw new noSuchElementFoundException;
		}
		ListNode temp=tail;
		if(head==tail){
			head =null;
		}
		else{
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
		length--;
		return temp;
		
	}
	

	public static void main(String args[]){
		
		DoublyLinkedList dl1=new DoublyLinkedList();
		dll.InsertFirst(1);
		dll.InsertFirst(5);
		dl1.InsertLast(5);
		dl1.InsertLast(1);
		//dll.DisplayForward();
		//dll.DisplayBackward();
		//dll.DisplayForward();
		//dl1.deleteFirst();
		//dl1.deleteFirst();
		//dl1.deleteFirst();
		//dl1.deleteFirst();
		dl1.deleteLast();
		dl1.deleteLast();
		dl1.deleteLast();
		dl1.deleteLast();
		dll.DisplayForward();
	}
	
	
	
	
}