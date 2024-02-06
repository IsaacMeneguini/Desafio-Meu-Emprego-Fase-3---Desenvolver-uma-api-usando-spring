package mainApplication.estrutura.dto;

public class Dto {

    private long id;
    private String nome;
    private String profissao;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getnome() {
        return nome;
    }
    public void setnome(String titulo) {
        this.nome = titulo;
    }
    public String getprofissao() {
        return profissao;
    }
    public void setprofissao(String profisao) {
        this.profissao = profisao;
    }

}

