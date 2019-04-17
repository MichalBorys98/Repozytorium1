/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadaniegit;

/**
 *
 * @author student
 */
public class Zadaniegit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pomieszczenie pokoj = new Pomieszczenie();
       
       pokoj.x = 15;
       pokoj.y = 20;
       pokoj.nazwa = "sypialnia";
       pokoj.pietro = 3;
       
       ElPietra test;
       test = pokoj;
       
       ElPietra[] tab = new ElPietra[3];
       
       tab[0]= pokoj;
       tab[1] = new Mieszkanie();
       
       
       
       
    }
    
   
}
