

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 28; i++) {
            int a = Integer.parseInt(br.readLine());
            arrayList.remove(Integer.valueOf(a));
        }
        arrayList.sort(Integer::compareTo);
        for (Integer i : arrayList) {
            System.out.println(i);
        }

    }


}
