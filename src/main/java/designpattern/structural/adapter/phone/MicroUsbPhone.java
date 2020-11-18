package designpattern.structural.adapter.phone;

import designpattern.structural.adapter.cable.MicroUsbCable;

public interface MicroUsbPhone {
    void connectUSBCable(MicroUsbCable cable);
    void charge();
}
