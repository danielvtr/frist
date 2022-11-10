import transporte.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        
        //cria um objeto 1: objeto, instância, classe
        Carro carro = new Carro("ABC1234", 1231287312);
        
        //atribuir caracteristicas atraves dos atributos
        /*carro.setPlaca("ABC1234"); 
        carro.setNumChassi(123125212);*/

        //ACELERANDO
        for(int i = 0; i < 10; i++) {
            carro.acelerar();
        }


        System.out.printf("Número da placa é %s, número do chassi é %d", carro.getPlaca(), carro.getNumChassi());
        System.out.printf("A velocidade atual SEM SOBRECARGA é: " + carro.getvelocidadeAtual());

        carro.acelerar(40);

        System.out.printf("\nA velocidade atual COM SOBRECARGA é " + carro.getvelocidadeAtual());
    }
}
