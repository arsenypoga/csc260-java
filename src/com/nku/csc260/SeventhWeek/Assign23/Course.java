package com.nku.csc260.SeventhWeek.Assign23;

import java.util.Objects;

/**
 * @author Arseny
 * @since 8/24/2017
 */
public class Course {

    private String _courseName;

    private int _numberOfStudents;
    private String[] _students = new String[10];

    public Course (String corseName) {
        this._courseName = corseName;
    }


    public String[] getStudents() {
        return this._students;
    }

    public int getNumberOfStudents() {
        return this._numberOfStudents;
    }

    public String getCourseName() {
        return this._courseName;
    }

    public void addStudent(String student) {

        if (this._numberOfStudents >= this._students.length) {
            String[] temp = new String[this._students.length * 2];
            System.arraycopy(this._students, 0, temp, 0, this._students.length);
            this._students = temp;
        }
        this._students[this._numberOfStudents++] = student;
    }

    public void dropStudent(String student) {

        for (int i = 0; i < this._students.length; i++) {

            if (student.equalsIgnoreCase(this._students[i])) {

                this._students[i] = null; // sets dropped student's value to null
                this._numberOfStudents--;
                while (i < this._numberOfStudents) {
                    this._students[i] = this._students[i + 1];
                    i++;
                }
                break;
            }
        }
    }

    public void clear() {
        this._students = new String[10];
        this._numberOfStudents = 0;
    }





}
