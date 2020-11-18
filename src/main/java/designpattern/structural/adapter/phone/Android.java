package designpattern.structural.adapter.phone;

import designpattern.structural.adapter.cable.MicroUsbCable;

public class Android implements MicroUsbPhone {

    private boolean connected;

    @Override
    public void connectUSBCable(MicroUsbCable cable) {
        cable.connect();
        connected = true;
    }

    @Override
    public void charge() {
        if (connected) {
            System.out.println("Charging Android phone");
        } else {
            System.out.println("Connect to USB cable");
        }
    }
}
