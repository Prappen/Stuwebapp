package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import objects.Account;
import objects.Post;
import objects.PostAudience;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FeedController implements Initializable {

    @FXML
    private VBox postContainer;
    List<Post> posts;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        posts = new ArrayList<>(getPosts());
        try {
        for (Post post : posts) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/views/Post.fxml"));
            VBox vBox = fxmlLoader.load();
            PostController postController = fxmlLoader.getController();
            postController.setData(post);
            postContainer.getChildren().add(vBox);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Post> getPosts() {
        List<Post> ls = new ArrayList<>();

        Post post;

        for (int i = 0; i < 50; i++) {
            post = new Post();
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
            ls.add(post);

        }
        return ls;
    }
    }





