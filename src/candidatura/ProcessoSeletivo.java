package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
//        analisarCandidato(1900.0);

//        seleccaoCandidatos();
//        imprimirSelecionados();

        String[] candidatos = {
                "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"
        };

        for (String candidato: candidatos) {

            entrandoEmContato(candidato);

        }
    }

    static void entrandoEmContato(String candidato) {

        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativaRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while (continuarTentando && tentativaRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+candidato+" NA "+tentativaRealizadas+ " TENTATIVA");
        }else{
            System.out.println("Não conseguimos contato com"+candidato+", Numero maximo tentativas "+tentativaRealizadas+" Realizada");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    public static  void imprimirSelecionados() {
        String[] candidatos = {
            "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"
        };

        System.out.println("Imprimindo a lista de candidatos informando o indece do elemento");

        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de numero "+(i + 1)+" é "+candidatos[i] );
        }

    }

    static void seleccaoCandidatos() {

        String[] candidatos = {
            "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JEFERSON"
        };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+ "  Solicitou este valor de salario "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+ " foi selecionardo para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDAR DEMIAS CANDIDATOS");
        }


    }


}
