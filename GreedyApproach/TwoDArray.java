import java.util.Arrays;

public class TwoDArray{
    public static void main(String[] args) {
        int [][] arr={{1,2},{2,4},{3,5},{0,6},{5,7},{8,9}};
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));


            System.out.println(Arrays.deepToString(arr));
            

    }
}