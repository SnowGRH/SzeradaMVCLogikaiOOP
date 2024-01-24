package main;

import model.lada;
import view.CuiNezet;

public class LogikaiProgram {

    public static void main(String[] args) {
        CuiNezet nezet = new CuiNezet();
        lada arany = new lada("Arany", "én rejtem");
        lada ezust = new lada("Ezüst", "nem én rejtem");
        lada bronz = new lada("Bronz", "az arany hazudik");
        lada[] ladak = {arany,ezust,bronz};
    }

}
