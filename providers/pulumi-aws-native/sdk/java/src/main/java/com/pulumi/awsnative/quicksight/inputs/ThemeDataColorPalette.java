// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The theme colors that are used for data colors in charts. The colors description is a
 *             hexadecimal color code that consists of six alphanumerical characters, prefixed with
 *                 &lt;code&gt;#&lt;/code&gt;, for example #37BFF5. &lt;/p&gt;
 * 
 */
public final class ThemeDataColorPalette extends com.pulumi.resources.InvokeArgs {

    public static final ThemeDataColorPalette Empty = new ThemeDataColorPalette();

    /**
     * &lt;p&gt;The hexadecimal codes for the colors.&lt;/p&gt;
     * 
     */
    @Import(name="colors")
    private @Nullable List<String> colors;

    /**
     * @return &lt;p&gt;The hexadecimal codes for the colors.&lt;/p&gt;
     * 
     */
    public Optional<List<String>> colors() {
        return Optional.ofNullable(this.colors);
    }

    /**
     * &lt;p&gt;The hexadecimal code of a color that applies to charts where a lack of data is
     *             highlighted.&lt;/p&gt;
     * 
     */
    @Import(name="emptyFillColor")
    private @Nullable String emptyFillColor;

    /**
     * @return &lt;p&gt;The hexadecimal code of a color that applies to charts where a lack of data is
     *             highlighted.&lt;/p&gt;
     * 
     */
    public Optional<String> emptyFillColor() {
        return Optional.ofNullable(this.emptyFillColor);
    }

    /**
     * &lt;p&gt;The minimum and maximum hexadecimal codes that describe a color gradient. &lt;/p&gt;
     * 
     */
    @Import(name="minMaxGradient")
    private @Nullable List<String> minMaxGradient;

    /**
     * @return &lt;p&gt;The minimum and maximum hexadecimal codes that describe a color gradient. &lt;/p&gt;
     * 
     */
    public Optional<List<String>> minMaxGradient() {
        return Optional.ofNullable(this.minMaxGradient);
    }

    private ThemeDataColorPalette() {}

    private ThemeDataColorPalette(ThemeDataColorPalette $) {
        this.colors = $.colors;
        this.emptyFillColor = $.emptyFillColor;
        this.minMaxGradient = $.minMaxGradient;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThemeDataColorPalette defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThemeDataColorPalette $;

        public Builder() {
            $ = new ThemeDataColorPalette();
        }

        public Builder(ThemeDataColorPalette defaults) {
            $ = new ThemeDataColorPalette(Objects.requireNonNull(defaults));
        }

        /**
         * @param colors &lt;p&gt;The hexadecimal codes for the colors.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder colors(@Nullable List<String> colors) {
            $.colors = colors;
            return this;
        }

        /**
         * @param colors &lt;p&gt;The hexadecimal codes for the colors.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder colors(String... colors) {
            return colors(List.of(colors));
        }

        /**
         * @param emptyFillColor &lt;p&gt;The hexadecimal code of a color that applies to charts where a lack of data is
         *             highlighted.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder emptyFillColor(@Nullable String emptyFillColor) {
            $.emptyFillColor = emptyFillColor;
            return this;
        }

        /**
         * @param minMaxGradient &lt;p&gt;The minimum and maximum hexadecimal codes that describe a color gradient. &lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder minMaxGradient(@Nullable List<String> minMaxGradient) {
            $.minMaxGradient = minMaxGradient;
            return this;
        }

        /**
         * @param minMaxGradient &lt;p&gt;The minimum and maximum hexadecimal codes that describe a color gradient. &lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder minMaxGradient(String... minMaxGradient) {
            return minMaxGradient(List.of(minMaxGradient));
        }

        public ThemeDataColorPalette build() {
            return $;
        }
    }

}
