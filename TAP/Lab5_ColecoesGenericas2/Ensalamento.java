public class Sensor {
	public String cor;
	public double resolucao;
	public int framesPorSegundo;

    public Sensor() {
		this("", 0.0, 0);
	}

    public Sensor(String cor, double resolucao, int framesPorSegundo) {
		this.cor = cor;
		this.resolucao = resolucao;
		this.framesPorSegundo = framesPorSegundo;
	}
    public double getMPixelsPorSegundo() {
		double megaPixelsPorSegundo = resolucao * framesPorSegundo;
		return megaPixelsPorSegundo;
	}
    
	public String getDescricao() {
		return "Sensor: cor=" + cor +
		", resolucao=" + resolucao + "Mp" + 
		", framesPorSegundo=" + framesPorSegundo + "fps" + 
		", mPixelsPorSegundo=" + getMPixelsPorSegundo() + "Mpps."
		;
	}



}
