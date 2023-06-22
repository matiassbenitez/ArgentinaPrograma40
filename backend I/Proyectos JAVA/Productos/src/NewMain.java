
import java.util.HashSet;



public class NewMain {

    public static void main(String[] args) {
        
        HashSet<Integer> num = new HashSet();
        
        for (int i = 0; i < 100; i++) {
            num.add((int)(Math.random()*1258+1));
        }
        
        System.out.println(num);
        
        for (Integer integer : num) {
            System.out.println(integer.hashCode());
        }
        
    }

}
