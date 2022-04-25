// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RecordConditionResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2RecordSuppressionResponse {
    /**
     * @return A condition that when it evaluates to true will result in the record being evaluated to be suppressed from the transformed content.
     * 
     */
    private final GooglePrivacyDlpV2RecordConditionResponse condition;

    @CustomType.Constructor
    private GooglePrivacyDlpV2RecordSuppressionResponse(@CustomType.Parameter("condition") GooglePrivacyDlpV2RecordConditionResponse condition) {
        this.condition = condition;
    }

    /**
     * @return A condition that when it evaluates to true will result in the record being evaluated to be suppressed from the transformed content.
     * 
     */
    public GooglePrivacyDlpV2RecordConditionResponse condition() {
        return this.condition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RecordSuppressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RecordConditionResponse condition;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RecordSuppressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
        }

        public Builder condition(GooglePrivacyDlpV2RecordConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }        public GooglePrivacyDlpV2RecordSuppressionResponse build() {
            return new GooglePrivacyDlpV2RecordSuppressionResponse(condition);
        }
    }
}
