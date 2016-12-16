package reusable;

import customcommands.ActionDriver;
import objectrepository.Homepage;

public class BusinessFunc extends ActionDriver{
	public static void search( String data){
		launchurl("https://www.usps.com");
		click(Homepage.lnk_usps_location);
		type(Homepage.txt_location_city_state,"21043");
		click(Homepage.btn_location_search);
		click(Homepage.lnk_first_search_link);
	}

}
