// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.EndpointRangeDescriptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a node type in the cluster, each node type represents sub set of nodes in the cluster.
 * 
 */
public final class NodeTypeDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeTypeDescriptionArgs Empty = new NodeTypeDescriptionArgs();

    /**
     * The range of ports from which cluster assigned port to Service Fabric applications.
     * 
     */
    @InputImport(name="applicationPorts")
    private final @Nullable Input<EndpointRangeDescriptionArgs> applicationPorts;

    public Input<EndpointRangeDescriptionArgs> getApplicationPorts() {
        return this.applicationPorts == null ? Input.empty() : this.applicationPorts;
    }

    /**
     * The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
     * 
     */
    @InputImport(name="capacities")
    private final @Nullable Input<Map<String,String>> capacities;

    public Input<Map<String,String>> getCapacities() {
        return this.capacities == null ? Input.empty() : this.capacities;
    }

    /**
     * The TCP cluster management endpoint port.
     * 
     */
    @InputImport(name="clientConnectionEndpointPort", required=true)
    private final Input<Integer> clientConnectionEndpointPort;

    public Input<Integer> getClientConnectionEndpointPort() {
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
    private final @Nullable Input<String> durabilityLevel;

    public Input<String> getDurabilityLevel() {
        return this.durabilityLevel == null ? Input.empty() : this.durabilityLevel;
    }

    /**
     * The range of ephemeral ports that nodes in this node type should be configured with.
     * 
     */
    @InputImport(name="ephemeralPorts")
    private final @Nullable Input<EndpointRangeDescriptionArgs> ephemeralPorts;

    public Input<EndpointRangeDescriptionArgs> getEphemeralPorts() {
        return this.ephemeralPorts == null ? Input.empty() : this.ephemeralPorts;
    }

    /**
     * The HTTP cluster management endpoint port.
     * 
     */
    @InputImport(name="httpGatewayEndpointPort", required=true)
    private final Input<Integer> httpGatewayEndpointPort;

    public Input<Integer> getHttpGatewayEndpointPort() {
        return this.httpGatewayEndpointPort;
    }

    /**
     * The node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
     * 
     */
    @InputImport(name="isPrimary", required=true)
    private final Input<Boolean> isPrimary;

    public Input<Boolean> getIsPrimary() {
        return this.isPrimary;
    }

    /**
     * The name of the node type.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
     * 
     */
    @InputImport(name="placementProperties")
    private final @Nullable Input<Map<String,String>> placementProperties;

    public Input<Map<String,String>> getPlacementProperties() {
        return this.placementProperties == null ? Input.empty() : this.placementProperties;
    }

    /**
     * The endpoint used by reverse proxy.
     * 
     */
    @InputImport(name="reverseProxyEndpointPort")
    private final @Nullable Input<Integer> reverseProxyEndpointPort;

    public Input<Integer> getReverseProxyEndpointPort() {
        return this.reverseProxyEndpointPort == null ? Input.empty() : this.reverseProxyEndpointPort;
    }

    /**
     * The number of nodes in the node type. This count should match the capacity property in the corresponding VirtualMachineScaleSet resource.
     * 
     */
    @InputImport(name="vmInstanceCount", required=true)
    private final Input<Integer> vmInstanceCount;

    public Input<Integer> getVmInstanceCount() {
        return this.vmInstanceCount;
    }

    public NodeTypeDescriptionArgs(
        @Nullable Input<EndpointRangeDescriptionArgs> applicationPorts,
        @Nullable Input<Map<String,String>> capacities,
        Input<Integer> clientConnectionEndpointPort,
        @Nullable Input<String> durabilityLevel,
        @Nullable Input<EndpointRangeDescriptionArgs> ephemeralPorts,
        Input<Integer> httpGatewayEndpointPort,
        Input<Boolean> isPrimary,
        Input<String> name,
        @Nullable Input<Map<String,String>> placementProperties,
        @Nullable Input<Integer> reverseProxyEndpointPort,
        Input<Integer> vmInstanceCount) {
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

    private NodeTypeDescriptionArgs() {
        this.applicationPorts = Input.empty();
        this.capacities = Input.empty();
        this.clientConnectionEndpointPort = Input.empty();
        this.durabilityLevel = Input.empty();
        this.ephemeralPorts = Input.empty();
        this.httpGatewayEndpointPort = Input.empty();
        this.isPrimary = Input.empty();
        this.name = Input.empty();
        this.placementProperties = Input.empty();
        this.reverseProxyEndpointPort = Input.empty();
        this.vmInstanceCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTypeDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EndpointRangeDescriptionArgs> applicationPorts;
        private @Nullable Input<Map<String,String>> capacities;
        private Input<Integer> clientConnectionEndpointPort;
        private @Nullable Input<String> durabilityLevel;
        private @Nullable Input<EndpointRangeDescriptionArgs> ephemeralPorts;
        private Input<Integer> httpGatewayEndpointPort;
        private Input<Boolean> isPrimary;
        private Input<String> name;
        private @Nullable Input<Map<String,String>> placementProperties;
        private @Nullable Input<Integer> reverseProxyEndpointPort;
        private Input<Integer> vmInstanceCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTypeDescriptionArgs defaults) {
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

        public Builder setApplicationPorts(@Nullable Input<EndpointRangeDescriptionArgs> applicationPorts) {
            this.applicationPorts = applicationPorts;
            return this;
        }

        public Builder setApplicationPorts(@Nullable EndpointRangeDescriptionArgs applicationPorts) {
            this.applicationPorts = Input.ofNullable(applicationPorts);
            return this;
        }

        public Builder setCapacities(@Nullable Input<Map<String,String>> capacities) {
            this.capacities = capacities;
            return this;
        }

        public Builder setCapacities(@Nullable Map<String,String> capacities) {
            this.capacities = Input.ofNullable(capacities);
            return this;
        }

        public Builder setClientConnectionEndpointPort(Input<Integer> clientConnectionEndpointPort) {
            this.clientConnectionEndpointPort = Objects.requireNonNull(clientConnectionEndpointPort);
            return this;
        }

        public Builder setClientConnectionEndpointPort(Integer clientConnectionEndpointPort) {
            this.clientConnectionEndpointPort = Input.of(Objects.requireNonNull(clientConnectionEndpointPort));
            return this;
        }

        public Builder setDurabilityLevel(@Nullable Input<String> durabilityLevel) {
            this.durabilityLevel = durabilityLevel;
            return this;
        }

        public Builder setDurabilityLevel(@Nullable String durabilityLevel) {
            this.durabilityLevel = Input.ofNullable(durabilityLevel);
            return this;
        }

        public Builder setEphemeralPorts(@Nullable Input<EndpointRangeDescriptionArgs> ephemeralPorts) {
            this.ephemeralPorts = ephemeralPorts;
            return this;
        }

        public Builder setEphemeralPorts(@Nullable EndpointRangeDescriptionArgs ephemeralPorts) {
            this.ephemeralPorts = Input.ofNullable(ephemeralPorts);
            return this;
        }

        public Builder setHttpGatewayEndpointPort(Input<Integer> httpGatewayEndpointPort) {
            this.httpGatewayEndpointPort = Objects.requireNonNull(httpGatewayEndpointPort);
            return this;
        }

        public Builder setHttpGatewayEndpointPort(Integer httpGatewayEndpointPort) {
            this.httpGatewayEndpointPort = Input.of(Objects.requireNonNull(httpGatewayEndpointPort));
            return this;
        }

        public Builder setIsPrimary(Input<Boolean> isPrimary) {
            this.isPrimary = Objects.requireNonNull(isPrimary);
            return this;
        }

        public Builder setIsPrimary(Boolean isPrimary) {
            this.isPrimary = Input.of(Objects.requireNonNull(isPrimary));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPlacementProperties(@Nullable Input<Map<String,String>> placementProperties) {
            this.placementProperties = placementProperties;
            return this;
        }

        public Builder setPlacementProperties(@Nullable Map<String,String> placementProperties) {
            this.placementProperties = Input.ofNullable(placementProperties);
            return this;
        }

        public Builder setReverseProxyEndpointPort(@Nullable Input<Integer> reverseProxyEndpointPort) {
            this.reverseProxyEndpointPort = reverseProxyEndpointPort;
            return this;
        }

        public Builder setReverseProxyEndpointPort(@Nullable Integer reverseProxyEndpointPort) {
            this.reverseProxyEndpointPort = Input.ofNullable(reverseProxyEndpointPort);
            return this;
        }

        public Builder setVmInstanceCount(Input<Integer> vmInstanceCount) {
            this.vmInstanceCount = Objects.requireNonNull(vmInstanceCount);
            return this;
        }

        public Builder setVmInstanceCount(Integer vmInstanceCount) {
            this.vmInstanceCount = Input.of(Objects.requireNonNull(vmInstanceCount));
            return this;
        }

        public NodeTypeDescriptionArgs build() {
            return new NodeTypeDescriptionArgs(applicationPorts, capacities, clientConnectionEndpointPort, durabilityLevel, ephemeralPorts, httpGatewayEndpointPort, isPrimary, name, placementProperties, reverseProxyEndpointPort, vmInstanceCount);
        }
    }
}
