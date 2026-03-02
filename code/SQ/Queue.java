public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int n;

    public Queue(int n) {
        this.n = n;
        arr = new int[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int x) {
        if (size == n) {
            System.out.println("full");
        }
        rear = (rear + 1) % n;
        arr[rear] = x;
        size++;
    }

    public int dequeue() {
        if (isEmpty())

        {
            System.out.println("empty");
        }
        int value = arr[front];
        front = (front + 1) % n;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        return arr[front];
    }

    public int size() {
        return size;
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }

}
