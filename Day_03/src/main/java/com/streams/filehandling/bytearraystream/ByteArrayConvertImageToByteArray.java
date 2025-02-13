package com.streams.filehandling.bytearraystream;

import java.io.File;
import java.util.Arrays;

public class ByteArrayConvertImageToByteArray {
    public static void main(String[] args) {
        File sourcePath = new File("src/main/java/com/streams/filehandling/bytearraystream/sourceImage.jpg");
        File destinationPath = new File("src/main/java/com/streams/filehandling/bytearraystream/destinationImage.jpg");
        try{
            //convert image to byte array
            byte[] imageBytes = ConvertImageToByteArray.convertImageToByteArray(sourcePath);

            //writing byte array back to image file
            ConvertingByteArrayToImage.writeByteToImageArray(imageBytes, destinationPath);
            byte[] secondImageBytes = ConvertImageToByteArray.convertImageToByteArray(destinationPath);
            boolean check = Arrays.equals(imageBytes , secondImageBytes);
            System.out.println("Image successfully converted and written to next address ");

            //check image are same or not
            if(check){
                System.out.println("Both image are identical");
            }
            else{
                System.out.println("Both image are not identical");
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
