package Modelo;

public class Libro {
    private String autor;
    private String editorial;
    private String descripcion;
    private int anio;
    private int paginas;
    private String etiqueta;

    public Libro(int anio, String autor, String descripcion, String editorial, String etiqueta, int paginas) {
        this.anio = anio;
        this.autor = autor;
        this.descripcion = descripcion;
        this.editorial = editorial;
        this.etiqueta = etiqueta;
        this.paginas = paginas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
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

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
