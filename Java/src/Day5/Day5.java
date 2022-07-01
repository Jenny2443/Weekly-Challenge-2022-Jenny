package Day5;

import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.net.*;

/*
 * Reto #5
 * ASPECT RATIO DE UNA IMAGEN
 * Fecha publicación enunciado: 01/02/22
 * Fecha publicación resolución: 07/02/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Day5 {
    public static void getAspectRatio(URL url){
        int width,height,aspectRatio;
        try{
            BufferedImage im = ImageIO.read(url); //Lee del url los datos de la imagen
            width = im.getWidth(); //Como ya tenemos la imagen(im) podemos obtener sus datos con getWidth y getHeight
            height = im.getHeight();
            aspectRatio = width / height; //Calculo de aspecto = ancho / largo
            System.out.println(aspectRatio);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png");
        getAspectRatio(url);

        /*Sin funciones
        BufferedImage im;
        int width;
        int height;
        int aspectRatio1;
        try{
            URL u = new URL("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png");
            im = ImageIO.read(u);
            width = im.getWidth();
            height = im.getHeight();
            aspectRatio1 = width / height;
            System.out.println(width);
            System.out.println(height);
            System.out.println(aspectRatio1);
        }catch(IOException e){

        }

    }*/
    }
}
