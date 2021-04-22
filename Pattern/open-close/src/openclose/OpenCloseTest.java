package openclose;

/**
 * Created by Jupiter on 2021/4/22.
 */
public class OpenCloseTest {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1,"Java架构",11800D);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse)iCourse;
        System.out.println("课程ID：" + discountCourse.getId() +
                    "\n课程标题：《" +  discountCourse.getName() + "》" +
                    "\n原价：" + discountCourse.getPrice() +
                    "\n售价：" + discountCourse.getDiscountPrice());
    }

}
