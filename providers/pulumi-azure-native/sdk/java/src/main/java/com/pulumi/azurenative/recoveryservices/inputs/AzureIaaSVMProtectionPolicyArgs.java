// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.InstantRPAdditionalDetailsArgs;
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
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup policy.
 * 
 */
public final class AzureIaaSVMProtectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureIaaSVMProtectionPolicyArgs Empty = new AzureIaaSVMProtectionPolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is &#39;AzureIaasVM&#39;.
     * 
     */
    @Import(name="backupManagementType", required=true)
    private Output<String> backupManagementType;

    /**
     * @return This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is &#39;AzureIaasVM&#39;.
     * 
     */
    public Output<String> backupManagementType() {
        return this.backupManagementType;
    }

    @Import(name="instantRPDetails")
    private @Nullable Output<InstantRPAdditionalDetailsArgs> instantRPDetails;

    public Optional<Output<InstantRPAdditionalDetailsArgs>> instantRPDetails() {
        return Optional.ofNullable(this.instantRPDetails);
    }

    /**
     * Instant RP retention policy range in days
     * 
     */
    @Import(name="instantRpRetentionRangeInDays")
    private @Nullable Output<Integer> instantRpRetentionRangeInDays;

    /**
     * @return Instant RP retention policy range in days
     * 
     */
    public Optional<Output<Integer>> instantRpRetentionRangeInDays() {
        return Optional.ofNullable(this.instantRpRetentionRangeInDays);
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @Import(name="protectedItemsCount")
    private @Nullable Output<Integer> protectedItemsCount;

    /**
     * @return Number of items associated with this policy.
     * 
     */
    public Optional<Output<Integer>> protectedItemsCount() {
        return Optional.ofNullable(this.protectedItemsCount);
    }

    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

    /**
     * @return Retention policy with the details on backup copy retention ranges.
     * 
     */
    public Optional<Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @Import(name="schedulePolicy")
    private @Nullable Output<Object> schedulePolicy;

    /**
     * @return Backup schedule specified as part of backup policy.
     * 
     */
    public Optional<Output<Object>> schedulePolicy() {
        return Optional.ofNullable(this.schedulePolicy);
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private AzureIaaSVMProtectionPolicyArgs() {}

    private AzureIaaSVMProtectionPolicyArgs(AzureIaaSVMProtectionPolicyArgs $) {
        this.backupManagementType = $.backupManagementType;
        this.instantRPDetails = $.instantRPDetails;
        this.instantRpRetentionRangeInDays = $.instantRpRetentionRangeInDays;
        this.protectedItemsCount = $.protectedItemsCount;
        this.retentionPolicy = $.retentionPolicy;
        this.schedulePolicy = $.schedulePolicy;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureIaaSVMProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureIaaSVMProtectionPolicyArgs $;

        public Builder() {
            $ = new AzureIaaSVMProtectionPolicyArgs();
        }

        public Builder(AzureIaaSVMProtectionPolicyArgs defaults) {
            $ = new AzureIaaSVMProtectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupManagementType This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
         * Expected value is &#39;AzureIaasVM&#39;.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(Output<String> backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        /**
         * @param backupManagementType This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
         * Expected value is &#39;AzureIaasVM&#39;.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(String backupManagementType) {
            return backupManagementType(Output.of(backupManagementType));
        }

        public Builder instantRPDetails(@Nullable Output<InstantRPAdditionalDetailsArgs> instantRPDetails) {
            $.instantRPDetails = instantRPDetails;
            return this;
        }

        public Builder instantRPDetails(InstantRPAdditionalDetailsArgs instantRPDetails) {
            return instantRPDetails(Output.of(instantRPDetails));
        }

        /**
         * @param instantRpRetentionRangeInDays Instant RP retention policy range in days
         * 
         * @return builder
         * 
         */
        public Builder instantRpRetentionRangeInDays(@Nullable Output<Integer> instantRpRetentionRangeInDays) {
            $.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
            return this;
        }

        /**
         * @param instantRpRetentionRangeInDays Instant RP retention policy range in days
         * 
         * @return builder
         * 
         */
        public Builder instantRpRetentionRangeInDays(Integer instantRpRetentionRangeInDays) {
            return instantRpRetentionRangeInDays(Output.of(instantRpRetentionRangeInDays));
        }

        /**
         * @param protectedItemsCount Number of items associated with this policy.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemsCount(@Nullable Output<Integer> protectedItemsCount) {
            $.protectedItemsCount = protectedItemsCount;
            return this;
        }

        /**
         * @param protectedItemsCount Number of items associated with this policy.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemsCount(Integer protectedItemsCount) {
            return protectedItemsCount(Output.of(protectedItemsCount));
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs> retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(LongTermRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Either.ofLeft(retentionPolicy));
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(SimpleRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Either.ofRight(retentionPolicy));
        }

        /**
         * @param schedulePolicy Backup schedule specified as part of backup policy.
         * 
         * @return builder
         * 
         */
        public Builder schedulePolicy(@Nullable Output<Object> schedulePolicy) {
            $.schedulePolicy = schedulePolicy;
            return this;
        }

        /**
         * @param schedulePolicy Backup schedule specified as part of backup policy.
         * 
         * @return builder
         * 
         */
        public Builder schedulePolicy(Object schedulePolicy) {
            return schedulePolicy(Output.of(schedulePolicy));
        }

        /**
         * @param timeZone TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public AzureIaaSVMProtectionPolicyArgs build() {
            $.backupManagementType = Codegen.stringProp("backupManagementType").output().arg($.backupManagementType).require();
            return $;
        }
    }

}
