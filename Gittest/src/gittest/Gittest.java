/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittest;

/**
 *
 * @author student
 */
public class Gittest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Pomieszczenie pokoj=new Pomieszczenie();
        pokoj.x=20;
        pokoj.y=10;
        pokoj.nrPiętra=2;
        ElementPiętra test;
        test=pokoj;
        ElementPiętra[] tab=new ElementPiętra[3];
        tab[1]=pokoj;
        tab[2]=new Mieszkanie();
    }
    
}
