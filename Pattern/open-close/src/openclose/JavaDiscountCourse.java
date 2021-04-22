package openclose;

/**
 * Created by Jupiter on 2021/4/22.
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice(){
        return super.getPrice() * 0.6;
    }

}
