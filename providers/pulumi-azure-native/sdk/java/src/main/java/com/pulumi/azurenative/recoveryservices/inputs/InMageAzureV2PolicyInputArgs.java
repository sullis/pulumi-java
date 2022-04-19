// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.SetMultiVmSyncStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VMWare Azure specific policy Input.
 * 
 */
public final class InMageAzureV2PolicyInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final InMageAzureV2PolicyInputArgs Empty = new InMageAzureV2PolicyInputArgs();

    /**
     * The app consistent snapshot frequency (in minutes).
     * 
     */
    @Import(name="appConsistentFrequencyInMinutes")
      private final @Nullable Output<Integer> appConsistentFrequencyInMinutes;

    public Output<Integer> appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes == null ? Codegen.empty() : this.appConsistentFrequencyInMinutes;
    }

    /**
     * The crash consistent snapshot frequency (in minutes).
     * 
     */
    @Import(name="crashConsistentFrequencyInMinutes")
      private final @Nullable Output<Integer> crashConsistentFrequencyInMinutes;

    public Output<Integer> crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes == null ? Codegen.empty() : this.crashConsistentFrequencyInMinutes;
    }

    /**
     * The class type.
     * Expected value is 'InMageAzureV2'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * A value indicating whether multi-VM sync has to be enabled. Value should be 'Enabled' or 'Disabled'.
     * 
     */
    @Import(name="multiVmSyncStatus", required=true)
      private final Output<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus;

    public Output<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @Import(name="recoveryPointHistory")
      private final @Nullable Output<Integer> recoveryPointHistory;

    public Output<Integer> recoveryPointHistory() {
        return this.recoveryPointHistory == null ? Codegen.empty() : this.recoveryPointHistory;
    }

    /**
     * The recovery point threshold in minutes.
     * 
     */
    @Import(name="recoveryPointThresholdInMinutes")
      private final @Nullable Output<Integer> recoveryPointThresholdInMinutes;

    public Output<Integer> recoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes == null ? Codegen.empty() : this.recoveryPointThresholdInMinutes;
    }

    public InMageAzureV2PolicyInputArgs(
        @Nullable Output<Integer> appConsistentFrequencyInMinutes,
        @Nullable Output<Integer> crashConsistentFrequencyInMinutes,
        @Nullable Output<String> instanceType,
        Output<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus,
        @Nullable Output<Integer> recoveryPointHistory,
        @Nullable Output<Integer> recoveryPointThresholdInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        this.instanceType = Codegen.stringProp("instanceType").output().arg(instanceType).getNullable();
        this.multiVmSyncStatus = Objects.requireNonNull(multiVmSyncStatus, "expected parameter 'multiVmSyncStatus' to be non-null");
        this.recoveryPointHistory = recoveryPointHistory;
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
    }

    private InMageAzureV2PolicyInputArgs() {
        this.appConsistentFrequencyInMinutes = Codegen.empty();
        this.crashConsistentFrequencyInMinutes = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.multiVmSyncStatus = Codegen.empty();
        this.recoveryPointHistory = Codegen.empty();
        this.recoveryPointThresholdInMinutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageAzureV2PolicyInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> appConsistentFrequencyInMinutes;
        private @Nullable Output<Integer> crashConsistentFrequencyInMinutes;
        private @Nullable Output<String> instanceType;
        private Output<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus;
        private @Nullable Output<Integer> recoveryPointHistory;
        private @Nullable Output<Integer> recoveryPointThresholdInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageAzureV2PolicyInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.crashConsistentFrequencyInMinutes = defaults.crashConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.multiVmSyncStatus = defaults.multiVmSyncStatus;
    	      this.recoveryPointHistory = defaults.recoveryPointHistory;
    	      this.recoveryPointThresholdInMinutes = defaults.recoveryPointThresholdInMinutes;
        }

        public Builder appConsistentFrequencyInMinutes(@Nullable Output<Integer> appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }
        public Builder appConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = Codegen.ofNullable(appConsistentFrequencyInMinutes);
            return this;
        }
        public Builder crashConsistentFrequencyInMinutes(@Nullable Output<Integer> crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
            return this;
        }
        public Builder crashConsistentFrequencyInMinutes(@Nullable Integer crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = Codegen.ofNullable(crashConsistentFrequencyInMinutes);
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
        public Builder multiVmSyncStatus(Output<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus) {
            this.multiVmSyncStatus = Objects.requireNonNull(multiVmSyncStatus);
            return this;
        }
        public Builder multiVmSyncStatus(Either<String,SetMultiVmSyncStatus> multiVmSyncStatus) {
            this.multiVmSyncStatus = Output.of(Objects.requireNonNull(multiVmSyncStatus));
            return this;
        }
        public Builder recoveryPointHistory(@Nullable Output<Integer> recoveryPointHistory) {
            this.recoveryPointHistory = recoveryPointHistory;
            return this;
        }
        public Builder recoveryPointHistory(@Nullable Integer recoveryPointHistory) {
            this.recoveryPointHistory = Codegen.ofNullable(recoveryPointHistory);
            return this;
        }
        public Builder recoveryPointThresholdInMinutes(@Nullable Output<Integer> recoveryPointThresholdInMinutes) {
            this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
            return this;
        }
        public Builder recoveryPointThresholdInMinutes(@Nullable Integer recoveryPointThresholdInMinutes) {
            this.recoveryPointThresholdInMinutes = Codegen.ofNullable(recoveryPointThresholdInMinutes);
            return this;
        }        public InMageAzureV2PolicyInputArgs build() {
            return new InMageAzureV2PolicyInputArgs(appConsistentFrequencyInMinutes, crashConsistentFrequencyInMinutes, instanceType, multiVmSyncStatus, recoveryPointHistory, recoveryPointThresholdInMinutes);
        }
    }
}
