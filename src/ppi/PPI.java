package ppi;
import java.util.*;

public class PPI {

    public static void main(String[] args) {
        
        System.out.println("Olá, aqui você pode analisar vetores!");

        System.out.println("\n Para começar digite o tamanho do vetor a ser criado: ");
        List<Integer> arr;
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            arr = new ArrayList<>();
            System.out.println("\nDigite os números que irão compor o vetor, entre os números deve haver apenas espaço, não utilize simbolos: ");
            for (int i = 0; i < n; i++){
                arr.add(scanner.nextInt());
            }
        }
        System.out.println("\n O vetor digitado foi:  " + arr); 

        

        int max = max(arr);
        int min = min(arr);
        int dif = max - min;
        System.out.println("\nValor máximo: " + max + " | Valor mínimo: " + min);
        System.out.println("A maior diferença entre dois elementos é: " + dif);

        boolean check = true;
        for (int i = 1; i < arr.size(); i++){
            if (arr.get(i) < arr.get(i - 1)) {
                check = false;
                break; 
            }
        }

        System.out.println("\nO vetor está em ordem crescente? " + check);
        System.out.println("\n Programa Finalizado");
    }

    public static Integer max(List<Integer> arr){
        int n = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > n) {
                n = arr.get(i);
            }
        }
        return n;
    }

    

    public static Integer min(List<Integer> arr){
        int n = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < n) {
                n = arr.get(i);
            }
        }
        return n;
        
        
    }
    
}
