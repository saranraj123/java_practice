package com.srn1535.serialization;

import java.io.*;

class StudentInfo implements Serializable {
	String name;
	int rid;
	static String contact;

	StudentInfo(String n, int r, String c) {
		this.name = n;
		this.rid = r;
		this.contact = c;
	}
}