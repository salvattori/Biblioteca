/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author rosalina
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        
        
        
        p[0] = new Pessoa("victor", 19, "masculino");
        p[1] = new Pessoa("manuela", 17, "feminino");
        
        l[0] = new Livro("romeu&julieta", "picasso", 369, p[1]);
        l[1] = new Livro("joao&maria", "fulano", 178, p[0]);
        
        l[1].detalhes();
    }
    
}
