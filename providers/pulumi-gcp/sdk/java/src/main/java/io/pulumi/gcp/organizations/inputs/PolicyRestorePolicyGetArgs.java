// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class PolicyRestorePolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyRestorePolicyGetArgs Empty = new PolicyRestorePolicyGetArgs();

    /**
     * May only be set to true. If set, then the default Policy is restored.
     * 
     */
    @Import(name="default", required=true)
      private final Output<Boolean> default_;

    public Output<Boolean> getDefault_() {
        return this.default_;
    }

    public PolicyRestorePolicyGetArgs(Output<Boolean> default_) {
        this.default_ = Objects.requireNonNull(default_, "expected parameter 'default_' to be non-null");
    }

    private PolicyRestorePolicyGetArgs() {
        this.default_ = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRestorePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> default_;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyRestorePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
        }

        public Builder default_(Output<Boolean> default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        public Builder default_(Boolean default_) {
            this.default_ = Output.of(Objects.requireNonNull(default_));
            return this;
        }        public PolicyRestorePolicyGetArgs build() {
            return new PolicyRestorePolicyGetArgs(default_);
        }
    }
}
