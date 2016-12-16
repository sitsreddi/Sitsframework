package objectrepository;

import org.openqa.selenium.By;

public class Homepage {
	// static variable will not change 
	// By type or class
	
	
public static By lnk_usps_location=By.linkText("Find USPS Locations");
public static By txt_location_city_state= By.id("tCityStateZip");
public static By btn_location_search= By.id("bSearch");
public static By lnk_first_search_link= By.className("po-name");

}
