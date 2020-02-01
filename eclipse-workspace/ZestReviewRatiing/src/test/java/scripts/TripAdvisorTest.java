package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FileLib;
import generic.WebDriverUtils;
import pages.TripAdvisorHomepage;
import pages.TripAdvisorHotelDetailsPage;
import pages.TripAdvisorHotelListPage;
import pages.TripAdvisorHotelReviewPage;

public class TripAdvisorTest extends BaseTest 
{

	@Test
	public void tripAdvisorPageTest() throws IOException, InterruptedException
	{
		/* Step 1 : TripAdvisor Home Page */
		
		TripAdvisorHomepage tahp = new TripAdvisorHomepage(driver);
		
		/* Step 2 : Search for searchBox and search for Hotel by name Club Mahindra */
		
		/* It Navigates to Hotel List Page */
		
		TripAdvisorHotelListPage tahlp = tahp.searchForHotels(FileLib.getCommonDatafromProperties("hotelName"));
		
		/* From List of hotels displayed select the First option from the list */
		
		/* Hotel is Selected and it navigates to Hotel details Page */		
		
		TripAdvisorHotelDetailsPage tahdp = tahlp.clickOnFirstResult();
		
		/*In order to Review about the Hotel , select Write Review option */
		
		/* It Navigates to Hotel Review Page */
		
		TripAdvisorHotelReviewPage tahrp = tahdp.clickOnWriteReviewBtn();
		
		/* Perform Mouse Hover action on the ratings and select 5th rating */
		
		tahrp.userRating();
		
		/* Enter the Summary of the visit to the Hotel */
		
		tahrp.summaryOfVisit("vacation");
		
		/* Enter the User Revirew regarding the Hotel */
		
		tahrp.userReview("Good");
		
		/* Check if Hotel Ratings are avaliable if avaliable do the mouse hover Actions and select 5th rating */

		tahrp.hotelRatings();
		
		/* Click on Submit check Box */
		
		tahrp.clickOnSubmitReviewCheckBox();
	}

}
