package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import objects.Account;
import objects.Post;
import objects.PostAudience;


public class PostController{
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

private Post getPost(){
    Post post = new Post();
    Account account = new Account();
    account.setName("Fornamn Efternamn");
    account.setProfileImg("/img/profile.png");
    post.setAccount(account);
    post.setVerified(false);
    post.setDate("Feb 14, 2021 at 12:15");
    post.setAudience(PostAudience.PUBLIC);
    post.setCaption("JavaFX: Admin Dashboard");
    post.setImage("/img/admin_dashboard.png");
    post.setNbComments(2);

};


}
