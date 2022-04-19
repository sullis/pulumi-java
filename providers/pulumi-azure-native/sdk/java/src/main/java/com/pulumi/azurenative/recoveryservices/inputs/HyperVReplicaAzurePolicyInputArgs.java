// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Hyper-V Replica Azure specific input for creating a protection profile.
 * 
 */
public final class HyperVReplicaAzurePolicyInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final HyperVReplicaAzurePolicyInputArgs Empty = new HyperVReplicaAzurePolicyInputArgs();

    /**
     * The interval (in hours) at which Hyper-V Replica should create an application consistent snapshot within the VM.
     * 
     */
    @Import(name="applicationConsistentSnapshotFrequencyInHours")
      private final @Nullable Output<Integer> applicationConsistentSnapshotFrequencyInHours;

    public Output<Integer> applicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours == null ? Codegen.empty() : this.applicationConsistentSnapshotFrequencyInHours;
    }

    /**
     * The class type.
     * Expected value is 'HyperVReplicaAzure'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * The scheduled start time for the initial replication. If this parameter is Null, the initial replication starts immediately.
     * 
     */
    @Import(name="onlineReplicationStartTime")
      private final @Nullable Output<String> onlineReplicationStartTime;

    public Output<String> onlineReplicationStartTime() {
        return this.onlineReplicationStartTime == null ? Codegen.empty() : this.onlineReplicationStartTime;
    }

    /**
     * The duration (in hours) to which point the recovery history needs to be maintained.
     * 
     */
    @Import(name="recoveryPointHistoryDuration")
      private final @Nullable Output<Integer> recoveryPointHistoryDuration;

    public Output<Integer> recoveryPointHistoryDuration() {
        return this.recoveryPointHistoryDuration == null ? Codegen.empty() : this.recoveryPointHistoryDuration;
    }

    /**
     * The replication interval.
     * 
     */
    @Import(name="replicationInterval")
      private final @Nullable Output<Integer> replicationInterval;

    public Output<Integer> replicationInterval() {
        return this.replicationInterval == null ? Codegen.empty() : this.replicationInterval;
    }

    /**
     * The list of storage accounts to which the VMs in the primary cloud can replicate to.
     * 
     */
    @Import(name="storageAccounts")
      private final @Nullable Output<List<String>> storageAccounts;

    public Output<List<String>> storageAccounts() {
        return this.storageAccounts == null ? Codegen.empty() : this.storageAccounts;
    }

    public HyperVReplicaAzurePolicyInputArgs(
        @Nullable Output<Integer> applicationConsistentSnapshotFrequencyInHours,
        @Nullable Output<String> instanceType,
        @Nullable Output<String> onlineReplicationStartTime,
        @Nullable Output<Integer> recoveryPointHistoryDuration,
        @Nullable Output<Integer> replicationInterval,
        @Nullable Output<List<String>> storageAccounts) {
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        this.instanceType = Codegen.stringProp("instanceType").output().arg(instanceType).getNullable();
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        this.recoveryPointHistoryDuration = recoveryPointHistoryDuration;
        this.replicationInterval = replicationInterval;
        this.storageAccounts = storageAccounts;
    }

    private HyperVReplicaAzurePolicyInputArgs() {
        this.applicationConsistentSnapshotFrequencyInHours = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.onlineReplicationStartTime = Codegen.empty();
        this.recoveryPointHistoryDuration = Codegen.empty();
        this.replicationInterval = Codegen.empty();
        this.storageAccounts = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaAzurePolicyInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> applicationConsistentSnapshotFrequencyInHours;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> onlineReplicationStartTime;
        private @Nullable Output<Integer> recoveryPointHistoryDuration;
        private @Nullable Output<Integer> replicationInterval;
        private @Nullable Output<List<String>> storageAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaAzurePolicyInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationConsistentSnapshotFrequencyInHours = defaults.applicationConsistentSnapshotFrequencyInHours;
    	      this.instanceType = defaults.instanceType;
    	      this.onlineReplicationStartTime = defaults.onlineReplicationStartTime;
    	      this.recoveryPointHistoryDuration = defaults.recoveryPointHistoryDuration;
    	      this.replicationInterval = defaults.replicationInterval;
    	      this.storageAccounts = defaults.storageAccounts;
        }

        public Builder applicationConsistentSnapshotFrequencyInHours(@Nullable Output<Integer> applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
            return this;
        }
        public Builder applicationConsistentSnapshotFrequencyInHours(@Nullable Integer applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = Codegen.ofNullable(applicationConsistentSnapshotFrequencyInHours);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder onlineReplicationStartTime(@Nullable Output<String> onlineReplicationStartTime) {
            this.onlineReplicationStartTime = onlineReplicationStartTime;
            return this;
        }
        public Builder onlineReplicationStartTime(@Nullable String onlineReplicationStartTime) {
            this.onlineReplicationStartTime = Codegen.ofNullable(onlineReplicationStartTime);
            return this;
        }
        public Builder recoveryPointHistoryDuration(@Nullable Output<Integer> recoveryPointHistoryDuration) {
            this.recoveryPointHistoryDuration = recoveryPointHistoryDuration;
            return this;
        }
        public Builder recoveryPointHistoryDuration(@Nullable Integer recoveryPointHistoryDuration) {
            this.recoveryPointHistoryDuration = Codegen.ofNullable(recoveryPointHistoryDuration);
            return this;
        }
        public Builder replicationInterval(@Nullable Output<Integer> replicationInterval) {
            this.replicationInterval = replicationInterval;
            return this;
        }
        public Builder replicationInterval(@Nullable Integer replicationInterval) {
            this.replicationInterval = Codegen.ofNullable(replicationInterval);
            return this;
        }
        public Builder storageAccounts(@Nullable Output<List<String>> storageAccounts) {
            this.storageAccounts = storageAccounts;
            return this;
        }
        public Builder storageAccounts(@Nullable List<String> storageAccounts) {
            this.storageAccounts = Codegen.ofNullable(storageAccounts);
            return this;
        }
        public Builder storageAccounts(String... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }        public HyperVReplicaAzurePolicyInputArgs build() {
            return new HyperVReplicaAzurePolicyInputArgs(applicationConsistentSnapshotFrequencyInHours, instanceType, onlineReplicationStartTime, recoveryPointHistoryDuration, replicationInterval, storageAccounts);
        }
    }
}
