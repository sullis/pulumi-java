// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ThemeDataColorPalette {
    private final @Nullable List<String> colors;
    private final @Nullable String emptyFillColor;
    private final @Nullable List<String> minMaxGradient;

    @OutputCustomType.Constructor({"colors","emptyFillColor","minMaxGradient"})
    private ThemeDataColorPalette(
        @Nullable List<String> colors,
        @Nullable String emptyFillColor,
        @Nullable List<String> minMaxGradient) {
        this.colors = colors;
        this.emptyFillColor = emptyFillColor;
        this.minMaxGradient = minMaxGradient;
    }

    public List<String> getColors() {
        return this.colors == null ? List.of() : this.colors;
    }
    public Optional<String> getEmptyFillColor() {
        return Optional.ofNullable(this.emptyFillColor);
    }
    public List<String> getMinMaxGradient() {
        return this.minMaxGradient == null ? List.of() : this.minMaxGradient;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeDataColorPalette defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> colors;
        private @Nullable String emptyFillColor;
        private @Nullable List<String> minMaxGradient;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeDataColorPalette defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.emptyFillColor = defaults.emptyFillColor;
    	      this.minMaxGradient = defaults.minMaxGradient;
        }

        public Builder setColors(@Nullable List<String> colors) {
            this.colors = colors;
            return this;
        }

        public Builder setEmptyFillColor(@Nullable String emptyFillColor) {
            this.emptyFillColor = emptyFillColor;
            return this;
        }

        public Builder setMinMaxGradient(@Nullable List<String> minMaxGradient) {
            this.minMaxGradient = minMaxGradient;
            return this;
        }

        public ThemeDataColorPalette build() {
            return new ThemeDataColorPalette(colors, emptyFillColor, minMaxGradient);
        }
    }
}
