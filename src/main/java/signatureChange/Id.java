package signatureChange;

public class Id {
    public Id(int id) {
        this.id = id;
    }

    private int id;

    public boolean isAdmin(){
        return id == 12345;
    }
}
