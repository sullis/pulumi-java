// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThemeFont extends io.pulumi.resources.InvokeArgs {

    public static final ThemeFont Empty = new ThemeFont();

    @Import(name="fontFamily")
      private final @Nullable String fontFamily;

    public Optional<String> fontFamily() {
        return this.fontFamily == null ? Optional.empty() : Optional.ofNullable(this.fontFamily);
    }

    public ThemeFont(@Nullable String fontFamily) {
        this.fontFamily = fontFamily;
    }

    private ThemeFont() {
        this.fontFamily = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeFont defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fontFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeFont defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fontFamily = defaults.fontFamily;
        }

        public Builder fontFamily(@Nullable String fontFamily) {
            this.fontFamily = fontFamily;
            return this;
        }        public ThemeFont build() {
            return new ThemeFont(fontFamily);
        }
    }
}
