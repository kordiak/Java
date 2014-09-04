/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shield;
//NAPIOS
/**
 *
 * @author admin
 */
public class Shield {

    /**
     * @param args the command line arguments
     * 
     * 
     * 
     */
    public static double getRandomNumber(int maxValue)
    {
        double randomNumber=Math.random()*maxValue;
        return randomNumber;
    }
    
    public static boolean checkWhere(double x,double y,int maxValue)
    {
        
        double x2=Math.pow(x, 2);
        double y2=Math.pow(y, 2);
        
        double r=Math.sqrt(x2+y2);
        //COMENT
        //COMMTENS
        
        boolean result=r<=maxValue?true:false;
        return result;
    }
    
    public static int shoot(int n,int maxValue)
    {
        
        int hit=0;
        for(int i=0;i<n;++i)
        {
            double x=getRandomNumber(maxValue);
            double y=getRandomNumber(maxValue);
            
            boolean did=checkWhere(x, y, maxValue);
            if(did) hit++;
                
            
            
        }
        
        return hit;
    }
    
    
    public static double PoleKola(double Promien)
    {
        return Math.PI*Promien*Promien;
    }
    public static double ObwodOkregu(double Promien)
    {
        return 2.0 * Math.PI* Promien;
    }
    public static double PoleTrojkata(double a,double h)
    {
        return 0.5 * a * h;
    }
    
    
    public static int Licznik=1;
    
    public static double abs(double a)
    {
         return a<0?a*-1:a;
         
        
    }
    
    public static double pow(double x,int n)
    {
        double potega=1;
        
        for(int i=0;i<n;++i)
        {
            potega*=x;
        }
        return potega;
    }
    
    
    public static int factorial(int value) 
    {
        int suma=value;
        
        if(value==1) return suma;
        suma*=factorial(value-1);
        
        
        
     return suma;
    }
    
    
    public static int silnia(int value)
    {
        
        int suma=1;
        for(;value>=1;--value)
        {
            suma*=value;
        }
        
        
        return suma;
    }
    public static void main(String[] args) {
        
        int n=1000;
        int hit=shoot(n,10*2);
       
        
        System.out.println("Celnośc wynosi: "+((double)hit/n)*4);
 
        System.out.println(abs(-0));
        
        System.out.println(pow(2,8));
        
        System.out.println(factorial(3));
        
        System.out.println(silnia(3));
    }
    
}
