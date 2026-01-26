public class No {
    private int dado;
    private No refNo;

    public No(int dado) {
        this.dado = dado;
        this.refNo = null;
    }

    public int getDado() {return dado; }
    public No getRef() {return refNo; }

    public void setDado(int dado) {
        this.dado = dado;
    }
    public void setRef(No reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "No{" + "dado=" + dado + "}";
    }
}
