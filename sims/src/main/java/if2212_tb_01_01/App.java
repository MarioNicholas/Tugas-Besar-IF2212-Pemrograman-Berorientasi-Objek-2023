/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package if2212_tb_01_01;
import java.util.*;
import if2212_tb_01_01.entities.*;

public class App {
    class MainMenu {
        public MainMenu() {
        }
        public void show() {
            System.out.println("Main Menu");
        }
    }

    public static void main(String[] args) {
        System.out.println("Selamat datang di Sim-Plicity!");
        World world = new World(64,64);
        System.out.println("Silakan masukkan nama lengkap: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        world.addRumah();
        Sim sim1 = new Sim(new Kesejahteraan(80,80,80,80), 100, name, world.getLastRumah());
        System.out.println("Selamat datang, " + name + "!");
        App app = new App();
        MainMenu mainMenu = app.new MainMenu();
        mainMenu.show();
        
    }
}
