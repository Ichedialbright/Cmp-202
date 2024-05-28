
class Student extends User{

    String matric_no;
    String admission_no;

    @Override
    String Register() {

        if (admission_no.equals("") || matric_no.equals("")){
            return "Can't be empty";
        }
        else {
            return "Success";
        }
    }
    void registerCourses(String course) {
        System.out.println(course);
    }
    String checkResult() {
        return "Results processed";
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.registerCourses("cmp202");
        System.out.println(student.checkResult());
    }
}