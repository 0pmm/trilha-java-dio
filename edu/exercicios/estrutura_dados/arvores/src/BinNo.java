public class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo (T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = this.noDir = null;
    }

    public T getConteudo() {
        return conteudo;
    }
    public BinNo<T> getnoDir() {
        return noDir;
    }
    public BinNo<T> getnoEsq() {
        return noEsq;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public void setnoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }
    public void setnoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    @Override
    public String toString() {
        return "BinNo{" + "conteudo=" + conteudo + "}";
    }


}
