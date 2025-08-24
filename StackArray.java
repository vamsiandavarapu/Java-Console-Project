public class StackArray {
    int size = 10;
    int[] data;
    int top = -1;

    StackArray() {
        data = new int[size];
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    int getcount() {
        return top + 1;
    }

    void push(int value) {
        if (getcount() == data.length - 1) {
            System.out.println("Overflow (List full)");
            return;
        }
        data[++top] = value;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Underflow(list is empty)");
            return -1;
        }
        return data[top--];

    }

    void display() {
        if (top == -1) {
            System.out.println("underflow(List is Empty)");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i] + " ");
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Underflow(List is empty)");
            return -1;
        }
        return data[top];
    }

    void search(int ele) {
        if (isEmpty()) {
            System.out.println("Underflow(List is empty)");
            return;
        }
        for (int i = 0; i <= top; i++) {
            if (data[i] == ele) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
