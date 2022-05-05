package es.hulk.buscaminas.objects;

import es.hulk.buscaminas.utils.CC;
import es.hulk.buscaminas.utils.Text;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box {

    private boolean flag;
    private boolean mine;
    private boolean open;
    private int minesAround;
    private int x;
    private int y;

    private boolean hasLost = false;

    public Box(int x, int y) {
        this.x = x;
        this.y = y;
        this.mine = false;
        this.open = false;
        this.flag = false;
        this.minesAround = 0;
    }

    public void changeFlag() {
        if (isOpen()) return;
        setFlag(!isFlag());
    }

    public void openBox() {
        if (isOpen()) return;
        if (isMine()) {
            this.hasLost = true;
            Text.gameLost();
            System.out.println(hasLost);
        }
        if (getMinesAround() == 0) setOpen(true);

        setOpen(true);
    }

    @Override
    public String toString() {
        if (isOpen()) return CC.GREEN + " [ O ] " + CC.RESET;
        else if (isFlag()) return CC.CYAN + " [ F ] " + CC.RESET;
        else return CC.RESET + " [   ] " + CC.RESET;
    }

    public String returnLastBoard() {
        if (isOpen()) return CC.GREEN + " [ O ] " + CC.RESET;
        else if (isFlag()) return CC.CYAN + " [ F ] " + CC.RESET;
        else if (isMine()) return CC.RED + " [ M ] " + CC.RESET;
        else return CC.RESET + " [   ] " + CC.RESET;
    }
}
