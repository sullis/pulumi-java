// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.WorkloadType;
import com.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AzureStorage backup policy.
 * 
 */
public final class AzureFileShareProtectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFileShareProtectionPolicyArgs Empty = new AzureFileShareProtectionPolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureStorage'.
     * 
     */
    @Import(name="backupManagementType", required=true)
      private final Output<String> backupManagementType;

    public Output<String> backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @Import(name="protectedItemsCount")
      private final @Nullable Output<Integer> protectedItemsCount;

    public Output<Integer> protectedItemsCount() {
        return this.protectedItemsCount == null ? Codegen.empty() : this.protectedItemsCount;
    }

    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @Import(name="retentionPolicy")
      private final @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

    public Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy() {
        return this.retentionPolicy == null ? Codegen.empty() : this.retentionPolicy;
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @Import(name="schedulePolicy")
      private final @Nullable Output<Object> schedulePolicy;

    public Output<Object> schedulePolicy() {
        return this.schedulePolicy == null ? Codegen.empty() : this.schedulePolicy;
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone == null ? Codegen.empty() : this.timeZone;
    }

    /**
     * Type of workload for the backup management
     * 
     */
    @Import(name="workLoadType")
      private final @Nullable Output<Either<String,WorkloadType>> workLoadType;

    public Output<Either<String,WorkloadType>> workLoadType() {
        return this.workLoadType == null ? Codegen.empty() : this.workLoadType;
    }

    public AzureFileShareProtectionPolicyArgs(
        Output<String> backupManagementType,
        @Nullable Output<Integer> protectedItemsCount,
        @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy,
        @Nullable Output<Object> schedulePolicy,
        @Nullable Output<String> timeZone,
        @Nullable Output<Either<String,WorkloadType>> workLoadType) {
        this.backupManagementType = Codegen.stringProp("backupManagementType").output().arg(backupManagementType).require();
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
        this.timeZone = timeZone;
        this.workLoadType = workLoadType;
    }

    private AzureFileShareProtectionPolicyArgs() {
        this.backupManagementType = Codegen.empty();
        this.protectedItemsCount = Codegen.empty();
        this.retentionPolicy = Codegen.empty();
        this.schedulePolicy = Codegen.empty();
        this.timeZone = Codegen.empty();
        this.workLoadType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileShareProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupManagementType;
        private @Nullable Output<Integer> protectedItemsCount;
        private @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;
        private @Nullable Output<Object> schedulePolicy;
        private @Nullable Output<String> timeZone;
        private @Nullable Output<Either<String,WorkloadType>> workLoadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileShareProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
    	      this.timeZone = defaults.timeZone;
    	      this.workLoadType = defaults.workLoadType;
        }

        public Builder backupManagementType(Output<String> backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }
        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Output.of(Objects.requireNonNull(backupManagementType));
            return this;
        }
        public Builder protectedItemsCount(@Nullable Output<Integer> protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }
        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = Codegen.ofNullable(protectedItemsCount);
            return this;
        }
        public Builder retentionPolicy(@Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = Codegen.ofNullable(retentionPolicy);
            return this;
        }
        public Builder schedulePolicy(@Nullable Output<Object> schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }
        public Builder schedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = Codegen.ofNullable(schedulePolicy);
            return this;
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Codegen.ofNullable(timeZone);
            return this;
        }
        public Builder workLoadType(@Nullable Output<Either<String,WorkloadType>> workLoadType) {
            this.workLoadType = workLoadType;
            return this;
        }
        public Builder workLoadType(@Nullable Either<String,WorkloadType> workLoadType) {
            this.workLoadType = Codegen.ofNullable(workLoadType);
            return this;
        }        public AzureFileShareProtectionPolicyArgs build() {
            return new AzureFileShareProtectionPolicyArgs(backupManagementType, protectedItemsCount, retentionPolicy, schedulePolicy, timeZone, workLoadType);
        }
    }
}
