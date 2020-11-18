package designpattern.structural.adapter.phone;

import designpattern.structural.adapter.cable.LightningCable;

public interface LightningPhone {
    void connectLightning(LightningCable cable);
    void charge();
}
