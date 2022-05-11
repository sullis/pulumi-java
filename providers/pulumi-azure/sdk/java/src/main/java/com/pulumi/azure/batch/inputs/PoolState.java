// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.azure.batch.inputs.PoolAutoScaleArgs;
import com.pulumi.azure.batch.inputs.PoolCertificateArgs;
import com.pulumi.azure.batch.inputs.PoolContainerConfigurationArgs;
import com.pulumi.azure.batch.inputs.PoolFixedScaleArgs;
import com.pulumi.azure.batch.inputs.PoolIdentityArgs;
import com.pulumi.azure.batch.inputs.PoolNetworkConfigurationArgs;
import com.pulumi.azure.batch.inputs.PoolStartTaskArgs;
import com.pulumi.azure.batch.inputs.PoolStorageImageReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolState extends com.pulumi.resources.ResourceArgs {

    public static final PoolState Empty = new PoolState();

    /**
     * Specifies the name of the Batch account in which the pool will be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return Specifies the name of the Batch account in which the pool will be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * A `auto_scale` block that describes the scale settings when using auto scale.
     * 
     */
    @Import(name="autoScale")
    private @Nullable Output<PoolAutoScaleArgs> autoScale;

    /**
     * @return A `auto_scale` block that describes the scale settings when using auto scale.
     * 
     */
    public Optional<Output<PoolAutoScaleArgs>> autoScale() {
        return Optional.ofNullable(this.autoScale);
    }

    /**
     * One or more `certificate` blocks that describe the certificates to be installed on each compute node in the pool.
     * 
     */
    @Import(name="certificates")
    private @Nullable Output<List<PoolCertificateArgs>> certificates;

    /**
     * @return One or more `certificate` blocks that describe the certificates to be installed on each compute node in the pool.
     * 
     */
    public Optional<Output<List<PoolCertificateArgs>>> certificates() {
        return Optional.ofNullable(this.certificates);
    }

    /**
     * The container configuration used in the pool&#39;s VMs.
     * 
     */
    @Import(name="containerConfiguration")
    private @Nullable Output<PoolContainerConfigurationArgs> containerConfiguration;

    /**
     * @return The container configuration used in the pool&#39;s VMs.
     * 
     */
    public Optional<Output<PoolContainerConfigurationArgs>> containerConfiguration() {
        return Optional.ofNullable(this.containerConfiguration);
    }

    /**
     * Specifies the display name of the Batch pool.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Specifies the display name of the Batch pool.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * A `fixed_scale` block that describes the scale settings when using fixed scale.
     * 
     */
    @Import(name="fixedScale")
    private @Nullable Output<PoolFixedScaleArgs> fixedScale;

    /**
     * @return A `fixed_scale` block that describes the scale settings when using fixed scale.
     * 
     */
    public Optional<Output<PoolFixedScaleArgs>> fixedScale() {
        return Optional.ofNullable(this.fixedScale);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<PoolIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<PoolIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Specifies the maximum number of tasks that can run concurrently on a single compute node in the pool. Defaults to `1`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="maxTasksPerNode")
    private @Nullable Output<Integer> maxTasksPerNode;

    /**
     * @return Specifies the maximum number of tasks that can run concurrently on a single compute node in the pool. Defaults to `1`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> maxTasksPerNode() {
        return Optional.ofNullable(this.maxTasksPerNode);
    }

    /**
     * A map of custom batch pool metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return A map of custom batch pool metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Specifies the name of the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `network_configuration` block that describes the network configurations for the Batch pool.
     * 
     */
    @Import(name="networkConfiguration")
    private @Nullable Output<PoolNetworkConfigurationArgs> networkConfiguration;

    /**
     * @return A `network_configuration` block that describes the network configurations for the Batch pool.
     * 
     */
    public Optional<Output<PoolNetworkConfigurationArgs>> networkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }

    /**
     * Specifies the SKU of the node agents that will be created in the Batch pool.
     * 
     */
    @Import(name="nodeAgentSkuId")
    private @Nullable Output<String> nodeAgentSkuId;

    /**
     * @return Specifies the SKU of the node agents that will be created in the Batch pool.
     * 
     */
    public Optional<Output<String>> nodeAgentSkuId() {
        return Optional.ofNullable(this.nodeAgentSkuId);
    }

    /**
     * The name of the resource group in which to create the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `start_task` block that describes the start task settings for the Batch pool.
     * 
     */
    @Import(name="startTask")
    private @Nullable Output<PoolStartTaskArgs> startTask;

    /**
     * @return A `start_task` block that describes the start task settings for the Batch pool.
     * 
     */
    public Optional<Output<PoolStartTaskArgs>> startTask() {
        return Optional.ofNullable(this.startTask);
    }

    @Import(name="stopPendingResizeOperation")
    private @Nullable Output<Boolean> stopPendingResizeOperation;

    public Optional<Output<Boolean>> stopPendingResizeOperation() {
        return Optional.ofNullable(this.stopPendingResizeOperation);
    }

    /**
     * A `storage_image_reference` for the virtual machines that will compose the Batch pool.
     * 
     */
    @Import(name="storageImageReference")
    private @Nullable Output<PoolStorageImageReferenceArgs> storageImageReference;

    /**
     * @return A `storage_image_reference` for the virtual machines that will compose the Batch pool.
     * 
     */
    public Optional<Output<PoolStorageImageReferenceArgs>> storageImageReference() {
        return Optional.ofNullable(this.storageImageReference);
    }

    /**
     * Specifies the size of the VM created in the Batch pool.
     * 
     */
    @Import(name="vmSize")
    private @Nullable Output<String> vmSize;

    /**
     * @return Specifies the size of the VM created in the Batch pool.
     * 
     */
    public Optional<Output<String>> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    private PoolState() {}

    private PoolState(PoolState $) {
        this.accountName = $.accountName;
        this.autoScale = $.autoScale;
        this.certificates = $.certificates;
        this.containerConfiguration = $.containerConfiguration;
        this.displayName = $.displayName;
        this.fixedScale = $.fixedScale;
        this.identity = $.identity;
        this.maxTasksPerNode = $.maxTasksPerNode;
        this.metadata = $.metadata;
        this.name = $.name;
        this.networkConfiguration = $.networkConfiguration;
        this.nodeAgentSkuId = $.nodeAgentSkuId;
        this.resourceGroupName = $.resourceGroupName;
        this.startTask = $.startTask;
        this.stopPendingResizeOperation = $.stopPendingResizeOperation;
        this.storageImageReference = $.storageImageReference;
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolState $;

        public Builder() {
            $ = new PoolState();
        }

        public Builder(PoolState defaults) {
            $ = new PoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Specifies the name of the Batch account in which the pool will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Specifies the name of the Batch account in which the pool will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param autoScale A `auto_scale` block that describes the scale settings when using auto scale.
         * 
         * @return builder
         * 
         */
        public Builder autoScale(@Nullable Output<PoolAutoScaleArgs> autoScale) {
            $.autoScale = autoScale;
            return this;
        }

        /**
         * @param autoScale A `auto_scale` block that describes the scale settings when using auto scale.
         * 
         * @return builder
         * 
         */
        public Builder autoScale(PoolAutoScaleArgs autoScale) {
            return autoScale(Output.of(autoScale));
        }

        /**
         * @param certificates One or more `certificate` blocks that describe the certificates to be installed on each compute node in the pool.
         * 
         * @return builder
         * 
         */
        public Builder certificates(@Nullable Output<List<PoolCertificateArgs>> certificates) {
            $.certificates = certificates;
            return this;
        }

        /**
         * @param certificates One or more `certificate` blocks that describe the certificates to be installed on each compute node in the pool.
         * 
         * @return builder
         * 
         */
        public Builder certificates(List<PoolCertificateArgs> certificates) {
            return certificates(Output.of(certificates));
        }

        /**
         * @param certificates One or more `certificate` blocks that describe the certificates to be installed on each compute node in the pool.
         * 
         * @return builder
         * 
         */
        public Builder certificates(PoolCertificateArgs... certificates) {
            return certificates(List.of(certificates));
        }

        /**
         * @param containerConfiguration The container configuration used in the pool&#39;s VMs.
         * 
         * @return builder
         * 
         */
        public Builder containerConfiguration(@Nullable Output<PoolContainerConfigurationArgs> containerConfiguration) {
            $.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * @param containerConfiguration The container configuration used in the pool&#39;s VMs.
         * 
         * @return builder
         * 
         */
        public Builder containerConfiguration(PoolContainerConfigurationArgs containerConfiguration) {
            return containerConfiguration(Output.of(containerConfiguration));
        }

        /**
         * @param displayName Specifies the display name of the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Specifies the display name of the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param fixedScale A `fixed_scale` block that describes the scale settings when using fixed scale.
         * 
         * @return builder
         * 
         */
        public Builder fixedScale(@Nullable Output<PoolFixedScaleArgs> fixedScale) {
            $.fixedScale = fixedScale;
            return this;
        }

        /**
         * @param fixedScale A `fixed_scale` block that describes the scale settings when using fixed scale.
         * 
         * @return builder
         * 
         */
        public Builder fixedScale(PoolFixedScaleArgs fixedScale) {
            return fixedScale(Output.of(fixedScale));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<PoolIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(PoolIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param maxTasksPerNode Specifies the maximum number of tasks that can run concurrently on a single compute node in the pool. Defaults to `1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maxTasksPerNode(@Nullable Output<Integer> maxTasksPerNode) {
            $.maxTasksPerNode = maxTasksPerNode;
            return this;
        }

        /**
         * @param maxTasksPerNode Specifies the maximum number of tasks that can run concurrently on a single compute node in the pool. Defaults to `1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maxTasksPerNode(Integer maxTasksPerNode) {
            return maxTasksPerNode(Output.of(maxTasksPerNode));
        }

        /**
         * @param metadata A map of custom batch pool metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A map of custom batch pool metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name Specifies the name of the Batch pool. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Batch pool. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkConfiguration A `network_configuration` block that describes the network configurations for the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder networkConfiguration(@Nullable Output<PoolNetworkConfigurationArgs> networkConfiguration) {
            $.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * @param networkConfiguration A `network_configuration` block that describes the network configurations for the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder networkConfiguration(PoolNetworkConfigurationArgs networkConfiguration) {
            return networkConfiguration(Output.of(networkConfiguration));
        }

        /**
         * @param nodeAgentSkuId Specifies the SKU of the node agents that will be created in the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeAgentSkuId(@Nullable Output<String> nodeAgentSkuId) {
            $.nodeAgentSkuId = nodeAgentSkuId;
            return this;
        }

        /**
         * @param nodeAgentSkuId Specifies the SKU of the node agents that will be created in the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeAgentSkuId(String nodeAgentSkuId) {
            return nodeAgentSkuId(Output.of(nodeAgentSkuId));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Batch pool. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Batch pool. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param startTask A `start_task` block that describes the start task settings for the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder startTask(@Nullable Output<PoolStartTaskArgs> startTask) {
            $.startTask = startTask;
            return this;
        }

        /**
         * @param startTask A `start_task` block that describes the start task settings for the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder startTask(PoolStartTaskArgs startTask) {
            return startTask(Output.of(startTask));
        }

        public Builder stopPendingResizeOperation(@Nullable Output<Boolean> stopPendingResizeOperation) {
            $.stopPendingResizeOperation = stopPendingResizeOperation;
            return this;
        }

        public Builder stopPendingResizeOperation(Boolean stopPendingResizeOperation) {
            return stopPendingResizeOperation(Output.of(stopPendingResizeOperation));
        }

        /**
         * @param storageImageReference A `storage_image_reference` for the virtual machines that will compose the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder storageImageReference(@Nullable Output<PoolStorageImageReferenceArgs> storageImageReference) {
            $.storageImageReference = storageImageReference;
            return this;
        }

        /**
         * @param storageImageReference A `storage_image_reference` for the virtual machines that will compose the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder storageImageReference(PoolStorageImageReferenceArgs storageImageReference) {
            return storageImageReference(Output.of(storageImageReference));
        }

        /**
         * @param vmSize Specifies the size of the VM created in the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder vmSize(@Nullable Output<String> vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        /**
         * @param vmSize Specifies the size of the VM created in the Batch pool.
         * 
         * @return builder
         * 
         */
        public Builder vmSize(String vmSize) {
            return vmSize(Output.of(vmSize));
        }

        public PoolState build() {
            return $;
        }
    }

}
