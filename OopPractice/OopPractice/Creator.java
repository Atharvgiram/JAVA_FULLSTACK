package OopPractice;

public class Creator extends SUser {
	@Override
	public void interactPost() {

		System.out.println("Creator received 500 Likes");
		System.out.println("Creator received 120 Comments");
	}

	@Override
	public void createPost(String post) {

		setPost(post);

		System.out.println("Creator Uploaded Post");
		System.out.println("Post : " + getPost());

		interactPost();
	}

}