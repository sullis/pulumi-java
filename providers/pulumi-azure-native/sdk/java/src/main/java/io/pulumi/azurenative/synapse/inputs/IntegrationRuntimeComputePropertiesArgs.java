// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.IntegrationRuntimeDataFlowPropertiesArgs;
import io.pulumi.azurenative.synapse.inputs.IntegrationRuntimeVNetPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The compute resource properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeComputePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeComputePropertiesArgs Empty = new IntegrationRuntimeComputePropertiesArgs();

    /**
     * Data flow properties for managed integration runtime.
     * 
     */
    @InputImport(name="dataFlowProperties")
    private final @Nullable Input<IntegrationRuntimeDataFlowPropertiesArgs> dataFlowProperties;

    public Input<IntegrationRuntimeDataFlowPropertiesArgs> getDataFlowProperties() {
        return this.dataFlowProperties == null ? Input.empty() : this.dataFlowProperties;
    }

    /**
     * The location for managed integration runtime. The supported regions could be found on https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Maximum parallel executions count per node for managed integration runtime.
     * 
     */
    @InputImport(name="maxParallelExecutionsPerNode")
    private final @Nullable Input<Integer> maxParallelExecutionsPerNode;

    public Input<Integer> getMaxParallelExecutionsPerNode() {
        return this.maxParallelExecutionsPerNode == null ? Input.empty() : this.maxParallelExecutionsPerNode;
    }

    /**
     * The node size requirement to managed integration runtime.
     * 
     */
    @InputImport(name="nodeSize")
    private final @Nullable Input<String> nodeSize;

    public Input<String> getNodeSize() {
        return this.nodeSize == null ? Input.empty() : this.nodeSize;
    }

    /**
     * The required number of nodes for managed integration runtime.
     * 
     */
    @InputImport(name="numberOfNodes")
    private final @Nullable Input<Integer> numberOfNodes;

    public Input<Integer> getNumberOfNodes() {
        return this.numberOfNodes == null ? Input.empty() : this.numberOfNodes;
    }

    /**
     * VNet properties for managed integration runtime.
     * 
     */
    @InputImport(name="vNetProperties")
    private final @Nullable Input<IntegrationRuntimeVNetPropertiesArgs> vNetProperties;

    public Input<IntegrationRuntimeVNetPropertiesArgs> getVNetProperties() {
        return this.vNetProperties == null ? Input.empty() : this.vNetProperties;
    }

    public IntegrationRuntimeComputePropertiesArgs(
        @Nullable Input<IntegrationRuntimeDataFlowPropertiesArgs> dataFlowProperties,
        @Nullable Input<String> location,
        @Nullable Input<Integer> maxParallelExecutionsPerNode,
        @Nullable Input<String> nodeSize,
        @Nullable Input<Integer> numberOfNodes,
        @Nullable Input<IntegrationRuntimeVNetPropertiesArgs> vNetProperties) {
        this.dataFlowProperties = dataFlowProperties;
        this.location = location;
        this.maxParallelExecutionsPerNode = maxParallelExecutionsPerNode;
        this.nodeSize = nodeSize;
        this.numberOfNodes = numberOfNodes;
        this.vNetProperties = vNetProperties;
    }

    private IntegrationRuntimeComputePropertiesArgs() {
        this.dataFlowProperties = Input.empty();
        this.location = Input.empty();
        this.maxParallelExecutionsPerNode = Input.empty();
        this.nodeSize = Input.empty();
        this.numberOfNodes = Input.empty();
        this.vNetProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeComputePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IntegrationRuntimeDataFlowPropertiesArgs> dataFlowProperties;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> maxParallelExecutionsPerNode;
        private @Nullable Input<String> nodeSize;
        private @Nullable Input<Integer> numberOfNodes;
        private @Nullable Input<IntegrationRuntimeVNetPropertiesArgs> vNetProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeComputePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataFlowProperties = defaults.dataFlowProperties;
    	      this.location = defaults.location;
    	      this.maxParallelExecutionsPerNode = defaults.maxParallelExecutionsPerNode;
    	      this.nodeSize = defaults.nodeSize;
    	      this.numberOfNodes = defaults.numberOfNodes;
    	      this.vNetProperties = defaults.vNetProperties;
        }

        public Builder setDataFlowProperties(@Nullable Input<IntegrationRuntimeDataFlowPropertiesArgs> dataFlowProperties) {
            this.dataFlowProperties = dataFlowProperties;
            return this;
        }

        public Builder setDataFlowProperties(@Nullable IntegrationRuntimeDataFlowPropertiesArgs dataFlowProperties) {
            this.dataFlowProperties = Input.ofNullable(dataFlowProperties);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaxParallelExecutionsPerNode(@Nullable Input<Integer> maxParallelExecutionsPerNode) {
            this.maxParallelExecutionsPerNode = maxParallelExecutionsPerNode;
            return this;
        }

        public Builder setMaxParallelExecutionsPerNode(@Nullable Integer maxParallelExecutionsPerNode) {
            this.maxParallelExecutionsPerNode = Input.ofNullable(maxParallelExecutionsPerNode);
            return this;
        }

        public Builder setNodeSize(@Nullable Input<String> nodeSize) {
            this.nodeSize = nodeSize;
            return this;
        }

        public Builder setNodeSize(@Nullable String nodeSize) {
            this.nodeSize = Input.ofNullable(nodeSize);
            return this;
        }

        public Builder setNumberOfNodes(@Nullable Input<Integer> numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            return this;
        }

        public Builder setNumberOfNodes(@Nullable Integer numberOfNodes) {
            this.numberOfNodes = Input.ofNullable(numberOfNodes);
            return this;
        }

        public Builder setVNetProperties(@Nullable Input<IntegrationRuntimeVNetPropertiesArgs> vNetProperties) {
            this.vNetProperties = vNetProperties;
            return this;
        }

        public Builder setVNetProperties(@Nullable IntegrationRuntimeVNetPropertiesArgs vNetProperties) {
            this.vNetProperties = Input.ofNullable(vNetProperties);
            return this;
        }

        public IntegrationRuntimeComputePropertiesArgs build() {
            return new IntegrationRuntimeComputePropertiesArgs(dataFlowProperties, location, maxParallelExecutionsPerNode, nodeSize, numberOfNodes, vNetProperties);
        }
    }
}
