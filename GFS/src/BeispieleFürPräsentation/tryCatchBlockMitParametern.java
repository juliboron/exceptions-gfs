package BeispieleFürPräsentation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryCatchBlockMitParametern {

    public static void main(String[] args){

        try (BufferedReader br = new BufferedReader((new InputStreamReader(System.in)))){

            String str = "";
            str = br.readLine();

        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
