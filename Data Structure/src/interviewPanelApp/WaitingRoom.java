package interviewPanelApp;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class WaitingRoom {
	private Queue<String> waitingHall;

	public WaitingRoom() {
		waitingHall = new ArrayDeque<String>(5);
	}

	public Queue<String> getWaitingHall() {
		return waitingHall;
	}

	public void addWaitingHall(String waitingHall) {
		this.waitingHall.add(waitingHall);
	}

	public String pollCandidate() {
		return waitingHall.poll();
	}
}
