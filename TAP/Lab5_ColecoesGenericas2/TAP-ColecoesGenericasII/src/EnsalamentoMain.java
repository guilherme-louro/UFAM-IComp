public class EnsalamentoMain {
    public static void main(String[] args) {
    	Ensalamento e1 = new Ensalamento();  // Supondo que e1 é do tipo Ensalamento

        // Gerar 100 turmas
        for (int i = 1; i <= 36; i++) {
            Turma t = new Turma("Turma " + i, "Professor " + i, (int) (Math.random() * 100), i % 2 == 0);
            // Adicionar horários de 0 a 35
            for (int j = 0; j <= 35; j++) {
                t.addHorario(j);
            }
            e1.addTurma(t);  // Adicionar turma ao ensalamento
        }

        // Gerar 100 salas
        for (int i = 1; i <= 36; i++) {
            Sala s = new Sala((i % 5) + 1, 100 + i, (int) (Math.random() * 100), i % 2 == 0);
            e1.addSala(s);  // Adicionar sala ao ensalamento
        }
        
        e1.alocarTodas();
        
        System.out.println(e1.relatorioTurmasPorSala());
        
    }
}