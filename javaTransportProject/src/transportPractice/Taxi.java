package transportPractice;

public class Taxi extends Transport {
	public Taxi(String destination) {
		this.destination = destination;
	}
	
	@Override
	public void getIn() {
		System.out.printf("%s로 향하는 택시를 탔습니다.\n", destination);
	}	
	
	@Override
	public void getOff() {
		System.out.println("목적지에 도착하였습니다.");
	}
}
