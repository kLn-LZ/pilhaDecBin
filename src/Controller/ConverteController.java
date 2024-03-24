package Controller;

import kLn.*;
public class ConverteController {

    Pilha p = new Pilha();
    public ConverteController() {
        super();
    }

    public String decToBin(int decimal) {

        String conv = "";

        while(decimal > 0) {

            p.push(decimal % 2);

            decimal = decimal / 2;

        }
        int tam = p.tamanho();
        for (int i = 0; i < tam; i++) {

            try {
                conv = conv + p.pop();
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }

        return conv;

    }

}
