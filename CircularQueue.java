public class CircularQueue {
    int count;
    int size;
    int front;
    int rear;
    int[] q1;
    CircularQueue()
    {
        front=-1;
        rear=-1;
        count=0;
        size=3;
        q1=new int[size];
    }
    void insert(int val)
    {
        if(count==size)
        {
            System.out.println("Queue is full(Overflows)");
            return;
        }
        if(front==-1)
        {
            front=0;
            rear=0;
        }
        rear=(rear+1)%size;
        count++;
    }
    void delete()
    {
        if(count==0)
        {
            System.out.println("Queue is empty(underflow)");
            return;
        }
        System.out.println("Deleted element:"+q1[front]);
        if(front==rear)
        {
            front=rear=-1;
        }        
        else
        {
            front=(front+1)%size;
            count--;
        }
    }
    
}
