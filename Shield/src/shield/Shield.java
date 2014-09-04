/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shield;

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
    
    public static void main(String[] args) {
        
        int n=1000000;
        int hit=shoot(n,10*2);
       // double srednia=(double)hit/n;
      
        System.out.println("Celnośc wynosi: "+((double)hit/n)*4);
 
        
    }
    
}