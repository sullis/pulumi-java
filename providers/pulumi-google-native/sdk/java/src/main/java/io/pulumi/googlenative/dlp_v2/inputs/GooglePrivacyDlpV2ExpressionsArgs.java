// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2ExpressionsLogicalOperator;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ConditionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An expression, consisting or an operator and conditions.
 * 
 */
public final class GooglePrivacyDlpV2ExpressionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2ExpressionsArgs Empty = new GooglePrivacyDlpV2ExpressionsArgs();

    /**
     * Conditions to apply to the expression.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Input<GooglePrivacyDlpV2ConditionsArgs> conditions;

    public Input<GooglePrivacyDlpV2ConditionsArgs> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * The operator to apply to the result of conditions. Default and currently only supported value is `AND`.
     * 
     */
    @InputImport(name="logicalOperator")
      private final @Nullable Input<GooglePrivacyDlpV2ExpressionsLogicalOperator> logicalOperator;

    public Input<GooglePrivacyDlpV2ExpressionsLogicalOperator> getLogicalOperator() {
        return this.logicalOperator == null ? Input.empty() : this.logicalOperator;
    }

    public GooglePrivacyDlpV2ExpressionsArgs(
        @Nullable Input<GooglePrivacyDlpV2ConditionsArgs> conditions,
        @Nullable Input<GooglePrivacyDlpV2ExpressionsLogicalOperator> logicalOperator) {
        this.conditions = conditions;
        this.logicalOperator = logicalOperator;
    }

    private GooglePrivacyDlpV2ExpressionsArgs() {
        this.conditions = Input.empty();
        this.logicalOperator = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ExpressionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2ConditionsArgs> conditions;
        private @Nullable Input<GooglePrivacyDlpV2ExpressionsLogicalOperator> logicalOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ExpressionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.logicalOperator = defaults.logicalOperator;
        }

        public Builder setConditions(@Nullable Input<GooglePrivacyDlpV2ConditionsArgs> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable GooglePrivacyDlpV2ConditionsArgs conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setLogicalOperator(@Nullable Input<GooglePrivacyDlpV2ExpressionsLogicalOperator> logicalOperator) {
            this.logicalOperator = logicalOperator;
            return this;
        }

        public Builder setLogicalOperator(@Nullable GooglePrivacyDlpV2ExpressionsLogicalOperator logicalOperator) {
            this.logicalOperator = Input.ofNullable(logicalOperator);
            return this;
        }
        public GooglePrivacyDlpV2ExpressionsArgs build() {
            return new GooglePrivacyDlpV2ExpressionsArgs(conditions, logicalOperator);
        }
    }
}