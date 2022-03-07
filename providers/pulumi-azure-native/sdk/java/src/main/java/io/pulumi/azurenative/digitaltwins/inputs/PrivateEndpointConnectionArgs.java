// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.azurenative.digitaltwins.inputs.PrivateEndpointConnectionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The private endpoint connection of a Digital Twin.
 * 
 */
public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    @InputImport(name="properties", required=true)
      private final Input<PrivateEndpointConnectionPropertiesArgs> properties;

    public Input<PrivateEndpointConnectionPropertiesArgs> getProperties() {
        return this.properties;
    }

    public PrivateEndpointConnectionArgs(Input<PrivateEndpointConnectionPropertiesArgs> properties) {
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PrivateEndpointConnectionPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder setProperties(Input<PrivateEndpointConnectionPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(PrivateEndpointConnectionPropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }
        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(properties);
        }
    }
}