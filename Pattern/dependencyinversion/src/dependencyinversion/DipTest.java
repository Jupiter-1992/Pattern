package dependencyinversion;

/**
 * Created by Jupiter on 2021/4/22.
 */
public class DipTest {

    public static void main(String[] args) {
        //=====  V1  ========
//        Jupiter jupiter = new Jupiter();
//        jupiter.studyJavaCourse();
//        jupiter.studyPythonCourse();
//        jupiter.studyAICourse();


        //=====  V2  ========
//        Jupiter jupiter = new Jupiter();
//        jupiter.study(new JavaCourse());
//        jupiter.study(new PythonCourse());


        //=====  V3  ========
//        Jupiter jupiter = new Jupiter(new JavaCourse());
//        jupiter.study();


        //=====  V4  ========
        Jupiter jupiter = new Jupiter();
        jupiter.setiCourse(new JavaCourse());
        jupiter.study();
    }
}
