// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThemeDataColorPalette {
    /**
     * @return &lt;p&gt;The hexadecimal codes for the colors.&lt;/p&gt;
     * 
     */
    private final @Nullable List<String> colors;
    /**
     * @return &lt;p&gt;The hexadecimal code of a color that applies to charts where a lack of data is
     *             highlighted.&lt;/p&gt;
     * 
     */
    private final @Nullable String emptyFillColor;
    /**
     * @return &lt;p&gt;The minimum and maximum hexadecimal codes that describe a color gradient. &lt;/p&gt;
     * 
     */
    private final @Nullable List<String> minMaxGradient;

    @CustomType.Constructor
    private ThemeDataColorPalette(
        @CustomType.Parameter("colors") @Nullable List<String> colors,
        @CustomType.Parameter("emptyFillColor") @Nullable String emptyFillColor,
        @CustomType.Parameter("minMaxGradient") @Nullable List<String> minMaxGradient) {
        this.colors = colors;
        this.emptyFillColor = emptyFillColor;
        this.minMaxGradient = minMaxGradient;
    }

    /**
     * @return &lt;p&gt;The hexadecimal codes for the colors.&lt;/p&gt;
     * 
     */
    public List<String> colors() {
        return this.colors == null ? List.of() : this.colors;
    }
    /**
     * @return &lt;p&gt;The hexadecimal code of a color that applies to charts where a lack of data is
     *             highlighted.&lt;/p&gt;
     * 
     */
    public Optional<String> emptyFillColor() {
        return Optional.ofNullable(this.emptyFillColor);
    }
    /**
     * @return &lt;p&gt;The minimum and maximum hexadecimal codes that describe a color gradient. &lt;/p&gt;
     * 
     */
    public List<String> minMaxGradient() {
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

        public Builder colors(@Nullable List<String> colors) {
            this.colors = colors;
            return this;
        }
        public Builder colors(String... colors) {
            return colors(List.of(colors));
        }
        public Builder emptyFillColor(@Nullable String emptyFillColor) {
            this.emptyFillColor = emptyFillColor;
            return this;
        }
        public Builder minMaxGradient(@Nullable List<String> minMaxGradient) {
            this.minMaxGradient = minMaxGradient;
            return this;
        }
        public Builder minMaxGradient(String... minMaxGradient) {
            return minMaxGradient(List.of(minMaxGradient));
        }        public ThemeDataColorPalette build() {
            return new ThemeDataColorPalette(colors, emptyFillColor, minMaxGradient);
        }
    }
}
