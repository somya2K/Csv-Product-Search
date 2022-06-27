package com.nagarro.assignment.week7hibernate.src.main.comparator;

import java.util.Comparator;

import com.nagarro.assignment.week7hibernate.src.main.data.Tshirt;

public class PriceComparator implements Comparator<Tshirt>{

	public int compare(Tshirt tshirt1,Tshirt tshirt2) {
		
		return (int)(tshirt1.getPrice()-tshirt2.getPrice());
	}
}
