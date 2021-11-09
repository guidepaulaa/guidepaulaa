/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancant;

/**
 *
 * @author Usuario
 */
public class Aluno extends Pessoa   // descendente
{
    private String ra;
    private double nota1, nota2;
    
    // Os construtotores da classe descendente precisam
    // obrigatoriamente chamar algum construtor da classe
    // ancestral e isso precisa ser feito na primeira linha
    // de código do construtor descendente. 
    // Caso isso não ocorra, o java irá chamar automaticamente
    // o construtor padrão da classe ancestral. Se a classe 
    // ancestral não tem um construtor padrão, ocorrerá
    // um erro de compilação.

    public Aluno(String nome, String rg, String ra, double nota1, double nota2)
    {
        super(nome, rg);
        this.ra= ra;
        this.nota1= nota1;
        this.nota2= nota2;
    }
            
    public String getRa() 
    {
        return ra;
    }

    public void setRa(String ra) 
    {
        this.ra = ra;
    }

    public double getNota1() 
    {
        return nota1;
    }

    public void setNota1(double nota1) 
    {
        this.nota1 = nota1;
    }

    public double getNota2() 
    {
        return nota2;
    }

    public void setNota2(double nota2) 
    {
        this.nota2 = nota2;
    }
    
    public double media()
    {
        return (nota1 + nota2)/2;
    }
    
    @Override
    // Sobreposição: ocorre quando a classe descendente reescreve, e portanto
    // substitui, um método que já existe na classe ancestral.
    public String toString()
    {
        return super.toString() + "  ra: " + ra + " nota 1: " + nota1 + " nota 2: " + nota2;
    }
}
