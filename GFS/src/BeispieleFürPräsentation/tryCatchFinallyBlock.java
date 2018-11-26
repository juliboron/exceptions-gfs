package BeispieleFürPräsentation;


public class tryCatchFinallyBlock{

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




