public class Stack {

    private String[] elements;
    private int top;
    private static final int INI_NUM = 5;

    public Stack() {
        elements = new String[INI_NUM];
        top = 0;
    }

    public Stack(int num) {
        elements = new String[num];
        top = 0;
    }

    public boolean isEmpty() {
        if(top == 0)
            return true;
        return false;
    }

    public String peek() {
        return elements[top - 1];
    }

    public String pop() {
        if(!isEmpty()){
            String a = elements[top - 1];
            elements[top - 1] = null;
            top --;
            return a;
        }
        else
            return "Stack underflow";
    }

    public void push(String element) {
        if(top != INI_NUM)
            elements[top] = element;
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for (int i = 0; i < top; i++) {
            System.out.printf("%s ", elements[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push("10");
        stack.push("20");
        stack.push("30");
        stack.push("40");
        stack.push("50");
        stack.printStack();
    }
}
