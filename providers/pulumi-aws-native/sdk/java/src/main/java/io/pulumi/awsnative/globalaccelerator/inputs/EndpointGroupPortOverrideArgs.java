// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * listener to endpoint port mapping.
 * 
 */
public final class EndpointGroupPortOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointGroupPortOverrideArgs Empty = new EndpointGroupPortOverrideArgs();

    @InputImport(name="endpointPort", required=true)
    private final Input<Integer> endpointPort;

    public Input<Integer> getEndpointPort() {
        return this.endpointPort;
    }

    @InputImport(name="listenerPort", required=true)
    private final Input<Integer> listenerPort;

    public Input<Integer> getListenerPort() {
        return this.listenerPort;
    }

    public EndpointGroupPortOverrideArgs(
        Input<Integer> endpointPort,
        Input<Integer> listenerPort) {
        this.endpointPort = Objects.requireNonNull(endpointPort, "expected parameter 'endpointPort' to be non-null");
        this.listenerPort = Objects.requireNonNull(listenerPort, "expected parameter 'listenerPort' to be non-null");
    }

    private EndpointGroupPortOverrideArgs() {
        this.endpointPort = Input.empty();
        this.listenerPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupPortOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> endpointPort;
        private Input<Integer> listenerPort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupPortOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointPort = defaults.endpointPort;
    	      this.listenerPort = defaults.listenerPort;
        }

        public Builder setEndpointPort(Input<Integer> endpointPort) {
            this.endpointPort = Objects.requireNonNull(endpointPort);
            return this;
        }

        public Builder setEndpointPort(Integer endpointPort) {
            this.endpointPort = Input.of(Objects.requireNonNull(endpointPort));
            return this;
        }

        public Builder setListenerPort(Input<Integer> listenerPort) {
            this.listenerPort = Objects.requireNonNull(listenerPort);
            return this;
        }

        public Builder setListenerPort(Integer listenerPort) {
            this.listenerPort = Input.of(Objects.requireNonNull(listenerPort));
            return this;
        }

        public EndpointGroupPortOverrideArgs build() {
            return new EndpointGroupPortOverrideArgs(endpointPort, listenerPort);
        }
    }
}
