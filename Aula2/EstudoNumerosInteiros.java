public class EstudoNumerosInteiros{
    public static void main(String[] args) {
        int a, b, c; //ocupa 32 bits (4 bytes) -> valores de -2G a 2G
        //long b; //ocupa 64 bits (8 bytes) -> valores de -9P a 9P
        //short c; //ocupa 16 bits (2 bytes) -> valores de -32.768 a 32.767
        //byte d; //ocupa 8 bits (1 byte) -> valores de -128 a 127

        //a = 10;
        //b = 8914;
        //c = 10000;
        //d = (byte)128; //casting = forçar o valor na variável //(127+1) = limite da representação de dados (127) + 1 = menor valor possível do byte (-128)

        //System.out.println("Valor de a = " + a);
        //System.out.println("Valor de b = " + b);
        //System.out.println("Valor de c = " + c);
        //System.out.println("Valor de d = " + d);

        //0000 = 0      > 0      0      0      0
        //0001 = 1      -2^3    2^2    2^1    2^0
        //0010 = 2      bit mais significativo
        //0011 = 3          0          1        1        0   =   6
        //0100 = 4      (0x(-2^3))  (1x2^2)  (1x2^1)  (0x2^0)
        //0101 = 5          0    +     4   +    2   +    0
        //0110 = 6
        //0111 = 7
        //1000 = -8  --- em byte ---
        //1001 = -7
        //1010 = -6
        //1011 = -5
        //1100 = -4
        //1101 = -3
        //1110 = -2
        //1111 = -1

        //c = a + b -> construção errada do código, pois os valores de a e b ainda não foram definidos
        a = 10;
        b = 3;
        //c = a / b; //resultado inteiro = 3
        c = a % b; //% = resto da divisão //c = a % b = 1  10|3
        //                                                - 9 3
        //                                                  1<-

        System.out.println("Valor do a = " + a);
        System.out.println("Valor do b = " + b);
        System.out.println("Valor do c = " + c);
    }
}