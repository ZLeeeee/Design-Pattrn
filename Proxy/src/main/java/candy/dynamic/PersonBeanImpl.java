package candy.dynamic;

import java.lang.reflect.Proxy;

public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interest;
    int rating;
    int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterest() {
        return interest;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0) return 0;
        return(rating/ratingCount);

    }

    @Override
    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

    public static PersonBean getOwnerPersonBeanProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),personBean.getClass().getInterfaces(),new OwnerInvocationHandler(personBean));
    }
    public static PersonBean getNonOwnerPersonBeanProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),personBean.getClass().getInterfaces(),new NonOwnerInvocationHandler(personBean));
    }

}
