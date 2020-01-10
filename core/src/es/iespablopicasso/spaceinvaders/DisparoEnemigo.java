package es.iespablopicasso.spaceinvaders;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Clase DisparoEnemigo. Representa a uno de sus disparos
 */

public class DisparoEnemigo extends ObjetoVolador {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //Definimos una constante para el nombre del fichero que contiene el sprite principal
    static private final String NOMBRE_SPRITE = "disparo_enemigo.png";

    //Las constantes para definir la velocidad de estos disparos
    static private final float VELOCIDAD_INICIAL_Y = -2.0f;
    static private final float VELOCIDAD_INICIAL_X = 0.0f;



    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public DisparoEnemigo(float nuevaPosX,float nuevaPosY) {
        nuevaPosX = posX;
        nuevaPosY = posY;
    }

    @Override
    public void pintarse(SpriteBatch miSB) {
        super.pintarse(miSB);
    }

    @Override
    public void moverse() {
        super.moverse();
    }

    public static float getVelocidadInicialY() {
        return VELOCIDAD_INICIAL_Y;
    }

    public static float getVelocidadInicialX() {
        return VELOCIDAD_INICIAL_X;
    }

    @Override
    public float getPosX() {
        return super.getPosX();
    }

    @Override
    public float getPosY() {
        return super.getPosY();
    }

    @Override
    public boolean colisiona(ObjetoVolador otro) {
        return super.colisiona(otro);
    }

    @Override
    public void dispose() {
        super.dispose();
    }

}