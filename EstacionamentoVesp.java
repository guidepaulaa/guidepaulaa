/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamentovesp;

/**
 *
 * @author Guilherme
 */
public class EstacionamentoVesp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Proprio p1= new Proprio(1, "abc-1234", "HB20", 2018, 50000, "02/05/2021");
        p1.imprimeDados();
        p1.venderCarro("Joca", 52000);
        p1.imprimeDados();
        p1.venderCarro("Joca", 60000);
        p1.imprimeDados();
        
        Consignado c1= new Consignado(2, "bcd-2345", "Corsa", 2010, "João Alfredo", 25000);
        c1.imprimeDados();
        c1.venderCarro("Zeca", 28000);
        c1.imprimeDados();
    }
    
}
