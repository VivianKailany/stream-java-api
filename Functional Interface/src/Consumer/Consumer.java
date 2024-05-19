import java.util.Arrays;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {
         List<Integer> numerosConsumer = Arrays.asList(1, 2, 3, 4, 5);
        
         numerosConsumer.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
