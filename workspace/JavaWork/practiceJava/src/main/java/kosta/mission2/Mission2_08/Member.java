package kosta.mission2.Mission2_08;

public class Member {
    private String id;
    private String name;
    private String address;
    private Video video;
    private int counts;
    private int points;

    public Member() {
    }

    public Member(String id, String name, String address, Video video) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.video = video;
        this.points = this.getClass().getSimpleName().equals("SpecialMember") ? 10 : 0;
    }

    public void watchVideo(Video video) {
        System.out.printf("%s is watching %s %s \n", this.name, video.getClass().getSimpleName(), getVideo().getTitle());
        this.counts++;

        if (counts >= 5 || this.getClass().getSimpleName().equals("SpecialMember")) {
            points += 5;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Video getVideo() {
        return video;
    }

    @Override
    public String toString() {
        return String.format("""
                        id : %s
                        name : %s
                        address : %s %s
                        videoNo : %d
                        videoTitle : %s
                        videoActor : %s
                         """,
                id, name, address, getPoints(), video.getVideoNo(), video.getTitle(), video.getActor().getName());
    }

    private String getPoints() {
        return (points <= 10 ? "" : String.format("\npoints : %s ", points));
    }
}
