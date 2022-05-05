class TwoStackInASingleArray
{
	int a[];
	int top1,top2;
	int size;
	
	TwoStackInASingleArray(int size)
	{
		a=new int[size];
		this.size=size;
		top1=-1;
		top2=size;
	}
	public boolean isEmpty()
	{
		if(top1==-1)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(top1=top2)
		{
			return true;
		}
		return false;
	}
	public void push1(int x)
	{
		if(isFull())
		{
			System.out.println("Overflow");
			return;
		}
		a[--top1]=x;
	}
	public void push2(int y)
	{
		if(isFull())
		{
			System.out.println("Overfloq");
			return;
		}
		a[--top2]=y;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.	println("Underflow");
			return;
		}
		int x = a[top1];
		System.out.println("Popped element from stack is "+x);
		top1++;
		return x;
	}
	
	public static void main(String args[])
	{
		
		TwoStackInASingleArray t = new TwoStackInASingleArray();
		t.push1(5);
		t.push2(10);
		t.push2(15);
		t.push1(11);
		t.push2(7);
		t.push2(40);
		t.pop(11);
		t.pop(40);
	}
	
}