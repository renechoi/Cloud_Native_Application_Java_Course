package kosta.mission2.Mission2_08;

public class Video {
    private static int videoNo = 0;
    private String title;
    private Actor actor;
    private String type;

    public Video(String title, Actor actor) {
        this(title, actor, "video");
    }

    public Video(String title, Actor actor, String type) {
        this.title = title;
        this.actor = actor;
        this.type = type;
        Video.videoNo++;
    }

    public static Video valueOf(String title, Actor actor, String type) {
        return switch (type.toLowerCase()) {
            case "drama" -> new Drama(title, actor, type);
            case "movie" -> new Movie(title, actor, type);
            default -> new Video(title, actor);
        };
    }

    public int getVideoNo() {
        return videoNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return String.format("""
                        title : %s
                        actor : %s
                        type : %s 
                         """,
                title, actor.getName(), type);
    }
}

class Drama extends Video {

    private String type;

    public Drama(String title, Actor actor, String type) {
        super(title, actor);
        System.out.printf("this is %s\n", type);
    }
}

class Movie extends Video {

    private String type;

    public Movie(String title, Actor actor, String type) {
        super(title, actor);
        System.out.printf("this is %s\n", type);
    }
}