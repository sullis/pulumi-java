// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.aws.fsx.outputs.OpenZfsFileSystemRootVolumeConfigurationNfsExports;
import io.pulumi.aws.fsx.outputs.OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OpenZfsFileSystemRootVolumeConfiguration {
    /**
     * - A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    private final @Nullable Boolean copyTagsToSnapshots;
    /**
     * - Method used to compress the data on the volume. Valid values are `NONE` or `ZSTD`. Child volumes that don't specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     * 
     */
    private final @Nullable String dataCompressionType;
    /**
     * - NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     * 
     */
    private final @Nullable OpenZfsFileSystemRootVolumeConfigurationNfsExports nfsExports;
    /**
     * - specifies whether the volume is read-only. Default is false.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * - Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     * 
     */
    private final @Nullable List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota> userAndGroupQuotas;

    @CustomType.Constructor
    private OpenZfsFileSystemRootVolumeConfiguration(
        @CustomType.Parameter("copyTagsToSnapshots") @Nullable Boolean copyTagsToSnapshots,
        @CustomType.Parameter("dataCompressionType") @Nullable String dataCompressionType,
        @CustomType.Parameter("nfsExports") @Nullable OpenZfsFileSystemRootVolumeConfigurationNfsExports nfsExports,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("userAndGroupQuotas") @Nullable List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota> userAndGroupQuotas) {
        this.copyTagsToSnapshots = copyTagsToSnapshots;
        this.dataCompressionType = dataCompressionType;
        this.nfsExports = nfsExports;
        this.readOnly = readOnly;
        this.userAndGroupQuotas = userAndGroupQuotas;
    }

    /**
     * - A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
    */
    public Optional<Boolean> getCopyTagsToSnapshots() {
        return Optional.ofNullable(this.copyTagsToSnapshots);
    }
    /**
     * - Method used to compress the data on the volume. Valid values are `NONE` or `ZSTD`. Child volumes that don't specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     * 
    */
    public Optional<String> getDataCompressionType() {
        return Optional.ofNullable(this.dataCompressionType);
    }
    /**
     * - NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     * 
    */
    public Optional<OpenZfsFileSystemRootVolumeConfigurationNfsExports> getNfsExports() {
        return Optional.ofNullable(this.nfsExports);
    }
    /**
     * - specifies whether the volume is read-only. Default is false.
     * 
    */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * - Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     * 
    */
    public List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota> getUserAndGroupQuotas() {
        return this.userAndGroupQuotas == null ? List.of() : this.userAndGroupQuotas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsFileSystemRootVolumeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean copyTagsToSnapshots;
        private @Nullable String dataCompressionType;
        private @Nullable OpenZfsFileSystemRootVolumeConfigurationNfsExports nfsExports;
        private @Nullable Boolean readOnly;
        private @Nullable List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota> userAndGroupQuotas;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsFileSystemRootVolumeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyTagsToSnapshots = defaults.copyTagsToSnapshots;
    	      this.dataCompressionType = defaults.dataCompressionType;
    	      this.nfsExports = defaults.nfsExports;
    	      this.readOnly = defaults.readOnly;
    	      this.userAndGroupQuotas = defaults.userAndGroupQuotas;
        }

        public Builder copyTagsToSnapshots(@Nullable Boolean copyTagsToSnapshots) {
            this.copyTagsToSnapshots = copyTagsToSnapshots;
            return this;
        }
        public Builder dataCompressionType(@Nullable String dataCompressionType) {
            this.dataCompressionType = dataCompressionType;
            return this;
        }
        public Builder nfsExports(@Nullable OpenZfsFileSystemRootVolumeConfigurationNfsExports nfsExports) {
            this.nfsExports = nfsExports;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder userAndGroupQuotas(@Nullable List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota> userAndGroupQuotas) {
            this.userAndGroupQuotas = userAndGroupQuotas;
            return this;
        }
        public Builder userAndGroupQuotas(OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota... userAndGroupQuotas) {
            return userAndGroupQuotas(List.of(userAndGroupQuotas));
        }        public OpenZfsFileSystemRootVolumeConfiguration build() {
            return new OpenZfsFileSystemRootVolumeConfiguration(copyTagsToSnapshots, dataCompressionType, nfsExports, readOnly, userAndGroupQuotas);
        }
    }
}
