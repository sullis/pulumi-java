// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.aws.ssm.outputs.PatchBaselineApprovalRulePatchFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PatchBaselineApprovalRule {
    /**
     * @return The number of days after the release date of each patch matched by the rule the patch is marked as approved in the patch baseline. Valid Range: 0 to 100. Conflicts with `approve_until_date`
     * 
     */
    private final @Nullable Integer approveAfterDays;
    /**
     * @return The cutoff date for auto approval of released patches. Any patches released on or before this date are installed automatically. Date is formatted as `YYYY-MM-DD`. Conflicts with `approve_after_days`
     * 
     */
    private final @Nullable String approveUntilDate;
    /**
     * @return Defines the compliance level for patches approved by this rule. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    private final @Nullable String complianceLevel;
    /**
     * @return Boolean enabling the application of non-security updates. The default value is &#39;false&#39;. Valid for Linux instances only.
     * 
     */
    private final @Nullable Boolean enableNonSecurity;
    /**
     * @return The patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid Keys are `PATCH_SET | PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`. Valid combinations of these Keys and the `operating_system` value can be found in the [SSM DescribePatchProperties API Reference](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html). Valid Values are exact values for the patch property given as the key, or a wildcard `*`, which matches all values.
     * 
     */
    private final List<PatchBaselineApprovalRulePatchFilter> patchFilters;

    @CustomType.Constructor
    private PatchBaselineApprovalRule(
        @CustomType.Parameter("approveAfterDays") @Nullable Integer approveAfterDays,
        @CustomType.Parameter("approveUntilDate") @Nullable String approveUntilDate,
        @CustomType.Parameter("complianceLevel") @Nullable String complianceLevel,
        @CustomType.Parameter("enableNonSecurity") @Nullable Boolean enableNonSecurity,
        @CustomType.Parameter("patchFilters") List<PatchBaselineApprovalRulePatchFilter> patchFilters) {
        this.approveAfterDays = approveAfterDays;
        this.approveUntilDate = approveUntilDate;
        this.complianceLevel = complianceLevel;
        this.enableNonSecurity = enableNonSecurity;
        this.patchFilters = patchFilters;
    }

    /**
     * @return The number of days after the release date of each patch matched by the rule the patch is marked as approved in the patch baseline. Valid Range: 0 to 100. Conflicts with `approve_until_date`
     * 
     */
    public Optional<Integer> approveAfterDays() {
        return Optional.ofNullable(this.approveAfterDays);
    }
    /**
     * @return The cutoff date for auto approval of released patches. Any patches released on or before this date are installed automatically. Date is formatted as `YYYY-MM-DD`. Conflicts with `approve_after_days`
     * 
     */
    public Optional<String> approveUntilDate() {
        return Optional.ofNullable(this.approveUntilDate);
    }
    /**
     * @return Defines the compliance level for patches approved by this rule. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    public Optional<String> complianceLevel() {
        return Optional.ofNullable(this.complianceLevel);
    }
    /**
     * @return Boolean enabling the application of non-security updates. The default value is &#39;false&#39;. Valid for Linux instances only.
     * 
     */
    public Optional<Boolean> enableNonSecurity() {
        return Optional.ofNullable(this.enableNonSecurity);
    }
    /**
     * @return The patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid Keys are `PATCH_SET | PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`. Valid combinations of these Keys and the `operating_system` value can be found in the [SSM DescribePatchProperties API Reference](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html). Valid Values are exact values for the patch property given as the key, or a wildcard `*`, which matches all values.
     * 
     */
    public List<PatchBaselineApprovalRulePatchFilter> patchFilters() {
        return this.patchFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchBaselineApprovalRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer approveAfterDays;
        private @Nullable String approveUntilDate;
        private @Nullable String complianceLevel;
        private @Nullable Boolean enableNonSecurity;
        private List<PatchBaselineApprovalRulePatchFilter> patchFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchBaselineApprovalRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approveAfterDays = defaults.approveAfterDays;
    	      this.approveUntilDate = defaults.approveUntilDate;
    	      this.complianceLevel = defaults.complianceLevel;
    	      this.enableNonSecurity = defaults.enableNonSecurity;
    	      this.patchFilters = defaults.patchFilters;
        }

        public Builder approveAfterDays(@Nullable Integer approveAfterDays) {
            this.approveAfterDays = approveAfterDays;
            return this;
        }
        public Builder approveUntilDate(@Nullable String approveUntilDate) {
            this.approveUntilDate = approveUntilDate;
            return this;
        }
        public Builder complianceLevel(@Nullable String complianceLevel) {
            this.complianceLevel = complianceLevel;
            return this;
        }
        public Builder enableNonSecurity(@Nullable Boolean enableNonSecurity) {
            this.enableNonSecurity = enableNonSecurity;
            return this;
        }
        public Builder patchFilters(List<PatchBaselineApprovalRulePatchFilter> patchFilters) {
            this.patchFilters = Objects.requireNonNull(patchFilters);
            return this;
        }
        public Builder patchFilters(PatchBaselineApprovalRulePatchFilter... patchFilters) {
            return patchFilters(List.of(patchFilters));
        }        public PatchBaselineApprovalRule build() {
            return new PatchBaselineApprovalRule(approveAfterDays, approveUntilDate, complianceLevel, enableNonSecurity, patchFilters);
        }
    }
}
