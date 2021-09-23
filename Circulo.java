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
public class Circulo extends Ponto
{
    private Ponto centro;
    private double raio;
    
    //Construtor Padrão

    public Circulo() 
    {
        super(); //Chama o atributo da classe Ancestral, nesse caso, o Ponto
        raio = 1;
    }
    
    //Construtor Parametrizado

    public Circulo(Ponto centro, double x, double y, double raio) 
    {
        super(x, y);
        this.raio = raio;
    }
    
    //Construtor Cópia
    
    public Circulo (Circulo c)
    {
        super(c);
    }
    //Pedidos do Exercício
    public void assign(Circulo c)
    {
        super.assign(c);
        raio = c.raio;
    }
    
    @Override
    public void escale(double factor)
    {
        super.escale(factor);
        raio *= factor;
    }
    
    //IMPRESSÃO
    public String toString()
    {
     return super.toString() + ":" + raio;
    }
    public boolean isValid()
    {
        return (raio > 0);
    }
    
    public double perimeter()
    {
        return 2*Math.PI*raio;
    }
    
    public double area()
    {
        return Math.PI * (raio * raio);
    }

}