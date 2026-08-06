package OopPractice;

public abstract class SUser implements PostActions {

    private String post;

   
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public abstract void interactPost();
}