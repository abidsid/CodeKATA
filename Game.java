/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Scanner;

/**
 *
 * @author Dell Insprion
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    static int score=0;
    static int final_score=0;
    public static int roll(int pins){        
       score=score+pins;
       return score;     
    }
    public static int score()
    {
        final_score=final_score+score;
        return final_score;
    }
    
    public static void main(String[] args) {
        try
        {
            int b,c=0,i,j,l,x=0,z=0,y=0,w=0,q=0;
            Scanner sc = new Scanner(System.in);
            for(i=1;i<11;i++)
                {
                    int k=0;
                    for(j=1;j<3;j++)
                    {
                        System.out.println("Frame number"+i);
                        System.out.println("Chance number"+j);
                        System.out.println("Enter the no. of pins rolled down by player");
                        b=sc.nextInt();
                        if(b<11)
                        {                        
                            if(j==1)
                            {
                                if(x==10)
                                {
                                    if(z==10)
                                    {
                                        if(y==10)
                                        {
                                            if(i==10)
                                            {
                                                int p=2*b;
                                                c=roll(p);
                                                x=10;
                                                z=0;
                                                y=0;
                                                
                                            }
                                            else
                                            {
                                                int p=3*b;
                                                c=roll(p);
                                                if(b==10)
                                                {
                                                    x=10;
                                                    z=10;
                                                    y=10;
                                                    j=3;
                                                }
                                                else
                                                {
                                                    x=10;
                                                    z=0;
                                                }
                                            }
                                        }
                                        else
                                        {
                                            int p=2*b;
                                            c=roll(p);
                                            if(b==10)
                                            {
                                                if(i==10)
                                                {
                                                    x=0;
                                                    y=0;
                                                    z=0;
                                                }
                                                else
                                                {
                                                    x=10;
                                                    z=10;
                                                    y=10;
                                                    j=3;
                                                }
                                            }
                                            else
                                            {
                                                x=10;
                                                z=0;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        int p=2*b;
                                        c=roll(p);
                                        if(b==10)
                                        {
                                            if(i==10)
                                            {
                                                x=10;
                                                z=0;
                                            }
                                            else
                                            {
                                                x=10;
                                                z=10;
                                                j=3; 
                                            }

                                        }
                                        else
                                        {
                                            k=k+b;
                                            x=0;
                                            z=0;
                                        }
                                    }
                                }
                                else
                                {
                                    c=roll(b);
                                    if(b==10)
                                    {
                                        if(i==10)
                                        {
                                            x=0;
                                            y=0;
                                            z=0;
                                        }
                                        else
                                        {
                                            x=10;
                                            z=10;
                                            j=3;
                                        }
                                    }
                                    else
                                    {
                                        k=k+b;
                                    }
                                }

                            }
                            
                            else
                            {
                                if(i==10 && q==10)
                                {
                                    k=0;
                                }
                                if(k+b<11)
                                {
                                    if(x==10)
                                    {
                                        if(z==10)
                                        {
                                            int p=2*b;
                                            c=roll(p);
                                            k=k+b;
                                            z=0;
                                            x=10;
                                        }
                                        else
                                        {
                                            int p=2*b;
                                            c=roll(p);
                                            
                                            if(i==10)
                                            {
                                                j=1;
                                                x=0;
                                                z=0;
                                                w=10;
                                                k=0;
                                            }
                                            else
                                            {
                                                k=k+b;
                                                x=0;
                                                z=0;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        c=roll(b);
                                        if(i==10 && q!=10)
                                        {
                                            x=k;
                                            k=b;
                                            q=10;
                                        }
                                        else if(i==10 && q==10)
                                        {
                                            k=b;
                                            q=0;
                                        }
                                        else
                                        {
                                            k=k+b;
                                        }
                                        if(k==10)
                                        {
                                            if(i==10)
                                            {
                                                if(w==10)
                                                {
                                                    c=roll(b);
                                                    j=3;
                                                }
                                                else if(q==10)
                                                {
                                                    j=1;
                                                    w=5;
                                                }
                                                else if(w==5)
                                                {
                                                    j=3;
                                                }
                                                else
                                                {
                                                    j=1;
                                                }
                                            }
                                            
                                            else
                                            {
                                                x=10;
                                            }
                                        }
                                        else if(i==10 && x+b==10)
                                        {
                                            j=1;
                                            w=5;
                                            k=0;
                                        }
                                    }

                                }
                                else
                                {
                                    System.out.println("Enter pins between 1 and 10");
                                    j=j-1;
                                }
                            }    
                        }
                        else
                        {
                            System.out.println("Enter pins between 1 and 10");
                            j=j-1;
                            
                        }
                    }
                    //System.out.println("the score after farame "+i+" is "+c);
                }
                l=score();
                System.out.println("The final score of the player is: "+l);
            
           
        }
        catch(Exception e)
        {
            System.out.println("Please enter numeric values between 1 to 10");
        }        
    }
}
