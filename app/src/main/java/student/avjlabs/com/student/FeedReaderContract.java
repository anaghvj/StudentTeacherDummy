package student.avjlabs.com.student;

import android.content.Context;
import android.provider.BaseColumns;

/**
 * Created by mypoolin on 11/25/2017.
 */

public class FeedReaderContract {
    public FeedReaderContract() {
    }

    public abstract class FeedEntry extends Context implements BaseColumns {
        public static final String DB_NAME = "sstudent.db";

        public static final int DATABASE_VERSION = 1;
        public static final String DB_KEY_TEACHER_ID = "teacher_id";

        public static final String DB_KEY_TEACHER_NAME = "teacher_name";
        public static final String DB_KEY_MOBILE = "teacher_mobile";
        public static final String DB_KEY_STUDENTS_ID = "student_id";
        public static final String DB_KEY_STUDENT_NAME = "student_name";
        public static final String DB_KEY_STUDENT_ADDRESS = "student_address";
        public static final String TABLE_TEACHERS = "teachers";
        public static final String TABLE_STUDENTS = "students";
        public static final String TABLE_TEACHER_STUDENTS = "teacher_student";
    }
}
