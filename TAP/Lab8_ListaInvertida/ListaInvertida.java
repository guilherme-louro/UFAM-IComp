import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida{
    private Hashtable<String, LinkedList<String>> tabela;

    public ListaInvertida(){
        this.tabela = new Hashtable<>();
    }

    public boolean insere(String palavra, String documento){
        LinkedList documentosProcurados = tabela.get(palavra);
        if (documentosProcurados != null) {
            if(!documentosProcurados.contains(documento)){
                documentosProcurados.add(documento);
                return true;
            }
            else {
                return false;
            }
        }
        else{
            LinkedList<String> novoDocumento = new LinkedList<>();
            novoDocumento.add(documento);
            tabela.put(palavra, novoDocumento);
            return true;
        }     
    }

    public LinkedList<String> busca(String palavra){
        if (tabela != null) {
            return tabela.get(palavra);            
        }
        else{
            return null;
        }
    } 

    public String toString(){
        if (tabela == null){
            return "{}";
        }
        else{
            return tabela.toString();
        }
    }
}