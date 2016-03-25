package com.demo.config;

import com.demo.version.Version;

public class SvcConst {
	
	public static String url(String path) {
		return String.format(Version.API_URI_V1 + "%s", path);
	}
	
	public static void main(String[] args) {
		System.out.println(url("/blog"));
	}

}
