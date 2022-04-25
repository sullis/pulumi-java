// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.awsnative.lightsail.inputs.InstanceMonthlyTransfer;
import com.pulumi.awsnative.lightsail.inputs.InstancePort;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Networking of the Instance.
 * 
 */
public final class InstanceNetworking extends com.pulumi.resources.InvokeArgs {

    public static final InstanceNetworking Empty = new InstanceNetworking();

    @Import(name="monthlyTransfer")
    private @Nullable InstanceMonthlyTransfer monthlyTransfer;

    public Optional<InstanceMonthlyTransfer> monthlyTransfer() {
        return Optional.ofNullable(this.monthlyTransfer);
    }

    /**
     * Ports to the Instance.
     * 
     */
    @Import(name="ports", required=true)
    private List<InstancePort> ports;

    /**
     * @return Ports to the Instance.
     * 
     */
    public List<InstancePort> ports() {
        return this.ports;
    }

    private InstanceNetworking() {}

    private InstanceNetworking(InstanceNetworking $) {
        this.monthlyTransfer = $.monthlyTransfer;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceNetworking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceNetworking $;

        public Builder() {
            $ = new InstanceNetworking();
        }

        public Builder(InstanceNetworking defaults) {
            $ = new InstanceNetworking(Objects.requireNonNull(defaults));
        }

        public Builder monthlyTransfer(@Nullable InstanceMonthlyTransfer monthlyTransfer) {
            $.monthlyTransfer = monthlyTransfer;
            return this;
        }

        /**
         * @param ports Ports to the Instance.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<InstancePort> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports Ports to the Instance.
         * 
         * @return builder
         * 
         */
        public Builder ports(InstancePort... ports) {
            return ports(List.of(ports));
        }

        public InstanceNetworking build() {
            $.ports = Objects.requireNonNull($.ports, "expected parameter 'ports' to be non-null");
            return $;
        }
    }

}
