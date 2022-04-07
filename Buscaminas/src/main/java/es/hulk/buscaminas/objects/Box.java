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
            System.out.println(Text.PUT_FLAG_ERROR);
            return;
        }

        if (getNumFlags() == 0) {
            System.out.println(Text.OUT_OF_FLAGS);
            return;
        }

        System.out.println();
        System.out.println(Text.PUT_FLAG);
        System.out.println(Text.FLAGS_REMAINING + ": " + (getNumFlags() - 1));
        System.out.println();
        setFlag(true);
        numFlags--;
    }

    public void removeFlag() {
        if (!isFlag()) {
            System.out.println(Text.REMOVE_FLAG_ERROR);
            return;
        }

        System.out.println();
        System.out.println(Text.REMOVE_FLAG);
        System.out.println(Text.FLAGS_REMAINING + ": " + (getNumFlags() + 1));
        System.out.println();
        setFlag(false);
        numFlags++;
    }

    public void openBox() {
        if (isOpen()) {
            System.out.println(Text.BOX_ALREDY_OPEN);
        } else if (isMine()) {
            System.out.println(Text.LOSE);
            return;
        }

        System.out.println(Text.OPEN_BOX);
        setOpen(true);
    }

}
