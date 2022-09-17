package poo.EjercicioTema5;


import poo.herencia.Coche;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl() {

        public static void main(String[] args) {

            cocheCRUD.save(new Coche());
            cocheCRUD.findAll();
            cocheCRUD.delete(new Coche());

        }
    };
}