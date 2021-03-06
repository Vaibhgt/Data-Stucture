class CQueue
{
	int max=7;
	int [] CQ=new int [max];
	int front,rear;
	CQueue()
	{
		rear=-1;
		front=-1;
	}
	
	boolean isFull()
	{
		if(front==0 && rear==max-1){
			return true;
		}
		if(front==rear+1){
			return true;
		}
		return false;
	}
	
	boolean isEmpty()
	{
		if(front==-1){
			return true;
		}
		return false;
			
	}
	
	void enqueue(int element){
		if (isFull())
			System.out.println("Queue is full");
		else
		{
			if(front==-1){
			front=0;
		}
		rear=(rear+1)%max;
		CQ[rear]=element;
		System.out.println(element+"Insertion done!!!");
		
	}
	}


	int dequeue(){
		int element;
		if (isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else{
			element=CQ[front];
			if (front==rear){
				front=-1;
				rear=-1;
			}
			else
			{
				front=(front+1)%max;
			}
			System.out.println("Deleted element ="+element);
			return element;
		}
	}
	
	void display()
	{
		for(int i=front;i<=rear;i=(i+1)%max)
		{
			System.out.println(CQ[i]);
		}
		System.out.println(rear+"=>Rear pointer");
		System.out.println(front+"=>Front pointer");
	
		
	}
	
	public static void main (String args[])
	{
		CQueue q=new CQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
		q.dequeue();
		q.display();
		
	}
}
	
