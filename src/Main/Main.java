package Main;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string ");
        String userInput = scanner.next();
        String[] huffmanCodes = {"1010","100000","00000","10110","010","110011","100010","0001","0110","110001011","11010011","10111","110010","0111","1001","100001","1100001001","0010","0011","1101","00001","1100000","1100010","1100001000","100011","1100001010"};
        String lowerCaseString  = userInput.toLowerCase();
        char[] characterArray = lowerCaseString.toCharArray();
        System.out.println("Huffman code is \n");
        for (int i = 0; i <characterArray.length ; i++)
        {
            int ascii = characterArray[i];
            ascii= ascii - 'a';

            System.out.print(huffmanCodes[ascii]+" ");


        }
        System.out.println(" \nthe binary string is ");
        for (int i = 0; i <characterArray.length ; i++)
        {
            int ascii = characterArray[i];


            String binaryWaali = Integer.toBinaryString(ascii);
            int length = binaryWaali.length();
            int remaingBits = 8 -length;
            String missingZeroes = "0".repeat(remaingBits);
            System.out.print(missingZeroes+binaryWaali+" ");

        }
        scanner.close();
           


    }
}
