public class EstudoNumerosReais {
    public static void main(String[] args) {
        float x; //ocupa 32 bits (8 bytes)
        double y; //ocupa 64 bits (16 bytes)

        x = 1.0f; //1.0 é considerado double (não cabe no float) //f no fim = conversão para float (ou fazer casting -> x = (float) 1.0)
        y = 2.0; //d no fim (2.0d) = conversão para double

        System.out.println("Valor do x = " + x);
        System.out.println("Valor do y = " + y);
    }
}
