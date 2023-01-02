package kosta.mission2.Mission2_08;

public class Video {
    private static int videoNo = 0;
    private String title;
    private Actor actor;
    private String type;

    public Video(String title, Actor actor) {
        this(title, actor, "video");
    }

    private Video(String title, Actor actor, String type) {
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
                         """,
                title, actor.getName());
    }
}

class Drama extends Video {

    private String type;

    public Drama(String title, Actor actor, String type) {
        super(title, actor);
        this.type = type;
        System.out.printf("this is %s\n", type);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
            type : %s
            """,type);
    }
}

class Movie extends Video {

    private String type;

    public Movie(String title, Actor actor, String type) {
        super(title, actor);
        this.type = type;
        System.out.printf("this is %s\n", type);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
            type : %s
            """,type);
    }
}