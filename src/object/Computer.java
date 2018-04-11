package object;


public class Computer {

    private String name;
    private int hdd;
    private int ram;
    private float weight;
    private float monitorSize;
    private String processor;
    private String typeRam;
    private int videoRam;
    
    public Computer(String name){
        this.name=name;
    }
    public Computer(){
    }

    public Computer(String name, int hdd, int ram, float weight, float monitorSize, String processor, String typeRam, int videoRam) {
        setName(name);
        setHdd(hdd);
        setRam(ram);
        setWeight(weight);
        setMonitorSize(monitorSize);
        setProcessor(processor);
        setTypeRam(typeRam);
        setVideoRam(videoRam);
    }
    
    //гетеры
    public String getName(){
        return name;
    }
    public int getHdd(){
        return hdd;
    }
    public int getRam(){
        return ram;
    }
    public float getWeight(){
        return weight;
    }
    public float getMonitorSize(){
        return monitorSize;
    }
    public String getProcessor(){
        return processor;
    }
    public String getTypeRam(){
        return typeRam;
    }
    public int getVideoRam(){
        return videoRam;
    }
    
    //сетеры
    public void setName(String newName){
        name = newName;
    }
    public void setHdd(int hdd){
        if (hdd>0){
             this.hdd = hdd;
        }else{
            prt("Значение "+hdd+" не может быть отрицательным");
        }
    }
    public void setRam(int ram){
        if (ram>0){
             this.ram=ram;
        }else{
            prt("Значение "+ram+" не может быть отрицательным");
        }
    }
    public void setWeight(float weight){
        if (weight>0){
             this.weight=weight;
        }else{
            prt("Значение "+weight+" не может быть отрицательным");
        }
    }   
    public void setMonitorSize(float size){
        if (size>0){
             monitorSize=size;
        }else{
            prt("Значение "+size+" не может быть отрицательным");
        }
    }   
    public void setProcessor(String proc){
        switch(proc){
            case "i3":
            case "i5":
            case "i7":
                processor=proc;
                break;
            default:
            prt(proc+" - не известный процессор");
        }
    }   
    public void setTypeRam(String ram){
        switch(ram){
            case "DDR1":
            case "DDR2":
            case "DDR3":
            case "DDR4":
                typeRam=ram;
                break;
            default:
            prt(ram+" - не известный тип памяти");
        }
    } 
    public void setVideoRam(int ram){
        if (ram>0){
             videoRam=ram;
        }else{
            prt("Значение "+ram+" не может быть отрицательным");
        }
    }
    
    
    //методы
    public void on() {
        prt("Я включился. Мои характеристики:");
        prt("Имя:"+name);
        prt("ЖД :"+hdd+"Мб");
        prt("ОЗУ:"+ram+"Мб "+typeRam);
        prt("Вес:"+weight+" кг");
        prt("ЦП :"+processor);
    }
    public void load(){
        prt("Я загружаюсь...");
        prt("Размер монитора: "+monitorSize+" дюймов");
        prt("Видеопамять - "+videoRam+"Мб");
        prt("");
        prt("Я загрузился.");
    }
    public void off(){
        prt("Я выключаюсь...");
        prt("Вес компьютера - "+weight+" кг");
    }
    private void prt(String str){
        System.out.println(str);
    }

        
}
