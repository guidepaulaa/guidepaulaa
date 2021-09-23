/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesianovesp;

/**
 *
 * @author Guilherme de Paula
 */
public class CartesianoVesp 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

        //c2 = new Circulo(2, 3, 4);
        //c3 = new Circulo(c2);
        
        
           
        /*System.out.println("author Guilherme de Paula");
        Segmento s1= new Segmento();
        s1.print("s1");
        
        Segmento s2= new Segmento(1, 2, 3, 4);
        s2.print("s2");
        
        Segmento s3= new Segmento(s2);
        s3.print("s3");
        
        s3.assign(s1);
        s3.print("s3");
        
        s3.desloc(1, 2);
        s3.print("s3");
        
        s3.escale(2);
        s3.print("s3");
        
        System.out.println("Comprimento de s1: " + s1.length());
        System.out.println("Comprimento de s2: " + s2.length());
        System.out.println("Comprimento de s3: " + s3.length());
        
        System.out.println("s1 é valido?: " + (s1.isValid()?"Sim":"Não") );
        System.out.println("s2 é valido?: " + (s2.isValid()?"Sim":"Não") );
        System.out.println("s3 é valido?: " + (s3.isValid()?"Sim":"Não") );
        
        Ponto pm= s3.midPoint();
        pm.print("pm");
        
        s2.print("s2");
        
        Ponto p= s2.getP1();
        
        p.escale(2);
        p.print("p");
        s2.print("s2");
        
        s1.print("s1");
        s1.setP1(p);
        s1.print("s1");
        
        p.escale(2);
        s1.print("s1");
        
        
//        (condição?resultado se true:resultado se false)
        
//        Ponto p1= new Ponto();
//        Ponto p2= new Ponto(3, 4);
//        
//        System.out.println("Distancia de p1 até p2: " + p1.distance(p2));
//        System.out.println("Distancia de p1 até (3,4): " + p1.distance(3,4));
//        
//        p1.print("p1");
//        p2.print("p2");
//        
//        p1.desloc(1, 2);
//        p1.print("p1");
//        
//        p1.escale(2);
//        p1.print("p1");
//        
//        System.out.println(p2);
//        System.out.println(p2.toString());*/
        

            /*Triangulo t1, t2, t3;
            t1 = new Triangulo();
            t1.print("t1");
            
            t2 = new Triangulo (2, 2, 2, 4, 4, 2);
            t2.print("t2");
            
            t3 = new Triangulo(t2);
            t3.print("t3");
            
            System.out.println("Lado a de t1: " + t1.lengthA());
            System.out.println("Lado b de t1: " + t1.lengthB());
            System.out.println("Lado c de t1: " + t1.lengthC());
            
            System.out.println("t1 é equilatero?:" + (t1.equilateral()?"Sim": "Não"));
            System.out.println("t2 é equilatero?:" + (t2.equilateral()?"Sim": "Não"));
            System.out.println("t3 é equilatero?:" + (t3.equilateral()?"Sim": "Não"));
            
            System.out.println("Perimetro de t1: " + t1.perimeter());
            System.out.println("Perimetro de t2: " + t2.perimeter());
            System.out.println("Perimetro de t3: " + t3.perimeter());
            
            System.out.println("A area do triangulo t1 é:" + t1.area());
            System.out.println("A area do triangulo t2 é:" + t2.area());
            System.out.println("A area do triangulo t3 é:" + t3.area());
          
            
            System.out.println("t1 é valido?: " + (t1.isValid()?"Sim":"Não"));
            System.out.println("t2 é valido?: " + (t2.isValid()?"Sim":"Não"));
            System.out.println("t3 é valido?: " + (t3.isValid()?"Sim":"Não"));
            
            System.out.println("Baricentro de t1:" + t1.gravCenter());
            
            Ponto p = t1.getVa();
            
            
            //MUDANDO AS COORDENADAS PARA TESTAR VALIDAÇÃO
            t3.setVa(new Ponto(1, 0));
            t3.setVb(new Ponto(2, 0));
            t3.setVc(new Ponto(3, 0));
            t3.print("t3");
            System.out.println("t3 é valido?: " + (t3.isValid()?"Sim":"Não"));*/
        
        
            Circulo c1, c2, c3;
            c1 = new Circulo();
            c1.print("c1");

            System.out.println("A area do circulo c1 é: " + c1.area());
            System.out.println("O perimetro do circulo c1 é: " + c1.perimeter());
            System.out.println("C1 é valido?: " + (c1.isValid()?"Sim":"Não"));

    }
    
}
