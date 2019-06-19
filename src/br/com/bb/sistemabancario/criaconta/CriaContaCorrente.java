package br.com.bb.sistemabancario.criaconta;

import br.com.bb.sistemabancario.dao.ContaCorrenteDAO;
import br.com.bb.sistemabancario.model.ContaCorrente;

public class CriaContaCorrente {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.setNumero("1234-0");
		cc.setAgencia("9876");
		cc.setDescricao("Conta corrente do Banco do Brasil");
		cc.setAtiva(true);
		cc.setVariacao(0);
		cc.setId((long) 3);
		cc.imprimeContaCorrente();
		
		ContaCorrenteDAO dao = new ContaCorrenteDAO();
		dao.insere(cc);
		System.out.println("Gravado!");
		dao.listAll();
	}
}
