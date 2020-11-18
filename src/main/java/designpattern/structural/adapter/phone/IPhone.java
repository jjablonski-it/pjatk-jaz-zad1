package designpattern.structural.adapter.phone;

import designpattern.structural.adapter.cable.LightningCable;

public class IPhone implements LightningPhone {

    private boolean connected;

    @Override
    public void connectLightning(LightningCable cable) {
        cable.connect();
        connected = true;
    }

    @Override
    public void charge() {
        if (connected) {
            System.out.println("Charging IPhone");
        } else {
            System.out.println("Connect to Lightning");
        }
    }
}
