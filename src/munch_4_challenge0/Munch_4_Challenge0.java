/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munch_4_challenge0;

/**
 *
 * @author Jmunch123
 */
public class Munch_4_Challenge0 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1;i < 501; i++){
        if (isD11(i) & isD5(i)){
            System.out.println(i + " = Animate This");
        }else if (isD11(i) & isD3(i)){
            System.out.println(i + " = Harr Direktor");
        }else if (isD11(i) & isD2(i)){
            System.out.println(i + " = ninja");
        }else if (isD2(i) & isD3(i) & isD5(i)){
            System.out.println(i + " = Tean Building ");
        }else if (isD3(i) & isD5(i)){
            System.out.println(i + " = Old School ");
        }else if (isD2(i) & isD3(i)){
            System.out.println(i + " = chisme ");
        }else if  (isD5(i)){
            System.out.println(i + " = Vidal ");
        }else if  (isD3(i)){
            System.out.println(i + " = Claughton ");    
        }else if  (isD2(i)){
            System.out.println(i + " = Davis ");    
        }else{           
            System.out.println(i + " = is not divisible ");
                }
        }
    }    

    static boolean isD2(int D){
        return (D % 2 == 0);
     
    }

    static boolean isD3(int V){
        return (V % 3 == 0); 
    
        }

    static boolean isD5(int C){
        return(C % 5 == 0);
         }
       
    static boolean isD11(int D){    
        return(D % 11 ==0);
    
    }
}

    