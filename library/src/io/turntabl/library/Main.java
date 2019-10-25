package io.turntabl.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	//Book book = new Book(" THE PASSION OF CHRIST ", 123, " History ", " Phoenix ",BookState.BORROWED);
		//System.out.println(book);
	//Borrower bow = new Borrower(" Louisa Fosuah ",3233, "11/01/2001", BorrowerType.GOLD);
		//System.out.println(bow);

		List<Borrower> listOfBorrowers = Arrays.asList(
				new Borrower (" Louisa ",3233, "11/01/2001", BorrowerType.GOLD),
				new Borrower (" jackline ",3234, "14/01/2001", BorrowerType.CHILDREN),
				new Borrower (" Clara",3235, "11/07/2011", BorrowerType.GOLD),
				new Borrower (" Portia ",3236, "01/01/2001", BorrowerType.GOLD),
				new Borrower (" Abigail ",3237, "18/03/2018", BorrowerType.GOLD),
				new Borrower (" Esther ",3238, "21/03/2016", BorrowerType.GOLD),
				new Borrower (" Christopeace ",3239, "31/01/2011", BorrowerType.GOLD),
				new Borrower (" Rhoda ",3240, "19/01/2000", BorrowerType.GOLD),
				new Borrower (" Olivia ",3241, "17/01/2014", BorrowerType.GOLD),
				new Borrower (" Rebecca ",3242, "17/03/2013", BorrowerType.GOLD),
				new Borrower (" Anita ",3243, "15/01/2017", BorrowerType.GOLD),
				new Borrower (" Matilda ",3244, "21/04/2015", BorrowerType.GOLD)
				);

		System.out.println(listOfBorrowers.size());
		System.out.println("no. of borrowers: " + listOfBorrowers.size());

		List<Borrower> goldBorrowers = new ArrayList<>();

		for (Borrower goldBorrower : listOfBorrowers ){
			if(goldBorrower.getBorrowerType() == BorrowerType.GOLD){
				goldBorrowers.add(goldBorrower);
			}
		}
		System.out.println(goldBorrowers);

		List <String> goldNames =  new ArrayList<>();
		for(Borrower goldBorrower : goldBorrowers){
			goldNames.add(goldBorrower.getName());
		}
		System.out.println(goldNames);
		System.out.println("no. of borrowers: " + goldNames.size());

    }



}
