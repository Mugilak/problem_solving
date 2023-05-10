package interviewPanelApp;

import java.util.Scanner;

public class PanelList {
	private Scanner input = new Scanner(System.in);
	private Candidate candidate;
	private WaitingRoom waiting;
	private String panel[] = new String[1];

	public PanelList() {
		candidate = new Candidate();
		waiting = new WaitingRoom();
	}

	public static void main(String[] ar) {
		PanelList panelList = new PanelList();
		panelList.start();
	}

	private void start() {
		String option = "1", name;
		do {
			System.out.println("""
					1. add Candidate in Interview hall
					2. show Waiting Hall
					3. Show Interview Hall
					4. show Panel
					5. add Candidate in Waiting Room
					6. add Candidate in panel
					7. exit
					""");
			option = input.nextLine();
			switch (option) {
			case "1":
				System.out.println("Enter Candidate Name : ");
				name = input.nextLine();
				candidate.addCandidate(name);
				System.out.println("added !\n");
				break;
			case "2":
				System.out.println(waiting.getWaitingHall() + "\n");
				break;
			case "3":
				System.out.println(candidate.getCandidates() + "\n");
				break;
			case "4":
				if (panel[0] != null)
					System.out.println(panel[0]);
				else
					System.out.println("No Candiates are interviewing at this time !");
				break;
			case "5":
				waiting.addWaitingHall(candidate.pollCandidate());
				System.out.println("added \n");
				break;
			case "6":
				addInPanel();
				System.out.println("added \n");
				break;
			case "7":
				option = "7";
				break;
			default:
				System.out.println("Enter right one");
			}
		} while (!option.equals("7"));
	}

	private void addInPanel() {
		if (panel[0] == null)
			panel[0] = waiting.pollCandidate();
	}
}
