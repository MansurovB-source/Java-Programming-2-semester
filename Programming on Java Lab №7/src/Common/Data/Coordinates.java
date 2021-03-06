package Common.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Behruz Mansurov
 */
public class Coordinates implements Serializable {
    static final long serialVersionUID = -4855375093353749788L;
    private int x; //Значение поля должно быть больше -912
    private Long y; //Максимальное значение поля: 139, Поле не может быть null

    public Coordinates(int x, Long y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates { " +
                " x = " + x +
                ", y = " + y +
                " }";
    }
}
