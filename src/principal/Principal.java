package principal;
import modelo.*;

public class Principal {

	public static void main(String[] args) {
		Conta conta1 = new Conta(null, null);
		Senha senha1 = new Senha("12345678");
		conta1.setEmail("teste@gmail.com");
		conta1.setSenha(senha1);
		
		System.out.println(conta1.getSenha() + "A força dessa senha é:" + conta1.getSenha().forcaSenha());
		
		senha1.setConteudo("12345678910ABa@23456");
		System.out.println(senha1);
		
		conta1.setSenha(senha1);
		System.out.println(conta1.getSenha() + "A força dessa senha é:" + conta1.getSenha().forcaSenha());
	}

}
