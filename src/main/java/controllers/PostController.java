package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import objects.Account;
import objects.Post;
import objects.PostAudience;

public class PostController {
    @FXML
    private Label caption;

    @FXML
    private Label date;

    @FXML
    private ImageView imgPost;

    @FXML
    private ImageView imgProfile;

    @FXML
    private ImageView imgVerified;

    @FXML
    private HBox likeContainer;

    @FXML
    private Label username;

    @FXML
    private ImageView audience;

    public void setData(Post post) {
        Image img;
        img = new Image(getClass().getResourceAsStream(post.getAccount().getProfileImg()));
        imgProfile.setImage(img);
        username.setText(post.getAccount().getName());
        if (post.getAccount().isVerified()) {
            imgVerified.setVisible(true);
        } else {
            imgVerified.setVisible(false);
        }
        date.setText(post.getDate());
        if (post.getAudience() == PostAudience.PUBLIC) {
            img = new Image(getClass().getResourceAsStream(PostAudience.PUBLIC.getImgSrc()));
        } else {
            img = new Image(getClass().getResourceAsStream(PostAudience.FRIENDS.getImgSrc()));
        }
        audience.setImage(img);

        if (!post.getCaption().isEmpty()) {
            caption.setText(post.getCaption());
        }
        if (!post.getImage().isEmpty()) {
            img = new Image(getClass().getResourceAsStream(post.getImage()));
            imgPost.setImage(img);
        } else {
            imgPost.setVisible(false);
        }
    }

    private Post getPost(){
        Post post = new Post();
        Account account = new Account();
        account.setName("Fornamn Efternamn");
        account.setProfileImg("/img/profile.png");
        account.setVerified(false);
        post.setAccount(account);
        post.setDate("Feb 14, 2021 at 12:15");
        post.setAudience(PostAudience.PUBLIC);
        post.setCaption("JavaFX: Admin Dashboard");
        post.setImage("/img/admin_dashboard.png");
        post.setNbComments(2);
        post.setNbShare(3);

        return post;
    }
}
