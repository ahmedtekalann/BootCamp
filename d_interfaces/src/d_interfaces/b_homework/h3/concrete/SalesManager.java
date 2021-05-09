package d_interfaces.b_homework.h3.concrete;

import d_interfaces.b_homework.h3.abstracts.BaseSalesManager;
import d_interfaces.b_homework.h3.abstracts.SalesService;
import d_interfaces.b_homework.h3.entities.Campaign;
import d_interfaces.b_homework.h3.entities.Game;
import d_interfaces.b_homework.h3.entities.Sales;
import d_interfaces.b_homework.h3.entities.User;

public class SalesManager extends BaseSalesManager implements SalesService {

	@Override
	public void salesAddition(Sales sales, Game game) {
		System.out.println("The price of the " + game.getGameName() + " is " + sales.getPrice() + "$.");
	}

	public void sales(Game game, User gamer, Sales sales) {
		System.out.println(game.getGameName() + " sold for " + sales.getPrice() + " for " + gamer.getFirstName());
	}

	@Override
	public void campaignSales(Game game, User gamer, Sales sales, Campaign campaign) {

		double promotionalPrice = sales.getPrice() - (sales.getPrice() * campaign.getDiscountRate());

		System.out.println("The " + game.getGameName() + ", with a sales price of " + sales.getPrice()
				+ ", was sold to " + gamer.getFirstName() + " with the '" + campaign.getCampaignName() + "' campaign.");
		System.out.println("The promotional price is: " + promotionalPrice);
		
	}

}
