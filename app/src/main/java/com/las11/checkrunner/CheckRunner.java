package com.las11.checkrunner;

import com.las11.checkrunner.ArgsListChecker;
import com.las11.checkrunner.Check;
import com.las11.checkrunner.DirectorDefault;
import com.las11.checkrunner.CheckBuilderDefault;


public class CheckRunner {
    public static void main(String[] args) throws Exception{
		
		ArgsListChecker argsChecker = new ArgsListChecker(args);
		if (argsChecker.isArgsListEmpty()) {
			System.out.println("The list is empty!");
			System.exit(-1);
		} 
		
		int cardNum = argsChecker.getLastDiscountCard();
		int itemsSize = args.length - argsChecker.getAmountOfDiscountCards();
		int items[][] = argsChecker.generateItemsList(itemsSize);
		
		Check check = new Check(items);
		CheckBuilderDefault builder = new CheckBuilderDefault();

		DirectorDefault director = new DirectorDefault();
		director.printDefaultCheck(builder, check);
		
		String path = "D://check.txt";
		DirectorToFileDefault directorFile = new DirectorToFileDefault();
		directorFile.printDefaultCheck(builder, check, path);

    }
	
}