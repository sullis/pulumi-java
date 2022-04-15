// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThemeGutterStyle {
    /**
     * <p>This Boolean value controls whether to display a gutter space between sheet tiles.
     *         </p>
     * 
     */
    private final @Nullable Boolean show;

    @CustomType.Constructor
    private ThemeGutterStyle(@CustomType.Parameter("show") @Nullable Boolean show) {
        this.show = show;
    }

    /**
     * <p>This Boolean value controls whether to display a gutter space between sheet tiles.
     *         </p>
     * 
    */
    public Optional<Boolean> show() {
        return Optional.ofNullable(this.show);
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

        public Builder show(@Nullable Boolean show) {
            this.show = show;
            return this;
        }        public ThemeGutterStyle build() {
            return new ThemeGutterStyle(show);
        }
    }
}
