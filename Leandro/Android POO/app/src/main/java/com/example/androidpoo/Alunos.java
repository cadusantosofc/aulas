package com.example.androidpoo;

import java.io.Serializable;

public class Alunos implements Serializable {

    private int id;
    private String nome;
    private String documento;
    private String curso;

    public Alunos(int id, String name, String doc, String course){
        this.id = id;
        this.nome = name;
        this.documento = doc;
        this.curso = course;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getDocumento(){
        return documento;
    }

    public String getCurso(){
        return curso;
    }

}
