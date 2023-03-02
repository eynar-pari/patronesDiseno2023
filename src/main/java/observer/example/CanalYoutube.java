package observer.example;

import java.util.ArrayList;
import java.util.List;

public class CanalYoutube implements  ICanal {
    private String name;
    private String description;
    private List<IUser> suscriptorList = new ArrayList<>();
    private List<Video> videoList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void uploadVideo(Video newVideo) {
        this.videoList.add(newVideo);
        this.notify(newVideo);
    }

    @Override
    public void subscription(IUser user, String category) {
        user.setCategoryVideo(category);
        suscriptorList.add(user);
    }

    @Override
    public void removeSubscription(IUser user) {
        suscriptorList.remove(user);
    }

    @Override
    public void notify(Video video) {
        for (IUser suscriptor:suscriptorList) {
            if (video.getCategory().equals(suscriptor.getCategoryVideo()))
                suscriptor.update("El canal: ["+name+"] subio un nuevo video: \n",video);
        }
    }
}
