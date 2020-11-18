package designpattern.structural.adapter.phone;

import designpattern.structural.adapter.cable.MicroUsbCable;

public class LightningToMicroUsbAdapter implements MicroUsbPhone {
    LightningPhone lightningPhone;

    public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void connectUSBCable(MicroUsbCable cable) {
        cable.connect();
    }

    @Override
    public void charge() {
        lightningPhone.charge();
    }
}
