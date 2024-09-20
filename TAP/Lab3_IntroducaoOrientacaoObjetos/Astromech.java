public class Astromech {
	public String modelo;
	public Mestre mestre;
	public Sensor sensor;
	public Conexao conexao;

	public Astromech(String modelo, Mestre mestre, Sensor sensor, Conexao conexao) {
		this.modelo = modelo;
		this.mestre = mestre;
		this.sensor = sensor;
		this.conexao = conexao;
	}

    public String getDescricao() {
        return "Astromech modelo " + modelo + 
		". Mestre: nome=" + mestre.nome + 
		", anoNascimento=" + mestre.getAnoNascimentoString() + 
		", afiliacao=" + mestre.afiliacao + 
		", posto=" + mestre.posto + 
		", possuiForca=" + mestre.possuiForca() + 
		". Sensor: cor=" + sensor.cor + 
		", resolucao=" + sensor.resolucao + "Mp" + 
		", framesPorSegundo=" + sensor.framesPorSegundo + "fps" + 
		", mPixelsPorSegundo=" + sensor.getMPixelsPorSegundo() + "Mpps" + 
		". Conexao: tipoPorta=" + conexao.tipoPorta + 
		", protocolo=" + conexao.getProtocoloString() + 
		", taxaTransmissao=" + conexao.getTaxaMBps() + "MBps."
		;
    }
}
