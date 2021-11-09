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
public class HerancaNt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//        Pessoa p= new Pessoa("João", "123456-7");
//        p.print();
        
        
        Aluno a= new Aluno("Maria", "234567-8", "2112256", 8, 9);
        a.print();
        
        Pessoa ps= new Professor("José", "3958576-2", "Matemática");
        ps.print();
        
        // Operador instanceof:
        // Determina se um objeto é ou não é instância de uma classe.
        // Uso:
        // (obj instanceof classe)
        // Se o objeto for instância da classe, o resultado será true,
        // caso contrário o resultado será false.
        
        System.out.println("a instanceof Aluno: " + (a instanceof Aluno));
        System.out.println("a instanceof Pessoa: " + (a instanceof Pessoa));
        System.out.println("a instanceof Object: " + (a instanceof Object));
        
        System.out.println("ps instanceof Pessoa: " + (ps instanceof Pessoa));
        System.out.println("ps instanceof Professor: " + (ps instanceof Professor));
        
        Professor pf= (Professor)ps;
        
        System.out.println(pf.getDisciplina());
        
        ListaPessoas lp= new ListaPessoas(10);
        
        lp.add(a);
        lp.add(pf);
        lp.add(new Aluno("Jorge", "123735-2", "2109477", 8, 9));
        lp.add(new Aluno("Zeca", "734554335-2", "21886577", 5, 4));
        lp.add(new Professor("Fernando", "7648477-1", "Português"));
        
        lp.listagemGeral();
        
        lp.listagemProfessores();
        
        lp.alunosAprovados();
    }
    
}
