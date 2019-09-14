package pack1;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.initializeQueue(5);
		//q.deleteElementQueue();
		q.insertElementQueue(7);
		q.insertElementQueue(5);
		q.insertElementQueue(6);
		//System.out.println("The Number of items in queue   "+q.getNumOfItems());
		
		q.insertElementQueue(7);
		q.insertElementQueue(8);
		//q.insertElementQueue(10);
		q.display();
		
		

	}

}
