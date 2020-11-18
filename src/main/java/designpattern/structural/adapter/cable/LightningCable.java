package designpattern.structural.adapter.cable;

public class LightningCable implements Cable {
    @Override
    public void connect() {
        System.out.println("Detected lightning");
    }
}
