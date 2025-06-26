import java.util.Scanner;


public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       
        System.out.print("Digite a altura (em metros, ex: 1.75): ");
        double altura;
        try {
            altura = Double.parseDouble(scanner.nextLine());
            if (altura <= 0) {
                System.out.println("Erro: A altura deve ser maior que zero!");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um valor numérico válido para a altura!");
            scanner.close();
            return;
        }
       
       
        System.out.print("Digite o peso (em kg, ex: 70.5): ");
        double peso;
        try {
            peso = Double.parseDouble(scanner.nextLine());
            if (peso <= 0) {
                System.out.println("Erro: O peso deve ser maior que zero!");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um valor numérico válido para o peso!");
            scanner.close();
            return;
        }
       
       
        double imc = peso / (altura * altura);
       
       
        String interpretacao;
        if (imc < 18.5) {
            interpretacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            interpretacao = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            interpretacao = "Sobrepeso";
        } else {
            interpretacao = "Obesidade";
        }
       
       
        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Interpretação: " + interpretacao);
        System.out.println("Processamento concluído com sucesso!");
       
        scanner.close();
    }
}

