package pack1;

public class Queue {
private int[] data;
private int head=-1;
private int tail=-1;
int numOfItems=0;


public int getNumOfItems() {
	return numOfItems;
}
public void setNumOfItems(int numOfItems) {
	this.numOfItems = numOfItems;
}
//initialize the queue
public void initializeQueue(int size)
{
	data=new int[size];
}
//inserting into Queue
public void insertElementQueue(int item)
{
	
	
	//if queue is empty
	if(isEmpty())
	{
		//tail++;
		data[++tail]=item;
		head++;
		numOfItems++;
	}
	//if queue is full
	else if(isFull())
	{
		throw new RuntimeException("Queue is Full cannot be inserted ");
	}
	//if queue is not empty and not full so inserting by incrementing head
	else
	{
		//tail++;
		data[++tail]=item;
		numOfItems++;
	}
	
}
//deleting elements from the Queue
public int deleteElementQueue()
{
//if queue is empty we cannot delete elements
	if(isEmpty())
	{
		throw new RuntimeException("Queue is Empty we cannot delete the elements");
	}
//if queue is not empty and inserting elements into it
	else
	{
		int ele;
		if(head==data.length-1)
		{
			ele=data[head];
			head=-1;
			numOfItems=0;
			return ele;
			
			
			
		}
		else
		{
		ele=data[head];
		head++;
		numOfItems--;
		return ele;
		}
		
	}
}
public boolean isEmpty()
{
	return numOfItems==0;
}
public boolean isFull()
{
	return numOfItems==data.length;
}
public void display()
{
	if(isEmpty())
	{
		System.out.println("Queue is Empty No elements to display");
	}
	for(int i=head;i<=tail;i++)
	{
		System.out.println(data[i]);
	}
}
}
