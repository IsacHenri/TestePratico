package modelo;

public class Senha {
	private String conteudo;

	
	
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

	@Override
	public String toString() {
		return "Senha [conteudo=" + conteudo + "]";
	}
	
	
	
	
}
