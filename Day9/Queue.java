class Queue
{
	int max=5;
	int Q[]=new int[max];
	int front, rear;
	
	Queue()
	{
		front=-1;
		rear=-1;
	}
	
	boolean isFull()
	{
		if (front==0 && rear==max-1){
			return true;
		}
		return false;
	}
	
	boolean isEmpty()
	{
		if (front==-1){
			return true;
		}
		return false;
	}
	
	void enqueue(int element){
		
		if (isFull()){
		System.out.println("queue is full!!!");	
		}
		else
		{
			//checking for first queue element
			if (front==-1){
				front=0;
			}
			rear++;
			Q[rear]=element;
			System.out.println("insertion done");
		}
	}
	
	int dequeue(){
		int element;
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		else{
			element =Q[front];
			if(front>rear){
				front=-1;
				rear=-1;
		}
		else{
			front++;
		}
		System.out.println("Delete element="+element);
		return element;
		}
	
	}
	
	void display()
	{
		for(int i=0;i<=rear;i++){
			System.out.println(Q[i]+" ");
		}
		System.out.println(rear+"=>Rear pointer");
		System.out.println(front+"=>Front pointer");
	}
	
	public static void main(String args[])
	{
		Queue q=new Queue();
		q.dequeue();
		q.display();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
	}
}
