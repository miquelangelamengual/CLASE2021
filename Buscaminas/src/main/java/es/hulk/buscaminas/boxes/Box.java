package es.hulk.buscaminas.boxes;

public class Box {

    private boolean isPlugged;
    protected boolean isFlag;
    private int aroundBomb;
    private boolean isBomb;

    public Box() {
        isPlugged = true;
        isFlag = false;
        aroundBomb = 0;
        isBomb = false;
    }

    /*

    SETTERS

     */

    public void setPlugged(boolean plugged) {
        isPlugged = plugged;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }

    public void setAroundBomb(int aroundBomb) {
        this.aroundBomb = aroundBomb;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }

    /*

    GETTERS

     */

    public boolean isPlugged() {
        return isPlugged;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public int getAroundBomb() {
        return aroundBomb;
    }

    public boolean isBomb() {
        return isBomb;
    }
}
