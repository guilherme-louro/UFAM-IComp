public class GoogleMain {
    public static void main(String[] args) {
        ListaInvertida listaInvertida = new ListaInvertida();

        listaInvertida.insere("force", "document1.txt");
        listaInvertida.insere("force", "document2.txt");
        listaInvertida.insere("force", "document3.txt");
        listaInvertida.insere("always", "document1.txt");
        listaInvertida.insere("one", "document3.txt");
        listaInvertida.insere("is", "document2.txt");
        listaInvertida.insere("is", "document3.txt");
        listaInvertida.insere("you", "document1.txt");
        listaInvertida.insere("you", "document2.txt");

        System.out.println(listaInvertida.busca("force"));
        System.out.println(listaInvertida.busca("is"));
        System.out.println(listaInvertida.busca("you"));

        System.out.println(listaInvertida.toString());
    }
}
