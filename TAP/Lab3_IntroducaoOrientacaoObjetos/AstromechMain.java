public class AstromechMain {
	public static void main(String[] args) {
            Mestre master = new Mestre("Anakyn Skywalker", -41, "Ordem Jedi", "Jedi");
            Sensor sensor = new Sensor("Azul", 512.0, 240);
            Conexao conection = new Conexao("SCOMP Link", 1, 4000);
            Astromech astromech = new Astromech("R2-D2", master, sensor, conection);
	}	
}
