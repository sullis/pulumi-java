// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NetworkInterface represents a NIC of a VM.
 * 
 */
public final class NetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * The external IP to define in the NIC.
     * 
     */
    @Import(name="externalIp")
    private @Nullable Output<String> externalIp;

    /**
     * @return The external IP to define in the NIC.
     * 
     */
    public Optional<Output<String>> externalIp() {
        return Optional.ofNullable(this.externalIp);
    }

    /**
     * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
     * 
     */
    @Import(name="internalIp")
    private @Nullable Output<String> internalIp;

    /**
     * @return The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
     * 
     */
    public Optional<Output<String>> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }

    /**
     * The network to connect the NIC to.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The network to connect the NIC to.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The subnetwork to connect the NIC to.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return The subnetwork to connect the NIC to.
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    private NetworkInterfaceArgs() {}

    private NetworkInterfaceArgs(NetworkInterfaceArgs $) {
        this.externalIp = $.externalIp;
        this.internalIp = $.internalIp;
        this.network = $.network;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceArgs $;

        public Builder() {
            $ = new NetworkInterfaceArgs();
        }

        public Builder(NetworkInterfaceArgs defaults) {
            $ = new NetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalIp The external IP to define in the NIC.
         * 
         * @return builder
         * 
         */
        public Builder externalIp(@Nullable Output<String> externalIp) {
            $.externalIp = externalIp;
            return this;
        }

        /**
         * @param externalIp The external IP to define in the NIC.
         * 
         * @return builder
         * 
         */
        public Builder externalIp(String externalIp) {
            return externalIp(Output.of(externalIp));
        }

        /**
         * @param internalIp The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
         * 
         * @return builder
         * 
         */
        public Builder internalIp(@Nullable Output<String> internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        /**
         * @param internalIp The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
         * 
         * @return builder
         * 
         */
        public Builder internalIp(String internalIp) {
            return internalIp(Output.of(internalIp));
        }

        /**
         * @param network The network to connect the NIC to.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The network to connect the NIC to.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param subnetwork The subnetwork to connect the NIC to.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork The subnetwork to connect the NIC to.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public NetworkInterfaceArgs build() {
            return $;
        }
    }

}
