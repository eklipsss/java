public class lab6 {
    public static class MyStack {
        private int capacity;
        private int top;
        private int[] arr;

        public MyStack(){
            capacity = 5;
            top = -1;
            arr = new int[capacity];
        }
        public boolean is_full(){
            return top == capacity - 1;
        }
        public boolean is_empty(){
            return top == -1;
        }

        public void push(int x){
            if(is_full()){
                int[] buf_arr = new int[capacity*2];
                System.arraycopy(arr, 0, buf_arr, 0, arr.length);
                arr = buf_arr;
            }
            arr[++top] = x;
            System.out.println("  push: " + x);
        }

        public int pop(){
            if(is_empty()){
                System.out.println("Invalid operation - stack is empty!");
                return -1;
            }
            int x = arr[top--];
            System.out.println("  pop: " + x);
            return x;
        }

        public int peek(){
            if(is_empty()){
                System.out.println("Invalid operation - stack is empty!");
                return -1;
            }
            return arr[top];
        }

        public void print_stack(){
            if(is_empty())
                System.out.println("Stack is empty!");
            else {
                System.out.println("Stack: ");
                for (int i = 0; i <= top; i++) {
                    System.out.println(" elem[" + i + "] = " + arr[i]);
                }
            }
        }

    }
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.print_stack();

        stack.push(7);
        stack.push(15);
        stack.push(2);
        stack.print_stack();


        int del_elem = stack.pop();
        System.out.println("deleted element: " + del_elem);
        stack.print_stack();

        stack.pop();
        int top_elem = stack.peek();
        System.out.println("top element: " + top_elem);

        stack.pop();
        stack.print_stack();

        stack.pop();
    }

}
