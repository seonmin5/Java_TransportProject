package transportPractice;

public class Subway extends Transport {
	public Subway(String destination) {
		this.destination = destination;
	}

	@Override
	public void getIn() {
		System.out.printf("%s로 향하는 지하철을 탔습니다.\n", destination);
	}	
	
	@Override
	public void getOff() {
		System.out.println("목적지에 도착하였습니다.");
	}
}
