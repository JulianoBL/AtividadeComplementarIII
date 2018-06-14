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
public interface Dinamica {
   public void insereFinal(int valor);
	public void insereInicio(int valor);
	public void inserePosicao(int indice, int valor);
	public void get(int indice); //-> valor
	public void set(int indice, int valor);
	public void removeFinal();
	public void removeInicio();
	public void remove(int indice);
	public int size();
	public int capacity();
	public boolean isEmpty();
	public void criarEspaco();
}

