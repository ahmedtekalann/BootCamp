package d_interfaces.b_homework.h3;

import java.util.GregorianCalendar;

import d_interfaces.b_homework.h3.abstracts.BaseSalesManager;
import d_interfaces.b_homework.h3.abstracts.CampaignService;
import d_interfaces.b_homework.h3.abstracts.GameService;
import d_interfaces.b_homework.h3.abstracts.SalesService;
import d_interfaces.b_homework.h3.abstracts.UserService;
import d_interfaces.b_homework.h3.adapters.MernisServiceAdapter;
import d_interfaces.b_homework.h3.concrete.CampaignManager;
import d_interfaces.b_homework.h3.concrete.GameManager;
import d_interfaces.b_homework.h3.concrete.SalesManager;
import d_interfaces.b_homework.h3.concrete.UserManager;
import d_interfaces.b_homework.h3.entities.Campaign;
import d_interfaces.b_homework.h3.entities.Game;
import d_interfaces.b_homework.h3.entities.Sales;
import d_interfaces.b_homework.h3.entities.User;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("----------User Addition----------");
		System.out.println("*Minority User Addition*");
		User user1 = new User();
		user1.setId(1);
		user1.setNatioanalityId("14785236956");
		user1.setFirstName("Ahmed");
		user1.setLastName("Tekalan");
		user1.setDateOfBirth(new GregorianCalendar(1993, 1, 1).getTime());
		UserService userManager = new UserManager(new MernisServiceAdapter());
		userManager.register(user1);
		userManager
				.register(new User(1, "Engin", "Demiro�", "28861499108", new GregorianCalendar(1985, 1, 6).getTime()));
		User user2 = new User(3, "Ayse", "Sari", "11122233366", new GregorianCalendar(1996, 6, 5).getTime());
		System.out.println("*Bulk User Addition*");
		User[] users = { user1, user2 };
		userManager.multipleRegisteration(users);
		System.out.println("");

		System.out.println("----------Game Addition----------");
		System.out.println("*Minority Game Addition*");
		GameService gameManager = new GameManager();
		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameName("CS:GO");
		gameManager.gameAddition(game1);
		System.out.println("*Bulk Game Addition*");
		Game[] games = { game1, new Game(2, "CS-1.6"), new Game(3, "Valorant"), new Game(4, "LoL") };
		gameManager.multipleGameAddition(games);
		System.out.println("");

		System.out.println("----------Campaign Addition----------");
		System.out.println("*Minority Campaign Addition*");
		Campaign campaign = new Campaign();
		campaign.setCampaignId(1);
		campaign.setCampaignName("Campaign 1");
		campaign.setDiscountRate(0.10);
		CampaignService campaignManager = new CampaignManager();
		campaignManager.campaignAddition(campaign);
		System.out.println("*Bulk Campaign Addition*");
		Campaign[] campaigns = { campaign, new Campaign(2, "Campaign 2", 0.20), new Campaign(3, "Campaign 3", 0.30),
				new Campaign(2, "Campaign 4", 0.40) };
		campaignManager.multipleCampaignAddition(campaigns);
		System.out.println("");

		System.out.println("----------Game Prices----------");
		SalesService salesManager = new SalesManager();
		Sales sales = new Sales();
		sales.setPrice(10);
		salesManager.salesAddition(sales, game1);
		Sales sales2 = new Sales(20);
		salesManager.salesAddition(sales2, games[1]);
		Sales sales3 = new Sales(30);
		salesManager.salesAddition(sales3, games[2]);
		Sales sales4 = new Sales(40);
		salesManager.salesAddition(sales4, games[3]);
		System.out.println("");

		System.out.println("----------Sales----------");
		BaseSalesManager salesManager2 = new SalesManager();
		salesManager2.sales(game1, user1, sales);
		salesManager2.sales(games[1], user1, sales2);
		salesManager2.sales(games[2], user2, sales3);
		salesManager2.sales(games[3], user2, sales4);
		System.out.println("");

		System.out.println("----------Sales with Campaign----------");
		salesManager2.campaignSales(game1, user1, sales, campaign);
		salesManager2.campaignSales(games[1], user1, sales2, campaigns[1]);
		salesManager2.campaignSales(games[2], user2, sales3, campaigns[2]);
		salesManager2.campaignSales(games[3], user2, sales2, campaigns[3]);
		System.out.println("");

		System.out.println("----------Extra Operations----------");
		userManager.update(user1);
		userManager.deletion(user1);
		campaignManager.campaignUpdate(campaign);
		campaignManager.campaignDeletion(campaign);

	}

}
