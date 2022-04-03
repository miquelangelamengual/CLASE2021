package es.hulk.buscaminas.objects;

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

}
