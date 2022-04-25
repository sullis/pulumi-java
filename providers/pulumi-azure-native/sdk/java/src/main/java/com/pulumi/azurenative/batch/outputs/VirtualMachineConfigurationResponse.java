// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.azurenative.batch.outputs.ContainerConfigurationResponse;
import com.pulumi.azurenative.batch.outputs.DataDiskResponse;
import com.pulumi.azurenative.batch.outputs.DiskEncryptionConfigurationResponse;
import com.pulumi.azurenative.batch.outputs.ImageReferenceResponse;
import com.pulumi.azurenative.batch.outputs.NodePlacementConfigurationResponse;
import com.pulumi.azurenative.batch.outputs.VMExtensionResponse;
import com.pulumi.azurenative.batch.outputs.WindowsConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineConfigurationResponse {
    /**
     * @return If specified, setup is performed on each node in the pool to allow tasks to run in containers. All regular tasks and job manager tasks run on this pool must specify the containerSettings property, and all other tasks may specify it.
     * 
     */
    private final @Nullable ContainerConfigurationResponse containerConfiguration;
    /**
     * @return This property must be specified if the compute nodes in the pool need to have empty data disks attached to them.
     * 
     */
    private final @Nullable List<DataDiskResponse> dataDisks;
    /**
     * @return If specified, encryption is performed on each node in the pool during node provisioning.
     * 
     */
    private final @Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
    /**
     * @return If specified, the extensions mentioned in this configuration will be installed on each node.
     * 
     */
    private final @Nullable List<VMExtensionResponse> extensions;
    private final ImageReferenceResponse imageReference;
    /**
     * @return This only applies to images that contain the Windows operating system, and should only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no on-premises licensing discount is applied. Values are:
     * 
     *  Windows_Server - The on-premises license is for Windows Server.
     *  Windows_Client - The on-premises license is for Windows Client.
     * 
     */
    private final @Nullable String licenseType;
    /**
     * @return The Batch node agent is a program that runs on each node in the pool, and provides the command-and-control interface between the node and the Batch service. There are different implementations of the node agent, known as SKUs, for different operating systems. You must specify a node agent SKU which matches the selected image reference. To get the list of supported node agent SKUs along with their list of verified image references, see the &#39;List supported node agent SKUs&#39; operation.
     * 
     */
    private final String nodeAgentSkuId;
    /**
     * @return This configuration will specify rules on how nodes in the pool will be physically allocated.
     * 
     */
    private final @Nullable NodePlacementConfigurationResponse nodePlacementConfiguration;
    /**
     * @return This property must not be specified if the imageReference specifies a Linux OS image.
     * 
     */
    private final @Nullable WindowsConfigurationResponse windowsConfiguration;

    @CustomType.Constructor
    private VirtualMachineConfigurationResponse(
        @CustomType.Parameter("containerConfiguration") @Nullable ContainerConfigurationResponse containerConfiguration,
        @CustomType.Parameter("dataDisks") @Nullable List<DataDiskResponse> dataDisks,
        @CustomType.Parameter("diskEncryptionConfiguration") @Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration,
        @CustomType.Parameter("extensions") @Nullable List<VMExtensionResponse> extensions,
        @CustomType.Parameter("imageReference") ImageReferenceResponse imageReference,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("nodeAgentSkuId") String nodeAgentSkuId,
        @CustomType.Parameter("nodePlacementConfiguration") @Nullable NodePlacementConfigurationResponse nodePlacementConfiguration,
        @CustomType.Parameter("windowsConfiguration") @Nullable WindowsConfigurationResponse windowsConfiguration) {
        this.containerConfiguration = containerConfiguration;
        this.dataDisks = dataDisks;
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        this.extensions = extensions;
        this.imageReference = imageReference;
        this.licenseType = licenseType;
        this.nodeAgentSkuId = nodeAgentSkuId;
        this.nodePlacementConfiguration = nodePlacementConfiguration;
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * @return If specified, setup is performed on each node in the pool to allow tasks to run in containers. All regular tasks and job manager tasks run on this pool must specify the containerSettings property, and all other tasks may specify it.
     * 
     */
    public Optional<ContainerConfigurationResponse> containerConfiguration() {
        return Optional.ofNullable(this.containerConfiguration);
    }
    /**
     * @return This property must be specified if the compute nodes in the pool need to have empty data disks attached to them.
     * 
     */
    public List<DataDiskResponse> dataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }
    /**
     * @return If specified, encryption is performed on each node in the pool during node provisioning.
     * 
     */
    public Optional<DiskEncryptionConfigurationResponse> diskEncryptionConfiguration() {
        return Optional.ofNullable(this.diskEncryptionConfiguration);
    }
    /**
     * @return If specified, the extensions mentioned in this configuration will be installed on each node.
     * 
     */
    public List<VMExtensionResponse> extensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }
    public ImageReferenceResponse imageReference() {
        return this.imageReference;
    }
    /**
     * @return This only applies to images that contain the Windows operating system, and should only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no on-premises licensing discount is applied. Values are:
     * 
     *  Windows_Server - The on-premises license is for Windows Server.
     *  Windows_Client - The on-premises license is for Windows Client.
     * 
     */
    public Optional<String> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * @return The Batch node agent is a program that runs on each node in the pool, and provides the command-and-control interface between the node and the Batch service. There are different implementations of the node agent, known as SKUs, for different operating systems. You must specify a node agent SKU which matches the selected image reference. To get the list of supported node agent SKUs along with their list of verified image references, see the &#39;List supported node agent SKUs&#39; operation.
     * 
     */
    public String nodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }
    /**
     * @return This configuration will specify rules on how nodes in the pool will be physically allocated.
     * 
     */
    public Optional<NodePlacementConfigurationResponse> nodePlacementConfiguration() {
        return Optional.ofNullable(this.nodePlacementConfiguration);
    }
    /**
     * @return This property must not be specified if the imageReference specifies a Linux OS image.
     * 
     */
    public Optional<WindowsConfigurationResponse> windowsConfiguration() {
        return Optional.ofNullable(this.windowsConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerConfigurationResponse containerConfiguration;
        private @Nullable List<DataDiskResponse> dataDisks;
        private @Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
        private @Nullable List<VMExtensionResponse> extensions;
        private ImageReferenceResponse imageReference;
        private @Nullable String licenseType;
        private String nodeAgentSkuId;
        private @Nullable NodePlacementConfigurationResponse nodePlacementConfiguration;
        private @Nullable WindowsConfigurationResponse windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerConfiguration = defaults.containerConfiguration;
    	      this.dataDisks = defaults.dataDisks;
    	      this.diskEncryptionConfiguration = defaults.diskEncryptionConfiguration;
    	      this.extensions = defaults.extensions;
    	      this.imageReference = defaults.imageReference;
    	      this.licenseType = defaults.licenseType;
    	      this.nodeAgentSkuId = defaults.nodeAgentSkuId;
    	      this.nodePlacementConfiguration = defaults.nodePlacementConfiguration;
    	      this.windowsConfiguration = defaults.windowsConfiguration;
        }

        public Builder containerConfiguration(@Nullable ContainerConfigurationResponse containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public Builder dataDisks(@Nullable List<DataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public Builder dataDisks(DataDiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder diskEncryptionConfiguration(@Nullable DiskEncryptionConfigurationResponse diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }
        public Builder extensions(@Nullable List<VMExtensionResponse> extensions) {
            this.extensions = extensions;
            return this;
        }
        public Builder extensions(VMExtensionResponse... extensions) {
            return extensions(List.of(extensions));
        }
        public Builder imageReference(ImageReferenceResponse imageReference) {
            this.imageReference = Objects.requireNonNull(imageReference);
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder nodeAgentSkuId(String nodeAgentSkuId) {
            this.nodeAgentSkuId = Objects.requireNonNull(nodeAgentSkuId);
            return this;
        }
        public Builder nodePlacementConfiguration(@Nullable NodePlacementConfigurationResponse nodePlacementConfiguration) {
            this.nodePlacementConfiguration = nodePlacementConfiguration;
            return this;
        }
        public Builder windowsConfiguration(@Nullable WindowsConfigurationResponse windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }        public VirtualMachineConfigurationResponse build() {
            return new VirtualMachineConfigurationResponse(containerConfiguration, dataDisks, diskEncryptionConfiguration, extensions, imageReference, licenseType, nodeAgentSkuId, nodePlacementConfiguration, windowsConfiguration);
        }
    }
}
