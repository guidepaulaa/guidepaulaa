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
public class ListaPessoas 
{
    // Array polimórfico: Contém objetos de classes diferentes.
    //
    private Pessoa lista[];
    private int count;
    
    public ListaPessoas(int capMax)
    {
        lista= new Pessoa[capMax];
        count= 0;
    }
    
    public boolean add(Pessoa p)
    {
        if(count >= lista.length) return false;
        lista[count]= p;
        count++;
        return true;
    }
    
    public void listagemGeral()
    {
        System.out.println("\nListagem geral");
        for(int i= 0; i<count; i++)
            lista[i].print();
    }
    
    public void listagemProfessores()
    {
        System.out.println("\nListagem de professores");
        for(int i= 0; i<count; i++)
            if(lista[i] instanceof Professor)
                lista[i].print();
    }
    
    public void alunosAprovados()
    {
        System.out.println("\nAlunos aprovados");
        for(int i= 0; i<count; i++)
            if(lista[i] instanceof Aluno)
            {
                Aluno a= (Aluno)lista[i];
                if(a.media() >= 6)
                    a.print();
            }
        
    }
}
