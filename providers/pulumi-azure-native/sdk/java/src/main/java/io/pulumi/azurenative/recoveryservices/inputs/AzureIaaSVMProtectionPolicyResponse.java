// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.InstantRPAdditionalDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup policy.
 * 
 */
public final class AzureIaaSVMProtectionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureIaaSVMProtectionPolicyResponse Empty = new AzureIaaSVMProtectionPolicyResponse();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureIaasVM'.
     * 
     */
    @InputImport(name="backupManagementType", required=true)
      private final String backupManagementType;

    public String getBackupManagementType() {
        return this.backupManagementType;
    }

    @InputImport(name="instantRPDetails")
      private final @Nullable InstantRPAdditionalDetailsResponse instantRPDetails;

    public Optional<InstantRPAdditionalDetailsResponse> getInstantRPDetails() {
        return this.instantRPDetails == null ? Optional.empty() : Optional.ofNullable(this.instantRPDetails);
    }

    /**
     * Instant RP retention policy range in days
     * 
     */
    @InputImport(name="instantRpRetentionRangeInDays")
      private final @Nullable Integer instantRpRetentionRangeInDays;

    public Optional<Integer> getInstantRpRetentionRangeInDays() {
        return this.instantRpRetentionRangeInDays == null ? Optional.empty() : Optional.ofNullable(this.instantRpRetentionRangeInDays);
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @InputImport(name="protectedItemsCount")
      private final @Nullable Integer protectedItemsCount;

    public Optional<Integer> getProtectedItemsCount() {
        return this.protectedItemsCount == null ? Optional.empty() : Optional.ofNullable(this.protectedItemsCount);
    }

    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @InputImport(name="retentionPolicy")
      private final @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;

    public Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> getRetentionPolicy() {
        return this.retentionPolicy == null ? null : this.retentionPolicy;
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @InputImport(name="schedulePolicy")
      private final @Nullable Object schedulePolicy;

    public Object getSchedulePolicy() {
        return this.schedulePolicy == null ? null : this.schedulePolicy;
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @InputImport(name="timeZone")
      private final @Nullable String timeZone;

    public Optional<String> getTimeZone() {
        return this.timeZone == null ? Optional.empty() : Optional.ofNullable(this.timeZone);
    }

    public AzureIaaSVMProtectionPolicyResponse(
        String backupManagementType,
        @Nullable InstantRPAdditionalDetailsResponse instantRPDetails,
        @Nullable Integer instantRpRetentionRangeInDays,
        @Nullable Integer protectedItemsCount,
        @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy,
        @Nullable Object schedulePolicy,
        @Nullable String timeZone) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.instantRPDetails = instantRPDetails;
        this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
        this.timeZone = timeZone;
    }

    private AzureIaaSVMProtectionPolicyResponse() {
        this.backupManagementType = null;
        this.instantRPDetails = null;
        this.instantRpRetentionRangeInDays = null;
        this.protectedItemsCount = null;
        this.retentionPolicy = null;
        this.schedulePolicy = null;
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable InstantRPAdditionalDetailsResponse instantRPDetails;
        private @Nullable Integer instantRpRetentionRangeInDays;
        private @Nullable Integer protectedItemsCount;
        private @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;
        private @Nullable Object schedulePolicy;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.instantRPDetails = defaults.instantRPDetails;
    	      this.instantRpRetentionRangeInDays = defaults.instantRpRetentionRangeInDays;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setBackupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder setInstantRPDetails(@Nullable InstantRPAdditionalDetailsResponse instantRPDetails) {
            this.instantRPDetails = instantRPDetails;
            return this;
        }

        public Builder setInstantRpRetentionRangeInDays(@Nullable Integer instantRpRetentionRangeInDays) {
            this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
            return this;
        }

        public Builder setProtectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setSchedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public AzureIaaSVMProtectionPolicyResponse build() {
            return new AzureIaaSVMProtectionPolicyResponse(backupManagementType, instantRPDetails, instantRpRetentionRangeInDays, protectedItemsCount, retentionPolicy, schedulePolicy, timeZone);
        }
    }
}