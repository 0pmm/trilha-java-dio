public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> refPrimeiroNo;
    private NoDuplo<T> refUltimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.refPrimeiroNo = null;
        this.refUltimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return tamanhoLista;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index) {
        if (index < 0 || index >= tamanhoLista)
            throw new IndexOutOfBoundsException("Index: " + index);

        NoDuplo<T> noAuxiliar = refPrimeiroNo;
        for (int i = 0; i < index; i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    /* ================= ADD NO FINAL ================= */

    public void add(T conteudo) {
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);

        novoNo.setNoAnterior(refUltimoNo);
        novoNo.setNoProximo(null);

        if (refPrimeiroNo == null) {
            refPrimeiroNo = novoNo;
        } else {
            refUltimoNo.setNoProximo(novoNo);
        }

        refUltimoNo = novoNo;
        tamanhoLista++;
    }

    /* ================= ADD POR ÍNDICE ================= */

    public void add(int index, T conteudo) {
        if (index < 0 || index > tamanhoLista)
            throw new IndexOutOfBoundsException("Index: " + index);

        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);

        if (index == 0) {
            novoNo.setNoProximo(refPrimeiroNo);
            novoNo.setNoAnterior(null);

            if (refPrimeiroNo != null)
                refPrimeiroNo.setNoAnterior(novoNo);

            refPrimeiroNo = novoNo;

            if (tamanhoLista == 0)
                refUltimoNo = novoNo;

        } else if (index == tamanhoLista) {
            add(conteudo);
            return;

        } else {
            NoDuplo<T> noAtual = getNo(index);
            NoDuplo<T> noAnterior = noAtual.getNoAnterior();

            novoNo.setNoAnterior(noAnterior);
            novoNo.setNoProximo(noAtual);

            noAnterior.setNoProximo(novoNo);
            noAtual.setNoAnterior(novoNo);
        }

        tamanhoLista++;
    }

    /* ================= REMOVE ================= */

    public void remove(int index) {
        if (index < 0 || index >= tamanhoLista)
            throw new IndexOutOfBoundsException("Index: " + index);

        NoDuplo<T> noRemovido = getNo(index);

        if (noRemovido == refPrimeiroNo) {
            refPrimeiroNo = noRemovido.getNoProximo();

            if (refPrimeiroNo != null)
                refPrimeiroNo.setNoAnterior(null);

        } else {
            noRemovido.getNoAnterior()
                      .setNoProximo(noRemovido.getNoProximo());
        }

        if (noRemovido == refUltimoNo) {
            refUltimoNo = noRemovido.getNoAnterior();
        } else {
            noRemovido.getNoProximo()
                      .setNoAnterior(noRemovido.getNoAnterior());
        }

        tamanhoLista--;
    }

    /* ================= TO STRING ================= */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoDuplo<T> noAuxiliar = refPrimeiroNo;

        while (noAuxiliar != null) {
            sb.append("[No{conteudo=")
              .append(noAuxiliar.getConteudo())
              .append("}] -> ");
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        sb.append("null");
        return sb.toString();
    }
}
