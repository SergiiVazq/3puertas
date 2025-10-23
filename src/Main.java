import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int victoriascambiando = 0;
        int victoriasmanteniendo = 0;
        int abierta;
        int otracerrada;
        int partidas =1000;

        for (int i = 0; i < partidas; i++) {
            int premio = (int) (Math.random() * 3);
            int eleccion = (int) (Math.random() * 3);
            do {
                abierta = (int) (Math.random() * 3);

            } while (abierta == premio || abierta == eleccion);
            do {
                otracerrada = (int) (Math.random() * 3);
            } while (otracerrada == abierta || otracerrada == eleccion);

            if (eleccion == premio) {
                victoriasmanteniendo++;
            }
            if (otracerrada == premio) {
                victoriascambiando++;

            }

        }
        System.out.println(" nuemro de partidas totales :" + partidas);
        float manteniendo = (float)(victoriasmanteniendo)/(float)(partidas)*100;
        System.out.println("Victorias manteniendo= "+ victoriasmanteniendo + " es un "+ manteniendo + "%");
        float cambiando = (float)(victoriascambiando)/(float)(partidas)*100;
        System.out.println("Victorias cambiando= "+ victoriascambiando + " es un "+ cambiando + "%");


    }
}