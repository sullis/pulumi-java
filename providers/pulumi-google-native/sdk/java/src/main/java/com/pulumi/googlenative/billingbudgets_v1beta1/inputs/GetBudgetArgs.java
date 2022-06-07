// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBudgetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBudgetArgs Empty = new GetBudgetArgs();

    @Import(name="billingAccountId", required=true)
    private Output<String> billingAccountId;

    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    @Import(name="budgetId", required=true)
    private Output<String> budgetId;

    public Output<String> budgetId() {
        return this.budgetId;
    }

    private GetBudgetArgs() {}

    private GetBudgetArgs(GetBudgetArgs $) {
        this.billingAccountId = $.billingAccountId;
        this.budgetId = $.budgetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBudgetArgs $;

        public Builder() {
            $ = new GetBudgetArgs();
        }

        public Builder(GetBudgetArgs defaults) {
            $ = new GetBudgetArgs(Objects.requireNonNull(defaults));
        }

        public Builder billingAccountId(Output<String> billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        public Builder billingAccountId(String billingAccountId) {
            return billingAccountId(Output.of(billingAccountId));
        }

        public Builder budgetId(Output<String> budgetId) {
            $.budgetId = budgetId;
            return this;
        }

        public Builder budgetId(String budgetId) {
            return budgetId(Output.of(budgetId));
        }

        public GetBudgetArgs build() {
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            $.budgetId = Objects.requireNonNull($.budgetId, "expected parameter 'budgetId' to be non-null");
            return $;
        }
    }

}
