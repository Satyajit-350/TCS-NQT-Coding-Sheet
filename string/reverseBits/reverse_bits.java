package string.reverseBits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverse_bits {
    

    public static void main(String[] args) throws IOException{
     
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Long X = Long.parseLong(reader.readLine());

        System.out.println(reverseBits(X));

    }

    private static Long reverseBits(Long x) {

        //convert the number into bits 
        String binary = Long.toBinaryString(x);

        //make it 32bits type and replace all the spaces with 0
        String leadingZero = String.format("%32s", binary).replace(' ', '0');

        //using stringBuilder reverse the string
        leadingZero = new StringBuilder(leadingZero).reverse().toString();

        //convert the string into decimal value
        return Long.parseLong(leadingZero, 2);
    }
    
}
