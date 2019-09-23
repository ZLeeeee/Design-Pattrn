import candy.dynamic.PersonBean;
import candy.dynamic.PersonBeanImpl;
import candy.remote.IconProxy;

public class Test {
    public static void main(String[] args) {
        PersonBeanImpl personBean = new PersonBeanImpl();
        PersonBean ownerPersonBeanProxy = PersonBeanImpl.getOwnerPersonBeanProxy(personBean);
        ownerPersonBeanProxy.setGender("1");
        ownerPersonBeanProxy.setHotOrNotRating(1);

        PersonBean nonOwnerPersonBeanProxy = PersonBeanImpl.getNonOwnerPersonBeanProxy(personBean);
    }
}
