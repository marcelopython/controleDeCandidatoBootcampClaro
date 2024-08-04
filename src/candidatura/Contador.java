package candidatura;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Digite o primeiro parametro");

            int parameterOne = scanner.nextInt();
            System.out.println("Digite o segundo parametro");

            int parameterTwo = scanner.nextInt();

            contador(parameterOne, parameterTwo);

        }catch (ParametrosInvalidosException e){
            System.out.println("Parametros invalidos");
        }finally {
            scanner.close();
        }


    }

    public static void contador(int parameterOne, int parameterTwo) throws ParametrosInvalidosException {

        if(parameterOne > parameterTwo){
            throw new ParametrosInvalidosException("Parametro invalido");
        }

        int contagem = parameterTwo - parameterOne;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número "+(i + 1));
        }

    }


}
