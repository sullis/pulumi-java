// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyResponse;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyResponse;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyResponse;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyResponse;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Mab container-specific backup policy.
 * 
 */
public final class MabProtectionPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final MabProtectionPolicyResponse Empty = new MabProtectionPolicyResponse();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'MAB'.
     * 
     */
    @Import(name="backupManagementType", required=true)
      private final String backupManagementType;

    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @Import(name="protectedItemsCount")
      private final @Nullable Integer protectedItemsCount;

    public Optional<Integer> protectedItemsCount() {
        return this.protectedItemsCount == null ? Optional.empty() : Optional.ofNullable(this.protectedItemsCount);
    }

    /**
     * Retention policy details.
     * 
     */
    @Import(name="retentionPolicy")
      private final @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;

    public Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy() {
        return this.retentionPolicy == null ? null : this.retentionPolicy;
    }

    /**
     * Backup schedule of backup policy.
     * 
     */
    @Import(name="schedulePolicy")
      private final @Nullable Object schedulePolicy;

    public Object schedulePolicy() {
        return this.schedulePolicy == null ? null : this.schedulePolicy;
    }

    public MabProtectionPolicyResponse(
        String backupManagementType,
        @Nullable Integer protectedItemsCount,
        @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy,
        @Nullable Object schedulePolicy) {
        this.backupManagementType = Codegen.stringProp("backupManagementType").arg(backupManagementType).require();
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
    }

    private MabProtectionPolicyResponse() {
        this.backupManagementType = null;
        this.protectedItemsCount = null;
        this.retentionPolicy = null;
        this.schedulePolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable Integer protectedItemsCount;
        private @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;
        private @Nullable Object schedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(MabProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }
        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }
        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder schedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }        public MabProtectionPolicyResponse build() {
            return new MabProtectionPolicyResponse(backupManagementType, protectedItemsCount, retentionPolicy, schedulePolicy);
        }
    }
}
