import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Class<?> clazz = Class.forName("MinhaClasse");
            Object obj = clazz.getConstructor().newInstance();
            Field campoLista = clazz.getDeclaredField("lista");

            Class<?> arrayListClass = Class.forName("java.util.ArrayList");
            Object listaInstanciada = arrayListClass.getDeclaredConstructor().newInstance();

            campoLista.set(obj, listaInstanciada);

            Method metodoAdd = arrayListClass.getMethod("add", Object.class);

            metodoAdd.invoke(listaInstanciada, "Rodrigo");
            metodoAdd.invoke(listaInstanciada, "Eunice");
            metodoAdd.invoke(listaInstanciada, "Leandro");
            metodoAdd.invoke(listaInstanciada, "Cristiane");

            Method metodoSize = arrayListClass.getMethod("size");
            Method metodoGet = arrayListClass.getMethod("get", int.class);

            int tamanho = (int) metodoSize.invoke(listaInstanciada);

            for (int i = 0; i < tamanho; i++) {
                Object valor = metodoGet.invoke(listaInstanciada, i);
                System.out.println(valor);
            }
            System.out.println();
            System.out.println("Lista possui " + tamanho + " elementos.");
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
