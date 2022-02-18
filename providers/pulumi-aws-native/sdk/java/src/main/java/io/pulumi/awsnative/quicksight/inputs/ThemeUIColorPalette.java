// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The theme colors that apply to UI and to charts, excluding data colors. The colors
 *             description is a hexadecimal color code that consists of six alphanumerical characters,
 *             prefixed with <code>#</code>, for example #37BFF5. For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html">Using Themes in Amazon QuickSight</a> in the <i>Amazon QuickSight User
 *                 Guide.</i>
 *         </p>
 * 
 */
public final class ThemeUIColorPalette extends io.pulumi.resources.InvokeArgs {

    public static final ThemeUIColorPalette Empty = new ThemeUIColorPalette();

    /**
     * <p>This color is that applies to selected states and buttons.</p>
     * 
     */
    @InputImport(name="accent")
    private final @Nullable String accent;

    public Optional<String> getAccent() {
        return this.accent == null ? Optional.empty() : Optional.ofNullable(this.accent);
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             accent color.</p>
     * 
     */
    @InputImport(name="accentForeground")
    private final @Nullable String accentForeground;

    public Optional<String> getAccentForeground() {
        return this.accentForeground == null ? Optional.empty() : Optional.ofNullable(this.accentForeground);
    }

    /**
     * <p>The color that applies to error messages.</p>
     * 
     */
    @InputImport(name="danger")
    private final @Nullable String danger;

    public Optional<String> getDanger() {
        return this.danger == null ? Optional.empty() : Optional.ofNullable(this.danger);
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             error color.</p>
     * 
     */
    @InputImport(name="dangerForeground")
    private final @Nullable String dangerForeground;

    public Optional<String> getDangerForeground() {
        return this.dangerForeground == null ? Optional.empty() : Optional.ofNullable(this.dangerForeground);
    }

    /**
     * <p>The color that applies to the names of fields that are identified as
     *             dimensions.</p>
     * 
     */
    @InputImport(name="dimension")
    private final @Nullable String dimension;

    public Optional<String> getDimension() {
        return this.dimension == null ? Optional.empty() : Optional.ofNullable(this.dimension);
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             dimension color.</p>
     * 
     */
    @InputImport(name="dimensionForeground")
    private final @Nullable String dimensionForeground;

    public Optional<String> getDimensionForeground() {
        return this.dimensionForeground == null ? Optional.empty() : Optional.ofNullable(this.dimensionForeground);
    }

    /**
     * <p>The color that applies to the names of fields that are identified as measures.</p>
     * 
     */
    @InputImport(name="measure")
    private final @Nullable String measure;

    public Optional<String> getMeasure() {
        return this.measure == null ? Optional.empty() : Optional.ofNullable(this.measure);
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             measure color.</p>
     * 
     */
    @InputImport(name="measureForeground")
    private final @Nullable String measureForeground;

    public Optional<String> getMeasureForeground() {
        return this.measureForeground == null ? Optional.empty() : Optional.ofNullable(this.measureForeground);
    }

    /**
     * <p>The background color that applies to visuals and other high emphasis UI.</p>
     * 
     */
    @InputImport(name="primaryBackground")
    private final @Nullable String primaryBackground;

    public Optional<String> getPrimaryBackground() {
        return this.primaryBackground == null ? Optional.empty() : Optional.ofNullable(this.primaryBackground);
    }

    /**
     * <p>The color of text and other foreground elements that appear over the primary
     *             background regions, such as grid lines, borders, table banding, icons, and so on.</p>
     * 
     */
    @InputImport(name="primaryForeground")
    private final @Nullable String primaryForeground;

    public Optional<String> getPrimaryForeground() {
        return this.primaryForeground == null ? Optional.empty() : Optional.ofNullable(this.primaryForeground);
    }

    /**
     * <p>The background color that applies to the sheet background and sheet controls.</p>
     * 
     */
    @InputImport(name="secondaryBackground")
    private final @Nullable String secondaryBackground;

    public Optional<String> getSecondaryBackground() {
        return this.secondaryBackground == null ? Optional.empty() : Optional.ofNullable(this.secondaryBackground);
    }

    /**
     * <p>The foreground color that applies to any sheet title, sheet control text, or UI that
     *             appears over the secondary background.</p>
     * 
     */
    @InputImport(name="secondaryForeground")
    private final @Nullable String secondaryForeground;

    public Optional<String> getSecondaryForeground() {
        return this.secondaryForeground == null ? Optional.empty() : Optional.ofNullable(this.secondaryForeground);
    }

    /**
     * <p>The color that applies to success messages, for example the check mark for a
     *             successful download.</p>
     * 
     */
    @InputImport(name="success")
    private final @Nullable String success;

    public Optional<String> getSuccess() {
        return this.success == null ? Optional.empty() : Optional.ofNullable(this.success);
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             success color.</p>
     * 
     */
    @InputImport(name="successForeground")
    private final @Nullable String successForeground;

    public Optional<String> getSuccessForeground() {
        return this.successForeground == null ? Optional.empty() : Optional.ofNullable(this.successForeground);
    }

    /**
     * <p>This color that applies to warning and informational messages.</p>
     * 
     */
    @InputImport(name="warning")
    private final @Nullable String warning;

    public Optional<String> getWarning() {
        return this.warning == null ? Optional.empty() : Optional.ofNullable(this.warning);
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             warning color.</p>
     * 
     */
    @InputImport(name="warningForeground")
    private final @Nullable String warningForeground;

    public Optional<String> getWarningForeground() {
        return this.warningForeground == null ? Optional.empty() : Optional.ofNullable(this.warningForeground);
    }

    public ThemeUIColorPalette(
        @Nullable String accent,
        @Nullable String accentForeground,
        @Nullable String danger,
        @Nullable String dangerForeground,
        @Nullable String dimension,
        @Nullable String dimensionForeground,
        @Nullable String measure,
        @Nullable String measureForeground,
        @Nullable String primaryBackground,
        @Nullable String primaryForeground,
        @Nullable String secondaryBackground,
        @Nullable String secondaryForeground,
        @Nullable String success,
        @Nullable String successForeground,
        @Nullable String warning,
        @Nullable String warningForeground) {
        this.accent = accent;
        this.accentForeground = accentForeground;
        this.danger = danger;
        this.dangerForeground = dangerForeground;
        this.dimension = dimension;
        this.dimensionForeground = dimensionForeground;
        this.measure = measure;
        this.measureForeground = measureForeground;
        this.primaryBackground = primaryBackground;
        this.primaryForeground = primaryForeground;
        this.secondaryBackground = secondaryBackground;
        this.secondaryForeground = secondaryForeground;
        this.success = success;
        this.successForeground = successForeground;
        this.warning = warning;
        this.warningForeground = warningForeground;
    }

    private ThemeUIColorPalette() {
        this.accent = null;
        this.accentForeground = null;
        this.danger = null;
        this.dangerForeground = null;
        this.dimension = null;
        this.dimensionForeground = null;
        this.measure = null;
        this.measureForeground = null;
        this.primaryBackground = null;
        this.primaryForeground = null;
        this.secondaryBackground = null;
        this.secondaryForeground = null;
        this.success = null;
        this.successForeground = null;
        this.warning = null;
        this.warningForeground = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeUIColorPalette defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accent;
        private @Nullable String accentForeground;
        private @Nullable String danger;
        private @Nullable String dangerForeground;
        private @Nullable String dimension;
        private @Nullable String dimensionForeground;
        private @Nullable String measure;
        private @Nullable String measureForeground;
        private @Nullable String primaryBackground;
        private @Nullable String primaryForeground;
        private @Nullable String secondaryBackground;
        private @Nullable String secondaryForeground;
        private @Nullable String success;
        private @Nullable String successForeground;
        private @Nullable String warning;
        private @Nullable String warningForeground;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeUIColorPalette defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accent = defaults.accent;
    	      this.accentForeground = defaults.accentForeground;
    	      this.danger = defaults.danger;
    	      this.dangerForeground = defaults.dangerForeground;
    	      this.dimension = defaults.dimension;
    	      this.dimensionForeground = defaults.dimensionForeground;
    	      this.measure = defaults.measure;
    	      this.measureForeground = defaults.measureForeground;
    	      this.primaryBackground = defaults.primaryBackground;
    	      this.primaryForeground = defaults.primaryForeground;
    	      this.secondaryBackground = defaults.secondaryBackground;
    	      this.secondaryForeground = defaults.secondaryForeground;
    	      this.success = defaults.success;
    	      this.successForeground = defaults.successForeground;
    	      this.warning = defaults.warning;
    	      this.warningForeground = defaults.warningForeground;
        }

        public Builder setAccent(@Nullable String accent) {
            this.accent = accent;
            return this;
        }

        public Builder setAccentForeground(@Nullable String accentForeground) {
            this.accentForeground = accentForeground;
            return this;
        }

        public Builder setDanger(@Nullable String danger) {
            this.danger = danger;
            return this;
        }

        public Builder setDangerForeground(@Nullable String dangerForeground) {
            this.dangerForeground = dangerForeground;
            return this;
        }

        public Builder setDimension(@Nullable String dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setDimensionForeground(@Nullable String dimensionForeground) {
            this.dimensionForeground = dimensionForeground;
            return this;
        }

        public Builder setMeasure(@Nullable String measure) {
            this.measure = measure;
            return this;
        }

        public Builder setMeasureForeground(@Nullable String measureForeground) {
            this.measureForeground = measureForeground;
            return this;
        }

        public Builder setPrimaryBackground(@Nullable String primaryBackground) {
            this.primaryBackground = primaryBackground;
            return this;
        }

        public Builder setPrimaryForeground(@Nullable String primaryForeground) {
            this.primaryForeground = primaryForeground;
            return this;
        }

        public Builder setSecondaryBackground(@Nullable String secondaryBackground) {
            this.secondaryBackground = secondaryBackground;
            return this;
        }

        public Builder setSecondaryForeground(@Nullable String secondaryForeground) {
            this.secondaryForeground = secondaryForeground;
            return this;
        }

        public Builder setSuccess(@Nullable String success) {
            this.success = success;
            return this;
        }

        public Builder setSuccessForeground(@Nullable String successForeground) {
            this.successForeground = successForeground;
            return this;
        }

        public Builder setWarning(@Nullable String warning) {
            this.warning = warning;
            return this;
        }

        public Builder setWarningForeground(@Nullable String warningForeground) {
            this.warningForeground = warningForeground;
            return this;
        }

        public ThemeUIColorPalette build() {
            return new ThemeUIColorPalette(accent, accentForeground, danger, dangerForeground, dimension, dimensionForeground, measure, measureForeground, primaryBackground, primaryForeground, secondaryBackground, secondaryForeground, success, successForeground, warning, warningForeground);
        }
    }
}
