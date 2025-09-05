package com.example.viewbindingtp2;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class LibroActivityViewModel extends AndroidViewModel {

    private MutableLiveData<Libro> mutableLibro;
    public LibroActivityViewModel(@NonNull Application application)
    {
        super(application);
    }
    public LiveData<Libro> getMutableLibro(){
        if(mutableLibro== null)
            mutableLibro=new MutableLiveData<>();
        return mutableLibro;
    }
    public void recuperarLibroEnviado(Intent intent){
        Libro libroEnviado=(Libro) intent.getSerializableExtra("Libro encontrado", Libro.class);
        mutableLibro.setValue(libroEnviado);
    }
}
