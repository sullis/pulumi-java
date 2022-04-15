// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The display options for tile borders for visuals.</p>
 * 
 */
public final class ThemeBorderStyleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeBorderStyleArgs Empty = new ThemeBorderStyleArgs();

    /**
     * <p>The option to enable display of borders for visuals.</p>
     * 
     */
    @Import(name="show")
      private final @Nullable Output<Boolean> show;

    public Output<Boolean> show() {
        return this.show == null ? Codegen.empty() : this.show;
    }

    public ThemeBorderStyleArgs(@Nullable Output<Boolean> show) {
        this.show = show;
    }

    private ThemeBorderStyleArgs() {
        this.show = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeBorderStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> show;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeBorderStyleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.show = defaults.show;
        }

        public Builder show(@Nullable Output<Boolean> show) {
            this.show = show;
            return this;
        }
        public Builder show(@Nullable Boolean show) {
            this.show = Codegen.ofNullable(show);
            return this;
        }        public ThemeBorderStyleArgs build() {
            return new ThemeBorderStyleArgs(show);
        }
    }
}
