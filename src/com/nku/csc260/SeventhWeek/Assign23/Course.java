package com.nku.csc260.SeventhWeek.Assign23;

import java.util.ArrayList;

/**
 * @author Arseny
 * @since 8/24/2017
 */
public class Course {

    private String _courseName;

    private int _numberOfStudents = 4;
    private String[] _students = new String[] {"First student", "Second student", "Third student", "Forth student"};
    

    public Course (String corseName) {
        this._courseName = corseName;
    }

public void dropStudent(String studentName) {
	for(int i = 0; i < this._numberOfStudents; i++) {
		
		if (studentName.equalsIgnoreCase(this._students[i])) {
			this._students[i] = null;
			this._numberOfStudents--;
			
			ArrayList<String> newArr = new ArrayList<String> ();
			for (String name : this._students) {
				if (name != null) {
					newArr.add(name);
			}
				
			this._students = newArr.toArray(new String[0]);
		}
		
		
			
		}
		
	}
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




}
