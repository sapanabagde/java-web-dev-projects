import java.util.ArrayList;

public class Course {

        //fields
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;

        //constructor
        public Course( String topic, Teacher instructor, ArrayList<Student> enrolledStudents){
                this.topic = topic;
                this.instructor = instructor;
                this.enrolledStudents = enrolledStudents;

        }

}
