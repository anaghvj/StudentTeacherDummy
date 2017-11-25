package student.avjlabs.com.student;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by mypoolin on 11/25/2017.
 */

public class DB_Helper {
    void createTeachersTable(SQLiteDatabase checkDB1) {
        String CREATE_TEACHERS_TABLE = "CREATE TABLE if not exists " + FeedReaderContract.FeedEntry.TABLE_TEACHERS + "("
                + FeedReaderContract.FeedEntry.DB_KEY_TEACHER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + FeedReaderContract.FeedEntry.DB_KEY_TEACHER_NAME + " TEXT, "
                + FeedReaderContract.FeedEntry.DB_KEY_MOBILE + " INTEGER DEFAULT 0"
                + ");";
        checkDB1.execSQL(CREATE_TEACHERS_TABLE);
    }

    void createStudentsTable(SQLiteDatabase checkDB1) {
        String CREATE_STUDENTS_TABLE = "CREATE TABLE if not exists " + FeedReaderContract.FeedEntry.TABLE_STUDENTS + "("
                + FeedReaderContract.FeedEntry.DB_KEY_STUDENTS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + FeedReaderContract.FeedEntry.DB_KEY_STUDENT_NAME + " TEXT, "
                + FeedReaderContract.FeedEntry.DB_KEY_STUDENT_ADDRESS + " TEXT, "
                + FeedReaderContract.FeedEntry.DB_KEY_MOBILE + " INTEGER DEFAULT 0"
                + ");";
        checkDB1.execSQL(CREATE_STUDENTS_TABLE);
    }

    void createTeacherStudentTable(SQLiteDatabase checkDB1) {
        String CREATE_STUDENTS_TABLE = "CREATE TABLE if not exists " + FeedReaderContract.FeedEntry.TABLE_TEACHER_STUDENTS + "("
                + FeedReaderContract.FeedEntry.DB_KEY_STUDENTS_ID + " INTEGER ,"
                + FeedReaderContract.FeedEntry.DB_KEY_TEACHER_ID + " INTEGER "
                + ");";
        checkDB1.execSQL(CREATE_STUDENTS_TABLE);
    }
}
