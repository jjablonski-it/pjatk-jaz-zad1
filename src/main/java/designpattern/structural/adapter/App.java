package designpattern.structural.adapter;

import designpattern.structural.adapter.cable.LightningCable;
import designpattern.structural.adapter.cable.MicroUsbCable;
import designpattern.structural.adapter.phone.Android;
import designpattern.structural.adapter.phone.IPhone;
import designpattern.structural.adapter.phone.LightningToMicroUsbAdapter;

public class App {

    public static void main(String[] args) {
        Android android = new Android();
        IPhone iPhone = new IPhone();

        android.connectUSBCable(new MicroUsbCable());
        android.charge();

        iPhone.connectLightning(new LightningCable());
        iPhone.charge();

        LightningToMicroUsbAdapter adapter = new LightningToMicroUsbAdapter(iPhone);
        adapter.connectUSBCable(new MicroUsbCable());
        adapter.charge();
    }
}
