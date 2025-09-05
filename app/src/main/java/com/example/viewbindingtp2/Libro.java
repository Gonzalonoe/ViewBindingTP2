package com.example.viewbindingtp2;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private String descripcion;
    private int paginas;
    private int portada;

    public Libro(String titulo, String autor, String descripcion, String editorial, int paginas, int portada) {
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.editorial = editorial;
        this.paginas = paginas;
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }
}
