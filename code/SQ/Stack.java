public class Stack
{
    private int[] arr;
    private int top;
    private int n;

    public Stack(int size)
    {
        n = size;
        arr = new int[n];
        top = -1;
    }
    public void push(int x)
    {
        if(top == n - 1)
        {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return -1;
        }
        return arr[top--];
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public int size()
    {
        return top + 1;
    }
    public static void main(String[] args)
    {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}