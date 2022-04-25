// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualHubBgpConnectionResult {
    /**
     * @return The current state of the VirtualHub to Peer.
     * 
     */
    private final String connectionState;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Name of the connection.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Peer ASN.
     * 
     */
    private final @Nullable Double peerAsn;
    /**
     * @return Peer IP.
     * 
     */
    private final @Nullable String peerIp;
    /**
     * @return The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Connection type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetVirtualHubBgpConnectionResult(
        @CustomType.Parameter("connectionState") String connectionState,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("peerAsn") @Nullable Double peerAsn,
        @CustomType.Parameter("peerIp") @Nullable String peerIp,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.connectionState = connectionState;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIp = peerIp;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return The current state of the VirtualHub to Peer.
     * 
     */
    public String connectionState() {
        return this.connectionState;
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Name of the connection.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Peer ASN.
     * 
     */
    public Optional<Double> peerAsn() {
        return Optional.ofNullable(this.peerAsn);
    }
    /**
     * @return Peer IP.
     * 
     */
    public Optional<String> peerIp() {
        return Optional.ofNullable(this.peerIp);
    }
    /**
     * @return The provisioning state of the resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Connection type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualHubBgpConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionState;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Double peerAsn;
        private @Nullable String peerIp;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualHubBgpConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionState = defaults.connectionState;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIp = defaults.peerIp;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder connectionState(String connectionState) {
            this.connectionState = Objects.requireNonNull(connectionState);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder peerAsn(@Nullable Double peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Builder peerIp(@Nullable String peerIp) {
            this.peerIp = peerIp;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetVirtualHubBgpConnectionResult build() {
            return new GetVirtualHubBgpConnectionResult(connectionState, etag, id, name, peerAsn, peerIp, provisioningState, type);
        }
    }
}
