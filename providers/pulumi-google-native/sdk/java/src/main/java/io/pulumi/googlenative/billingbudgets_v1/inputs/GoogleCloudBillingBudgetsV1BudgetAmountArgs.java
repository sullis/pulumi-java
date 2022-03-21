// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1LastPeriodAmountArgs;
import io.pulumi.googlenative.billingbudgets_v1.inputs.GoogleTypeMoneyArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The budgeted amount for each usage period.
 * 
 */
public final class GoogleCloudBillingBudgetsV1BudgetAmountArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1BudgetAmountArgs Empty = new GoogleCloudBillingBudgetsV1BudgetAmountArgs();

    /**
     * Use the last period's actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget's time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
     * 
     */
    @Import(name="lastPeriodAmount")
      private final @Nullable Output<GoogleCloudBillingBudgetsV1LastPeriodAmountArgs> lastPeriodAmount;

    public Output<GoogleCloudBillingBudgetsV1LastPeriodAmountArgs> getLastPeriodAmount() {
        return this.lastPeriodAmount == null ? Output.empty() : this.lastPeriodAmount;
    }

    /**
     * A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
     * 
     */
    @Import(name="specifiedAmount")
      private final @Nullable Output<GoogleTypeMoneyArgs> specifiedAmount;

    public Output<GoogleTypeMoneyArgs> getSpecifiedAmount() {
        return this.specifiedAmount == null ? Output.empty() : this.specifiedAmount;
    }

    public GoogleCloudBillingBudgetsV1BudgetAmountArgs(
        @Nullable Output<GoogleCloudBillingBudgetsV1LastPeriodAmountArgs> lastPeriodAmount,
        @Nullable Output<GoogleTypeMoneyArgs> specifiedAmount) {
        this.lastPeriodAmount = lastPeriodAmount;
        this.specifiedAmount = specifiedAmount;
    }

    private GoogleCloudBillingBudgetsV1BudgetAmountArgs() {
        this.lastPeriodAmount = Output.empty();
        this.specifiedAmount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1BudgetAmountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudBillingBudgetsV1LastPeriodAmountArgs> lastPeriodAmount;
        private @Nullable Output<GoogleTypeMoneyArgs> specifiedAmount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1BudgetAmountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastPeriodAmount = defaults.lastPeriodAmount;
    	      this.specifiedAmount = defaults.specifiedAmount;
        }

        public Builder lastPeriodAmount(@Nullable Output<GoogleCloudBillingBudgetsV1LastPeriodAmountArgs> lastPeriodAmount) {
            this.lastPeriodAmount = lastPeriodAmount;
            return this;
        }
        public Builder lastPeriodAmount(@Nullable GoogleCloudBillingBudgetsV1LastPeriodAmountArgs lastPeriodAmount) {
            this.lastPeriodAmount = Output.ofNullable(lastPeriodAmount);
            return this;
        }
        public Builder specifiedAmount(@Nullable Output<GoogleTypeMoneyArgs> specifiedAmount) {
            this.specifiedAmount = specifiedAmount;
            return this;
        }
        public Builder specifiedAmount(@Nullable GoogleTypeMoneyArgs specifiedAmount) {
            this.specifiedAmount = Output.ofNullable(specifiedAmount);
            return this;
        }        public GoogleCloudBillingBudgetsV1BudgetAmountArgs build() {
            return new GoogleCloudBillingBudgetsV1BudgetAmountArgs(lastPeriodAmount, specifiedAmount);
        }
    }
}
