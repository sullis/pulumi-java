// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.ContainerConfigurationArgs;
import io.pulumi.azurenative.batch.inputs.DataDiskArgs;
import io.pulumi.azurenative.batch.inputs.DiskEncryptionConfigurationArgs;
import io.pulumi.azurenative.batch.inputs.ImageReferenceArgs;
import io.pulumi.azurenative.batch.inputs.NodePlacementConfigurationArgs;
import io.pulumi.azurenative.batch.inputs.VMExtensionArgs;
import io.pulumi.azurenative.batch.inputs.WindowsConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineConfigurationArgs Empty = new VirtualMachineConfigurationArgs();

    /**
     * If specified, setup is performed on each node in the pool to allow tasks to run in containers. All regular tasks and job manager tasks run on this pool must specify the containerSettings property, and all other tasks may specify it.
     * 
     */
    @InputImport(name="containerConfiguration")
    private final @Nullable Input<ContainerConfigurationArgs> containerConfiguration;

    public Input<ContainerConfigurationArgs> getContainerConfiguration() {
        return this.containerConfiguration == null ? Input.empty() : this.containerConfiguration;
    }

    /**
     * This property must be specified if the compute nodes in the pool need to have empty data disks attached to them.
     * 
     */
    @InputImport(name="dataDisks")
    private final @Nullable Input<List<DataDiskArgs>> dataDisks;

    public Input<List<DataDiskArgs>> getDataDisks() {
        return this.dataDisks == null ? Input.empty() : this.dataDisks;
    }

    /**
     * If specified, encryption is performed on each node in the pool during node provisioning.
     * 
     */
    @InputImport(name="diskEncryptionConfiguration")
    private final @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;

    public Input<DiskEncryptionConfigurationArgs> getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration == null ? Input.empty() : this.diskEncryptionConfiguration;
    }

    /**
     * If specified, the extensions mentioned in this configuration will be installed on each node.
     * 
     */
    @InputImport(name="extensions")
    private final @Nullable Input<List<VMExtensionArgs>> extensions;

    public Input<List<VMExtensionArgs>> getExtensions() {
        return this.extensions == null ? Input.empty() : this.extensions;
    }

    @InputImport(name="imageReference", required=true)
    private final Input<ImageReferenceArgs> imageReference;

    public Input<ImageReferenceArgs> getImageReference() {
        return this.imageReference;
    }

    /**
     * This only applies to images that contain the Windows operating system, and should only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no on-premises licensing discount is applied. Values are:
     * 
     *  Windows_Server - The on-premises license is for Windows Server.
     *  Windows_Client - The on-premises license is for Windows Client.
     * 
     */
    @InputImport(name="licenseType")
    private final @Nullable Input<String> licenseType;

    public Input<String> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
    }

    /**
     * The Batch node agent is a program that runs on each node in the pool, and provides the command-and-control interface between the node and the Batch service. There are different implementations of the node agent, known as SKUs, for different operating systems. You must specify a node agent SKU which matches the selected image reference. To get the list of supported node agent SKUs along with their list of verified image references, see the 'List supported node agent SKUs' operation.
     * 
     */
    @InputImport(name="nodeAgentSkuId", required=true)
    private final Input<String> nodeAgentSkuId;

    public Input<String> getNodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }

    /**
     * This configuration will specify rules on how nodes in the pool will be physically allocated.
     * 
     */
    @InputImport(name="nodePlacementConfiguration")
    private final @Nullable Input<NodePlacementConfigurationArgs> nodePlacementConfiguration;

    public Input<NodePlacementConfigurationArgs> getNodePlacementConfiguration() {
        return this.nodePlacementConfiguration == null ? Input.empty() : this.nodePlacementConfiguration;
    }

    /**
     * This property must not be specified if the imageReference specifies a Linux OS image.
     * 
     */
    @InputImport(name="windowsConfiguration")
    private final @Nullable Input<WindowsConfigurationArgs> windowsConfiguration;

    public Input<WindowsConfigurationArgs> getWindowsConfiguration() {
        return this.windowsConfiguration == null ? Input.empty() : this.windowsConfiguration;
    }

    public VirtualMachineConfigurationArgs(
        @Nullable Input<ContainerConfigurationArgs> containerConfiguration,
        @Nullable Input<List<DataDiskArgs>> dataDisks,
        @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration,
        @Nullable Input<List<VMExtensionArgs>> extensions,
        Input<ImageReferenceArgs> imageReference,
        @Nullable Input<String> licenseType,
        Input<String> nodeAgentSkuId,
        @Nullable Input<NodePlacementConfigurationArgs> nodePlacementConfiguration,
        @Nullable Input<WindowsConfigurationArgs> windowsConfiguration) {
        this.containerConfiguration = containerConfiguration;
        this.dataDisks = dataDisks;
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        this.extensions = extensions;
        this.imageReference = Objects.requireNonNull(imageReference, "expected parameter 'imageReference' to be non-null");
        this.licenseType = licenseType;
        this.nodeAgentSkuId = Objects.requireNonNull(nodeAgentSkuId, "expected parameter 'nodeAgentSkuId' to be non-null");
        this.nodePlacementConfiguration = nodePlacementConfiguration;
        this.windowsConfiguration = windowsConfiguration;
    }

    private VirtualMachineConfigurationArgs() {
        this.containerConfiguration = Input.empty();
        this.dataDisks = Input.empty();
        this.diskEncryptionConfiguration = Input.empty();
        this.extensions = Input.empty();
        this.imageReference = Input.empty();
        this.licenseType = Input.empty();
        this.nodeAgentSkuId = Input.empty();
        this.nodePlacementConfiguration = Input.empty();
        this.windowsConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ContainerConfigurationArgs> containerConfiguration;
        private @Nullable Input<List<DataDiskArgs>> dataDisks;
        private @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;
        private @Nullable Input<List<VMExtensionArgs>> extensions;
        private Input<ImageReferenceArgs> imageReference;
        private @Nullable Input<String> licenseType;
        private Input<String> nodeAgentSkuId;
        private @Nullable Input<NodePlacementConfigurationArgs> nodePlacementConfiguration;
        private @Nullable Input<WindowsConfigurationArgs> windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineConfigurationArgs defaults) {
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

        public Builder setContainerConfiguration(@Nullable Input<ContainerConfigurationArgs> containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        public Builder setContainerConfiguration(@Nullable ContainerConfigurationArgs containerConfiguration) {
            this.containerConfiguration = Input.ofNullable(containerConfiguration);
            return this;
        }

        public Builder setDataDisks(@Nullable Input<List<DataDiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setDataDisks(@Nullable List<DataDiskArgs> dataDisks) {
            this.dataDisks = Input.ofNullable(dataDisks);
            return this;
        }

        public Builder setDiskEncryptionConfiguration(@Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }

        public Builder setDiskEncryptionConfiguration(@Nullable DiskEncryptionConfigurationArgs diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = Input.ofNullable(diskEncryptionConfiguration);
            return this;
        }

        public Builder setExtensions(@Nullable Input<List<VMExtensionArgs>> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder setExtensions(@Nullable List<VMExtensionArgs> extensions) {
            this.extensions = Input.ofNullable(extensions);
            return this;
        }

        public Builder setImageReference(Input<ImageReferenceArgs> imageReference) {
            this.imageReference = Objects.requireNonNull(imageReference);
            return this;
        }

        public Builder setImageReference(ImageReferenceArgs imageReference) {
            this.imageReference = Input.of(Objects.requireNonNull(imageReference));
            return this;
        }

        public Builder setLicenseType(@Nullable Input<String> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
            return this;
        }

        public Builder setNodeAgentSkuId(Input<String> nodeAgentSkuId) {
            this.nodeAgentSkuId = Objects.requireNonNull(nodeAgentSkuId);
            return this;
        }

        public Builder setNodeAgentSkuId(String nodeAgentSkuId) {
            this.nodeAgentSkuId = Input.of(Objects.requireNonNull(nodeAgentSkuId));
            return this;
        }

        public Builder setNodePlacementConfiguration(@Nullable Input<NodePlacementConfigurationArgs> nodePlacementConfiguration) {
            this.nodePlacementConfiguration = nodePlacementConfiguration;
            return this;
        }

        public Builder setNodePlacementConfiguration(@Nullable NodePlacementConfigurationArgs nodePlacementConfiguration) {
            this.nodePlacementConfiguration = Input.ofNullable(nodePlacementConfiguration);
            return this;
        }

        public Builder setWindowsConfiguration(@Nullable Input<WindowsConfigurationArgs> windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }

        public Builder setWindowsConfiguration(@Nullable WindowsConfigurationArgs windowsConfiguration) {
            this.windowsConfiguration = Input.ofNullable(windowsConfiguration);
            return this;
        }

        public VirtualMachineConfigurationArgs build() {
            return new VirtualMachineConfigurationArgs(containerConfiguration, dataDisks, diskEncryptionConfiguration, extensions, imageReference, licenseType, nodeAgentSkuId, nodePlacementConfiguration, windowsConfiguration);
        }
    }
}
