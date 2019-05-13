package AprendizajeLearning;

public class Main {

    public static void main(String args[]) {
        int[] numeros= new int[]{24, 56, 34, 12, 12, 34, 56, 24};

        System.out.println("Array original: "+ (numeros[0])+"-"+(numeros[1])+"-"+(numeros[2])+"-"+(numeros[3])+"-"+(numeros[4])+"-"+(numeros[5])+"-"+(numeros[6])+"-"+(numeros[7]));

        if (palindromosVector (numeros)==1) System.out.println("Habemus palindromo");
        else System.out.println("Ni de bromis palindromo");

    }

    public static int palindromosVector(int[] numeros) {
        int resultado=0;
        for (int i = 0; i < numeros.length/2; i++) {
            if (numeros[i]!=(numeros[numeros.length-i-1]))
                resultado=0;
            else resultado=1;
        }
        return resultado;
    }
}