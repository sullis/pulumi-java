// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HyperVReplicaAzurePolicyDetailsResponse {
    /**
     * The active storage account Id.
     * 
     */
    private final @Nullable String activeStorageAccountId;
    /**
     * The interval (in hours) at which Hyper-V Replica should create an application consistent snapshot within the VM.
     * 
     */
    private final @Nullable Integer applicationConsistentSnapshotFrequencyInHours;
    /**
     * A value indicating whether encryption is enabled for virtual machines in this cloud.
     * 
     */
    private final @Nullable String encryption;
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'HyperVReplicaAzure'.
     * 
     */
    private final String instanceType;
    /**
     * The scheduled start time for the initial replication. If this parameter is Null, the initial replication starts immediately.
     * 
     */
    private final @Nullable String onlineReplicationStartTime;
    /**
     * The duration (in hours) to which point the recovery history needs to be maintained.
     * 
     */
    private final @Nullable Integer recoveryPointHistoryDurationInHours;
    /**
     * The replication interval.
     * 
     */
    private final @Nullable Integer replicationInterval;

    @OutputCustomType.Constructor({"activeStorageAccountId","applicationConsistentSnapshotFrequencyInHours","encryption","instanceType","onlineReplicationStartTime","recoveryPointHistoryDurationInHours","replicationInterval"})
    private HyperVReplicaAzurePolicyDetailsResponse(
        @Nullable String activeStorageAccountId,
        @Nullable Integer applicationConsistentSnapshotFrequencyInHours,
        @Nullable String encryption,
        String instanceType,
        @Nullable String onlineReplicationStartTime,
        @Nullable Integer recoveryPointHistoryDurationInHours,
        @Nullable Integer replicationInterval) {
        this.activeStorageAccountId = activeStorageAccountId;
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        this.encryption = encryption;
        this.instanceType = Objects.requireNonNull(instanceType);
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        this.recoveryPointHistoryDurationInHours = recoveryPointHistoryDurationInHours;
        this.replicationInterval = replicationInterval;
    }

    /**
     * The active storage account Id.
     * 
     */
    public Optional<String> getActiveStorageAccountId() {
        return Optional.ofNullable(this.activeStorageAccountId);
    }
    /**
     * The interval (in hours) at which Hyper-V Replica should create an application consistent snapshot within the VM.
     * 
     */
    public Optional<Integer> getApplicationConsistentSnapshotFrequencyInHours() {
        return Optional.ofNullable(this.applicationConsistentSnapshotFrequencyInHours);
    }
    /**
     * A value indicating whether encryption is enabled for virtual machines in this cloud.
     * 
     */
    public Optional<String> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'HyperVReplicaAzure'.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The scheduled start time for the initial replication. If this parameter is Null, the initial replication starts immediately.
     * 
     */
    public Optional<String> getOnlineReplicationStartTime() {
        return Optional.ofNullable(this.onlineReplicationStartTime);
    }
    /**
     * The duration (in hours) to which point the recovery history needs to be maintained.
     * 
     */
    public Optional<Integer> getRecoveryPointHistoryDurationInHours() {
        return Optional.ofNullable(this.recoveryPointHistoryDurationInHours);
    }
    /**
     * The replication interval.
     * 
     */
    public Optional<Integer> getReplicationInterval() {
        return Optional.ofNullable(this.replicationInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaAzurePolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeStorageAccountId;
        private @Nullable Integer applicationConsistentSnapshotFrequencyInHours;
        private @Nullable String encryption;
        private String instanceType;
        private @Nullable String onlineReplicationStartTime;
        private @Nullable Integer recoveryPointHistoryDurationInHours;
        private @Nullable Integer replicationInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaAzurePolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeStorageAccountId = defaults.activeStorageAccountId;
    	      this.applicationConsistentSnapshotFrequencyInHours = defaults.applicationConsistentSnapshotFrequencyInHours;
    	      this.encryption = defaults.encryption;
    	      this.instanceType = defaults.instanceType;
    	      this.onlineReplicationStartTime = defaults.onlineReplicationStartTime;
    	      this.recoveryPointHistoryDurationInHours = defaults.recoveryPointHistoryDurationInHours;
    	      this.replicationInterval = defaults.replicationInterval;
        }

        public Builder setActiveStorageAccountId(@Nullable String activeStorageAccountId) {
            this.activeStorageAccountId = activeStorageAccountId;
            return this;
        }

        public Builder setApplicationConsistentSnapshotFrequencyInHours(@Nullable Integer applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
            return this;
        }

        public Builder setEncryption(@Nullable String encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setOnlineReplicationStartTime(@Nullable String onlineReplicationStartTime) {
            this.onlineReplicationStartTime = onlineReplicationStartTime;
            return this;
        }

        public Builder setRecoveryPointHistoryDurationInHours(@Nullable Integer recoveryPointHistoryDurationInHours) {
            this.recoveryPointHistoryDurationInHours = recoveryPointHistoryDurationInHours;
            return this;
        }

        public Builder setReplicationInterval(@Nullable Integer replicationInterval) {
            this.replicationInterval = replicationInterval;
            return this;
        }

        public HyperVReplicaAzurePolicyDetailsResponse build() {
            return new HyperVReplicaAzurePolicyDetailsResponse(activeStorageAccountId, applicationConsistentSnapshotFrequencyInHours, encryption, instanceType, onlineReplicationStartTime, recoveryPointHistoryDurationInHours, replicationInterval);
        }
    }
}
