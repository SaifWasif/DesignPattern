package factoryPattern;

public class PCFactory implements IComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}
}