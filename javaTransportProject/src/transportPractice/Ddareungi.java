package transportPractice;

public class Ddareungi extends Transport {
	public Ddareungi(String destination) {
		this.destination = destination;
	}

	@Override
	public void getIn() {
		System.out.printf("따릉이로 %s까지 달려보세요!\n", destination);
	}	
	
	@Override
	public void getOff() {
		System.out.println("목적지에 도착하였습니다.");
	}
}
