package com.company.chatterbook.controller;

import com.company.chatterbook.model.ChatterPost;
import com.company.chatterbook.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ChatterbookController {

    private List<User> userList;

    public ChatterbookController() {
        User luis = new User("Luis");
        User sue = new User("Sue");
        User timothy = new User("Timothy");
        User george = new User("George");
        User arturo = new User("Arturo");
        User mariella = new User("Mariella");
        User paolo = new User("Paolo");
        User tri = new User("Tri");
        User jane = new User("Jane");
        User carol = new User("Carol");
        User carl = new User("Carl");

        luis.setChatterPosts(Arrays.asList(new ChatterPost("Hey! This is my first post!"), new ChatterPost("Anybody want to be friends?")));
        sue.setChatterPosts(Arrays.asList(new ChatterPost("I'm bored"), new ChatterPost("Who wants to hang?")));
        timothy.setChatterPosts(Arrays.asList(new ChatterPost("My life is awesome!"), new ChatterPost("Click here to buy my vegan shakes!")));
        george.setChatterPosts(Arrays.asList(new ChatterPost("I like pigs."), new ChatterPost("I love lamp.")));
        arturo.setChatterPosts(Arrays.asList(new ChatterPost("My cat is so cute"), new ChatterPost("My kitten is purr-fect.")));
        mariella.setChatterPosts(Arrays.asList(new ChatterPost("I'll never post again")));
        paolo.setChatterPosts(Arrays.asList(new ChatterPost("Have you ever heard of the band Nirvana?"), new ChatterPost("Pearl Jam 4 Life")));
        tri.setChatterPosts(Arrays.asList(new ChatterPost("You definitely grew up in the 90s if you get these 10 references."), new ChatterPost("I don't get this generation? Everyone expects a participation trophy.")));
        jane.setChatterPosts(Arrays.asList(new ChatterPost("I just wrecked my dad's car. He's going to kill me!"), new ChatterPost("Grounded.... for 5 months :( ")));
        carol.setChatterPosts(Arrays.asList(new ChatterPost("Does anyone have some imodium?")));
        carl.setChatterPosts(Arrays.asList(new ChatterPost("My roommate is awful!!!!"), new ChatterPost("Anyone know a room for rent in Hyde Park?")));

        userList = Arrays.asList(luis, sue, timothy, george, arturo, mariella, paolo, tri, jane, carol, carl);
    }

    //provide a GET route for a list of all users.
    @GetMapping(value = "/allusers")
    public List<User> getAllUsers(){
        return userList;
    }


    //provide a GET route for a single user by username.
    @GetMapping(value = "/users/user/{username}")
    public User getUserByUsername(@PathVariable String username){
        User selectedUser = null;

        for (User user: userList){
            if (user.getName().equals(username)){
                selectedUser = user;
            }
        }
        return selectedUser;
    }

    //provide a GET route for a list of ChatterPosts for a user by username.
    @GetMapping(value = "/users/posts/{username}")
    public List<ChatterPost> getChatterPostsByUsername(@PathVariable String username){

        List<ChatterPost> userPosts = new ArrayList<>();

        for(User user : userList) {
            //check if username exists
            if(user.getName().equals(username)) {
                userPosts = user.getChatterPosts();
            }
        }
        return userPosts;


        /*
        List<ChatterPost> userPosts = null;

        for(User user : userList) {
            if(user.getName().equals(username)) {
                userPosts = user.getChatterPosts();
            }
        }
        return userPosts;

         */

    }


}
