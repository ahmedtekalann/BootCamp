package d_interfaces.b_homework.h3.concrete;

import d_interfaces.b_homework.h3.abstracts.CampaignService;
import d_interfaces.b_homework.h3.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void campaignAddition(Campaign campaign) {

		System.out.println("Campaign added; The name is: " + campaign.getCampaignName() + " and the discount rate is: "
				+ campaign.getDiscountRate());

	}

	@Override
	public void multipleCampaignAddition(Campaign[] campaigns) {

		for (Campaign campaign : campaigns) {
			this.campaignAddition(campaign);
		}

	}

	@Override
	public void campaignDeletion(Campaign campaign) {
		System.out.println("Campaign deleted: " + campaign.getCampaignName());
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println("Campaign updated: " + campaign.getCampaignName());
	}

}
