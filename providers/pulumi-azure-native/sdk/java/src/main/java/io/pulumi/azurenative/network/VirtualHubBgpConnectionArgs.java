// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualHubBgpConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualHubBgpConnectionArgs Empty = new VirtualHubBgpConnectionArgs();

    /**
     * The name of the connection.
     * 
     */
    @InputImport(name="connectionName")
    private final @Nullable Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName == null ? Input.empty() : this.connectionName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Name of the connection.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Peer ASN.
     * 
     */
    @InputImport(name="peerAsn")
    private final @Nullable Input<Double> peerAsn;

    public Input<Double> getPeerAsn() {
        return this.peerAsn == null ? Input.empty() : this.peerAsn;
    }

    /**
     * Peer IP.
     * 
     */
    @InputImport(name="peerIp")
    private final @Nullable Input<String> peerIp;

    public Input<String> getPeerIp() {
        return this.peerIp == null ? Input.empty() : this.peerIp;
    }

    /**
     * The resource group name of the VirtualHub.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @InputImport(name="virtualHubName", required=true)
    private final Input<String> virtualHubName;

    public Input<String> getVirtualHubName() {
        return this.virtualHubName;
    }

    public VirtualHubBgpConnectionArgs(
        @Nullable Input<String> connectionName,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<Double> peerAsn,
        @Nullable Input<String> peerIp,
        Input<String> resourceGroupName,
        Input<String> virtualHubName) {
        this.connectionName = connectionName;
        this.id = id;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIp = peerIp;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualHubName = Objects.requireNonNull(virtualHubName, "expected parameter 'virtualHubName' to be non-null");
    }

    private VirtualHubBgpConnectionArgs() {
        this.connectionName = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.peerAsn = Input.empty();
        this.peerIp = Input.empty();
        this.resourceGroupName = Input.empty();
        this.virtualHubName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubBgpConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectionName;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<Double> peerAsn;
        private @Nullable Input<String> peerIp;
        private Input<String> resourceGroupName;
        private Input<String> virtualHubName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubBgpConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIp = defaults.peerIp;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualHubName = defaults.virtualHubName;
        }

        public Builder setConnectionName(@Nullable Input<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder setConnectionName(@Nullable String connectionName) {
            this.connectionName = Input.ofNullable(connectionName);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder setPeerAsn(@Nullable Input<Double> peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }

        public Builder setPeerAsn(@Nullable Double peerAsn) {
            this.peerAsn = Input.ofNullable(peerAsn);
            return this;
        }

        public Builder setPeerIp(@Nullable Input<String> peerIp) {
            this.peerIp = peerIp;
            return this;
        }

        public Builder setPeerIp(@Nullable String peerIp) {
            this.peerIp = Input.ofNullable(peerIp);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setVirtualHubName(Input<String> virtualHubName) {
            this.virtualHubName = Objects.requireNonNull(virtualHubName);
            return this;
        }

        public Builder setVirtualHubName(String virtualHubName) {
            this.virtualHubName = Input.of(Objects.requireNonNull(virtualHubName));
            return this;
        }

        public VirtualHubBgpConnectionArgs build() {
            return new VirtualHubBgpConnectionArgs(connectionName, id, name, peerAsn, peerIp, resourceGroupName, virtualHubName);
        }
    }
}
