import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class maxevents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]  events= new int[n][2];
        for(int i =0; i<n; i++) events[i] =new int[]{sc.nextInt(),sc.nextInt()};
        System.out.println(maxevent(events));
    }
    public  static int maxevent(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res = 0, day = 1, i = 0, n = events.length;


        while (i < n || !pq.isEmpty()) {
            while (i < n && events[i][0] == day) pq.add(events[i++][1]);
            while (!pq.isEmpty() && pq.peek() < day) pq.poll();
            if (!pq.isEmpty()) {
                pq.poll();
                res++;
            }
            day++;
        }
        return res;
    }
}
