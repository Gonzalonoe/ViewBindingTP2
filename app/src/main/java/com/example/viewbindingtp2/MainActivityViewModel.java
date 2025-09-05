package com.example.viewbindingtp2;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private List<Libro> listaLibros;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }
    public void cargarListaLibros() {
        listaLibros= new ArrayList<>();
        listaLibros.add(new Libro("Harry Potter", "J. K. Rowling", "Bloomsbury",545,"Magia", R.drawable.libro1));
        listaLibros.add(new Libro("El Hobbit", "J.R.R Tolkien", "Minotauro",350,"Fantasia", R.drawable.libro2));
        listaLibros.add(new Libro("Juego de Tronos", "George R.R Maartin", "Plaza & Janés",800, "Aventura",  R.drawable.libro3));
    }
    public void buscarEnviarLibro(String tituloBuscado){
        cargarListaLibros();
        for (Libro libroAuxiliar: listaLibros){
            if(libroAuxiliar.getTitulo().equalsIgnoreCase(tituloBuscado)){
                Intent intent=new Intent(getApplication(), LibroActivity.class);
                intent.putExtra("SE ENCONTRO EL LIBRO",libroAuxiliar);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                getApplication().startActivity(intent);
            }
        }
    }
}
