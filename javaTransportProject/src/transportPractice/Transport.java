package transportPractice;

public abstract class Transport {
	protected String destination;
	protected int budget;
	protected int departureTime;
	protected int targetTime;
	
	public abstract void getIn();
	public abstract void getOff();
	
	// 교통수단 추천 메서드
	public static Transport chooseTransport(int calculatedTime, int budget, String destination) {
		Transport transport = null;
		
		if (budget >= 10000 && calculatedTime <= 20) {
			transport = new Taxi(destination);
		} else if (budget >= 5000 && calculatedTime <= 40) {
			transport = new Subway(destination);
		} else if (budget >= 2000 && calculatedTime <= 60) {
			transport = new Ddareungi(destination);
		} else {
			System.out.println("마음 편히 지각하고 노래하세요.");
		}
		// 선택된 교통수단을 반환하거나 null 반환
		return transport;
	}
}
