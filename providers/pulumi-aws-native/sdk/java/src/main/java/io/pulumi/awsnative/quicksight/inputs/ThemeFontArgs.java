// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThemeFontArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeFontArgs Empty = new ThemeFontArgs();

    @Import(name="fontFamily")
      private final @Nullable Output<String> fontFamily;

    public Output<String> fontFamily() {
        return this.fontFamily == null ? Codegen.empty() : this.fontFamily;
    }

    public ThemeFontArgs(@Nullable Output<String> fontFamily) {
        this.fontFamily = fontFamily;
    }

    private ThemeFontArgs() {
        this.fontFamily = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeFontArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fontFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeFontArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fontFamily = defaults.fontFamily;
        }

        public Builder fontFamily(@Nullable Output<String> fontFamily) {
            this.fontFamily = fontFamily;
            return this;
        }
        public Builder fontFamily(@Nullable String fontFamily) {
            this.fontFamily = Codegen.ofNullable(fontFamily);
            return this;
        }        public ThemeFontArgs build() {
            return new ThemeFontArgs(fontFamily);
        }
    }
}
