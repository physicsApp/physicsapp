package imspv.lycee.physics.DTO;


public class SettingDTO {

    private String title, subtitle;

    public SettingDTO(){
    }

    public SettingDTO(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
            }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
