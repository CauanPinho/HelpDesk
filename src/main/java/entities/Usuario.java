package entities;
import enums.TipoUsuario;
//declara as variáveis
public class Usuario{
    private int id;
    private String nome;
    private String email;
    private TipoUsuario tipo;
    private boolean ativo;

//Constructor
    public Usuario(int id,String nome, String email,TipoUsuario tipo, boolean ativo ){
        this.id=id;
        this.nome=nome;
        this.email=email;
        this.tipo=tipo;
        this.ativo=ativo;
    }
    //getters
    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }

    public TipouUsuario getTipo(){
        return tipo;
    }

    public boolean isAtivo(){
        return ativo;
    }

    //SETTERS
    public void setId(int id){
        this.id=id;
    }
    public void setNome(String Nome){
        this.id=id;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setTipo(TipoUsuario tipo){
        this.tipo=tipo;
    }
    public void setAtivo(boolean Ativo){
        this.ativo=ativo;
    }

    @Override
    Public String toString(){
        return "USUARIO: " +
        "ID: " + id +
        "NOME: " + nome +
        "EMAIL: " + email +
        "TIPO DE USUARIO: " + tipo +
        "STATUS: " + ativo ;
    }

}