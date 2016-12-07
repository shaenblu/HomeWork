import java.lang.reflect.*;
import java.util.*;


public class BeanUtils {
    public static void assign(Object from, Object to) throws InvocationTargetException, IllegalAccessException {
        Class fromClass = from.getClass();
        Class toClass = to.getClass();

        Map<String, Method> map = new HashMap<>();

        for (Method method : fromClass.getDeclaredMethods()) {
            String methodName = method.getName().toLowerCase();
            if (methodName.startsWith("get")) {
                methodName = methodName.substring(3, methodName.length());
                map.put(methodName, method);
            }
        }

        for (Method method : toClass.getDeclaredMethods()) {
            String methodName = method.getName().toLowerCase();
            if (methodName.startsWith("set")) {
                methodName = methodName.substring(3, methodName.length());

                for (String key : map.keySet()) {
                    if (key.equals(methodName)) {
                        if (method.getParameterCount() == 1 && map.get(methodName).getReturnType().equals(method.getParameterTypes()[0])) {
                            try {
                                method.invoke(to, map.get(methodName).invoke(from));
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }

            }

        }
    }
}
