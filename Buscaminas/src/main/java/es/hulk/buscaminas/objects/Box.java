package es.hulk.buscaminas.objects;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Box {

    private boolean flag;
    private boolean mine;
    private boolean open;
    private int minesAround;
    private int x;
    private int y;

    public Box(int x, int y) {
        this.x = x;
        this.y = y;
        this.flag = false;
        this.mine = false;
        this.open = false;
        this.minesAround = 0;
    }



}
