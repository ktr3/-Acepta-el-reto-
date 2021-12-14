package com.company;
import java.io.*;
import java.util.StringTokenizer;
public class Ejercicio433 {

	    public static class FastReader {
	        // Reader object
	        BufferedReader reader;

	        // Constructor
	        public FastReader()
	        {
	            // Initialize the reader
	            reader = new BufferedReader(new InputStreamReader(System.in));
	        }

	        public FastReader(String fileName) {
	            File file = new File(fileName);
	            try {
	                reader = new BufferedReader(new FileReader(file));
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	        // String tokenizer
	        StringTokenizer tokenizer;

	        // Function to read integer
	        public int readSingleInt()
	                throws IOException
	        {
	            return Integer.parseInt(reader.readLine());
	        }

	        // Function to read a single long
	        public long readSingleLong()
	                throws IOException
	        {
	            return Long.parseLong(reader.readLine());
	        }

	        // Function to read a array of
	        // numsInts integers in 1 line
	        public int[] readIntArray(int numInts)
	                throws IOException
	        {
	            int[] nums = new int[numInts];
	            tokenizer = new StringTokenizer(reader.readLine());

	            // Input Numbers
	            for (int i = 0; i < numInts; i++) {
	                nums[i] = Integer.parseInt(tokenizer.nextToken());
	            }
	            return nums;
	        }

	        // Function to read string
	        public String readString()
	                throws IOException
	        {
	            return reader.readLine();
	        }
	    }
	    public static void main(String[] args) throws IOException {
			 FastReader r = new FastReader();
	        StringBuffer s;
	        try {
	        	int uvas;
	        	int acumulador;
	                	
	    		uvas = r.readSingleInt();
	    		while (uvas !=0) {
	    			acumulador = 0 ;
	    			
	    			for (int i= 1; 1<= uvas;i++) {
	    				acumulador += i;
	    				
	    				if (acumulador >= uvas) {
	    					System.out.println(i);
	    					break;
	    				}
	    				}
	    			uvas = r.readSingleInt();
	    		}

	        } catch(IOException e) {
	            e.printStackTrace();
	        }

	    }
	}

