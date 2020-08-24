package guia1poo1;
import java.util.*;
public class Divisibles {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite el primer numero: ");
        num1 = reader.nextInt();
        System.out.print("Digite el segundo numero: ");
        num2 = reader.nextInt();
        System.out.println(num1 + "/" + num2);
        if(num1%num2==0)
        {
            System.out.println("El número " + num1 + " es divisible entre el numero " + num2);
        }
        else
        {
            System.out.println("Los numeros no son divisibles");
        }
    } 
}
