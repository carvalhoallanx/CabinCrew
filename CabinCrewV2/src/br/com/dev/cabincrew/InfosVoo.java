package br.com.dev.cabincrew;

public class InfosVoo {
	private String Callsing;
	private String Saida;
	private String Destino;
	private String N_Passageiros;
	
	public String getCallsing() {
		return Callsing;
	}
	public void setCallsing(String callsing) {
		Callsing = callsing;
	}
	
	public String getSaida() {
		return Saida;
	}
	public void setSaida(String saida) {
		Saida = saida;
	}
	
	public String getDestino() {
		return Destino;
	}
	
	public void setDestino(String destino) {
		Destino = destino;
	}
	
	public String getN_Passageiros() {
		return N_Passageiros;
	}
	public void setN_Passageiros(String n_Passageiros) {
		N_Passageiros = n_Passageiros;
	}
}
