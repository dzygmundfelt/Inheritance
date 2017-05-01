/**
 * Created by danzygmund-felt on 5/1/17.
 */

import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an array size.");
        int n = Integer.parseInt(scan.nextLine());

        System.out.println("Choose your rotation.");
        int k = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < n; i++) {
            list.add(n*Math.random());
        }

        System.out.println(list.toString());

        double temp = 0;

        for(int j = 0; j < k; j++) {
            //System.out.println("Haaaay");
            for(int j1 = 0; j1 < n-1; j1++) {
                temp = list.get(j1);
                list.set(j1, list.get((j1-1+n)%n));
                list.set((j1-1+n)%n, temp);
            }
        }

        System.out.println(list.toString());

    }

}
