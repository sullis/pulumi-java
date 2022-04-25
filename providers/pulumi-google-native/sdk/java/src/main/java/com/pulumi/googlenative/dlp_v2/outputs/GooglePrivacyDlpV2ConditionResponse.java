// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ValueResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ConditionResponse {
    /**
     * @return Field within the record this condition is evaluated against.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse field;
    /**
     * @return Operator used to compare the field or infoType to the value.
     * 
     */
    private final String operator;
    /**
     * @return Value to compare against. [Mandatory, except for `EXISTS` tests.]
     * 
     */
    private final GooglePrivacyDlpV2ValueResponse value;

    @CustomType.Constructor
    private GooglePrivacyDlpV2ConditionResponse(
        @CustomType.Parameter("field") GooglePrivacyDlpV2FieldIdResponse field,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("value") GooglePrivacyDlpV2ValueResponse value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    /**
     * @return Field within the record this condition is evaluated against.
     * 
     */
    public GooglePrivacyDlpV2FieldIdResponse field() {
        return this.field;
    }
    /**
     * @return Operator used to compare the field or infoType to the value.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Value to compare against. [Mandatory, except for `EXISTS` tests.]
     * 
     */
    public GooglePrivacyDlpV2ValueResponse value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldIdResponse field;
        private String operator;
        private GooglePrivacyDlpV2ValueResponse value;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder field(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder value(GooglePrivacyDlpV2ValueResponse value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GooglePrivacyDlpV2ConditionResponse build() {
            return new GooglePrivacyDlpV2ConditionResponse(field, operator, value);
        }
    }
}
