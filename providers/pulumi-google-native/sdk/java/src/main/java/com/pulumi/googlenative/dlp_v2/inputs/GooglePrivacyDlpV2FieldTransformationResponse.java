// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeTransformationsResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2PrimitiveTransformationResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RecordConditionResponse;
import java.util.List;
import java.util.Objects;


/**
 * The transformation to apply to the field.
 * 
 */
public final class GooglePrivacyDlpV2FieldTransformationResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2FieldTransformationResponse Empty = new GooglePrivacyDlpV2FieldTransformationResponse();

    /**
     * Only apply the transformation if the condition evaluates to true for the given `RecordCondition`. The conditions are allowed to reference fields that are not used in the actual transformation. Example Use Cases: - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range. - Redact a field if the date of birth field is greater than 85.
     * 
     */
    @Import(name="condition", required=true)
    private GooglePrivacyDlpV2RecordConditionResponse condition;

    /**
     * @return Only apply the transformation if the condition evaluates to true for the given `RecordCondition`. The conditions are allowed to reference fields that are not used in the actual transformation. Example Use Cases: - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range. - Redact a field if the date of birth field is greater than 85.
     * 
     */
    public GooglePrivacyDlpV2RecordConditionResponse condition() {
        return this.condition;
    }

    /**
     * Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId. FieldId name matching ignores the index. For example, instead of &#34;contact.nums[0].type&#34;, use &#34;contact.nums.type&#34;.
     * 
     */
    @Import(name="fields", required=true)
    private List<GooglePrivacyDlpV2FieldIdResponse> fields;

    /**
     * @return Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId. FieldId name matching ignores the index. For example, instead of &#34;contact.nums[0].type&#34;, use &#34;contact.nums.type&#34;.
     * 
     */
    public List<GooglePrivacyDlpV2FieldIdResponse> fields() {
        return this.fields;
    }

    /**
     * Treat the contents of the field as free text, and selectively transform content that matches an `InfoType`.
     * 
     */
    @Import(name="infoTypeTransformations", required=true)
    private GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations;

    /**
     * @return Treat the contents of the field as free text, and selectively transform content that matches an `InfoType`.
     * 
     */
    public GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations() {
        return this.infoTypeTransformations;
    }

    /**
     * Apply the transformation to the entire field.
     * 
     */
    @Import(name="primitiveTransformation", required=true)
    private GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation;

    /**
     * @return Apply the transformation to the entire field.
     * 
     */
    public GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation() {
        return this.primitiveTransformation;
    }

    private GooglePrivacyDlpV2FieldTransformationResponse() {}

    private GooglePrivacyDlpV2FieldTransformationResponse(GooglePrivacyDlpV2FieldTransformationResponse $) {
        this.condition = $.condition;
        this.fields = $.fields;
        this.infoTypeTransformations = $.infoTypeTransformations;
        this.primitiveTransformation = $.primitiveTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2FieldTransformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldTransformationResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2FieldTransformationResponse();
        }

        public Builder(GooglePrivacyDlpV2FieldTransformationResponse defaults) {
            $ = new GooglePrivacyDlpV2FieldTransformationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition Only apply the transformation if the condition evaluates to true for the given `RecordCondition`. The conditions are allowed to reference fields that are not used in the actual transformation. Example Use Cases: - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range. - Redact a field if the date of birth field is greater than 85.
         * 
         * @return builder
         * 
         */
        public Builder condition(GooglePrivacyDlpV2RecordConditionResponse condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param fields Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId. FieldId name matching ignores the index. For example, instead of &#34;contact.nums[0].type&#34;, use &#34;contact.nums.type&#34;.
         * 
         * @return builder
         * 
         */
        public Builder fields(List<GooglePrivacyDlpV2FieldIdResponse> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId. FieldId name matching ignores the index. For example, instead of &#34;contact.nums[0].type&#34;, use &#34;contact.nums.type&#34;.
         * 
         * @return builder
         * 
         */
        public Builder fields(GooglePrivacyDlpV2FieldIdResponse... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param infoTypeTransformations Treat the contents of the field as free text, and selectively transform content that matches an `InfoType`.
         * 
         * @return builder
         * 
         */
        public Builder infoTypeTransformations(GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations) {
            $.infoTypeTransformations = infoTypeTransformations;
            return this;
        }

        /**
         * @param primitiveTransformation Apply the transformation to the entire field.
         * 
         * @return builder
         * 
         */
        public Builder primitiveTransformation(GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation) {
            $.primitiveTransformation = primitiveTransformation;
            return this;
        }

        public GooglePrivacyDlpV2FieldTransformationResponse build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.fields = Objects.requireNonNull($.fields, "expected parameter 'fields' to be non-null");
            $.infoTypeTransformations = Objects.requireNonNull($.infoTypeTransformations, "expected parameter 'infoTypeTransformations' to be non-null");
            $.primitiveTransformation = Objects.requireNonNull($.primitiveTransformation, "expected parameter 'primitiveTransformation' to be non-null");
            return $;
        }
    }

}
