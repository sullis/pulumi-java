// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.azure.batch.outputs.GetPoolAutoScale;
import com.pulumi.azure.batch.outputs.GetPoolCertificate;
import com.pulumi.azure.batch.outputs.GetPoolContainerConfiguration;
import com.pulumi.azure.batch.outputs.GetPoolFixedScale;
import com.pulumi.azure.batch.outputs.GetPoolNetworkConfiguration;
import com.pulumi.azure.batch.outputs.GetPoolStartTask;
import com.pulumi.azure.batch.outputs.GetPoolStorageImageReference;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPoolResult {
    /**
     * @return The name of the Batch account.
     * 
     */
    private final String accountName;
    /**
     * @return A `auto_scale` block that describes the scale settings when using auto scale.
     * 
     */
    private final List<GetPoolAutoScale> autoScales;
    /**
     * @return One or more `certificate` blocks that describe the certificates installed on each compute node in the pool.
     * 
     */
    private final List<GetPoolCertificate> certificates;
    /**
     * @return The container configuration used in the pool&#39;s VMs.
     * 
     */
    private final List<GetPoolContainerConfiguration> containerConfigurations;
    private final String displayName;
    /**
     * @return A `fixed_scale` block that describes the scale settings when using fixed scale.
     * 
     */
    private final List<GetPoolFixedScale> fixedScales;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The maximum number of tasks that can run concurrently on a single compute node in the pool.
     * 
     */
    private final Integer maxTasksPerNode;
    private final Map<String,String> metadata;
    /**
     * @return The name of the endpoint.
     * 
     */
    private final String name;
    private final List<GetPoolNetworkConfiguration> networkConfigurations;
    /**
     * @return The SKU of the node agents in the Batch pool.
     * 
     */
    private final String nodeAgentSkuId;
    private final String resourceGroupName;
    /**
     * @return A `start_task` block that describes the start task settings for the Batch pool.
     * 
     */
    private final List<GetPoolStartTask> startTasks;
    /**
     * @return The reference of the storage image used by the nodes in the Batch pool.
     * 
     */
    private final List<GetPoolStorageImageReference> storageImageReferences;
    /**
     * @return The size of the VM created in the Batch pool.
     * 
     */
    private final String vmSize;

    @CustomType.Constructor
    private GetPoolResult(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("autoScales") List<GetPoolAutoScale> autoScales,
        @CustomType.Parameter("certificates") List<GetPoolCertificate> certificates,
        @CustomType.Parameter("containerConfigurations") List<GetPoolContainerConfiguration> containerConfigurations,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("fixedScales") List<GetPoolFixedScale> fixedScales,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("maxTasksPerNode") Integer maxTasksPerNode,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkConfigurations") List<GetPoolNetworkConfiguration> networkConfigurations,
        @CustomType.Parameter("nodeAgentSkuId") String nodeAgentSkuId,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("startTasks") List<GetPoolStartTask> startTasks,
        @CustomType.Parameter("storageImageReferences") List<GetPoolStorageImageReference> storageImageReferences,
        @CustomType.Parameter("vmSize") String vmSize) {
        this.accountName = accountName;
        this.autoScales = autoScales;
        this.certificates = certificates;
        this.containerConfigurations = containerConfigurations;
        this.displayName = displayName;
        this.fixedScales = fixedScales;
        this.id = id;
        this.maxTasksPerNode = maxTasksPerNode;
        this.metadata = metadata;
        this.name = name;
        this.networkConfigurations = networkConfigurations;
        this.nodeAgentSkuId = nodeAgentSkuId;
        this.resourceGroupName = resourceGroupName;
        this.startTasks = startTasks;
        this.storageImageReferences = storageImageReferences;
        this.vmSize = vmSize;
    }

    /**
     * @return The name of the Batch account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return A `auto_scale` block that describes the scale settings when using auto scale.
     * 
     */
    public List<GetPoolAutoScale> autoScales() {
        return this.autoScales;
    }
    /**
     * @return One or more `certificate` blocks that describe the certificates installed on each compute node in the pool.
     * 
     */
    public List<GetPoolCertificate> certificates() {
        return this.certificates;
    }
    /**
     * @return The container configuration used in the pool&#39;s VMs.
     * 
     */
    public List<GetPoolContainerConfiguration> containerConfigurations() {
        return this.containerConfigurations;
    }
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return A `fixed_scale` block that describes the scale settings when using fixed scale.
     * 
     */
    public List<GetPoolFixedScale> fixedScales() {
        return this.fixedScales;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The maximum number of tasks that can run concurrently on a single compute node in the pool.
     * 
     */
    public Integer maxTasksPerNode() {
        return this.maxTasksPerNode;
    }
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return The name of the endpoint.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<GetPoolNetworkConfiguration> networkConfigurations() {
        return this.networkConfigurations;
    }
    /**
     * @return The SKU of the node agents in the Batch pool.
     * 
     */
    public String nodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A `start_task` block that describes the start task settings for the Batch pool.
     * 
     */
    public List<GetPoolStartTask> startTasks() {
        return this.startTasks;
    }
    /**
     * @return The reference of the storage image used by the nodes in the Batch pool.
     * 
     */
    public List<GetPoolStorageImageReference> storageImageReferences() {
        return this.storageImageReferences;
    }
    /**
     * @return The size of the VM created in the Batch pool.
     * 
     */
    public String vmSize() {
        return this.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private List<GetPoolAutoScale> autoScales;
        private List<GetPoolCertificate> certificates;
        private List<GetPoolContainerConfiguration> containerConfigurations;
        private String displayName;
        private List<GetPoolFixedScale> fixedScales;
        private String id;
        private Integer maxTasksPerNode;
        private Map<String,String> metadata;
        private String name;
        private List<GetPoolNetworkConfiguration> networkConfigurations;
        private String nodeAgentSkuId;
        private String resourceGroupName;
        private List<GetPoolStartTask> startTasks;
        private List<GetPoolStorageImageReference> storageImageReferences;
        private String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.autoScales = defaults.autoScales;
    	      this.certificates = defaults.certificates;
    	      this.containerConfigurations = defaults.containerConfigurations;
    	      this.displayName = defaults.displayName;
    	      this.fixedScales = defaults.fixedScales;
    	      this.id = defaults.id;
    	      this.maxTasksPerNode = defaults.maxTasksPerNode;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.networkConfigurations = defaults.networkConfigurations;
    	      this.nodeAgentSkuId = defaults.nodeAgentSkuId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.startTasks = defaults.startTasks;
    	      this.storageImageReferences = defaults.storageImageReferences;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder autoScales(List<GetPoolAutoScale> autoScales) {
            this.autoScales = Objects.requireNonNull(autoScales);
            return this;
        }
        public Builder autoScales(GetPoolAutoScale... autoScales) {
            return autoScales(List.of(autoScales));
        }
        public Builder certificates(List<GetPoolCertificate> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }
        public Builder certificates(GetPoolCertificate... certificates) {
            return certificates(List.of(certificates));
        }
        public Builder containerConfigurations(List<GetPoolContainerConfiguration> containerConfigurations) {
            this.containerConfigurations = Objects.requireNonNull(containerConfigurations);
            return this;
        }
        public Builder containerConfigurations(GetPoolContainerConfiguration... containerConfigurations) {
            return containerConfigurations(List.of(containerConfigurations));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder fixedScales(List<GetPoolFixedScale> fixedScales) {
            this.fixedScales = Objects.requireNonNull(fixedScales);
            return this;
        }
        public Builder fixedScales(GetPoolFixedScale... fixedScales) {
            return fixedScales(List.of(fixedScales));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder maxTasksPerNode(Integer maxTasksPerNode) {
            this.maxTasksPerNode = Objects.requireNonNull(maxTasksPerNode);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkConfigurations(List<GetPoolNetworkConfiguration> networkConfigurations) {
            this.networkConfigurations = Objects.requireNonNull(networkConfigurations);
            return this;
        }
        public Builder networkConfigurations(GetPoolNetworkConfiguration... networkConfigurations) {
            return networkConfigurations(List.of(networkConfigurations));
        }
        public Builder nodeAgentSkuId(String nodeAgentSkuId) {
            this.nodeAgentSkuId = Objects.requireNonNull(nodeAgentSkuId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder startTasks(List<GetPoolStartTask> startTasks) {
            this.startTasks = Objects.requireNonNull(startTasks);
            return this;
        }
        public Builder startTasks(GetPoolStartTask... startTasks) {
            return startTasks(List.of(startTasks));
        }
        public Builder storageImageReferences(List<GetPoolStorageImageReference> storageImageReferences) {
            this.storageImageReferences = Objects.requireNonNull(storageImageReferences);
            return this;
        }
        public Builder storageImageReferences(GetPoolStorageImageReference... storageImageReferences) {
            return storageImageReferences(List.of(storageImageReferences));
        }
        public Builder vmSize(String vmSize) {
            this.vmSize = Objects.requireNonNull(vmSize);
            return this;
        }        public GetPoolResult build() {
            return new GetPoolResult(accountName, autoScales, certificates, containerConfigurations, displayName, fixedScales, id, maxTasksPerNode, metadata, name, networkConfigurations, nodeAgentSkuId, resourceGroupName, startTasks, storageImageReferences, vmSize);
        }
    }
}
