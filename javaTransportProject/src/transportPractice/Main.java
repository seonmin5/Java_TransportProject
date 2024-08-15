package transportPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "집");
		map.put(2, "상암IT타워");
		
		System.out.print("목적지 번호를 선택하세요.");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.printf("(%d. %s)", entry.getKey(), entry.getValue());
		}
		int getDestination = sc.nextInt();
		String destination = map.getOrDefault(getDestination, "False");
		
		System.out.print("출발 시간: ");
		int departureTime = sc.nextInt();
		System.out.print("도착 예정 시간: ");
		int targetTime = sc.nextInt();
		System.out.print("예산(KRW): ");
		int budget = sc.nextInt();
		
		int calculatedTime = targetTime - departureTime;
		Transport transport = Transport.chooseTransport(calculatedTime, budget, destination);
		
		if (transport != null) {
			transport.getIn();
			transport.getOff();
		}
	
		sc.close();
		
		}
	}
