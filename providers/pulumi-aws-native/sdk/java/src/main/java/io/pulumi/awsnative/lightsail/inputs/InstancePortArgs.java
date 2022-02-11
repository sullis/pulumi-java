// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstancePortArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstancePortArgs Empty = new InstancePortArgs();

    @InputImport(name="accessDirection")
    private final @Nullable Input<String> accessDirection;

    public Input<String> getAccessDirection() {
        return this.accessDirection == null ? Input.empty() : this.accessDirection;
    }

    @InputImport(name="accessFrom")
    private final @Nullable Input<String> accessFrom;

    public Input<String> getAccessFrom() {
        return this.accessFrom == null ? Input.empty() : this.accessFrom;
    }

    @InputImport(name="accessType")
    private final @Nullable Input<String> accessType;

    public Input<String> getAccessType() {
        return this.accessType == null ? Input.empty() : this.accessType;
    }

    @InputImport(name="cidrListAliases")
    private final @Nullable Input<List<String>> cidrListAliases;

    public Input<List<String>> getCidrListAliases() {
        return this.cidrListAliases == null ? Input.empty() : this.cidrListAliases;
    }

    @InputImport(name="cidrs")
    private final @Nullable Input<List<String>> cidrs;

    public Input<List<String>> getCidrs() {
        return this.cidrs == null ? Input.empty() : this.cidrs;
    }

    @InputImport(name="commonName")
    private final @Nullable Input<String> commonName;

    public Input<String> getCommonName() {
        return this.commonName == null ? Input.empty() : this.commonName;
    }

    @InputImport(name="fromPort")
    private final @Nullable Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort == null ? Input.empty() : this.fromPort;
    }

    @InputImport(name="ipv6Cidrs")
    private final @Nullable Input<List<String>> ipv6Cidrs;

    public Input<List<String>> getIpv6Cidrs() {
        return this.ipv6Cidrs == null ? Input.empty() : this.ipv6Cidrs;
    }

    @InputImport(name="protocol")
    private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    @InputImport(name="toPort")
    private final @Nullable Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort == null ? Input.empty() : this.toPort;
    }

    public InstancePortArgs(
        @Nullable Input<String> accessDirection,
        @Nullable Input<String> accessFrom,
        @Nullable Input<String> accessType,
        @Nullable Input<List<String>> cidrListAliases,
        @Nullable Input<List<String>> cidrs,
        @Nullable Input<String> commonName,
        @Nullable Input<Integer> fromPort,
        @Nullable Input<List<String>> ipv6Cidrs,
        @Nullable Input<String> protocol,
        @Nullable Input<Integer> toPort) {
        this.accessDirection = accessDirection;
        this.accessFrom = accessFrom;
        this.accessType = accessType;
        this.cidrListAliases = cidrListAliases;
        this.cidrs = cidrs;
        this.commonName = commonName;
        this.fromPort = fromPort;
        this.ipv6Cidrs = ipv6Cidrs;
        this.protocol = protocol;
        this.toPort = toPort;
    }

    private InstancePortArgs() {
        this.accessDirection = Input.empty();
        this.accessFrom = Input.empty();
        this.accessType = Input.empty();
        this.cidrListAliases = Input.empty();
        this.cidrs = Input.empty();
        this.commonName = Input.empty();
        this.fromPort = Input.empty();
        this.ipv6Cidrs = Input.empty();
        this.protocol = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessDirection;
        private @Nullable Input<String> accessFrom;
        private @Nullable Input<String> accessType;
        private @Nullable Input<List<String>> cidrListAliases;
        private @Nullable Input<List<String>> cidrs;
        private @Nullable Input<String> commonName;
        private @Nullable Input<Integer> fromPort;
        private @Nullable Input<List<String>> ipv6Cidrs;
        private @Nullable Input<String> protocol;
        private @Nullable Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessDirection = defaults.accessDirection;
    	      this.accessFrom = defaults.accessFrom;
    	      this.accessType = defaults.accessType;
    	      this.cidrListAliases = defaults.cidrListAliases;
    	      this.cidrs = defaults.cidrs;
    	      this.commonName = defaults.commonName;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6Cidrs = defaults.ipv6Cidrs;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder setAccessDirection(@Nullable Input<String> accessDirection) {
            this.accessDirection = accessDirection;
            return this;
        }

        public Builder setAccessDirection(@Nullable String accessDirection) {
            this.accessDirection = Input.ofNullable(accessDirection);
            return this;
        }

        public Builder setAccessFrom(@Nullable Input<String> accessFrom) {
            this.accessFrom = accessFrom;
            return this;
        }

        public Builder setAccessFrom(@Nullable String accessFrom) {
            this.accessFrom = Input.ofNullable(accessFrom);
            return this;
        }

        public Builder setAccessType(@Nullable Input<String> accessType) {
            this.accessType = accessType;
            return this;
        }

        public Builder setAccessType(@Nullable String accessType) {
            this.accessType = Input.ofNullable(accessType);
            return this;
        }

        public Builder setCidrListAliases(@Nullable Input<List<String>> cidrListAliases) {
            this.cidrListAliases = cidrListAliases;
            return this;
        }

        public Builder setCidrListAliases(@Nullable List<String> cidrListAliases) {
            this.cidrListAliases = Input.ofNullable(cidrListAliases);
            return this;
        }

        public Builder setCidrs(@Nullable Input<List<String>> cidrs) {
            this.cidrs = cidrs;
            return this;
        }

        public Builder setCidrs(@Nullable List<String> cidrs) {
            this.cidrs = Input.ofNullable(cidrs);
            return this;
        }

        public Builder setCommonName(@Nullable Input<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder setCommonName(@Nullable String commonName) {
            this.commonName = Input.ofNullable(commonName);
            return this;
        }

        public Builder setFromPort(@Nullable Input<Integer> fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        public Builder setFromPort(@Nullable Integer fromPort) {
            this.fromPort = Input.ofNullable(fromPort);
            return this;
        }

        public Builder setIpv6Cidrs(@Nullable Input<List<String>> ipv6Cidrs) {
            this.ipv6Cidrs = ipv6Cidrs;
            return this;
        }

        public Builder setIpv6Cidrs(@Nullable List<String> ipv6Cidrs) {
            this.ipv6Cidrs = Input.ofNullable(ipv6Cidrs);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setToPort(@Nullable Input<Integer> toPort) {
            this.toPort = toPort;
            return this;
        }

        public Builder setToPort(@Nullable Integer toPort) {
            this.toPort = Input.ofNullable(toPort);
            return this;
        }

        public InstancePortArgs build() {
            return new InstancePortArgs(accessDirection, accessFrom, accessType, cidrListAliases, cidrs, commonName, fromPort, ipv6Cidrs, protocol, toPort);
        }
    }
}
