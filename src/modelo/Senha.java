package modelo;

public class Senha {
	private String conteudo;

	
	//contrutor verificando se a senha que esta sendo passada é maior que 10 e menor que 30 e se possui o caracter maiusculo "A"
	public Senha(String conteudo) {
		super();
		if(conteudo.length() > 10) {
			if(conteudo.length() < 30) {
				if(conteudo.contains("A")) {
					this.conteudo = conteudo;
				}
			}
		}
		this.conteudo = "Nao foi possivel alterar, precisa de uma senha mais forte";
	}

	public String getConteudo() {
		return conteudo;
	}

	// verificando se na hora da alteração da senha, está sendo passado mais de 10 e menos de 30, verifica se contem a letra maiuscula "A" e "B", verifica se possui a letra minuscula "a",
	// verifica se possui caracter especial "@", verifica se possui algum numero "1" para salvar a senha se não salva como: "Nao foi possivel alterar, precisa de uma senha mais forte".
	public void setConteudo(String conteudo) {
		if(conteudo.length() > 10) {
			if(conteudo.length() < 30) {
				if(conteudo.contains("A")) {
					if(conteudo.contains("B")) {
						if(conteudo.contains("a")) {
							if(conteudo.contains("@")) {
								if(conteudo.contains("1")) {
									this.conteudo = conteudo;
								}

							}

						}
					}
				}
			}
		}else {
			this.conteudo = "Nao foi possivel alterar, precisa de uma senha mais forte";
		}
		
	}

	// metodo que verifica se a senha é forte e retorna os pontos pra saber o nivel de segurança
	public int forcaSenha() {
		if(conteudo.length() < 10) {
			return 0;
		}if(conteudo.length() < 15) {
			return 75;
		}if(conteudo.length() == 30) {
			return 100;
		}if(conteudo.length() == 15) {
			return 80;
		}if(conteudo.length() < 30) {
			return 90;
		}
		return 0;
		
		
	}

	//metodo to string para poder exibir a classe
	@Override
	public String toString() {
		return "Senha [conteudo=" + conteudo + "]";
	}
	
	
	
	
}
