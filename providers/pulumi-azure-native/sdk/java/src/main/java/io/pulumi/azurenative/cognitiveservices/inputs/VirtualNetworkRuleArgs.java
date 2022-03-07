// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule governing the accessibility from a specific virtual network.
 * 
 */
public final class VirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * Full resource id of a vnet subnet, such as '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Ignore missing vnet service endpoint or not.
     * 
     */
    @InputImport(name="ignoreMissingVnetServiceEndpoint")
      private final @Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint;

    public Input<Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint == null ? Input.empty() : this.ignoreMissingVnetServiceEndpoint;
    }

    /**
     * Gets the state of virtual network rule.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public VirtualNetworkRuleArgs(
        Input<String> id,
        @Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint,
        @Nullable Input<String> state) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.state = state;
    }

    private VirtualNetworkRuleArgs() {
        this.id = Input.empty();
        this.ignoreMissingVnetServiceEndpoint = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private @Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
    	      this.state = defaults.state;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setIgnoreMissingVnetServiceEndpoint(@Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        public Builder setIgnoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = Input.ofNullable(ignoreMissingVnetServiceEndpoint);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(id, ignoreMissingVnetServiceEndpoint, state);
        }
    }
}