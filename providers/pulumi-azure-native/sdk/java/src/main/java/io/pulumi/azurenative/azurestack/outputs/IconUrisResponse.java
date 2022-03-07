// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IconUrisResponse {
    /**
     * URI to hero icon.
     * 
     */
    private final @Nullable String hero;
    /**
     * URI to large icon.
     * 
     */
    private final @Nullable String large;
    /**
     * URI to medium icon.
     * 
     */
    private final @Nullable String medium;
    /**
     * URI to small icon.
     * 
     */
    private final @Nullable String small;
    /**
     * URI to wide icon.
     * 
     */
    private final @Nullable String wide;

    @OutputCustomType.Constructor({"hero","large","medium","small","wide"})
    private IconUrisResponse(
        @Nullable String hero,
        @Nullable String large,
        @Nullable String medium,
        @Nullable String small,
        @Nullable String wide) {
        this.hero = hero;
        this.large = large;
        this.medium = medium;
        this.small = small;
        this.wide = wide;
    }

    /**
     * URI to hero icon.
     * 
    */
    public Optional<String> getHero() {
        return Optional.ofNullable(this.hero);
    }
    /**
     * URI to large icon.
     * 
    */
    public Optional<String> getLarge() {
        return Optional.ofNullable(this.large);
    }
    /**
     * URI to medium icon.
     * 
    */
    public Optional<String> getMedium() {
        return Optional.ofNullable(this.medium);
    }
    /**
     * URI to small icon.
     * 
    */
    public Optional<String> getSmall() {
        return Optional.ofNullable(this.small);
    }
    /**
     * URI to wide icon.
     * 
    */
    public Optional<String> getWide() {
        return Optional.ofNullable(this.wide);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IconUrisResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hero;
        private @Nullable String large;
        private @Nullable String medium;
        private @Nullable String small;
        private @Nullable String wide;

        public Builder() {
    	      // Empty
        }

        public Builder(IconUrisResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hero = defaults.hero;
    	      this.large = defaults.large;
    	      this.medium = defaults.medium;
    	      this.small = defaults.small;
    	      this.wide = defaults.wide;
        }

        public Builder setHero(@Nullable String hero) {
            this.hero = hero;
            return this;
        }

        public Builder setLarge(@Nullable String large) {
            this.large = large;
            return this;
        }

        public Builder setMedium(@Nullable String medium) {
            this.medium = medium;
            return this;
        }

        public Builder setSmall(@Nullable String small) {
            this.small = small;
            return this;
        }

        public Builder setWide(@Nullable String wide) {
            this.wide = wide;
            return this;
        }
        public IconUrisResponse build() {
            return new IconUrisResponse(hero, large, medium, small, wide);
        }
    }
}