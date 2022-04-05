package es.hulk.buscaminas.objects;

import es.hulk.buscaminas.utils.Text;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Box {

    private boolean flag;
    private int numFlags;
    private boolean mine;
    private boolean open;
    private int minesAround;
    private int mines;
    private int x;
    private int y;

    public Box(int x, int y, int mines, int numFlags) {
        this.x = x;
        this.y = y;
        this.mine = false;
        this.open = false;
        this.flag = false;
        this.minesAround = 0;
        this.mines = mines;
        this.numFlags = numFlags;
    }

    public void putFlag() {
        if (isFlag()) {
            System.out.println("No puedes poner una bandera aqui");
            return;
        }

        setFlag(true);
        numFlags--;
    }

    public void removeFlag() {
        if (!isFlag()) {
            System.out.println("No puedes quitar una bandera aqui");
            return;
        }

        setFlag(false);
        numFlags++;
    }

    public void openBox() {
        if (isOpen()) {
            System.out.println("No puedes abrir una casilla ya abierta");
        } else if (isMine()) {
            System.out.println("Has perdido");
            return;
        }

        setOpen(true);
    }

}
