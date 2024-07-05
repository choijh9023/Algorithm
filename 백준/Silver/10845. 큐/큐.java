

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private int[] que; // 큐용 배열
    private int capacity; // 큐 용량
    private int front; // 맨 앞의 요소 커서
    private int rear; // 맨 뒤의 요소 커서
    private int num; // 현재 데이터 개수

    // 생성자: 큐의 용량을 초기화하고 배열을 생성
    public Main(int capacity) {
        this.capacity = capacity;
        que = new int[capacity];
        front = 0;
        rear = 0;
        num = 0;
    }

    public void push(int x) throws IllegalStateException {
        if (num >= capacity) {
            throw new IllegalStateException("Queue is full");
        }
        que[rear++] = x;
        if (rear == capacity) {
            rear = 0;
        }
        num++;
    }

    public int pop() {
        if (num <= 0) return -1;
        int value = que[front++];
        if (front == capacity) {
            front = 0;
        }
        num--;
        return value;
    }

    public int front() {
        if (num <= 0) return -1;
        return que[front];
    }

    public int size() {
        return num;
    }

    public int empty() {
        return num == 0 ? 1 : 0;
    }

    public int back() {
        if (num <= 0) return -1;
        int idx = (rear == 0) ? capacity - 1 : rear - 1;
        return que[idx];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Main queue = new Main(10000); // 큐의 용량을 충분히 크게 설정

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String commandLine = bf.readLine();
            StringTokenizer st = new StringTokenizer(commandLine);
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int value = Integer.parseInt(st.nextToken());
                    queue.push(value);
                    break;
                case "pop":
                    output.append(queue.pop()).append("\n");
                    break;
                case "size":
                    output.append(queue.size()).append("\n");
                    break;
                case "empty":
                    output.append(queue.empty()).append("\n");
                    break;
                case "front":
                    output.append(queue.front()).append("\n");
                    break;
                case "back":
                    output.append(queue.back()).append("\n");
                    break;
            }
        }

        System.out.print(output.toString());
    }
}
