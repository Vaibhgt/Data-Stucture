class Stack{
	static final int Max=10;
	int top;
	int s[]=new int[Max];
	
	Stack(){
		top=-1;// to intialize the top
		
	}
	// to check stack is empty
	boolean isEmpty(){
		return(top<0);
		
	}
	
	// to perform insertion opearion: Push
	boolean push(int x){
		if (top>=Max-1){
			System.out.println("Overflow !!!");
			return false;
		}
		else{
			s[++top]=x;
			System.out.println(x+"------>Push Operation!!!");
			return true;
		}
		}
		//to perform deletion opearation: POP
		int pop()
		{
		if (top <0)
		{
			System.out.println("Underflow");
			return 0;
		}
		else
		{
			int x=s[top--];
			return x;
	    }
	
}
//to get the current status of POP
int peek()
{
	if (top<0)
	{
		System.out.println("Underflow !!!");
		return 0;
	}
	else{
		int x=s[top];
		return x;
	}
}

public static void main(String args[]){
	Stack s1=new Stack();
	s1.push(10);
	s1.push(20);
	s1.push(30);
	System.out.println(s1.pop());
	System.out.println(s1.peek());
}
}
	
