// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The theme colors that are used for data colors in charts. The colors description is a
 *             hexadecimal color code that consists of six alphanumerical characters, prefixed with
 *                 <code>#</code>, for example #37BFF5. </p>
 * 
 */
public final class ThemeDataColorPaletteArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeDataColorPaletteArgs Empty = new ThemeDataColorPaletteArgs();

    /**
     * <p>The hexadecimal codes for the colors.</p>
     * 
     */
    @InputImport(name="colors")
    private final @Nullable Input<List<String>> colors;

    public Input<List<String>> getColors() {
        return this.colors == null ? Input.empty() : this.colors;
    }

    /**
     * <p>The hexadecimal code of a color that applies to charts where a lack of data is
     *             highlighted.</p>
     * 
     */
    @InputImport(name="emptyFillColor")
    private final @Nullable Input<String> emptyFillColor;

    public Input<String> getEmptyFillColor() {
        return this.emptyFillColor == null ? Input.empty() : this.emptyFillColor;
    }

    /**
     * <p>The minimum and maximum hexadecimal codes that describe a color gradient. </p>
     * 
     */
    @InputImport(name="minMaxGradient")
    private final @Nullable Input<List<String>> minMaxGradient;

    public Input<List<String>> getMinMaxGradient() {
        return this.minMaxGradient == null ? Input.empty() : this.minMaxGradient;
    }

    public ThemeDataColorPaletteArgs(
        @Nullable Input<List<String>> colors,
        @Nullable Input<String> emptyFillColor,
        @Nullable Input<List<String>> minMaxGradient) {
        this.colors = colors;
        this.emptyFillColor = emptyFillColor;
        this.minMaxGradient = minMaxGradient;
    }

    private ThemeDataColorPaletteArgs() {
        this.colors = Input.empty();
        this.emptyFillColor = Input.empty();
        this.minMaxGradient = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeDataColorPaletteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> colors;
        private @Nullable Input<String> emptyFillColor;
        private @Nullable Input<List<String>> minMaxGradient;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeDataColorPaletteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.emptyFillColor = defaults.emptyFillColor;
    	      this.minMaxGradient = defaults.minMaxGradient;
        }

        public Builder setColors(@Nullable Input<List<String>> colors) {
            this.colors = colors;
            return this;
        }

        public Builder setColors(@Nullable List<String> colors) {
            this.colors = Input.ofNullable(colors);
            return this;
        }

        public Builder setEmptyFillColor(@Nullable Input<String> emptyFillColor) {
            this.emptyFillColor = emptyFillColor;
            return this;
        }

        public Builder setEmptyFillColor(@Nullable String emptyFillColor) {
            this.emptyFillColor = Input.ofNullable(emptyFillColor);
            return this;
        }

        public Builder setMinMaxGradient(@Nullable Input<List<String>> minMaxGradient) {
            this.minMaxGradient = minMaxGradient;
            return this;
        }

        public Builder setMinMaxGradient(@Nullable List<String> minMaxGradient) {
            this.minMaxGradient = Input.ofNullable(minMaxGradient);
            return this;
        }

        public ThemeDataColorPaletteArgs build() {
            return new ThemeDataColorPaletteArgs(colors, emptyFillColor, minMaxGradient);
        }
    }
}
