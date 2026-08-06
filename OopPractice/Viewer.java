package OopPractice;

public class Viewer extends SUser {

	@Override
	public void interactPost() {

		System.out.println("Viewer Liked the Post");
		System.out.println("Viewer Commented: Amazing!");
	}
	@Override
	public void createPost(String post) {

		setPost(post);

		System.out.println("Viewer Viewed Post");
		System.out.println("Post : " + getPost());

		interactPost();
	}

	
}