package com.mycompany.aula20250228;


public class Aula20250228 {

    public static void main(String[] args) {
        System.out.println("BANCO!");
        
        Cliente c = new Cliente();
        c.cpf = "1232156";
        c.nome = "Cassio";
        c.sobrenome = "Capucho";
        
        Conta cont = new Conta();
        cont.numero = 10;
        cont.limite = 100;
        cont.saldo = 10000;
        cont.titular = c;
        
        c.cont = cont;
        
        Cliente m = new Cliente();
        m.cpf = "2648265";
        m.nome = "Maria";
        m.sobrenome = "Silva";
        
        Conta contMaria = new Conta();
        cont.numero = 10;
        cont.limite = 100;
        cont.saldo = 10000;
        cont.titular = m;
        
        m.cont = contMaria;
        
        c.conjuge.cont.limite = 1000;
    }
}
