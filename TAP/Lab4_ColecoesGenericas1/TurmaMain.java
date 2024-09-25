public class TurmaMain {
	public static void main(String[] args) {
        Aluno eu = new Aluno("Guilherme Louro", 22300000, 1999);
        Aluno irmao = new Aluno("Henrique Louro", 22300001, 2001);

        Professor horacio = new Professor("Horacio Fernandes", "Dr.", 0000);
        Professor nakamura = new Professor("Eduardo Nakamura", "Dr.", 0001);

        Turma tap = new Turma("Técnicas Avançadas de Programação", 2024, 1, horacio);
        Turma md = new Turma("Matemática Discreta", 2023, 1, nakamura);

        tap.addAluno(eu);
        tap.addAluno(irmao);

        md.addAluno(eu);
        md.addAluno(irmao);
    
        System.out.println(eu.getDescricao());
        System.out.println(irmao.getDescricao());

        System.out.println(horacio.getDescricao());
        System.out.println(nakamura.getDescricao());

        System.out.println(tap.getDescricao());
        System.out.println(md.getDescricao());
	}	
}
