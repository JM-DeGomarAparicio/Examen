package evf.javadoc.original;

public class Artista {
    String nombreArtista;
    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//comentario comflictivo
	//Prueba fetch
	//Prueba fetch 2
	//Jose Maria De Gomar Aparicio
    }
    
}


