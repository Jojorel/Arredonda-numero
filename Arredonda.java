/**
 * Escreva a descrição da classe asd aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class Arredonda{
    public static void main(String[] args){
        float nr = -5.75f;
        System.out.println("absoluto: " + Math.abs(nr) +
        "\ninteiro mais baixo: " + Math.ceil(nr) + "\nDouble mais proximo: "
        + Math.rint(nr) + "\nArredondamento: " + Math.round(nr));
    }
}