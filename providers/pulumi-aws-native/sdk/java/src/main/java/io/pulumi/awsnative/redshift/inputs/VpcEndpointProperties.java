// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.awsnative.redshift.inputs.EndpointAccessNetworkInterface;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The connection endpoint for connecting to an Amazon Redshift cluster through the proxy.
 * 
 */
public final class VpcEndpointProperties extends io.pulumi.resources.InvokeArgs {

    public static final VpcEndpointProperties Empty = new VpcEndpointProperties();

    /**
     * One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * 
     */
    @Import(name="networkInterfaces")
      private final @Nullable List<EndpointAccessNetworkInterface> networkInterfaces;

    public List<EndpointAccessNetworkInterface> networkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }

    /**
     * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     * 
     */
    @Import(name="vpcEndpointId")
      private final @Nullable String vpcEndpointId;

    public Optional<String> vpcEndpointId() {
        return this.vpcEndpointId == null ? Optional.empty() : Optional.ofNullable(this.vpcEndpointId);
    }

    /**
     * The VPC identifier that the endpoint is associated.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable String vpcId;

    public Optional<String> vpcId() {
        return this.vpcId == null ? Optional.empty() : Optional.ofNullable(this.vpcId);
    }

    public VpcEndpointProperties(
        @Nullable List<EndpointAccessNetworkInterface> networkInterfaces,
        @Nullable String vpcEndpointId,
        @Nullable String vpcId) {
        this.networkInterfaces = networkInterfaces;
        this.vpcEndpointId = vpcEndpointId;
        this.vpcId = vpcId;
    }

    private VpcEndpointProperties() {
        this.networkInterfaces = List.of();
        this.vpcEndpointId = null;
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EndpointAccessNetworkInterface> networkInterfaces;
        private @Nullable String vpcEndpointId;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder networkInterfaces(@Nullable List<EndpointAccessNetworkInterface> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(EndpointAccessNetworkInterface... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public VpcEndpointProperties build() {
            return new VpcEndpointProperties(networkInterfaces, vpcEndpointId, vpcId);
        }
    }
}
