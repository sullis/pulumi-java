// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Outbound rule of the load balancer.
 * 
 */
public final class OutboundRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final OutboundRuleResponse Empty = new OutboundRuleResponse();

    /**
     * The number of outbound ports to be used for NAT.
     * 
     */
    @InputImport(name="allocatedOutboundPorts")
    private final @Nullable Integer allocatedOutboundPorts;

    public Optional<Integer> getAllocatedOutboundPorts() {
        return this.allocatedOutboundPorts == null ? Optional.empty() : Optional.ofNullable(this.allocatedOutboundPorts);
    }

    /**
     * A reference to a pool of DIPs. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    @InputImport(name="backendAddressPool", required=true)
    private final SubResourceResponse backendAddressPool;

    public SubResourceResponse getBackendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @InputImport(name="enableTcpReset")
    private final @Nullable Boolean enableTcpReset;

    public Optional<Boolean> getEnableTcpReset() {
        return this.enableTcpReset == null ? Optional.empty() : Optional.ofNullable(this.enableTcpReset);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * The Frontend IP addresses of the load balancer.
     * 
     */
    @InputImport(name="frontendIPConfigurations", required=true)
    private final List<SubResourceResponse> frontendIPConfigurations;

    public List<SubResourceResponse> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The timeout for the TCP idle connection.
     * 
     */
    @InputImport(name="idleTimeoutInMinutes")
    private final @Nullable Integer idleTimeoutInMinutes;

    public Optional<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Optional.empty() : Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The protocol for the outbound rule in load balancer.
     * 
     */
    @InputImport(name="protocol", required=true)
    private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The provisioning state of the outbound rule resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public OutboundRuleResponse(
        @Nullable Integer allocatedOutboundPorts,
        SubResourceResponse backendAddressPool,
        @Nullable Boolean enableTcpReset,
        String etag,
        List<SubResourceResponse> frontendIPConfigurations,
        @Nullable String id,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable String name,
        String protocol,
        String provisioningState,
        String type) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        this.backendAddressPool = Objects.requireNonNull(backendAddressPool, "expected parameter 'backendAddressPool' to be non-null");
        this.enableTcpReset = enableTcpReset;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations, "expected parameter 'frontendIPConfigurations' to be non-null");
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.name = name;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OutboundRuleResponse() {
        this.allocatedOutboundPorts = null;
        this.backendAddressPool = null;
        this.enableTcpReset = null;
        this.etag = null;
        this.frontendIPConfigurations = List.of();
        this.id = null;
        this.idleTimeoutInMinutes = null;
        this.name = null;
        this.protocol = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutboundRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allocatedOutboundPorts;
        private SubResourceResponse backendAddressPool;
        private @Nullable Boolean enableTcpReset;
        private String etag;
        private List<SubResourceResponse> frontendIPConfigurations;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String name;
        private String protocol;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OutboundRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedOutboundPorts = defaults.allocatedOutboundPorts;
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.etag = defaults.etag;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAllocatedOutboundPorts(@Nullable Integer allocatedOutboundPorts) {
            this.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        public Builder setBackendAddressPool(SubResourceResponse backendAddressPool) {
            this.backendAddressPool = Objects.requireNonNull(backendAddressPool);
            return this;
        }

        public Builder setEnableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFrontendIPConfigurations(List<SubResourceResponse> frontendIPConfigurations) {
            this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public OutboundRuleResponse build() {
            return new OutboundRuleResponse(allocatedOutboundPorts, backendAddressPool, enableTcpReset, etag, frontendIPConfigurations, id, idleTimeoutInMinutes, name, protocol, provisioningState, type);
        }
    }
}
