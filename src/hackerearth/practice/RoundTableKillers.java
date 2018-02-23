package hackerearth.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class PersonInRoundTableKiller {
	private int place;
	private PersonInRoundTableKiller personInRoundTableKillers;

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public PersonInRoundTableKiller getPersonInRoundTableKillers() {
		return personInRoundTableKillers;
	}

	public void setPersonInRoundTableKillers(PersonInRoundTableKiller personInRoundTableKillers) {
		this.personInRoundTableKillers = personInRoundTableKillers;
	}
}

class list {
	private PersonInRoundTableKiller head;

	public PersonInRoundTableKiller getHead() {
		return head;
	}

	public void setHead(PersonInRoundTableKiller head) {
		this.head = head;
	}
}

public class RoundTableKillers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		list list = new list();
		PersonInRoundTableKiller personInRoundTableKiller = new PersonInRoundTableKiller();
		personInRoundTableKiller.setPlace(1);
		personInRoundTableKiller.setPersonInRoundTableKillers(null);
		list.setHead(personInRoundTableKiller);
				
		for(int i = 2; i <= N; i++) {
			PersonInRoundTableKiller newPersonInRoundTableKiller = new PersonInRoundTableKiller();
			personInRoundTableKiller.setPlace(i);
			personInRoundTableKiller.setPersonInRoundTableKillers(null);
		}
		
	}
}
