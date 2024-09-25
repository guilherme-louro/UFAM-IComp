import java.util.ArrayList;

public class Turma {

    private static void elif(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String nome;
    public String professor;
    public int numAlunos;
    public boolean acessivel;
    public ArrayList<Integer> horarios;

    public Turma() {
        this("", "", 0, false);
        this.horarios = new ArrayList<>();
    }

    public Turma(String nome, String professor, int numAlunos, boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        this.horarios = new ArrayList<>();
    }

    public void addHorario(int horario) {
    
    }

    public static int horarioIntToHora(int horaTurma){
        int horaQuadro = 0;
        switch (horaTurma%7) {
            case 1 -> horaQuadro = 8;
            case 2 -> horaQuadro = 10;
            case 3 -> horaQuadro = 12;
            case 4 -> horaQuadro = 14;
            case 5 -> horaQuadro = 16;
            case 6 -> horaQuadro = 18;
            case 0 -> horaQuadro = 20;
        }
        return horaQuadro;
    }

    public static String horarioIntToDiaSemana(int horaTurma) {
        // int[] segunda = {1, 2, 3, 4, 5, 6, 7};
        // int[] terca = {8, 9, 10, 11, 12, 13, 14};
        // int[] quarta = {15, 16, 17, 18, 19, 20, 21};
        // int[] quinta = {22, 23, 24, 25, 26, 27, 28};
        // int[] sexta = {29, 30, 31, 32, 33, 34, 35};

        if (1 <= horaTurma && horaTurma <= 7) {
            return "Segunda";
        }
        elif (8 <= horaTurma && horaTurma <= 14) {
            return "Terça";
        }
        elif (15 <= horaTurma && horaTurma <= 21) {
            return "Quarta";
        }
        elif (22 <= horaTurma && horaTurma <= 28) {
            return "Quinta";
        }
        elif (29 <= horaTurma && horaTurma <= 35) {
            return "Sexta";
        }
    }
    

    public String getHorariosString() {
        StringBuilder horariosString = new StringBuilder();
        for (Integer horario : horarios) {
            
        }

    }

    public String stringAcessivel() {
        if (acessivel == true) {
            return "acessível";
        } 
        else {
            return "não acessível";
        }
    }

    public String getDescricao() {
        StringBuilder descricao = new StringBuilder();
        descricao.append(String.format("Turma %s - %d/%d (%s):\n", disciplina, ano, semestre, professor.getDescricao()));
        int contador = 1;
        for (Aluno aluno : alunos) {
            descricao.append(String.format(" - Aluno %d: %s\n", contador, aluno.getDescricao()));
            contador++;
        }
        return descricao.toString();
    }
}