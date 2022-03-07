// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.DataflowEndpointGroupSocketAddress;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupDataflowEndpoint extends io.pulumi.resources.InvokeArgs {

    public static final DataflowEndpointGroupDataflowEndpoint Empty = new DataflowEndpointGroupDataflowEndpoint();

    @InputImport(name="address")
      private final @Nullable DataflowEndpointGroupSocketAddress address;

    public Optional<DataflowEndpointGroupSocketAddress> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    @InputImport(name="mtu")
      private final @Nullable Integer mtu;

    public Optional<Integer> getMtu() {
        return this.mtu == null ? Optional.empty() : Optional.ofNullable(this.mtu);
    }

    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public DataflowEndpointGroupDataflowEndpoint(
        @Nullable DataflowEndpointGroupSocketAddress address,
        @Nullable Integer mtu,
        @Nullable String name) {
        this.address = address;
        this.mtu = mtu;
        this.name = name;
    }

    private DataflowEndpointGroupDataflowEndpoint() {
        this.address = null;
        this.mtu = null;
        this.name = null;
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