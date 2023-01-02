package kosta.mission2.Mission2_08;

public class GeneralMember extends Member {
    private String id;
    private String name;
    private String address;
    private Video video;

    public GeneralMember(String id, String name, String address, Video video) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.video = video;
    }

    public void watchVideo(Video video) {
        System.out.printf("%s is watching %s %s \n",this.name, video.getClass().getSimpleName(), getVideo().getTitle());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return String.format("""
               id : %s
               name : %s
               address : %s 
               videoNo : %d
               videoTitle : %s
               videoActor : %s
                """,
                id, name, address, video.getVideoNo(), video.getTitle(), video.getActor().getName());
    }
}
