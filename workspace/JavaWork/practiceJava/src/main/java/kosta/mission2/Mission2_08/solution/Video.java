package kosta.mission2.Mission2_08.solution;

public class Video {
    private String videoNo;
    private String title;
    private String actor;

    public Video() {
    }

    public Video(String videoNo, String title, String actor) {
        this.videoNo = videoNo;
        this.title = title;
        this.actor = actor;
    }

    public String getInfo() {
        return String.format(
                """
                        회원이 대여한 비디오: %s
                        회원이 대여한 비디오 제목: %s
                        회원이 대여한 비디오 주인공: %s
                        """,
                videoNo, title, actor);
    }

    public void show() {
        System.out.println(String.format(
                """
                        회원이 대여한 비디오: %s
                        회원이 대여한 비디오 제목: %s
                        회원이 대여한 비디오 주인공: %s
                        """,
                videoNo, title, actor));
    }

    public String getVideoNo() {
        return videoNo;
    }

    public void setVideoNo(String videoNo) {
        this.videoNo = videoNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}