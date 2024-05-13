package objects;

public enum Reactions {
    NON(0, "Like", "/img,ic_like_outline.png");

    private int id;
    private String name;
    private String imgSrc;

    Reactions(int id, String name, String imgSrc) {
        this.id = id;
        this.name = name;
        this.imgSrc = imgSrc;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}


