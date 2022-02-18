// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.AzureContainerDataFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * The container name.
     * 
     */
    @InputImport(name="containerName")
    private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    /**
     * DataFormat for Container
     * 
     */
    @InputImport(name="dataFormat", required=true)
    private final Input<Either<String,AzureContainerDataFormat>> dataFormat;

    public Input<Either<String,AzureContainerDataFormat>> getDataFormat() {
        return this.dataFormat;
    }

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Storage Account Name
     * 
     */
    @InputImport(name="storageAccountName", required=true)
    private final Input<String> storageAccountName;

    public Input<String> getStorageAccountName() {
        return this.storageAccountName;
    }

    public ContainerArgs(
        @Nullable Input<String> containerName,
        Input<Either<String,AzureContainerDataFormat>> dataFormat,
        Input<String> deviceName,
        Input<String> resourceGroupName,
        Input<String> storageAccountName) {
        this.containerName = containerName;
        this.dataFormat = Objects.requireNonNull(dataFormat, "expected parameter 'dataFormat' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
    }

    private ContainerArgs() {
        this.containerName = Input.empty();
        this.dataFormat = Input.empty();
        this.deviceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.storageAccountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerName;
        private Input<Either<String,AzureContainerDataFormat>> dataFormat;
        private Input<String> deviceName;
        private Input<String> resourceGroupName;
        private Input<String> storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataFormat = defaults.dataFormat;
    	      this.deviceName = defaults.deviceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder setContainerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }

        public Builder setDataFormat(Input<Either<String,AzureContainerDataFormat>> dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }

        public Builder setDataFormat(Either<String,AzureContainerDataFormat> dataFormat) {
            this.dataFormat = Input.of(Objects.requireNonNull(dataFormat));
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStorageAccountName(Input<String> storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Input.of(Objects.requireNonNull(storageAccountName));
            return this;
        }

        public ContainerArgs build() {
            return new ContainerArgs(containerName, dataFormat, deviceName, resourceGroupName, storageAccountName);
        }
    }
}
