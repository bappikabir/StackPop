package nswitchois;

public class StackOverFlow {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(3);
        stack.push(5);

        System.out.println("popped " + stack.pop());
        System.out.println("popped " + stack.pop());
    }
}

class Stack<T> {

    int top;
    T[] elements;

    public Stack(int stackSize) {
        this.elements = (T[]) new Object[stackSize];     
        this.top = -1;
    }

    public void push(T value) {
        elements[++top] = value;     
        System.out.println(value);
    }

    public T pop() {
        if (top == -1) {
            return null;
        }
        return elements[top--];
    }

    public void clear() {
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            System.out.println(true);
        }
        return false;
    }

    public int size() {
        return top + 1;
    }
}
