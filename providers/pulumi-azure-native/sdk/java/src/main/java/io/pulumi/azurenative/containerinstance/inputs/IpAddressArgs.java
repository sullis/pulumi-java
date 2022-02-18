// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.enums.ContainerGroupIpAddressType;
import io.pulumi.azurenative.containerinstance.inputs.PortArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IP address for the container group.
 * 
 */
public final class IpAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpAddressArgs Empty = new IpAddressArgs();

    /**
     * The Dns name label for the IP.
     * 
     */
    @InputImport(name="dnsNameLabel")
    private final @Nullable Input<String> dnsNameLabel;

    public Input<String> getDnsNameLabel() {
        return this.dnsNameLabel == null ? Input.empty() : this.dnsNameLabel;
    }

    /**
     * The IP exposed to the public internet.
     * 
     */
    @InputImport(name="ip")
    private final @Nullable Input<String> ip;

    public Input<String> getIp() {
        return this.ip == null ? Input.empty() : this.ip;
    }

    /**
     * The list of ports exposed on the container group.
     * 
     */
    @InputImport(name="ports", required=true)
    private final Input<List<PortArgs>> ports;

    public Input<List<PortArgs>> getPorts() {
        return this.ports;
    }

    /**
     * Specifies if the IP is exposed to the public internet or private VNET.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<Either<String,ContainerGroupIpAddressType>> type;

    public Input<Either<String,ContainerGroupIpAddressType>> getType() {
        return this.type;
    }

    public IpAddressArgs(
        @Nullable Input<String> dnsNameLabel,
        @Nullable Input<String> ip,
        Input<List<PortArgs>> ports,
        Input<Either<String,ContainerGroupIpAddressType>> type) {
        this.dnsNameLabel = dnsNameLabel;
        this.ip = ip;
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IpAddressArgs() {
        this.dnsNameLabel = Input.empty();
        this.ip = Input.empty();
        this.ports = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dnsNameLabel;
        private @Nullable Input<String> ip;
        private Input<List<PortArgs>> ports;
        private Input<Either<String,ContainerGroupIpAddressType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsNameLabel = defaults.dnsNameLabel;
    	      this.ip = defaults.ip;
    	      this.ports = defaults.ports;
    	      this.type = defaults.type;
        }

        public Builder setDnsNameLabel(@Nullable Input<String> dnsNameLabel) {
            this.dnsNameLabel = dnsNameLabel;
            return this;
        }

        public Builder setDnsNameLabel(@Nullable String dnsNameLabel) {
            this.dnsNameLabel = Input.ofNullable(dnsNameLabel);
            return this;
        }

        public Builder setIp(@Nullable Input<String> ip) {
            this.ip = ip;
            return this;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = Input.ofNullable(ip);
            return this;
        }

        public Builder setPorts(Input<List<PortArgs>> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setPorts(List<PortArgs> ports) {
            this.ports = Input.of(Objects.requireNonNull(ports));
            return this;
        }

        public Builder setType(Input<Either<String,ContainerGroupIpAddressType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,ContainerGroupIpAddressType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public IpAddressArgs build() {
            return new IpAddressArgs(dnsNameLabel, ip, ports, type);
        }
    }
}
