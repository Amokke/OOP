package org.example.lesson2.cw.task3;

public class Human {
    private Transport lastTransport;
    public void drive(Transport transport){
        if(lastTransport == null) {
            transport.start();
            lastTransport = transport;
        }else {
            System.out.println("Уже еду");
        }
    }
    public void stop(){
        if (lastTransport!=null) {
            lastTransport.stop();
            lastTransport = null;
        }else {
            System.out.println("Уже стою");
        }
    }
}
