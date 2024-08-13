package ejercicio7;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private int numPaginas;
    private String[] temas;

    public Libro(String isbn, String titulo, String autor, int anioPublicacion, String editorial, int numPaginas, String[] temas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.temas = temas;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnioPublicacion() { return añoPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) { this.añoPublicacion = anioPublicacion; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public int getNumPaginas() { return numPaginas; }
    public void setNumPaginas(int numPaginas) { this.numPaginas = numPaginas; }

    public String[] getTemas() { return temas; }
    public void setTemas(String[] temas) { this.temas = temas; }

    public void mostrarDatos() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("Editorial: " + editorial);
        System.out.println("Número de Páginas: " + numPaginas);
        System.out.print("Temas: ");
        if (temas.length > 0) {
            System.out.print(temas[0]);
        }
        if (temas.length > 1) {
            System.out.print(", " + temas[1]);
        }
        if (temas.length > 2) {
            System.out.print(", " + temas[2]);
        }
    }
}
