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

        public int getId(){
            this.id=id;
        }

        public String getTitulo(){
            this.titulo=titulo;
        }

        public Descrição getDescrição(){
            this.descrição=descrição;
        }
        public StatusChamado getStatus(){
            this.status=status;
        }

        public Categoria getCategoriaId(){
            this.categoriaId=categoriaID;
        }
        public Usuario getCLiente(){
            this.cliente=cliente;
        }


    }

}