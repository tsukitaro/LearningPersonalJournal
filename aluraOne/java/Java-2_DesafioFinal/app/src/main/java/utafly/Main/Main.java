package utafly.Main;

import utafly.modelos.AddFav;
import utafly.modelos.Cancion;
import utafly.modelos.Podcats;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Cancion miCancion = new Cancion();
    miCancion.setTitulo("Mirai ni narenakatta ano yoru ni");
    miCancion.setAutor("Amazarashii");


    Podcats miPodcats = new Podcats();
    miPodcats.setPresentador("Gabriela Aguilar");
    miPodcats.setTitulo("Cafe.Tech");

    for (int i = 0; i < 100; i++) {
      miCancion.meGusta();
    }
    for (int i = 0; i < 5000; i++) {
      miCancion.reproducir();
    }
    // obj Podcats
    for (int i = 0; i < 100; i++) {
      miPodcats.meGusta();
    }
    for (int i = 0; i < 8000; i++) {
      miPodcats.reproducir();
    }


    System.out.println("Total de me gusta: "+miCancion.getTotalDeMeGusta());
    System.out.println("Total de reproducciones: "+miCancion.getTotalDeReproducciones());

    AddFav favoritos = new AddFav();
    favoritos.getAddFavorites(miCancion);
    favoritos.getAddFavorites(miPodcats);
    


  }
}
