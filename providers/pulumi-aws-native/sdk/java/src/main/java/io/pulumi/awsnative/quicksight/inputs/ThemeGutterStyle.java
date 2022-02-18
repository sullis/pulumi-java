// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The display options for gutter spacing between tiles on a sheet.</p>
 * 
 */
public final class ThemeGutterStyle extends io.pulumi.resources.InvokeArgs {

    public static final ThemeGutterStyle Empty = new ThemeGutterStyle();

    /**
     * <p>This Boolean value controls whether to display a gutter space between sheet tiles.
     *         </p>
     * 
     */
    @InputImport(name="show")
    private final @Nullable Boolean show;

    public Optional<Boolean> getShow() {
        return this.show == null ? Optional.empty() : Optional.ofNullable(this.show);
    }

    public ThemeGutterStyle(@Nullable Boolean show) {
        this.show = show;
    }

    private ThemeGutterStyle() {
        this.show = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeGutterStyle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean show;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeGutterStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.show = defaults.show;
        }

        public Builder setShow(@Nullable Boolean show) {
            this.show = show;
            return this;
        }

        public ThemeGutterStyle build() {
            return new ThemeGutterStyle(show);
        }
    }
}
