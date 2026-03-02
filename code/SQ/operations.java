public class Stack
{
    private int[] arr;
    private int top;
    privte int n;

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
        }
        arr[top++] = x;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("empty");
        }
        return arr[top--];
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("empty");
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
}