package entities;

import enums.StatusChamado;
import enums.TipoUsuario;
import enums.StatusChamado;
import java.util.LocalDateTime;


public class Chamado{
    private int id;
    private String titulo;
    private String descrição;


    private Categoria categoriaId;
    private StatusChamado status;

    private Usuario cliente;
    private Usuario responsavel;

    private LocalDatetime criadoEm;
    private LocalDateTime atualizadoEm;
    private LocalDateTime fechadoEm;

    public chamado(int id, String titulo, String descrição,Categoria categoriaId, StatusChamado status,Usuario cliente){

        this.id=id;
        this.titulo=titulo;
        this.descrição=descrição;
        this.categoria=categoriaId;
        this.status=status;
        this.cliente=cliente;

        this.status=StatusChamado.ABERTO;

        this.responsavel=null;

        this.criadoEm=LocalDateTime.now();
        this.atualizadoEm=LocalDateTime.now();
        this.fechadoEm=null;

        //getters
        //cadastro de pessoa
        public int getId(){
            return id;
        }

        public String getTitulo(){
            return titulo;
        }

        public Descrição getDescrição(){
            return descrição;
        }


        //identificação de pessoa
        public StatusChamado getStatus(){
            return status;
        }

        public Categoria getCategoriaId(){
            return categoriaID;
        }



        //tipo de usuario
        public Usuario getCLiente(){
            return cliente;
        }
        public Usuario getResponsavel(){
            return responsavel;
        }

        //Localdates

        public LocalDateTime getCriadoem(){
            return criadoEm;
        }

        public LocalDateTime getAtualizadoEm(){
            return atualizadoEm;
        }

        public LocalDateTime getFechadoEm(){
            return fechadoEm;
        }

        //SETTERS
        public void setTItulo(int id){
            this.titulo=titulo;
            touch();
        }

        public void setDescrição(Descrição descrição){
            this.descrição=descrição;
            touch();
        }
        public void setCategoriaId(Categoria categoriaId){
            this.categoriaId=categoriaId;
        }

        public void setStatus(StatusChamado status){
            this.status=status;
            touch();
        }

        public void setResponsavel (Usuario responsavel){
            this.responsavel=responsavel;
            touch();
        }

        public void setFechadoEm(LocalDateTime fechadoEm){
            this.fechadoEm=fechadoEm;
            touch();
        }

        //usar o private touch pra ficar atualizando todos

        private void  touch(){
            this.atualizadoEm=LocalDateTime.now()
        }
        







    }

}