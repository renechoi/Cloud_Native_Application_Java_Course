package kosta.mission2.Mission2_08;

public class Video {
    private static int videoNo = 0;
    private String title;
    private Actor actor;

    public Video(String title, Actor actor) {
        this.title = title;
        this.actor = actor;
        Video.videoNo++;
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
        return "Video{" +
                "title='" + title + '\'' +
                ", actor=" + actor +
                '}';
    }
}
