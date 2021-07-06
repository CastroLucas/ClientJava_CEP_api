package br.com.lucas.testes.api;

public class Endereco {
	String logradouro;
	String bairro;
	String localidade;
	String uf;
	String complemento;
	
	
	public String getLogradouro() {
		return this.logradouro;
	}


	public String getBairro() {
		return this.bairro;
	}

	public String getLocalidade() {
		return this.localidade;
	}

	public String getComplemento() {
		if(this.complemento == null) {
			return "sem";
		}else if(this.complemento.equals("")){
			return "sem";
		}else{		
			return this.complemento;
	
		}
	}
	
	@Override
	public String toString() {
        return "Endereço{" + "logradouro: " + logradouro + ", bairro: " + getBairro() + ", Cidade: " 
	+ localidade +" - " +uf + ", Complemento: " + getComplemento() + "}";
	}

}