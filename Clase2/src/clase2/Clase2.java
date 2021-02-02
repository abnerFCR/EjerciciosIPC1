package clase2;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    static int[][] primerArray = new int[3][3];
    static int[][] segundoArray = new int[3][3];

    public static void main(String[] args) {
        //llenamos el array con numeros del 1 - 9
        int contador = 1;
        for (int i = 0; i < 3; i++) {         //recorrer las filas
            for (int j = 0; j < 3; j++) {     //recorrer las columnas
                primerArray[i][j] = contador;
                contador++;
            }
        }
        //Escribimos el archivo
        escribirArchivo();
        
        //leemos un fichero cuya ruta ingresamos por consola
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese ruta:");
        String ruta  = lector.nextLine();
        
        //mandamos a leer el fichero
        leerFichero(ruta);
        // TODO code application logic here
        /*
        for(int i = 0; i < 3; i++){         //recorrer las filas
            for(int j = 0; j < 3; j++){     //recorrer las columnas
                segundoArray[i][j] = contador;
                contador++;
            }
        }
        */
    }

    static void escribirArchivo() {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            //escribimos un fichero dentro de la carpeta de nuestro proyecto
            fichero = new FileWriter("./prueba.html");
            pw = new PrintWriter(fichero);
            //agregamos codigo html
            pw.println("<html><head><title>Primera Prueba desde Java</title>");
            pw.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">");
            pw.println("</head><body>");
            pw.println("<table class=\"table table-hover\">");
            for (int i = 0; i < 3; i++) {         //recorrer las filas
                pw.println("<tr class=\"table-primary\">");
                for (int j = 0; j < 3; j++) {     //recorrer las columnas
                    pw.println("<th>Soy el numero" + primerArray[i][j] + "</th>");
                }
                pw.println("</tr>");
            }
            pw.println("</table>");
            pw.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static void leerFichero(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            String contenido="";
            while ((linea = br.readLine()) != null) {
                contenido = contenido + linea+"\n";
            }
            String [] lineasArchivo = contenido.split("\n");
            
            String[] datos;
            int numFilas=lineasArchivo.length;
            for(int i = 0; i < lineasArchivo.length; i++){
                //datos es el arreglo que almacena cada uno de los elementos de una linea del archivo
                //aca deben almacenar cada uno de los elementos en el mismo arreglo. 
                //TERMINAR...
                datos = lineasArchivo[i].split(",");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
