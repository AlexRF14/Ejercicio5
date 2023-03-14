package dominio;
import java.util.stream.IntStream;
public class Aplicacion{


   public static int sumatorio(int n_in){
      int resultado = IntStream.rangeClosed(0, n_in)
            .reduce((a, b) -> a + b)
            .getAsInt();
      return resultado;
   }
   public static int factorial(int f_in){
        int resultado = IntStream.rangeClosed(1, f_in)
                .reduce((a, b) -> a * b)
                .getAsInt();
        return resultado;
   }
   public static int potencia_enesima(int m_in, int p_in){
    int resultado = IntStream.rangeClosed(1, p_in)
            .reduce((a, b) -> a * m_in)
            .getAsInt();
    return resultado;
    public static double sumaDeArray(double[] lista_in, int n_in){
         double resultado = IntStream.rangeClosed(0, n_in)
                .mapToDouble(i -> lista_in[i])
                .reduce((a, b) -> a + b)
                .getAsDouble();
         return resultado;
    }
   
    public static double desviacionDeArray(double[] lista_in, int n_in){
         double resultado = IntStream.rangeClosed(0, n_in)
                .mapToDouble(i -> lista_in[i])
                .map(i -> Math.pow(i, 2))
                .reduce((a, b) -> a + b)
                .getAsDouble();
         return resultado;
    }
    public static int sumaDePares(int x_in){
        int resultado = IntStream.rangeClosed(0, x_in)
                .filter(i -> i % 2 == 0)
                .reduce((a, b) -> a + b)
                .getAsInt();
        return resultado;
    }
   
    public static int sumaDeParesArray(double[] lista_in, int n_in){
        int resultado = IntStream.rangeClosed(0, n_in)
                .mapToDouble(i -> lista_in[i])
                .filter(i -> i % 2 == 0)
                .reduce((a, b) -> a + b)
                .getAsInt();
        return resultado;
    }
    public static int nuevaListaArray(double[] lista_in, int n_in){
        int resultado = IntStream.rangeClosed(0, n_in)
                .mapToDouble(i -> lista_in[i])
                .filter(i -> i % 2 == 0)
                .reduce((a, b) -> a + b)
                .getAsInt();
        return resultado;
    }
    public static int paresN(int h_in){
        int resultado = IntStream.rangeClosed(1, h_in)
                .filter(i -> i % 2 == 0)
                .reduce((a, b) -> a + b)
                .getAsInt();
        return resultado;
    }
    public static int productoEscalar(int[] vector1_in, int[] vector2_in, int n_in){
        int resultado = IntStream.rangeClosed(0, n_in)
                .map(i -> vector1_in[i] * vector2_in[i])
                .reduce((a, b) -> a + b)
                .getAsInt();
        return resultado;
    }
    public static int fibonacci(int f_in){
        int resultado = IntStream.rangeClosed(1, f_in)
                .reduce((a, b) -> a + b)
                .getAsInt();
        return resultado;
   }
}
}
}
