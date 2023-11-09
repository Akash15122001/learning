package designPatterns.types.builder;

public class PhoneBuilder {
    private String os;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    private int battery;
    private int ram;
    private String processor;

    public Phone getPhone()
    {
        return new Phone(ram,processor,os,battery);
    }
}
