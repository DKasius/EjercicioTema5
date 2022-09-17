package poo.EjercicioTema5;

import poo.herencia.Coche;

import java.util.List;

public interface CocheCRUD {
    
    void save(Coche coche);
    
    List<Coche> findAll();
    
    void delete (Coche coche);


}
