import java.util.*;

class Item{
    int val,weight;
    Item(int v, int w) {
        val = v;
        weight = w;
    }

}
public  class Fractional{
    public static void main(String[] args) {
        Item[] items={new Item(60,10),
                    new Item(100,20),
                    new Item(120,30),
        };
        int capacity = 50;
        Arrays.sort(items,(a,b)->Double.compare((double)b.val / b.weight,(double) a.val /a.weight));
        double totalvalue =0;
        for (Item item: items){
            if(capacity >= item.weight){
                capacity -=item.weight;
                totalvalue += item.val;

            }else{
                totalvalue +=item.val *((double)capacity / item.weight);
                break;
            }
        }
        System.out.println(totalvalue);
    }
}