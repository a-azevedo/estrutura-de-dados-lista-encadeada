public class No<T> {

    private T conteudo;
    private No refNo;

    public No(){
        this.refNo = null;
    }

    public No(T conteudo){
        this.refNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No refNo) {
        this.refNo = null;
        this.conteudo = conteudo;
        this.refNo = refNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
    public String toStringEncadeado(){
        String str = "No{Conteudo = " + conteudo + "}";
        if(refNo != null){
            str += "-->" + refNo.toString();
        }else{
            str += "--> null";
        }
        return str;
    }
    public String minhaString(){
        StringBuilder strb = new StringBuilder();
        strb.append("No{Conteudo= " + conteudo);
        if(refNo != null){
            strb.append("-->" + refNo);
        }else{
            strb.append("-->null");
        }
        return strb.toString();
    }
}
