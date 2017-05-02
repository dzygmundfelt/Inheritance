/**
 * Created by danzygmund-felt on 5/1/17.
 */

import java.util.*;

public class RotateArray<E> extends ArrayList<E>{

    void rotate(int k) {
        E temp;
        int n = this.size();

        for(int j = 0; j < k; j++) {
            for(int j1 = 0; j1 < n-1; j1++) {
                temp = this.get(j1);
                this.set(j1, this.get((j1-1+n)%n));
                this.set((j1-1+n)%n, temp);
            }
        }
    }

    public static void main(String[] args) {
        RotateArray<Double> list = new RotateArray<Double>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an array size.");
        int n = Integer.parseInt(scan.nextLine());

        System.out.println("Choose your rotation.");
        int k = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < n; i++) {
            list.add(n*Math.random());
        }

        System.out.println(list.toString());

        list.rotate(k);

        System.out.println(list.toString());
    }

}
