package BeispieleFürPräsentation;


public class tryCatchBlock{

    public static void main(String[] args){

        try {
            //Kritischer Code
        }catch (ArithmeticException e){
            //Exception für durch Null teilen
        }catch (ArrayIndexOutOfBoundsException e){
            //Exception für Initialisierung einer Variable mit höherem Index als die Größe des Arrays
        }catch (Exception e){
            //Allgmeine Exception
        }finally {
            //Code der ausgeführt wird egal ob try erfolgreich war oder nicht
        }

    }
}


/*

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class tryCatchBlock {

    public static void main(String[] args){

        try {
            FileOutputStream fos = new FileOutputStream("abx.txt");
        } catch (FileNotFoundException e) {
            //Wenn keine Datei existiert
        } catch (IOException e){
            //Input Output Stream
        } catch (Exception e){
            //behandelt alle Typen der Exception
        }

    }

}

*/

