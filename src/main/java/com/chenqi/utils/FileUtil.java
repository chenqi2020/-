package com.chenqi.utils;

import java.io.File;

public class FileUtil {

	
	public static String getExtendName(String fileName){
		
		if(!StringUtil.hasText(fileName))
			return null;
		return  fileName.substring(fileName.lastIndexOf("."));
	}
	
	public static File getTempDirectory(){
		
		String path = System.getProperty("java.io.tmpdir");
		
		return new File(path);
	}
	
	public static File getUserDirectory(){
	String path = System.getProperty("user.home");
		
		return new File(path);
	}
}
