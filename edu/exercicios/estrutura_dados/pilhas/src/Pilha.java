public class Pilha {
    private No refNoEntrada;

    public Pilha(){
        this.refNoEntrada = null;
    }

    public void push(No novoNo) {
        No refAux = refNoEntrada;
        refNoEntrada = novoNo;
        refNoEntrada.setRef(refAux);
    }

    public No pop() {
        if(!this.isEmpty()){
            No noPoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getRef();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntrada;
    }

    public boolean isEmpty() {
        return refNoEntrada == null ? true : false;
    }


    @Override
    public String toString() {
        String stringRetorno = "------------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "------------------\n";

        No noAuxliar = refNoEntrada;

        while(true) {
            if(noAuxliar != null) {
                stringRetorno += "[No{dado=" + noAuxliar.getDado() + "}]\n";
                noAuxliar = noAuxliar.getRef(); 
            }else{
                break;
            }
        }
        stringRetorno += "------------------\n";
        return stringRetorno;
    }
}
