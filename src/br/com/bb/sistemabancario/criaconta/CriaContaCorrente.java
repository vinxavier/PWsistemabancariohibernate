package br.com.bb.sistemabancario.criaconta;

import br.com.bb.sistemabancario.dao.ContaCorrenteDAO;
import br.com.bb.sistemabancario.model.ContaCorrente;

public class CriaContaCorrente {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.setNumero("34564-0");
		cc.setAgencia("5766");
		cc.setDescricao("Conta poupança do Banco do Brasil");
		cc.setAtiva(true);
		cc.setVariacao(0);
		cc.imprimeContaCorrente();
		
		ContaCorrenteDAO dao = new ContaCorrenteDAO();
		dao.insere(cc);
		System.out.println("Gravado!");
		dao.listAll();
	}
}
