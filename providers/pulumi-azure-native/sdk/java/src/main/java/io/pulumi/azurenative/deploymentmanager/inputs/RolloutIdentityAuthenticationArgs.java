// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * RolloutIdentity uses the user-assigned managed identity authentication context specified in the Identity property during rollout creation.
 * 
 */
public final class RolloutIdentityAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RolloutIdentityAuthenticationArgs Empty = new RolloutIdentityAuthenticationArgs();

    /**
     * The authentication type.
     * Expected value is 'RolloutIdentity'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RolloutIdentityAuthenticationArgs(Input<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RolloutIdentityAuthenticationArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutIdentityAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RolloutIdentityAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public RolloutIdentityAuthenticationArgs build() {
            return new RolloutIdentityAuthenticationArgs(type);
        }
    }
}