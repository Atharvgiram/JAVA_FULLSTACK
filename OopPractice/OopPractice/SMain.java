package OopPractice;

public class SMain {

    public static void main(String[] args) {

        Creator creator = new Creator();
        Viewer viewer = new Viewer();

        creator.createPost("Sunset Photography");

        System.out.println("------------------------");

        viewer.createPost("Sunset Photography");
    }
}