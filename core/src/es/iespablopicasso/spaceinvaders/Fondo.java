import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Clase Fondo. Se encarga de dibujar y avanzar una simulación de "camara" por una imagen dada
 * En una escena tendremos varios fondos.
 */

public class Fondo {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////
    private Texture imgFondo; //Nuestra imagen a pintar.

    private int velocidadX;
    private int velocidadY;

    private int posX;
    private int posY;
    private int anchoVentana;
    private int altoVentana;
    private int ancho;
    private int alto;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTOS
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //CONSTRUCTOR/ES
    public Fondo(String fichero, int velImagenX, int velImagenY, int posIniX, int posIniY, int anV, int alV) {

        fichero="D:\\COSAS DEL CICLO ELECTRIC BOGALOO\\PROGRAMACION\\spaceinvaders_hueco\\android\\assets";
        velImagenY=velocidadY;
        velImagenX=velocidadX;
        posIniX=posX;
        posIniY=posY;
        anV=ancho;
        alV=alto;



    }

    //RESTO DE COMPORTAMIENTOS


    //método para avanzar la cámara
    public void avanzar() {

        if (posY<altoVentana*2){
            posY=0;
        }
        posY+=velocidadY;


    }

    //Comportamiento para pintar la ventana del fondo a utilizar
    public void pintate(SpriteBatch miSB) {

        TextureRegion ventana;
        miSB.begin();
        miSB.draw(imgFondo,posX,posY,velocidadX,velocidadY);
        miSB.end();

    }


    //Método para liberar recursos
    public void dispose() {
        imgFondo.dispose();
    }


    public int getAltoFondo() {
        return 0;
    }

    public int getAnchoFondo() {
        return 0;
    }
}















