package in.co.rays;

public final class StringImmutable {
	
	private final int id;
    private final String name; // String is already immutable

    public StringImmutable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
	

}
