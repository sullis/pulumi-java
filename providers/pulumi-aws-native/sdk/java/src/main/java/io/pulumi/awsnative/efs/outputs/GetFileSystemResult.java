// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs.outputs;

import io.pulumi.awsnative.efs.outputs.FileSystemBackupPolicy;
import io.pulumi.awsnative.efs.outputs.FileSystemElasticFileSystemTag;
import io.pulumi.awsnative.efs.outputs.FileSystemLifecyclePolicy;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFileSystemResult {
    private final @Nullable String arn;
    private final @Nullable FileSystemBackupPolicy backupPolicy;
    private final @Nullable String fileSystemId;
    private final @Nullable Object fileSystemPolicy;
    private final @Nullable List<FileSystemElasticFileSystemTag> fileSystemTags;
    private final @Nullable List<FileSystemLifecyclePolicy> lifecyclePolicies;
    private final @Nullable Double provisionedThroughputInMibps;
    private final @Nullable String throughputMode;

    @OutputCustomType.Constructor({"arn","backupPolicy","fileSystemId","fileSystemPolicy","fileSystemTags","lifecyclePolicies","provisionedThroughputInMibps","throughputMode"})
    private GetFileSystemResult(
        @Nullable String arn,
        @Nullable FileSystemBackupPolicy backupPolicy,
        @Nullable String fileSystemId,
        @Nullable Object fileSystemPolicy,
        @Nullable List<FileSystemElasticFileSystemTag> fileSystemTags,
        @Nullable List<FileSystemLifecyclePolicy> lifecyclePolicies,
        @Nullable Double provisionedThroughputInMibps,
        @Nullable String throughputMode) {
        this.arn = arn;
        this.backupPolicy = backupPolicy;
        this.fileSystemId = fileSystemId;
        this.fileSystemPolicy = fileSystemPolicy;
        this.fileSystemTags = fileSystemTags;
        this.lifecyclePolicies = lifecyclePolicies;
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
        this.throughputMode = throughputMode;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<FileSystemBackupPolicy> getBackupPolicy() {
        return Optional.ofNullable(this.backupPolicy);
    }
    public Optional<String> getFileSystemId() {
        return Optional.ofNullable(this.fileSystemId);
    }
    public Optional<Object> getFileSystemPolicy() {
        return Optional.ofNullable(this.fileSystemPolicy);
    }
    public List<FileSystemElasticFileSystemTag> getFileSystemTags() {
        return this.fileSystemTags == null ? List.of() : this.fileSystemTags;
    }
    public List<FileSystemLifecyclePolicy> getLifecyclePolicies() {
        return this.lifecyclePolicies == null ? List.of() : this.lifecyclePolicies;
    }
    public Optional<Double> getProvisionedThroughputInMibps() {
        return Optional.ofNullable(this.provisionedThroughputInMibps);
    }
    public Optional<String> getThroughputMode() {
        return Optional.ofNullable(this.throughputMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileSystemResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable FileSystemBackupPolicy backupPolicy;
        private @Nullable String fileSystemId;
        private @Nullable Object fileSystemPolicy;
        private @Nullable List<FileSystemElasticFileSystemTag> fileSystemTags;
        private @Nullable List<FileSystemLifecyclePolicy> lifecyclePolicies;
        private @Nullable Double provisionedThroughputInMibps;
        private @Nullable String throughputMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFileSystemResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.backupPolicy = defaults.backupPolicy;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.fileSystemPolicy = defaults.fileSystemPolicy;
    	      this.fileSystemTags = defaults.fileSystemTags;
    	      this.lifecyclePolicies = defaults.lifecyclePolicies;
    	      this.provisionedThroughputInMibps = defaults.provisionedThroughputInMibps;
    	      this.throughputMode = defaults.throughputMode;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setBackupPolicy(@Nullable FileSystemBackupPolicy backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }

        public Builder setFileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        public Builder setFileSystemPolicy(@Nullable Object fileSystemPolicy) {
            this.fileSystemPolicy = fileSystemPolicy;
            return this;
        }

        public Builder setFileSystemTags(@Nullable List<FileSystemElasticFileSystemTag> fileSystemTags) {
            this.fileSystemTags = fileSystemTags;
            return this;
        }

        public Builder setLifecyclePolicies(@Nullable List<FileSystemLifecyclePolicy> lifecyclePolicies) {
            this.lifecyclePolicies = lifecyclePolicies;
            return this;
        }

        public Builder setProvisionedThroughputInMibps(@Nullable Double provisionedThroughputInMibps) {
            this.provisionedThroughputInMibps = provisionedThroughputInMibps;
            return this;
        }

        public Builder setThroughputMode(@Nullable String throughputMode) {
            this.throughputMode = throughputMode;
            return this;
        }

        public GetFileSystemResult build() {
            return new GetFileSystemResult(arn, backupPolicy, fileSystemId, fileSystemPolicy, fileSystemTags, lifecyclePolicies, provisionedThroughputInMibps, throughputMode);
        }
    }
}
