import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int franciscounter =0;
		int snowdencounter =0;
		for (int i = 0; i < votes.size(); i++) {
			if(votes.get(i).equalsIgnoreCase("edward snowden")) {
				snowdencounter = snowdencounter +1;
			}
			else if(votes.get(i).equalsIgnoreCase("pope francis")) {
				franciscounter = franciscounter +1;
			}
		}
		if(snowdencounter>franciscounter) {
			return "edward snowden";
		}
		else if(franciscounter>snowdencounter){
			return "pope francis";
		}
		else {
			return "TIE";
		}
	}

}
