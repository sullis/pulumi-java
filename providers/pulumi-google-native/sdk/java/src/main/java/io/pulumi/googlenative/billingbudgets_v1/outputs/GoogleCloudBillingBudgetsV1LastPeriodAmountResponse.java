// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudBillingBudgetsV1LastPeriodAmountResponse {
    @OutputCustomType.Constructor({})
    private GoogleCloudBillingBudgetsV1LastPeriodAmountResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1LastPeriodAmountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1LastPeriodAmountResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GoogleCloudBillingBudgetsV1LastPeriodAmountResponse build() {
            return new GoogleCloudBillingBudgetsV1LastPeriodAmountResponse();
        }
    }
}