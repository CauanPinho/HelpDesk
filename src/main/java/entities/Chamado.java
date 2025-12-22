package entities;

import enums.StatusChamado;
import java.time.LocalDateTime;

public class Chamado {
    private int id;
    private String titulo;
    private String descricao;

    private Categoria categoria;           // objeto Categoria
    private StatusChamado status;

    private Usuario cliente;               // objeto Usuario
    private Usuario responsavel;           // pode começar null

    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
    private LocalDateTime fechadoEm;

    public Chamado(int id, String titulo, String descricao, Categoria categoria, Usuario cliente) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.cliente = cliente;

        this.status = StatusChamado.ABERTO;
        this.responsavel = null;

        this.criadoEm = LocalDateTime.now();
        this.atualizadoEm = LocalDateTime.now();
        this.fechadoEm = null;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public StatusChamado getStatus() {
        return status;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public LocalDateTime getFechadoEm() {
        return fechadoEm;
    }

    // SETTERS (os que fazem sentido alterar)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
        touch();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        touch();
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
        touch();
    }

    public void setStatus(StatusChamado status) {
        this.status = status;
        touch();
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
        touch();
    }

    public void setFechadoEm(LocalDateTime fechadoEm) {
        this.fechadoEm = fechadoEm;
        touch();
    }

    // atualiza o "atualizadoEm" sempre que algo muda
    private void touch() {
        this.atualizadoEm = LocalDateTime.now();
    }

    @Override
    public String toString() {
        String nomeCategoria = (categoria != null) ? categoria.getNome() : "N/A";
        String nomeCliente = (cliente != null) ? cliente.getNome() : "N/A";
        String nomeResponsavel = (responsavel != null) ? responsavel.getNome() : "N/A";

        return "Chamado{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", categoria='" + nomeCategoria + '\'' +
                ", status=" + status +
                ", cliente='" + nomeCliente + '\'' +
                ", responsavel='" + nomeResponsavel + '\'' +
                ", criadoEm=" + criadoEm +
                ", atualizadoEm=" + atualizadoEm +
                ", fechadoEm=" + fechadoEm +
                '}';
    }
}
