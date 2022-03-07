// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostedConnectionArgs Empty = new HostedConnectionArgs();

    /**
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     * 
     */
    @InputImport(name="bandwidth", required=true)
      private final Input<String> bandwidth;

    public Input<String> getBandwidth() {
        return this.bandwidth;
    }

    /**
     * The ID of the interconnect or LAG.
     * 
     */
    @InputImport(name="connectionId", required=true)
      private final Input<String> connectionId;

    public Input<String> getConnectionId() {
        return this.connectionId;
    }

    /**
     * The name of the connection.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the AWS account of the customer for the connection.
     * 
     */
    @InputImport(name="ownerAccountId", required=true)
      private final Input<String> ownerAccountId;

    public Input<String> getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * The dedicated VLAN provisioned to the hosted connection.
     * 
     */
    @InputImport(name="vlan", required=true)
      private final Input<Integer> vlan;

    public Input<Integer> getVlan() {
        return this.vlan;
    }

    public HostedConnectionArgs(
        Input<String> bandwidth,
        Input<String> connectionId,
        @Nullable Input<String> name,
        Input<String> ownerAccountId,
        Input<Integer> vlan) {
        this.bandwidth = Objects.requireNonNull(bandwidth, "expected parameter 'bandwidth' to be non-null");
        this.connectionId = Objects.requireNonNull(connectionId, "expected parameter 'connectionId' to be non-null");
        this.name = name;
        this.ownerAccountId = Objects.requireNonNull(ownerAccountId, "expected parameter 'ownerAccountId' to be non-null");
        this.vlan = Objects.requireNonNull(vlan, "expected parameter 'vlan' to be non-null");
    }

    private HostedConnectionArgs() {
        this.bandwidth = Input.empty();
        this.connectionId = Input.empty();
        this.name = Input.empty();
        this.ownerAccountId = Input.empty();
        this.vlan = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bandwidth;
        private Input<String> connectionId;
        private @Nullable Input<String> name;
        private Input<String> ownerAccountId;
        private Input<Integer> vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.connectionId = defaults.connectionId;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.vlan = defaults.vlan;
        }

        public Builder setBandwidth(Input<String> bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }

        public Builder setBandwidth(String bandwidth) {
            this.bandwidth = Input.of(Objects.requireNonNull(bandwidth));
            return this;
        }

        public Builder setConnectionId(Input<String> connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }

        public Builder setConnectionId(String connectionId) {
            this.connectionId = Input.of(Objects.requireNonNull(connectionId));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOwnerAccountId(Input<String> ownerAccountId) {
            this.ownerAccountId = Objects.requireNonNull(ownerAccountId);
            return this;
        }

        public Builder setOwnerAccountId(String ownerAccountId) {
            this.ownerAccountId = Input.of(Objects.requireNonNull(ownerAccountId));
            return this;
        }

        public Builder setVlan(Input<Integer> vlan) {
            this.vlan = Objects.requireNonNull(vlan);
            return this;
        }

        public Builder setVlan(Integer vlan) {
            this.vlan = Input.of(Objects.requireNonNull(vlan));
            return this;
        }
        public HostedConnectionArgs build() {
            return new HostedConnectionArgs(bandwidth, connectionId, name, ownerAccountId, vlan);
        }
    }
}