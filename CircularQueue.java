class CircularQueue {
    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int count;

    public CircularQueue(int k) {
        queue = new int[k];
        head = 0;
        tail = -1;
        size = k;
        count = 0;
    }

    public boolean enqueue(int value) {
        if (count == size) {
            return false; // Queue is full
        }
        tail = (tail + 1) % size;
        queue[tail] = value;
        count++;
        return true;
    }

    public int dequeue() {
        if (count == 0) {
            throw new RuntimeException("Queue is empty"); // Queue is empty
        }
        int value = queue[head];
        head = (head + 1) % size;
        count--;
        return value;
    }

    public int front() {
        if (count == 0) {
            throw new RuntimeException("Queue is empty"); // Queue is empty
        }
        return queue[head];
    }

    public int rear() {
        if (count == 0) {
            throw new RuntimeException("Queue is empty"); // Queue is empty
        }
        return queue[tail];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        q.enqueue(4);
        System.out.println(q.front());
        System.out.println(q.rear());
    }
}
