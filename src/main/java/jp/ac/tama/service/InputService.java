package jp.ac.tama.service;

import jp.ac.tama.InputResult;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Scanner;

@Service
public class InputService{
    public InputResult ScanInput(InputStream inputStream){
        Scanner scanner =new Scanner (inputStream);
        System.out.println("Please input left side number.");
        int left = scanner.nextInt();
        System.out.println("Please input right side number");
        int right = scanner.nextInt();
        InputResult inputResult =new InputResult(right,left);
        return inputResult;
    }
}


