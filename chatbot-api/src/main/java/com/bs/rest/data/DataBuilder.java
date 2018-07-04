package com.bs.rest.data;

import java.util.ArrayList;
import java.util.List;

public class DataBuilder {

	private static final List<StaticData> dataList = new ArrayList<StaticData>();
	
	static{
		//build static data
		buildData();
	}

	private static void buildData() {
		dataList.add(createSampleData("hi|hello|hey","Hello Mr. Hiren Patel, How can I help you."));
		dataList.add(createSampleData("restaurants|restaurant|food","Do you want to try any new cuisine or dine in the regular restaurants you visited?"));
		dataList.add(createSampleData("new","Okay. That great! What kind of Food do you like? We have found some restaurants near by you which servers following foods Mexican/Italian/Chinese/Indian, Please choose anyone of them."));
		dataList.add(createSampleData("regular","Aha.. Let me look, As per past 3 months, you had visisted Italian/chinese, Please choose anyone of them."));
		dataList.add(createSampleData("maxican","Great Choice. Here are Maxican Resturants. 1. Armando's Mexican Food 2. Top Shelf Mexican."));
		dataList.add(createSampleData("italian","Awesome Choice. Here are Italian Resturants. 1. Tutti Santi by Nina 2. Romano's Macaroni Grill "));
		dataList.add(createSampleData("chinese","Super Choice. Here are Chinese Resturants. 1. Panda Express 2. Go Go China "));
		dataList.add(createSampleData("indian","Amazing Choice. Here are Indian Resturants. 1. Bawarchi Indian Cuisine 2. Marigold Maison "));
		dataList.add(createSampleData("offers|deal|coupons","Yes, There is one offer on some the restaurants too, Here is 1. If you spend $100, you will get 20% discount. Do you want to see all those Restaurants?"));
		dataList.add(createSampleData("yes","Here are Resturants list 1. Village Inn 2. Sonic Drive-In."));
		dataList.add(createSampleData("no","Have nice day Mr. Hiren Patel."));
		dataList.add(createSampleData("thanks|thank","It's my pleasure."));
		dataList.add(createSampleData("bye","Have nice day Mr. Hiren Patel."));
		dataList.add(createSampleData("great|awesome","That's my job. Thank You."));
	}
	
	private static StaticData createSampleData(String pattern, String value){
		StaticData sd = new StaticData();
		sd.setPattern(pattern);
		sd.setValue(value);
		return sd;
	}
	
	public static List<StaticData> getData(){
		return dataList;
	}
	
	
}
