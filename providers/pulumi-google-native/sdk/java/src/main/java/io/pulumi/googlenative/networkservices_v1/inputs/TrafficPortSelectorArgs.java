// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification of a port-based selector.
 * 
 */
public final class TrafficPortSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficPortSelectorArgs Empty = new TrafficPortSelectorArgs();

    /**
     * Optional. A list of ports. Can be port numbers or port range (example, [80-90] specifies all ports from 80 to 90, including 80 and 90) or named ports or * to specify all ports. If the list is empty, all ports are selected.
     * 
     */
    @InputImport(name="ports")
      private final @Nullable Input<List<String>> ports;

    public Input<List<String>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    public TrafficPortSelectorArgs(@Nullable Input<List<String>> ports) {
        this.ports = ports;
    }

    private TrafficPortSelectorArgs() {
        this.ports = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficPortSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficPortSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ports = defaults.ports;
        }

        public Builder setPorts(@Nullable Input<List<String>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<String> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }
        public TrafficPortSelectorArgs build() {
            return new TrafficPortSelectorArgs(ports);
        }
    }
}