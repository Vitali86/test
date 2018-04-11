package RUN;

import object.Computer;


public class Run {

    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setName("Lenovo");
        comp.setHdd(500);
        comp.setMonitorSize(17.3f);
        comp.setProcessor("i5");
        comp.setRam(8192);
        comp.setTypeRam("DDR4");
        comp.setVideoRam(4096);
        comp.setWeight(4.3f);
        
        comp.on();
        comp.load();
        comp.off();
    }

}
