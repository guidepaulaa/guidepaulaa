
package cartesianovesp;

/**
 *
 * @author Guilherme de Paula
 */
public class Triangulo 
{
    private Ponto va, vb, vc;
    
    //Construtor Padrão

    public Triangulo() 
    {
        va = new Ponto (0, 0);
        vb = new Ponto (1, 0);
        vc = new Ponto (0, 1);
    }
    
    //Construtor Parametrizado
    public Triangulo(double x1, double y1, double x2, double y2, 
            double x3, double y3)
            
    {
        va = new Ponto(x1, y1);
        vb = new Ponto(x2, y2);
        vc = new Ponto(x3, y3);
    }
    
    //Construtor Cópia
    
    public Triangulo(Triangulo tr)
    {
        va = new Ponto(tr.va);
        vb = new Ponto(tr.vb);
        vc = new Ponto(tr.vc); 
    }
    
    //Comprimento dos Lados
    public double lengthA()
    {
        return vb.distance(vc);
    }
    
    public double lengthB()
    {
        return va.distance(vc);
    }
    
    public double lengthC() 
    {
        return va.distance(vb);
    }
    
    
    //Equilateral
    public boolean equilateral()
    {
        return (lengthA() == lengthB()) && (lengthB() == lengthC());
    }
    
    //Método de Impressão
    public String toString()
    {
        return "[" + va.toString() + ", " + vb.toString() + ", " + 
                vc.toString() + "]";
    }

    public void print(String caption)
    {
        System.out.println(caption + toString());
    }
    
    public double perimeter()
    {
        return lengthA() + lengthB() + lengthC();
    }
    
    public double area()
    {
        double sp = perimeter() / 2;
        
        return Math.sqrt (sp * (sp - lengthA()) * (sp - lengthB()) *
                (sp - lengthC()));
    }
    
    public boolean isValid()
    {
        return (va != null) && (vb != null) && (vc != null) &&
                (lengthA() > 0) && (lengthB() > 0) && (lengthC() > 0) &&
                (lengthA() + lengthB() > lengthC()) &&
                (lengthA() + lengthC() > lengthB()) &&
                (lengthC() + lengthB() > lengthA());
    }
     
      public Ponto gravCenter()
      {
        double gx= (va.getX() + vb.getX() + vc.getX())/3;
        double gy= (va.getY() + vb.getY() + vc.getX())/3;
        
        return new Ponto(gx, gy);
      }

    //GETTERS
    public Ponto getVa() 
    {
        return new Ponto (va);
    }

    public Ponto getVb() 
    {
        return new Ponto (vb);
    }

    public Ponto getVc() 
    {
        return new Ponto (vc);
    }

    //SETTERS
    public void setVa(Ponto va) 
    {
        this.va = new Ponto (va);
    }

    public void setVb(Ponto vb) 
    {
        this.vb = new Ponto (vb);
    }

    public void setVc(Ponto vc) 
    {
        this.vc = new Ponto (vc);
    }
      
    
}   



    
    
    
