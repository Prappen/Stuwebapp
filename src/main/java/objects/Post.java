package objects;

public class Post {
    private Account account;
    private boolean isVerified;
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

    public boolean isVerified() {
        return isVerified;
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
}
