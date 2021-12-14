package com.company;
import java.io.*;
import java.util.StringTokenizer;

public class p413 {
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
        FastReader r = new FastReader("D:\\Programame\\src\\com\\company\\pruebas.txt");
        try {
        	
        	int casos;
    		int []filas;
    		int blancas = 0;
    		int negras = 0;
    		double cantidad = 0;
    		double total;


    		casos = r.readSingleInt();

    		for(int i=0; i<casos; i++) {

    			filas = r.readIntArray(2);


    			total = filas[0] * filas[1];
    			cantidad = (double)total / 2;

    			blancas = (int)cantidad;
    			negras = (int)cantidad;

    			if(filas[0]== 1 && filas[1] == 1) {

    				blancas = 1;
    				negras = 0;

    			} else if(total %2 != 0 ) {

    				blancas = (int)cantidad + 1;

     			}

    			System.out.print(blancas + " " + negras);
    			System.out.println();

    		}


    	
        	
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
