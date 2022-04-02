public class Phone {
    int id ;
    String color;
    public Phone(int id, String color) {
        this.id = id;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Phone[" + "id=" + id + ", color='" + color + '\'' + ']';
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone(1002,"blue");
        System.out.println(phone1.getColor());
        System.out.println(phone1.getId());
        System.out.println(phone1.toString());
        phone1.setColor("red");
        System.out.println(phone1.getColor());
    }
}
