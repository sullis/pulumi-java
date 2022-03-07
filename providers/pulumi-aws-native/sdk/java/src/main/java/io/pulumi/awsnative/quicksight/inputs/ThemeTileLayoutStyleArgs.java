// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.ThemeGutterStyleArgs;
import io.pulumi.awsnative.quicksight.inputs.ThemeMarginStyleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The display options for the layout of tiles on a sheet.</p>
 * 
 */
public final class ThemeTileLayoutStyleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeTileLayoutStyleArgs Empty = new ThemeTileLayoutStyleArgs();

    @InputImport(name="gutter")
      private final @Nullable Input<ThemeGutterStyleArgs> gutter;

    public Input<ThemeGutterStyleArgs> getGutter() {
        return this.gutter == null ? Input.empty() : this.gutter;
    }

    @InputImport(name="margin")
      private final @Nullable Input<ThemeMarginStyleArgs> margin;

    public Input<ThemeMarginStyleArgs> getMargin() {
        return this.margin == null ? Input.empty() : this.margin;
    }

    public ThemeTileLayoutStyleArgs(
        @Nullable Input<ThemeGutterStyleArgs> gutter,
        @Nullable Input<ThemeMarginStyleArgs> margin) {
        this.gutter = gutter;
        this.margin = margin;
    }

    private ThemeTileLayoutStyleArgs() {
        this.gutter = Input.empty();
        this.margin = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeTileLayoutStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ThemeGutterStyleArgs> gutter;
        private @Nullable Input<ThemeMarginStyleArgs> margin;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeTileLayoutStyleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gutter = defaults.gutter;
    	      this.margin = defaults.margin;
        }

        public Builder setGutter(@Nullable Input<ThemeGutterStyleArgs> gutter) {
            this.gutter = gutter;
            return this;
        }

        public Builder setGutter(@Nullable ThemeGutterStyleArgs gutter) {
            this.gutter = Input.ofNullable(gutter);
            return this;
        }

        public Builder setMargin(@Nullable Input<ThemeMarginStyleArgs> margin) {
            this.margin = margin;
            return this;
        }

        public Builder setMargin(@Nullable ThemeMarginStyleArgs margin) {
            this.margin = Input.ofNullable(margin);
            return this;
        }
        public ThemeTileLayoutStyleArgs build() {
            return new ThemeTileLayoutStyleArgs(gutter, margin);
        }
    }
}