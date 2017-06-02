package dailysuvichar.eventsapp.model;

import android.support.annotation.NonNull;

/**
 * Created by rishabhshukla on 02/06/17.
 */

public class Event {
    @NonNull
    String title;
    @NonNull
    String description;
    @NonNull
    String photoUrl;
    @NonNull
    Integer likes;
    @NonNull
    String category;

    public Event(@NonNull String title) {
        this.title = title;
    }

    public Event(@NonNull String title, @NonNull String description, @NonNull String photoUrl, @NonNull Integer likes, @NonNull String category) {
        this.title = title;
        this.description = description;
        this.photoUrl = photoUrl;
        this.likes = likes;
        this.category = category;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    @NonNull
    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(@NonNull String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @NonNull
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(@NonNull Integer likes) {
        this.likes = likes;
    }

    @NonNull
    public String getCategory() {
        return category;
    }

    public void setCategory(@NonNull String category) {
        this.category = category;
    }
}
