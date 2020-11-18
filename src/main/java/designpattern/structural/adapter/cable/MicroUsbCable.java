package designpattern.structural.adapter.cable;

public class MicroUsbCable implements Cable {
    @Override
    public void connect() {
        System.out.println("Detected micro USB");
    }
}
