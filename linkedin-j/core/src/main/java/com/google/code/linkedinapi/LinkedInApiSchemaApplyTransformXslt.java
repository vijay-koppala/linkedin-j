package com.google.code.linkedinapi;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class LinkedInApiSchemaApplyTransformXslt {

	public static String XSLT_DIR = "/home/vijay/dev/code/icentris/sitequest/git-linkedin/workspace-code/linkedin-j/linkedin-j/core/src/main/resources/com/google/code/linkedinapi/schema/xslt";
	public static String SCHEMA_DIR = "/home/vijay/dev/code/icentris/sitequest/git-linkedin/workspace-code/linkedin-j/linkedin-j/core/src/main/resources/com/google/code/linkedinapi/schema/";
	
	public static void main(String[] args) {
		if(args.length > 0 && args[0].equals("sort")) {
			for(int i=1;i < args.length; i++) {
				sort(SCHEMA_DIR,
						args[i]);
			}
		} 
//		else if(false) {
//			
//		} 
		else {
			performTransformations(SCHEMA_DIR,
				"linkedinapi-schema-generated-new");
		}
	}
	
	public static void performTransformations(String dir, String inputFile) {
		inputFile = dir+File.separator+inputFile+".xsd";
		String outputFile = inputFile+"-xslt";

		try {
			File[] xsltFiles = loadXsltFiles(XSLT_DIR);
			for (int i=0; i < xsltFiles.length; i++) {
				File xsltFile  = xsltFiles[i];
				String tmpOutputFile = (i<xsltFiles.length-1 ? outputFile+"-"+i : outputFile)+".xsd";
				
				transform(inputFile, tmpOutputFile, xsltFile.getAbsolutePath());
			    inputFile = tmpOutputFile;
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		printXml(outputFile+".xsd");
	}
	
	
	public static void sort(String dir, String inputFile) {
		inputFile = dir+File.separator+inputFile;
		String outputFile = inputFile+"-sort.xsd";
		inputFile = inputFile+".xsd";

		try {
			File xsltFile = loadSortXsltFile(XSLT_DIR);
			transform(inputFile, outputFile, xsltFile.getAbsolutePath());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		printXml(outputFile);
	}
	
	
	
	
	public static void transform(String inputFile, String outputFile, String xsltFile) throws Exception {
	    Source xmlSource = new StreamSource(new FileInputStream(inputFile));
	    Source xsltSource = new StreamSource(xsltFile);
	    
	    Result result = new StreamResult(new FileOutputStream(outputFile));
	 
	    TransformerFactory transFactory = TransformerFactory.newInstance();
	    Transformer transformer = transFactory.newTransformer(xsltSource);
	 
	    transformer.transform(xmlSource, result);
		
	}
	
	public static void printXml(String file) {
		try {
			byte[] b = new byte[4096];
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			
			while(bis.read(b) > -1) {
				System.out.println(new String(b));
			}
			System.out.println(new String(b));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static File[] loadXsltFiles(String dirPath) {
	        ListXsltFiles xsltFilter = new ListXsltFiles();
	        File xsltDir = new File(dirPath);
	        File[] files = xsltDir.listFiles(xsltFilter);
	        Arrays.sort(files);
	        for (File file : files) {
				System.out.println(file.getAbsolutePath());
			}
	        return files;
	}
	
	public static File loadSortXsltFile(String dirPath) {
        File[] files = loadXsltFiles(dirPath);
        for (File file : files) {
        	if(file.getAbsolutePath().endsWith("-sort.xslt"))
        		return file;
		}
        return null;
	}
	
	static class ListXsltFiles implements FileFilter {

        @Override
        public boolean accept(File pathname) {
                String regex = ".*\\.xslt";
                if(pathname.getAbsolutePath().matches(regex)) {
                	return true;
                }
                return false;
        }
	}

}
