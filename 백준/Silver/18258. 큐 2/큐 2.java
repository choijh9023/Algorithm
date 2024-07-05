import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private int[] que;
    private int capacity;
    private int front;
    private int num;
    private int rear;

    public Main(int capacity) {
        this.capacity = capacity;
        que = new int[capacity];
        front = 0;
        num = 0;
        rear = 0;
    }

    public void push(int x) {
        if (num >= capacity) {
            return; // 큐가 가득 찬 경우 예외 처리 대신 무시
        }
        que[rear++] = x;
        if (rear == capacity) {
            rear = 0;
        }
        num++;
    }

    public int pop() {
        if (num <= 0) return -1;
        int result = que[front++];
        if (front == capacity) {
            front = 0;
        }
        num--;
        return result;
    }

    public int size() {
        return num;
    }

    public int empty() {
        return num == 0 ? 1 : 0;
    }

    public int front() {
        if (num <= 0) return -1;
        return que[front];
    }

    public int back() {
        if (num <= 0) return -1;
        int lastIndex = (rear - 1 + capacity) % capacity;
        return que[lastIndex];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());
        Main que = new Main(2000000);
        for (int i = 0; i < n; i++) {
            String order = bf.readLine();
            StringTokenizer st = new StringTokenizer(order);
            String command = st.nextToken();
            
            switch (command) {
                case "push":
                    int value = Integer.parseInt(st.nextToken());
                    que.push(value);
                    break;
                case "pop":
                    output.append(que.pop()).append("\n");
                    break;
                case "size":
                    output.append(que.size()).append("\n");
                    break;
                case "empty":
                    output.append(que.empty()).append("\n");
                    break;
                case "front":
                    output.append(que.front()).append("\n");
                    break;
                case "back":
                    output.append(que.back()).append("\n");
                    break;
            }
        }
        System.out.print(output.toString());
    }
}
