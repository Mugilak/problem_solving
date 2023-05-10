package interviewPanelApp;

import java.util.LinkedList;
import java.util.Queue;

public class Candidate {
	private Queue<String> interviewHall;

	public Candidate() {
		interviewHall = new LinkedList<String>();
	}

	public Queue<String> getCandidates() {
		return interviewHall;
	}

	public void addCandidate(String candidateName) {
		this.interviewHall.offer(candidateName);
	}

	public String pollCandidate() {
		return interviewHall.poll();
	}

}
