
package com.xadrez.core;

import com.xadrez.estructure.MovTree;
import com.xadrez.estructure.Position;

public abstract class Peca {
    
    public int id;
    public int time;
    int vida;
    String nome;
    Position posicao;
    protected MovTree movimentacao;
    
    public Peca(int vida, String nome,Position posicao,int time) {
      id=this.hashCode();
      this.time = time;
      this.vida = vida;
      this.nome = nome;
      this.posicao = posicao;
      movimentacao = new MovTree(null);
    }
   
     public abstract void CriarMovimentacao();
}
