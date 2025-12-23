package  entities;

import java.util.LocalDateTime;


public class ChamadoLog{
    private int id;
    private Chamado chamado;
    private LocalDateTime dataHora;
    private String acao;
    private String autor;
    private String detalhes;


    //CONSTRUTOR
    public ChamadoLog(int id,Chamado chamado,LocalDateTime dataHora,String acao,String autor,String detalhes) {
        this.id = id;
        this.chamado = chamado;
        this.dataHora = LocalDateTime;
        this.acao = acao;
        this.autor = autor;
        this.detalhes = detalhes;
    }
    //GETTERS
    public int getId(){
        return id;
    }

    public Chamado getChamado(){
        return chamado;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public String getAcao() {
        return acao;
    }

    public String getAutor() {
        return autor;
    }

    public String getDetalhes() {
        return detalhes;
    }

    //SETTERS

    public void setId(int id){
        this.id=id;}

    public void setChamado(Chamado chamado){
        this.chamado=chamado;}

    public void setDatahora(LocalDateTime dataHora){
        this.dataHora=dataHora;}

    public void setAcao(String acao){
        this.acao=acao;}

    public void setAutor(String autor){
        this.autor=autor;}

    public void setDetalhes(String detalhes){
        this.detalhes=detalhes;}




    public String toString() {
        String chamadoId = "N/A";
        if (chamado != null) {
            chamadoId = String.valueOf(chamado.getId());
        }

        String nomeAutor = "N/A";
        if (autor != null) {
            nomeAutor = autor.getNome();
        }

        return "ChamadoLog{" +
                "id=" + id +
                ", chamadoId=" + chamadoId +
                ", dataHora=" + dataHora +
                ", acao='" + acao + '\'' +
                ", autor='" + nomeAutor + '\'' +
                ", detalhes='" + detalhes + '\'' +
                '}';
    }
}