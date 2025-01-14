package ru.slava.recipes.AvatarView;

import androidx.annotation.NonNull;

import ru.slava.recipes.AvatarView.views.AvatarView;

public abstract class ImageLoaderBase implements IImageLoader {

    private final String defaultPlaceholderString;

    public ImageLoaderBase() {
        this.defaultPlaceholderString = AvatarPlaceholder.DEFAULT_PLACEHOLDER_STRING;
    }

    public ImageLoaderBase(String defaultPlaceholderString) {
        this.defaultPlaceholderString = defaultPlaceholderString;
    }

    @Override
    public void loadImage(@NonNull AvatarView avatarView, String avatarUrl, String name) {
        loadImage(avatarView, new AvatarPlaceholder(name, defaultPlaceholderString), avatarUrl);
    }

    @Override
    public void loadImage(@NonNull AvatarView avatarView, String avatarUrl, String name, int textSizePercentage) {
        loadImage(avatarView, new AvatarPlaceholder(name, textSizePercentage, defaultPlaceholderString), avatarUrl);
    }
}
