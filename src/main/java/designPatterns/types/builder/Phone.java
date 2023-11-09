package designPatterns.types.builder;

public class Phone {
    @Override
    public String toString() {
        return "Phone{" +
                "ram=" + ram +
                ", processor='" + processor + '\'' +
                ", os='" + os + '\'' +
                ", battery=" + battery +
                '}';
    }

    private int ram;
    private String processor;

    public Phone(int ram, String processor, String os, int battery) {
        this.ram = ram;
        this.processor = processor;
        this.os = os;
        this.battery = battery;
    }

    private String os;
    private int battery;
}
