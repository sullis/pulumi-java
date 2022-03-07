// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs;

import io.pulumi.awsnative.efs.inputs.FileSystemBackupPolicyArgs;
import io.pulumi.awsnative.efs.inputs.FileSystemElasticFileSystemTagArgs;
import io.pulumi.awsnative.efs.inputs.FileSystemLifecyclePolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileSystemArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemArgs Empty = new FileSystemArgs();

    @InputImport(name="availabilityZoneName")
      private final @Nullable Input<String> availabilityZoneName;

    public Input<String> getAvailabilityZoneName() {
        return this.availabilityZoneName == null ? Input.empty() : this.availabilityZoneName;
    }

    @InputImport(name="backupPolicy")
      private final @Nullable Input<FileSystemBackupPolicyArgs> backupPolicy;

    public Input<FileSystemBackupPolicyArgs> getBackupPolicy() {
        return this.backupPolicy == null ? Input.empty() : this.backupPolicy;
    }

    /**
     * Whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request to be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. Defaults to false
     * 
     */
    @InputImport(name="bypassPolicyLockoutSafetyCheck")
      private final @Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck;

    public Input<Boolean> getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck == null ? Input.empty() : this.bypassPolicyLockoutSafetyCheck;
    }

    @InputImport(name="encrypted")
      private final @Nullable Input<Boolean> encrypted;

    public Input<Boolean> getEncrypted() {
        return this.encrypted == null ? Input.empty() : this.encrypted;
    }

    @InputImport(name="fileSystemPolicy")
      private final @Nullable Input<Object> fileSystemPolicy;

    public Input<Object> getFileSystemPolicy() {
        return this.fileSystemPolicy == null ? Input.empty() : this.fileSystemPolicy;
    }

    @InputImport(name="fileSystemTags")
      private final @Nullable Input<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags;

    public Input<List<FileSystemElasticFileSystemTagArgs>> getFileSystemTags() {
        return this.fileSystemTags == null ? Input.empty() : this.fileSystemTags;
    }

    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    @InputImport(name="lifecyclePolicies")
      private final @Nullable Input<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies;

    public Input<List<FileSystemLifecyclePolicyArgs>> getLifecyclePolicies() {
        return this.lifecyclePolicies == null ? Input.empty() : this.lifecyclePolicies;
    }

    @InputImport(name="performanceMode")
      private final @Nullable Input<String> performanceMode;

    public Input<String> getPerformanceMode() {
        return this.performanceMode == null ? Input.empty() : this.performanceMode;
    }

    @InputImport(name="provisionedThroughputInMibps")
      private final @Nullable Input<Double> provisionedThroughputInMibps;

    public Input<Double> getProvisionedThroughputInMibps() {
        return this.provisionedThroughputInMibps == null ? Input.empty() : this.provisionedThroughputInMibps;
    }

    @InputImport(name="throughputMode")
      private final @Nullable Input<String> throughputMode;

    public Input<String> getThroughputMode() {
        return this.throughputMode == null ? Input.empty() : this.throughputMode;
    }

    public FileSystemArgs(
        @Nullable Input<String> availabilityZoneName,
        @Nullable Input<FileSystemBackupPolicyArgs> backupPolicy,
        @Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck,
        @Nullable Input<Boolean> encrypted,
        @Nullable Input<Object> fileSystemPolicy,
        @Nullable Input<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies,
        @Nullable Input<String> performanceMode,
        @Nullable Input<Double> provisionedThroughputInMibps,
        @Nullable Input<String> throughputMode) {
        this.availabilityZoneName = availabilityZoneName;
        this.backupPolicy = backupPolicy;
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        this.encrypted = encrypted;
        this.fileSystemPolicy = fileSystemPolicy;
        this.fileSystemTags = fileSystemTags;
        this.kmsKeyId = kmsKeyId;
        this.lifecyclePolicies = lifecyclePolicies;
        this.performanceMode = performanceMode;
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
        this.throughputMode = throughputMode;
    }

    private FileSystemArgs() {
        this.availabilityZoneName = Input.empty();
        this.backupPolicy = Input.empty();
        this.bypassPolicyLockoutSafetyCheck = Input.empty();
        this.encrypted = Input.empty();
        this.fileSystemPolicy = Input.empty();
        this.fileSystemTags = Input.empty();
        this.kmsKeyId = Input.empty();
        this.lifecyclePolicies = Input.empty();
        this.performanceMode = Input.empty();
        this.provisionedThroughputInMibps = Input.empty();
        this.throughputMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> availabilityZoneName;
        private @Nullable Input<FileSystemBackupPolicyArgs> backupPolicy;
        private @Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck;
        private @Nullable Input<Boolean> encrypted;
        private @Nullable Input<Object> fileSystemPolicy;
        private @Nullable Input<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies;
        private @Nullable Input<String> performanceMode;
        private @Nullable Input<Double> provisionedThroughputInMibps;
        private @Nullable Input<String> throughputMode;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneName = defaults.availabilityZoneName;
    	      this.backupPolicy = defaults.backupPolicy;
    	      this.bypassPolicyLockoutSafetyCheck = defaults.bypassPolicyLockoutSafetyCheck;
    	      this.encrypted = defaults.encrypted;
    	      this.fileSystemPolicy = defaults.fileSystemPolicy;
    	      this.fileSystemTags = defaults.fileSystemTags;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.lifecyclePolicies = defaults.lifecyclePolicies;
    	      this.performanceMode = defaults.performanceMode;
    	      this.provisionedThroughputInMibps = defaults.provisionedThroughputInMibps;
    	      this.throughputMode = defaults.throughputMode;
        }

        public Builder setAvailabilityZoneName(@Nullable Input<String> availabilityZoneName) {
            this.availabilityZoneName = availabilityZoneName;
            return this;
        }

        public Builder setAvailabilityZoneName(@Nullable String availabilityZoneName) {
            this.availabilityZoneName = Input.ofNullable(availabilityZoneName);
            return this;
        }

        public Builder setBackupPolicy(@Nullable Input<FileSystemBackupPolicyArgs> backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }

        public Builder setBackupPolicy(@Nullable FileSystemBackupPolicyArgs backupPolicy) {
            this.backupPolicy = Input.ofNullable(backupPolicy);
            return this;
        }

        public Builder setBypassPolicyLockoutSafetyCheck(@Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }

        public Builder setBypassPolicyLockoutSafetyCheck(@Nullable Boolean bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = Input.ofNullable(bypassPolicyLockoutSafetyCheck);
            return this;
        }

        public Builder setEncrypted(@Nullable Input<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = Input.ofNullable(encrypted);
            return this;
        }

        public Builder setFileSystemPolicy(@Nullable Input<Object> fileSystemPolicy) {
            this.fileSystemPolicy = fileSystemPolicy;
            return this;
        }

        public Builder setFileSystemPolicy(@Nullable Object fileSystemPolicy) {
            this.fileSystemPolicy = Input.ofNullable(fileSystemPolicy);
            return this;
        }

        public Builder setFileSystemTags(@Nullable Input<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags) {
            this.fileSystemTags = fileSystemTags;
            return this;
        }

        public Builder setFileSystemTags(@Nullable List<FileSystemElasticFileSystemTagArgs> fileSystemTags) {
            this.fileSystemTags = Input.ofNullable(fileSystemTags);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setLifecyclePolicies(@Nullable Input<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies) {
            this.lifecyclePolicies = lifecyclePolicies;
            return this;
        }

        public Builder setLifecyclePolicies(@Nullable List<FileSystemLifecyclePolicyArgs> lifecyclePolicies) {
            this.lifecyclePolicies = Input.ofNullable(lifecyclePolicies);
            return this;
        }

        public Builder setPerformanceMode(@Nullable Input<String> performanceMode) {
            this.performanceMode = performanceMode;
            return this;
        }

        public Builder setPerformanceMode(@Nullable String performanceMode) {
            this.performanceMode = Input.ofNullable(performanceMode);
            return this;
        }

        public Builder setProvisionedThroughputInMibps(@Nullable Input<Double> provisionedThroughputInMibps) {
            this.provisionedThroughputInMibps = provisionedThroughputInMibps;
            return this;
        }

        public Builder setProvisionedThroughputInMibps(@Nullable Double provisionedThroughputInMibps) {
            this.provisionedThroughputInMibps = Input.ofNullable(provisionedThroughputInMibps);
            return this;
        }

        public Builder setThroughputMode(@Nullable Input<String> throughputMode) {
            this.throughputMode = throughputMode;
            return this;
        }

        public Builder setThroughputMode(@Nullable String throughputMode) {
            this.throughputMode = Input.ofNullable(throughputMode);
            return this;
        }
        public FileSystemArgs build() {
            return new FileSystemArgs(availabilityZoneName, backupPolicy, bypassPolicyLockoutSafetyCheck, encrypted, fileSystemPolicy, fileSystemTags, kmsKeyId, lifecyclePolicies, performanceMode, provisionedThroughputInMibps, throughputMode);
        }
    }
}