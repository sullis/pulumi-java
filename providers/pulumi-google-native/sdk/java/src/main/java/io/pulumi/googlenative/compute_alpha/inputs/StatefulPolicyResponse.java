// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.StatefulPolicyPreservedStateResponse;
import java.util.Objects;


public final class StatefulPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final StatefulPolicyResponse Empty = new StatefulPolicyResponse();

    @Import(name="preservedState", required=true)
      private final StatefulPolicyPreservedStateResponse preservedState;

    public StatefulPolicyPreservedStateResponse getPreservedState() {
        return this.preservedState;
    }

    public StatefulPolicyResponse(StatefulPolicyPreservedStateResponse preservedState) {
        this.preservedState = Objects.requireNonNull(preservedState, "expected parameter 'preservedState' to be non-null");
    }

    private StatefulPolicyResponse() {
        this.preservedState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulPolicyPreservedStateResponse preservedState;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preservedState = defaults.preservedState;
        }

        public Builder preservedState(StatefulPolicyPreservedStateResponse preservedState) {
            this.preservedState = Objects.requireNonNull(preservedState);
            return this;
        }        public StatefulPolicyResponse build() {
            return new StatefulPolicyResponse(preservedState);
        }
    }
}
