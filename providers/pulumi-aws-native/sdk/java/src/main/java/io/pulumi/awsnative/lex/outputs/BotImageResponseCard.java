// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotButton;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotImageResponseCard {
    private final @Nullable List<BotButton> buttons;
    private final @Nullable String imageUrl;
    private final @Nullable String subtitle;
    private final String title;

    @OutputCustomType.Constructor({"buttons","imageUrl","subtitle","title"})
    private BotImageResponseCard(
        @Nullable List<BotButton> buttons,
        @Nullable String imageUrl,
        @Nullable String subtitle,
        String title) {
        this.buttons = buttons;
        this.imageUrl = imageUrl;
        this.subtitle = subtitle;
        this.title = Objects.requireNonNull(title);
    }

    public List<BotButton> getButtons() {
        return this.buttons == null ? List.of() : this.buttons;
    }
    public Optional<String> getImageUrl() {
        return Optional.ofNullable(this.imageUrl);
    }
    public Optional<String> getSubtitle() {
        return Optional.ofNullable(this.subtitle);
    }
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotImageResponseCard defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BotButton> buttons;
        private @Nullable String imageUrl;
        private @Nullable String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(BotImageResponseCard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.imageUrl = defaults.imageUrl;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setButtons(@Nullable List<BotButton> buttons) {
            this.buttons = buttons;
            return this;
        }

        public Builder setImageUrl(@Nullable String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder setSubtitle(@Nullable String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public BotImageResponseCard build() {
            return new BotImageResponseCard(buttons, imageUrl, subtitle, title);
        }
    }
}
