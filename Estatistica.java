import java.lang.Math;
import java.util.TreeMap;

public class Estatistica {
    // Esse metodo acha o menor valor da lista de valores.
    // Feito usando um laco for para passar por todos valores e um if para verificar se o menor é menor do que o valro atual.
    // Se o valor atual for menor do que o valor 'menor', o valor menor recebe o valor atual. 
    // Se o valor menor for menor do que o valor atual, nao acontece nada.
    public static int acharMenor(int[] valores) {
        int menor = valores[0];
        for (int valor : valores) {
            if (menor > valor) {
                menor = valor;
            }
        }
        return menor;
    }
    // Esse metodo acha o maior valor da lista de valores.
    // Feito usando um laço para passar por todos valores e um if para verificar se o maior é maior do que o valor atual.
    // Se o valor atual for maior do que o valor 'maior', o valor maior recebe o valor atual. 
    // Se o valor maior for maior do que o valor atual, nao acontece nada.
    public static int acharMaior(int[] valores) {
        int maior = valores[0];
        for (int valor : valores) {
            if (maior < valor) {
                maior = valor;
            }
        }
        return maior;
    }
    // Esse metodo calcula a soma do array.
    // 
    public static int acharSoma(int[] valores){
        int soma = 0;
        for( int valor : valores ) {
            soma += valor;
        }
        return soma;
    }
    // Esse metodo calcula a media do array.
    // Feito usando um laço para contabilizar todos valores e somando o valor atual com os outros.
    // Depois que se tem a soma de todos os valores do array, é dividido pelo total de valores.
    public static double acharMedia(int[] valores, int soma) {
        int total = valores.length;
        double media = ( double ) soma / total;
        return media;
    }
    // Esse metodo calcula a mediana do array.
    // Esse metodo primeiro verifica se o tamanho do array é par ou impar usando um if.
    // Depois de identificado se é par ou impar, o metodo pega o(s) valor(es) no meio do array.
    public static double acharMediana(int[] valores) {
        int inicio = 0;
        int meio;
        int fim = valores.length;
        double mediana;
        if ( ( fim % 2 ) != 0 ) {
            meio = ( fim - inicio ) / 2;
            mediana = valores[meio];
        } else {
            int meio1, meio2;
            meio1=( fim - inicio ) / 2;
            meio2 = meio1 - 1;
            mediana = (double) (valores[meio1] + valores[meio2])/2;
        }
        return mediana;
    }
    // Esse metodo calcula o desvio padrao do array.
    // Feito usando um for para passar por todos os valores do array e subtraindo ele com a media e depois elevando o resultado da subtração ao quadrado com a função pow da lib Math.
    // E depois adciona os valores em uma variavel chamada 'soma'.
    // Depois que é calculado de todos os valores do array, é dividido a soma dos valores calculados no for e é dividido pelo tamanho do array e então é tirado a raiz quadrada com a função sqrt da lib Math.
    public static double acharDesvioPadrao(int[] valores, double media){
        double soma = 0, a, d, im, dp, desvioPadrao;
        int tamanho = valores.length;
        for (int valor : valores){
            im = valor - media;
            a = Math.pow(im, 2.0);
            soma += a;
        }
        d = soma/tamanho;
        dp = (double) Math.sqrt(d);
        desvioPadrao = (double) (Math.round(dp*100.0)/100.0);
        return desvioPadrao;
    }
}