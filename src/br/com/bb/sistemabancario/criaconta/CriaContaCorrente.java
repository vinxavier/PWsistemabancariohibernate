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
		System.out.println(cc.getNumero());
		System.out.println(cc.getAgencia());
		System.out.println(cc.getDescricao());
		System.out.println(cc.isAtiva());
		System.out.println(cc.getVariacao());
		System.out.println(cc.getId());
		
		ContaCorrenteDAO dao = new ContaCorrenteDAO();
		dao.insere(cc);
		System.out.println("Gravado!");
	}
}
