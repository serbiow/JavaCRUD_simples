package br.com.fatec.model;

import java.util.ArrayList;

public class Persistencia {
    public static ArrayList<Usuario> lista= new ArrayList<Usuario>();
    
    public static boolean cadastrar(Usuario user){
        if(user != null){
            lista.add(user);
            return true;
        }else{
            return false;
        }
    }
//excluir
//buscar
//alterar
//listar
}
