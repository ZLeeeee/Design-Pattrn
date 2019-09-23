package candy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    public OwnerInvocationHandler(PersonBean personBean){
        this.personBean = personBean;
    }
    private PersonBean personBean;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if (method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("set")){
                return method.invoke(personBean,args);
            }
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
