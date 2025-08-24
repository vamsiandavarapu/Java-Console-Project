public class QueueArray {
    int front, rear, size;
    int[] Q1;

    QueueArray() {
        front = -1;
        rear = -1;
        size = 10;
        Q1 = new int[size];
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Overflow (Queue is full)");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        Q1[rear] = value;
    }

    int dequeue() {
        if (front == rear) {
            System.out.println("Underflow (Queue is empty)");
            return -1;
        }
        int value = Q1[front];
        front++;
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        return value;
    }

    void display() {
        if (front == -1) {
            System.out.println("Underflow (Queue is empty)");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(Q1[i] + " ");
        }
    }

    int peek() {
        if (front == -1) {
            System.out.println("Underflow (Queue is empty)");
            return -1;
        }
        return Q1[front];
    }

    boolean isEmpty() {
        return front == -1;
    }
}
