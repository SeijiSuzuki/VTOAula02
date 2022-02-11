package dio.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;

//        O erro está sendo causado por conta do limite máximo suportado do tipo;
//        short s2 = 40000;

//        Da mesma forma como o exemplo anterior, esse caso está ferindo o limite máximo;
//        porém de forma negativa;
//        int i1 = -10000000000;
        int i2 = 28500;

//        Quando existe um numero muito grande de valor, é necessário utilizar a letra L;
//        para que possa ser intepretado como um tipo long;
        long l1 = 100000000000000000L;
        long l2 = 200400500050005500L;

//        Essa situação consegue ser tratada com casting, mas esse assunto será abordado nas próximas aulas;
//        float f1 = 4.5;
        float f2 = 10.68F;

//        O double não necessita colocar o D no final do valor pois ele já automaticamente reconhece que
//        é uma variável double;
        double d1 = 85.69;
        double d2 = 99.54D;

//        Tipo char é aceito apenas um caracter;
        char c1 = 'w';
//        char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Ciclano";
        String st3 = "ag asdh adwubvr asdjlierj 6468/4 **()";

//        Existe uma classe para se trabalhar de forma otimizada com datas;
//        String dt1 = "09/02/1981";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(s1);

        System.out.println(i2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(c1);
        System.out.println(c3);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.println(bo1);
        System.out.println(bo2);
    }
}
