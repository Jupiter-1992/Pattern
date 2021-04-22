package dependencyinversion;

/**
 * Created by Jupiter on 2021/4/22.
 */
public class Jupiter {
//    public void studyJavaCourse(){
//        System.out.println("Jupiter正在学习Java课程");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("Jupiter正在学习Python课程");
//    }
//
//    public void studyAICourse(){
//        System.out.println("Jupiter正在学习AI课程");
//    }

//    public void study(ICourse course){
//        course.study();
//    }

    private ICourse iCourse;

//    public Jupiter(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.study();
    }
}
