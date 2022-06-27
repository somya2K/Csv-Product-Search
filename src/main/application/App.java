package com.nagarro.assignment.week7hibernate.src.main.application;

import java.io.FileNotFoundException;


import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
// java.util.logging.Logger;

import com.nagarro.assignment.week7hibernate.src.main.data.Tshirt;
import com.nagarro.assignment.week7hibernate.src.main.searchip.TshirtSearchIp;
import com.nagarro.assignment.week7hibernate.src.main.searchop.TshirtSearchOp;
import com.nagarro.assignment.week7hibernate.src.main.view.Input;
import com.nagarro.assignment.week7hibernate.src.main.view.Output;

//import org.jboss.logging.Level;



public class App {
	
public static void main(String[] args) throws FileNotFoundException
	{
        Input input = new Input();
        TshirtSearchIp tshirtSearchIp = input.getInput();
        
        TshirtSearchOp tshirtSearchOp = new TshirtSearchOp();
        ArrayList<Tshirt>matchedTShirts = tshirtSearchOp.getMatchingTshirts(tshirtSearchIp);
        
        Output output = new Output();
        output.displayOutput(matchedTShirts);
        
        Configure configure = new Configure();
        List<Tshirt> res = new ArrayList<Tshirt>();
        res = configure.searchItem("yellow","M","L");
        System.out.println(res);
	
//	Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
//	TshirtCsv tshirtcsv = new TshirtCsv();
//    TshirtCsv.start();
//    char ans;
//    
//    while (true) {
//        Input input = new Input();
//        TshirtSearchIp tshirtSearchIp = input.getInput();
//        Configure configure = new Configure();
//        List<Tshirt> list =  Configure.searchItem(input.getColor(), input.getGender(scn), input.getSize());
//        Output output = new Output();
//        output.DisplayItems(list, input.getOutputPreference());
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\nEnter Y for more inputs else enter N to exit");
//        ans = scanner.next().charAt(0);
//        if (ans == 'N') {
//            break;
//        }
        //}
//}
	}
}
