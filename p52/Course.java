package p52;
import java.util.Arrays;

class Course {

    static int maxCapacity = 3;

    String courseName;
    int enrolledStudents;
    String[] studentList;



    Course(String courseName){
        this.courseName = courseName;
        this.studentList = new String[maxCapacity];
        this.enrolledStudents = 0;
    }


    public static void setMaxCapacity(int capacity){
        Course.maxCapacity = capacity;
    }


    public void enrollStudent(String studentName){
        if (this.enrolledStudents >= maxCapacity){
            System.out.println("Maximum students in the course.");
        }
        else{
            for(int i = 0;i<this.studentList.length;i++){
                if(this.studentList[i] == null){
                    this.studentList[i] = studentName;
                    this.enrolledStudents++;
                    break;
                }

            }


        }
        System.out.println(Arrays.toString(this.studentList)); 

    }
    public  void unenrollStudent(String studentName){
        boolean isNameInCourse = false;

        for(int i = 0;i<this.studentList.length;i++){
            if(studentName.equals(this.studentList[i])){
                this.studentList[i] = null;
                this.enrolledStudents--;
                isNameInCourse = true;
                break;
            }

        }
        if (!isNameInCourse){
            System.out.println(studentName + " is not the course");
        }
        System.out.println(Arrays.toString(this.studentList)); 

 
    }

}