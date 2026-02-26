public class ArvoreBinaria<T extends Comparable<T>> {
    
    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = alocar(raiz, novoNo);
        
    }

    private BinNo<T> alocar (BinNo<T> atual, BinNo<T> novoNo) {
        if(atual == null) {
            return novoNo;
        } else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setnoEsq(alocar(atual.getnoEsq(), novoNo));
        } else {
            atual.setnoDir(alocar(atual.getnoDir(), novoNo));
        }
        return atual;
    }

    public void inOrdem() {
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if(atual != null) {
            exibirInOrdem(atual.getnoEsq());
            System.out.print(atual.getConteudo() + ",");
            exibirInOrdem(atual.getnoDir());
        }
    }

    public void posOrdem() {
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if(atual != null) {
            exibirInOrdem(atual.getnoEsq());
            exibirInOrdem(atual.getnoDir());
            System.out.print(atual.getConteudo() + ",");
        }
    }

    public void preOrdem() {
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if(atual != null) {
            System.out.print(atual.getConteudo() + ",");
            exibirInOrdem(atual.getnoEsq());
            exibirInOrdem(atual.getnoDir());
        }
    }

    public void remove(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;
            
            while(atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getnoEsq();
                } else {
                    atual = atual.getnoDir();
                }
            }

            if(atual == null) {
                System.out.println("Conteudo nao encontrado ~try");
            }
            
            if(pai == null) {
                if(atual.getnoDir() == null) {
                    this.raiz = atual.getnoEsq();
                }else if(atual.getnoEsq() == null) {
                    this.raiz = atual.getnoDir();
                }else {
                    for(temp = atual, filho = atual.getnoEsq(); 
                        filho.getnoDir() != null;
                        temp = filho, filho = filho.getnoEsq())
                    {
                        if(filho != atual.getnoEsq()) {
                            temp.setnoDir(filho.getnoEsq());
                            filho.setnoEsq(raiz.getnoEsq());
                        }                        
                    }
                    filho.setnoDir(raiz.getnoDir());
                    raiz = filho;
                }
            }else if(atual.getnoDir() == null) {
                if(pai.getnoEsq() == atual) {
                    pai.setnoEsq(atual.getnoEsq());
                }else {
                    pai.setnoDir(atual.getnoEsq());
                }
            }else if(atual.getnoEsq() == null) {
                if(pai.getnoEsq() == atual) {
                    pai.setnoEsq(atual.getnoDir());
                }else {
                    pai.setnoDir(atual.getnoEsq());
                }
            } else {
                for(
                    temp = atual, filho = atual.getnoEsq();
                    filho.getnoDir() != null;
                    temp = filho, filho = filho.getnoDir()
                ) {
                    if(filho != atual.getnoEsq()){
                        temp.setnoDir(filho.getnoEsq());
                        temp.setnoEsq(filho.getnoEsq());
                    }
                    filho.setnoDir(atual.getnoDir()); 
                    if(pai.getnoEsq() == atual) {
                        pai.setnoEsq(filho);
                    }else{
                        pai.setnoDir(filho);
                    }          
                }
            }
        
        } catch (NullPointerException e) {
            System.out.println("Conteudo nao encontrado");
        }
    }


}
