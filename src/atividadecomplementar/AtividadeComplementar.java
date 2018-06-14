/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecomplementar;

/**
 *
 * @author Juliano Brasil Lopes
 */
public class AtividadeComplementar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vetor v = new Vetor();
        
		v.insereFinal(6);
		v.insereFinal(2);
		v.insereFinal(54);
		v.insereFinal(1);
		v.insereInicio(5);
		v.insereInicio(2);
		v.inserePosicao(1, 4);
		v.removeInicio();
		v.removeInicio();
		v.removeFinal();
		v.removeFinal();
		v.removeFinal();
		v.remove(1);
		v.set(2, 3);
		v.get(0);
		v.get(7);
		v.get(5);
		v.get(5);
		v.get(4);
		v.get(5);
		
		
		System.out.println(v.capacity());
		System.out.println("fim");
        
    }//main
    
}//atividade 
