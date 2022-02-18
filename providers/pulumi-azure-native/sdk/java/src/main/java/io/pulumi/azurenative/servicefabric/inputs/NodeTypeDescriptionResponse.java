// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.EndpointRangeDescriptionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a node type in the cluster, each node type represents sub set of nodes in the cluster.
 * 
 */
public final class NodeTypeDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeTypeDescriptionResponse Empty = new NodeTypeDescriptionResponse();

    /**
     * The range of ports from which cluster assigned port to Service Fabric applications.
     * 
     */
    @InputImport(name="applicationPorts")
    private final @Nullable EndpointRangeDescriptionResponse applicationPorts;

    public Optional<EndpointRangeDescriptionResponse> getApplicationPorts() {
        return this.applicationPorts == null ? Optional.empty() : Optional.ofNullable(this.applicationPorts);
    }

    /**
     * The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
     * 
     */
    @InputImport(name="capacities")
    private final @Nullable Map<String,String> capacities;

    public Map<String,String> getCapacities() {
        return this.capacities == null ? Map.of() : this.capacities;
    }

    /**
     * The TCP cluster management endpoint port.
     * 
     */
    @InputImport(name="clientConnectionEndpointPort", required=true)
    private final Integer clientConnectionEndpointPort;

    public Integer getClientConnectionEndpointPort() {
        return this.clientConnectionEndpointPort;
    }

    /**
     * The durability level of the node type. Learn about [DurabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     * 
     *   - Bronze - No privileges. This is the default.
     *   - Silver - The infrastructure jobs can be paused for a duration of 10 minutes per UD.
     *   - Gold - The infrastructure jobs can be paused for a duration of 2 hours per UD. Gold durability can be enabled only on full node VM skus like D15_V2, G5 etc.
     * 
     */
    @InputImport(name="durabilityLevel")
    private final @Nullable String durabilityLevel;

    public Optional<String> getDurabilityLevel() {
        return this.durabilityLevel == null ? Optional.empty() : Optional.ofNullable(this.durabilityLevel);
    }

    /**
     * The range of ephemeral ports that nodes in this node type should be configured with.
     * 
     */
    @InputImport(name="ephemeralPorts")
    private final @Nullable EndpointRangeDescriptionResponse ephemeralPorts;

    public Optional<EndpointRangeDescriptionResponse> getEphemeralPorts() {
        return this.ephemeralPorts == null ? Optional.empty() : Optional.ofNullable(this.ephemeralPorts);
    }

    /**
     * The HTTP cluster management endpoint port.
     * 
     */
    @InputImport(name="httpGatewayEndpointPort", required=true)
    private final Integer httpGatewayEndpointPort;

    public Integer getHttpGatewayEndpointPort() {
        return this.httpGatewayEndpointPort;
    }

    /**
     * The node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
     * 
     */
    @InputImport(name="isPrimary", required=true)
    private final Boolean isPrimary;

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    /**
     * The name of the node type.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
     * 
     */
    @InputImport(name="placementProperties")
    private final @Nullable Map<String,String> placementProperties;

    public Map<String,String> getPlacementProperties() {
        return this.placementProperties == null ? Map.of() : this.placementProperties;
    }

    /**
     * The endpoint used by reverse proxy.
     * 
     */
    @InputImport(name="reverseProxyEndpointPort")
    private final @Nullable Integer reverseProxyEndpointPort;

    public Optional<Integer> getReverseProxyEndpointPort() {
        return this.reverseProxyEndpointPort == null ? Optional.empty() : Optional.ofNullable(this.reverseProxyEndpointPort);
    }

    /**
     * The number of nodes in the node type. This count should match the capacity property in the corresponding VirtualMachineScaleSet resource.
     * 
     */
    @InputImport(name="vmInstanceCount", required=true)
    private final Integer vmInstanceCount;

    public Integer getVmInstanceCount() {
        return this.vmInstanceCount;
    }

    public NodeTypeDescriptionResponse(
        @Nullable EndpointRangeDescriptionResponse applicationPorts,
        @Nullable Map<String,String> capacities,
        Integer clientConnectionEndpointPort,
        @Nullable String durabilityLevel,
        @Nullable EndpointRangeDescriptionResponse ephemeralPorts,
        Integer httpGatewayEndpointPort,
        Boolean isPrimary,
        String name,
        @Nullable Map<String,String> placementProperties,
        @Nullable Integer reverseProxyEndpointPort,
        Integer vmInstanceCount) {
        this.applicationPorts = applicationPorts;
        this.capacities = capacities;
        this.clientConnectionEndpointPort = Objects.requireNonNull(clientConnectionEndpointPort, "expected parameter 'clientConnectionEndpointPort' to be non-null");
        this.durabilityLevel = durabilityLevel;
        this.ephemeralPorts = ephemeralPorts;
        this.httpGatewayEndpointPort = Objects.requireNonNull(httpGatewayEndpointPort, "expected parameter 'httpGatewayEndpointPort' to be non-null");
        this.isPrimary = Objects.requireNonNull(isPrimary, "expected parameter 'isPrimary' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.placementProperties = placementProperties;
        this.reverseProxyEndpointPort = reverseProxyEndpointPort;
        this.vmInstanceCount = Objects.requireNonNull(vmInstanceCount, "expected parameter 'vmInstanceCount' to be non-null");
    }

    private NodeTypeDescriptionResponse() {
        this.applicationPorts = null;
        this.capacities = Map.of();
        this.clientConnectionEndpointPort = null;
        this.durabilityLevel = null;
        this.ephemeralPorts = null;
        this.httpGatewayEndpointPort = null;
        this.isPrimary = null;
        this.name = null;
        this.placementProperties = Map.of();
        this.reverseProxyEndpointPort = null;
        this.vmInstanceCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTypeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EndpointRangeDescriptionResponse applicationPorts;
        private @Nullable Map<String,String> capacities;
        private Integer clientConnectionEndpointPort;
        private @Nullable String durabilityLevel;
        private @Nullable EndpointRangeDescriptionResponse ephemeralPorts;
        private Integer httpGatewayEndpointPort;
        private Boolean isPrimary;
        private String name;
        private @Nullable Map<String,String> placementProperties;
        private @Nullable Integer reverseProxyEndpointPort;
        private Integer vmInstanceCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTypeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationPorts = defaults.applicationPorts;
    	      this.capacities = defaults.capacities;
    	      this.clientConnectionEndpointPort = defaults.clientConnectionEndpointPort;
    	      this.durabilityLevel = defaults.durabilityLevel;
    	      this.ephemeralPorts = defaults.ephemeralPorts;
    	      this.httpGatewayEndpointPort = defaults.httpGatewayEndpointPort;
    	      this.isPrimary = defaults.isPrimary;
    	      this.name = defaults.name;
    	      this.placementProperties = defaults.placementProperties;
    	      this.reverseProxyEndpointPort = defaults.reverseProxyEndpointPort;
    	      this.vmInstanceCount = defaults.vmInstanceCount;
        }

        public Builder setApplicationPorts(@Nullable EndpointRangeDescriptionResponse applicationPorts) {
            this.applicationPorts = applicationPorts;
            return this;
        }

        public Builder setCapacities(@Nullable Map<String,String> capacities) {
            this.capacities = capacities;
            return this;
        }

        public Builder setClientConnectionEndpointPort(Integer clientConnectionEndpointPort) {
            this.clientConnectionEndpointPort = Objects.requireNonNull(clientConnectionEndpointPort);
            return this;
        }

        public Builder setDurabilityLevel(@Nullable String durabilityLevel) {
            this.durabilityLevel = durabilityLevel;
            return this;
        }

        public Builder setEphemeralPorts(@Nullable EndpointRangeDescriptionResponse ephemeralPorts) {
            this.ephemeralPorts = ephemeralPorts;
            return this;
        }

        public Builder setHttpGatewayEndpointPort(Integer httpGatewayEndpointPort) {
            this.httpGatewayEndpointPort = Objects.requireNonNull(httpGatewayEndpointPort);
            return this;
        }

        public Builder setIsPrimary(Boolean isPrimary) {
            this.isPrimary = Objects.requireNonNull(isPrimary);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlacementProperties(@Nullable Map<String,String> placementProperties) {
            this.placementProperties = placementProperties;
            return this;
        }

        public Builder setReverseProxyEndpointPort(@Nullable Integer reverseProxyEndpointPort) {
            this.reverseProxyEndpointPort = reverseProxyEndpointPort;
            return this;
        }

        public Builder setVmInstanceCount(Integer vmInstanceCount) {
            this.vmInstanceCount = Objects.requireNonNull(vmInstanceCount);
            return this;
        }

        public NodeTypeDescriptionResponse build() {
            return new NodeTypeDescriptionResponse(applicationPorts, capacities, clientConnectionEndpointPort, durabilityLevel, ephemeralPorts, httpGatewayEndpointPort, isPrimary, name, placementProperties, reverseProxyEndpointPort, vmInstanceCount);
        }
    }
}
