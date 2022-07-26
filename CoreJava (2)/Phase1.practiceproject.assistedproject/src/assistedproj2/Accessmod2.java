package assistedproj2;
class Info {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class Accessmod2 {

	public static void main(String[] args) {
		
		Info d = new Info();
		
		d.setName("java program");
        System.out.println(d.getName());
	}

}


