package Test.GUIForm;

/**
 * Created by jubair.
 * Date: 1/5/24
 * Time: 2:58 PM
 */

/**
 * modified by Lepic
 * Date: 9/5/24
 */

public class Course {
    private String code;
    private String name;
    private float credit;
    private String type;

    public Course(String code, String name, float credit, String type) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return code + ", " + name + ", " + credit + ", " + type;
    }
}
