package BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
         List<Integer> numerosBinary = Arrays.asList(1, 2, 3, 4, 5);

         BinaryOperator <Integer> somar = (numero1, numero2) -> numero1+numero2;

         int resultado = numerosBinary.stream()
            .reduce(0,somar);

         System.out.println(resultado);
    }
}
