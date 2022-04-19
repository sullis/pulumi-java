// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of the managed disks.
 * 
 */
public final class ManagedDiskDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDiskDetailsArgs Empty = new ManagedDiskDetailsArgs();

    /**
     * Account Type of the data to be transferred.
     * Expected value is 'ManagedDisk'.
     * 
     */
    @Import(name="dataAccountType", required=true)
      private final Output<String> dataAccountType;

    public Output<String> dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Resource Group Id of the compute disks.
     * 
     */
    @Import(name="resourceGroupId", required=true)
      private final Output<String> resourceGroupId;

    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * Password for all the shares to be created on the device. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    @Import(name="sharePassword")
      private final @Nullable Output<String> sharePassword;

    public Output<String> sharePassword() {
        return this.sharePassword == null ? Codegen.empty() : this.sharePassword;
    }

    /**
     * Resource Id of the storage account that can be used to copy the vhd for staging.
     * 
     */
    @Import(name="stagingStorageAccountId", required=true)
      private final Output<String> stagingStorageAccountId;

    public Output<String> stagingStorageAccountId() {
        return this.stagingStorageAccountId;
    }

    public ManagedDiskDetailsArgs(
        Output<String> dataAccountType,
        Output<String> resourceGroupId,
        @Nullable Output<String> sharePassword,
        Output<String> stagingStorageAccountId) {
        this.dataAccountType = Codegen.stringProp("dataAccountType").output().arg(dataAccountType).def("StorageAccount").require();
        this.resourceGroupId = Objects.requireNonNull(resourceGroupId, "expected parameter 'resourceGroupId' to be non-null");
        this.sharePassword = sharePassword;
        this.stagingStorageAccountId = Objects.requireNonNull(stagingStorageAccountId, "expected parameter 'stagingStorageAccountId' to be non-null");
    }

    private ManagedDiskDetailsArgs() {
        this.dataAccountType = Codegen.empty();
        this.resourceGroupId = Codegen.empty();
        this.sharePassword = Codegen.empty();
        this.stagingStorageAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDiskDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataAccountType;
        private Output<String> resourceGroupId;
        private @Nullable Output<String> sharePassword;
        private Output<String> stagingStorageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDiskDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.sharePassword = defaults.sharePassword;
    	      this.stagingStorageAccountId = defaults.stagingStorageAccountId;
        }

        public Builder dataAccountType(Output<String> dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }
        public Builder dataAccountType(String dataAccountType) {
            this.dataAccountType = Output.of(Objects.requireNonNull(dataAccountType));
            return this;
        }
        public Builder resourceGroupId(Output<String> resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Output.of(Objects.requireNonNull(resourceGroupId));
            return this;
        }
        public Builder sharePassword(@Nullable Output<String> sharePassword) {
            this.sharePassword = sharePassword;
            return this;
        }
        public Builder sharePassword(@Nullable String sharePassword) {
            this.sharePassword = Codegen.ofNullable(sharePassword);
            return this;
        }
        public Builder stagingStorageAccountId(Output<String> stagingStorageAccountId) {
            this.stagingStorageAccountId = Objects.requireNonNull(stagingStorageAccountId);
            return this;
        }
        public Builder stagingStorageAccountId(String stagingStorageAccountId) {
            this.stagingStorageAccountId = Output.of(Objects.requireNonNull(stagingStorageAccountId));
            return this;
        }        public ManagedDiskDetailsArgs build() {
            return new ManagedDiskDetailsArgs(dataAccountType, resourceGroupId, sharePassword, stagingStorageAccountId);
        }
    }
}
