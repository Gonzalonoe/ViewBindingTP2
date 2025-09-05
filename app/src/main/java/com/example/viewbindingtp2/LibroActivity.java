package com.example.viewbindingtp2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.viewbindingtp2.databinding.ActivityLibroBinding;

public class LibroActivity extends AppCompatActivity {

    private ActivityLibroBinding binding;
    private LibroActivityViewModel vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityLibroBinding.inflate(getLayoutInflater());
        vm= new LibroActivityViewModel(getApplication());
        setContentView(binding.getRoot());
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(LibroActivityViewModel.class);;

        vm.getMutableLibro().observe(this, new Observer<Libro>() {
            @Override
            public void onChanged(Libro libro) {
                binding.edtTitulo.setText(libro.getTitulo());
                binding.edtAutor.setText(libro.getAutor());
                binding.edtEditorial.setText(libro.getEditorial());
                binding.edtPaginas.setText(libro.getPaginas());
                binding.edtCategoria.setText(libro.getCategoria());
                binding.portada.setImageResource(libro.getPortada());
            }
        });

        vm.recuperarLibroEnviado(getIntent());
    }
}