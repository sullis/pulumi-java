// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Office365 breakout categories.
 * 
 */
public final class O365BreakOutCategoryPoliciesResponse extends io.pulumi.resources.InvokeArgs {

    public static final O365BreakOutCategoryPoliciesResponse Empty = new O365BreakOutCategoryPoliciesResponse();

    /**
     * Flag to control allow category.
     * 
     */
    @Import(name="allow")
      private final @Nullable Boolean allow;

    public Optional<Boolean> getAllow() {
        return this.allow == null ? Optional.empty() : Optional.ofNullable(this.allow);
    }

    /**
     * Flag to control default category.
     * 
     */
    @Import(name="default")
      private final @Nullable Boolean default_;

    public Optional<Boolean> getDefault_() {
        return this.default_ == null ? Optional.empty() : Optional.ofNullable(this.default_);
    }

    /**
     * Flag to control optimize category.
     * 
     */
    @Import(name="optimize")
      private final @Nullable Boolean optimize;

    public Optional<Boolean> getOptimize() {
        return this.optimize == null ? Optional.empty() : Optional.ofNullable(this.optimize);
    }

    public O365BreakOutCategoryPoliciesResponse(
        @Nullable Boolean allow,
        @Nullable Boolean default_,
        @Nullable Boolean optimize) {
        this.allow = allow;
        this.default_ = default_;
        this.optimize = optimize;
    }

    private O365BreakOutCategoryPoliciesResponse() {
        this.allow = null;
        this.default_ = null;
        this.optimize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(O365BreakOutCategoryPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allow;
        private @Nullable Boolean default_;
        private @Nullable Boolean optimize;

        public Builder() {
    	      // Empty
        }

        public Builder(O365BreakOutCategoryPoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.default_ = defaults.default_;
    	      this.optimize = defaults.optimize;
        }

        public Builder allow(@Nullable Boolean allow) {
            this.allow = allow;
            return this;
        }
        public Builder default_(@Nullable Boolean default_) {
            this.default_ = default_;
            return this;
        }
        public Builder optimize(@Nullable Boolean optimize) {
            this.optimize = optimize;
            return this;
        }        public O365BreakOutCategoryPoliciesResponse build() {
            return new O365BreakOutCategoryPoliciesResponse(allow, default_, optimize);
        }
    }
}
