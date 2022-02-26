public class arrays {
    public static void main(String[] args){

        String[] frutas = new String[6];
        int[] numeros = {10,20,30,40,50};


        frutas[0] = "Goiaba";
        frutas[1] = "Banana";
        frutas[2] = "Melancia";
        frutas[3] = "Amendoin";
        frutas[4] = "Uva";
        frutas[5] = "Melao";

        for(int i = 0; i <frutas.length; i++){
            System.out.printf("%s - ", frutas[i]);
        }
    }
}