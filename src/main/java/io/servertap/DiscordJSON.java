package io.servertap;

public class DiscordJSON  {

    public String username="SERVER";
    public String content;
    public String avatar_url="https://i.kym-cdn.com/photos/images/original/001/106/143/cde.jpg";
    public DiscordJSON (String username,String content,String avatar_url){
        this.content=content;
        this.username=username;
        this.avatar_url= avatar_url.equals("") ?this.avatar_url:avatar_url;
    }
}
