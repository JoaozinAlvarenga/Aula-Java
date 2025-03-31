
package com.mycompany.aula3103;

public class Aula3103 {

    public static void main(String[] args) {
        System.out.println("Agenda");
        
        AgendaTelefonica ag = new AgendaTelefonica();
                
        ag.inserir("Roberto", "(46)15151-6115");
        ag.inserir("Carlos", "(54)51954-4589");
        ag.inserir("Pedro", "(45)13561-6151");
        ag.inserir("Rogerio", "(84)51265-1551");
        
        ag.imprimir();

    }
}
