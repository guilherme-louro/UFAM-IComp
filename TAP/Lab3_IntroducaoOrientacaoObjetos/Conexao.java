public class Conexao {

    public String tipoPorta;
    public int idProtocolo;
    public int taxaTransmissao;

    public Conexao() {
        this("", 0, 0);
    }

    public Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao) {
        this.tipoPorta = tipoPorta;
        this.idProtocolo = idProtocolo;
        this.taxaTransmissao = taxaTransmissao;
    }

    public String getProtocoloString() {
        return switch (idProtocolo) {
            case 1 -> "Rotoscope";
            case 2 -> "Acustico";
            case 3 -> "Radio";
            default -> "Outros";
        };
    }

    public double getTaxaMBps() {
		return taxaTransmissao/1024.0;
    }

    public String getDescricao() {
        return "Conexao: tipoPorta=" + tipoPorta
                + ", protocolo=" + getProtocoloString()
                + ", taxaTransmissao=" + getTaxaMBps() + "MBps."
				;
    }
}
