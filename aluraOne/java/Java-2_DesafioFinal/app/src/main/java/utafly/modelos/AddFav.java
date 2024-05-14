package utafly.modelos;

/**
 * AddFav
 */
public class AddFav {

  
 
public void getAddFavorites(Audio audio) {
     if (audio.getClasificacion()>8) {
      System.out.println("Es favorito del momento");
    }else if (audio.getClasificacion()==2) {
      System.out.println("Esta siendo considerada");
    }else {
      System.out.println("Otras estan siendo mejores");
    }
  }
}

