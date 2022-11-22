/**
 * @author jrl
 * @date Create in 14:48 2022/11/9
 */
public class Person implements Cloneable {
    String name;
    int beautyLevel;

    public Person(String name, int beautyLevel) {
        this.name = name;
        this.beautyLevel = beautyLevel;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeautyLevel() {
        return beautyLevel;
    }

    public void setBeautyLevel(int beautyLevel) {
        this.beautyLevel = beautyLevel;
    }
}
