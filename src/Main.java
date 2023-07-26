import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer(); //yeni bir computer nesnesi oluşturuldu
        computer.openPc(); //coomputer nesnesi açıldı
        computer.chooseController(); //bağlamak istediğimiz kontroller seçildi ve oyun yazdırıldı
        computer.closePc(); //computer kapatıldı

    }
}