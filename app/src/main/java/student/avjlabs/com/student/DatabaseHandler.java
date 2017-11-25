package student.avjlabs.com.student;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mypoolin on 11/25/2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = FeedReaderContract.FeedEntry.DATABASE_VERSION;
    // Database Name
    private static final String DATABASE_NAME = FeedReaderContract.FeedEntry.DB_NAME;
    private static DatabaseHandler sInstance;

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized DatabaseHandler getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DatabaseHandler(context.getApplicationContext());
        }
        return sInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        DB_Helper db_helper = new DB_Helper();
        db_helper.createStudentsTable(sqLiteDatabase);
        db_helper.createTeachersTable(sqLiteDatabase);
        db_helper.createTeacherStudentTable(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public synchronized void addStudent(String name,
                                        int mobile,
                                        String address) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FeedReaderContract.FeedEntry.DB_KEY_STUDENT_NAME, name);
        values.put(FeedReaderContract.FeedEntry.DB_KEY_STUDENT_ADDRESS, address);
        values.put(FeedReaderContract.FeedEntry.DB_KEY_MOBILE, mobile);
        // Inserting Row
        db.insert(FeedReaderContract.FeedEntry.TABLE_STUDENTS, null, values);
        db.close(); // Closing database connection
    }

    public synchronized void addTeacher(String name,
                                        int mobile) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FeedReaderContract.FeedEntry.DB_KEY_TEACHER_NAME, name);
        values.put(FeedReaderContract.FeedEntry.DB_KEY_MOBILE, mobile);
        // Inserting Row
        db.insert(FeedReaderContract.FeedEntry.TABLE_TEACHERS, null, values);
        db.close(); // Closing database connection
    }

    public synchronized void addTeacherStudentMap(int studentid,
                                                  int teacherid) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FeedReaderContract.FeedEntry.DB_KEY_TEACHER_ID, teacherid);
        values.put(FeedReaderContract.FeedEntry.DB_KEY_STUDENTS_ID, studentid);
        // Inserting Row
        db.insert(FeedReaderContract.FeedEntry.TABLE_TEACHER_STUDENTS, null, values);
        db.close(); // Closing database connection
    }
}
