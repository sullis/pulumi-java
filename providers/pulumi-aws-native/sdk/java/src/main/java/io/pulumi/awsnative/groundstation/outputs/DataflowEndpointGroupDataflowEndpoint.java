// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.outputs.DataflowEndpointGroupSocketAddress;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataflowEndpointGroupDataflowEndpoint {
    private final @Nullable DataflowEndpointGroupSocketAddress address;
    private final @Nullable Integer mtu;
    private final @Nullable String name;

    @OutputCustomType.Constructor({"address","mtu","name"})
    private DataflowEndpointGroupDataflowEndpoint(
        @Nullable DataflowEndpointGroupSocketAddress address,
        @Nullable Integer mtu,
        @Nullable String name) {
        this.address = address;
        this.mtu = mtu;
        this.name = name;
    }

    public Optional<DataflowEndpointGroupSocketAddress> getAddress() {
        return Optional.ofNullable(this.address);
    }
    public Optional<Integer> getMtu() {
        return Optional.ofNullable(this.mtu);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupDataflowEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataflowEndpointGroupSocketAddress address;
        private @Nullable Integer mtu;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupDataflowEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
        }

        public Builder setAddress(@Nullable DataflowEndpointGroupSocketAddress address) {
            this.address = address;
            return this;
        }

        public Builder setMtu(@Nullable Integer mtu) {
            this.mtu = mtu;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public DataflowEndpointGroupDataflowEndpoint build() {
            return new DataflowEndpointGroupDataflowEndpoint(address, mtu, name);
        }
    }
}