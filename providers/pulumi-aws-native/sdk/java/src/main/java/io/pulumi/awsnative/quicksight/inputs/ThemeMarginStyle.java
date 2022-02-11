// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThemeMarginStyle extends io.pulumi.resources.InvokeArgs {

    public static final ThemeMarginStyle Empty = new ThemeMarginStyle();

    @InputImport(name="show")
    private final @Nullable Boolean show;

    public Optional<Boolean> getShow() {
        return this.show == null ? Optional.empty() : Optional.ofNullable(this.show);
    }

    public ThemeMarginStyle(@Nullable Boolean show) {
        this.show = show;
    }

    private ThemeMarginStyle() {
        this.show = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeMarginStyle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean show;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeMarginStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.show = defaults.show;
        }

        public Builder setShow(@Nullable Boolean show) {
            this.show = show;
            return this;
        }

        public ThemeMarginStyle build() {
            return new ThemeMarginStyle(show);
        }
    }
}
