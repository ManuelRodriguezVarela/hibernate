package gal.san.clemente.tarefa_4_orm.model;

import java.io.Serializable;

public class Noticia implements Serializable {
    
    private String titulo;

    public Noticia(String titulo) {
        this.titulo = titulo;
    }
    
    public Noticia() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Noticias{" + "titulo=" + titulo + '}';
    }
    
}
