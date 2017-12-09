package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String str = reader.readLine();
        //PrintWriter out = new PrintWriter(new FileWriter("/Users/boris/IdeaProjects/171109 HW InputOutput/src/com/company/PrintStream.txt", true), true);
        //out.write(str + System.lineSeparator());
        //out.close();

        InputStream inputStream = System.in;
        OutputStream outputStream = new FileOutputStream("/Users/boris/IdeaProjects/171109 HW InputOutput/src/com/company/PrintStream.txt");
        copy(inputStream, outputStream);
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte [] buffer = new byte[64 * 1024];

        while(true) {
            if(buffer.equals(49)){
                break;
            }
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
            System.out.println(buffer[1]);
        }
        inputStream.close();
        outputStream.close();

    }

    //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //String str = reader.readLine();

}
