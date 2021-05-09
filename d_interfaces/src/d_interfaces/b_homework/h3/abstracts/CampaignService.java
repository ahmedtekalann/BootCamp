package d_interfaces.b_homework.h3.abstracts;

import d_interfaces.b_homework.h3.entities.Campaign;

public interface CampaignService {

	void campaignAddition(Campaign campaign);

	void multipleCampaignAddition(Campaign[] campaigns);

	void campaignDeletion(Campaign campaign);

	void campaignUpdate(Campaign campaign);

}
