/**
 * @author jrl
 * @date Create in 12:29 2022/11/9
 */
public class Son extends Father implements Cloneable {
    Person lovers = new Person("Mona", 10);

    public Son(Person lovers) {
        this.lovers = lovers;
    }

    public Son() {
    }

    @Override
    protected Son clone() throws CloneNotSupportedException {
        Son clone = (Son) super.clone();
        clone.lovers = (Person) clone.lovers.clone();
        return clone;
    }
}
