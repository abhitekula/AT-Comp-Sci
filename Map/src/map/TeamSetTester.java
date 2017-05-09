package map;

public class TeamSetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamSet team = new TeamSet();
		team.add(new Wrestler("Abhi", 200));
		team.add(new Wrestler("Joe", 150));
		team.add(new Wrestler("Bob", 120));
		team.add(new Wrestler("Jon", 100));
		team.add(new Wrestler("Henry", 110));
		
		System.out.println("Average Weight: " + team.avgWeight());
		System.out.println("LightWeights: " + team.lightweights());
		
	}

}
