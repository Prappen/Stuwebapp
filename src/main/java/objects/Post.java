package objects;

public class Post {
    private Account account;
    private PostAudience audience;
    private String date;
    private String caption;
    private String image;
    private String totalReaction;
    private int nbComments;
    private int nbShare;

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    public PostAudience getAudience() {
        return audience;
    }
    public void setAudience(PostAudience audience) {
        this.audience = audience;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTotalReaction() {
        return totalReaction;
    }

    public void setTotalReaction(String totalReaction) {
        this.totalReaction = totalReaction;
    }

    public int getNbComments() {
        return nbComments;
    }

    public void setNbComments(int nbComments) {
        this.nbComments = nbComments;
    }

    public int getNbShare() {
        return nbShare;
    }

    public void setNbShare(int nbShare) {
        this.nbShare = nbShare;
    }
}
