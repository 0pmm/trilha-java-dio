public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public T first() {
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                } 
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }


    public void enqueue(T obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T dequeue() {
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No auxliar = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null){
                    auxliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    auxliar.setRefNo(null);
                    break;
                } 
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }


    @Override
    public String toString() {
        String stringRetorno = "";
        No auxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true) {
                stringRetorno += "[No{objeto=" + auxiliar.getObject() + "}]--->";
                if(auxiliar.getRefNo() != null){
                    auxiliar = auxiliar.getRefNo();
                }
                else{
                    stringRetorno += "null";
                    break;
                }
            }
        }
        return stringRetorno;
    }
}
