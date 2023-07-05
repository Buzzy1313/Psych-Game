public class Episode {
    private String title;
    private String frame;
  private String epNum;

    public Episode(String title, String epNum, String frame) {
        this.title = title;
        this.frame = frame;
        this.epNum = epNum;
    }

    public String getTitle() {
        return title;
    }

    public String getFrame() {
        return frame;
    }
    public String getEpNum() {
      return epNum;
    }
}
