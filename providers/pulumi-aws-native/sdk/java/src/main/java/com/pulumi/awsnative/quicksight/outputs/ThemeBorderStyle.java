// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThemeBorderStyle {
    /**
     * @return &lt;p&gt;The option to enable display of borders for visuals.&lt;/p&gt;
     * 
     */
    private final @Nullable Boolean show;

    @CustomType.Constructor
    private ThemeBorderStyle(@CustomType.Parameter("show") @Nullable Boolean show) {
        this.show = show;
    }

    /**
     * @return &lt;p&gt;The option to enable display of borders for visuals.&lt;/p&gt;
     * 
     */
    public Optional<Boolean> show() {
        return Optional.ofNullable(this.show);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeBorderStyle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean show;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeBorderStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.show = defaults.show;
        }

        public Builder show(@Nullable Boolean show) {
            this.show = show;
            return this;
        }        public ThemeBorderStyle build() {
            return new ThemeBorderStyle(show);
        }
    }
}
