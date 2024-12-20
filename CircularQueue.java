package Codeforces;
public  class CircularQueue {
    static int arr [] ;
    static int size;
    static int rear;
    static int front;
    CircularQueue(int n ){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }
    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    //Add :-
    public static void add(int  a){
        if(rear == front){
            System.out.println("Queue is full");
            return ;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1)%size;
        arr[rear] = a;
    }
    //Remove :-
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        if(front == rear){
            rear = front = -1;
        }
        else{
            front = (front + 1)%size;
        }
        return result;
    }
    //Peek ;-
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty :");
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
