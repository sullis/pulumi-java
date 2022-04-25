// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Max findings configuration per infoType, per content item or long running DlpJob.
 * 
 */
public final class GooglePrivacyDlpV2InfoTypeLimitResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InfoTypeLimitResponse Empty = new GooglePrivacyDlpV2InfoTypeLimitResponse();

    /**
     * Type of information the findings limit applies to. Only one limit per info_type should be provided. If InfoTypeLimit does not have an info_type, the DLP API applies the limit against all info_types that are found but not specified in another InfoTypeLimit.
     * 
     */
    @Import(name="infoType", required=true)
    private GooglePrivacyDlpV2InfoTypeResponse infoType;

    /**
     * @return Type of information the findings limit applies to. Only one limit per info_type should be provided. If InfoTypeLimit does not have an info_type, the DLP API applies the limit against all info_types that are found but not specified in another InfoTypeLimit.
     * 
     */
    public GooglePrivacyDlpV2InfoTypeResponse infoType() {
        return this.infoType;
    }

    /**
     * Max findings limit for the given infoType.
     * 
     */
    @Import(name="maxFindings", required=true)
    private Integer maxFindings;

    /**
     * @return Max findings limit for the given infoType.
     * 
     */
    public Integer maxFindings() {
        return this.maxFindings;
    }

    private GooglePrivacyDlpV2InfoTypeLimitResponse() {}

    private GooglePrivacyDlpV2InfoTypeLimitResponse(GooglePrivacyDlpV2InfoTypeLimitResponse $) {
        this.infoType = $.infoType;
        this.maxFindings = $.maxFindings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2InfoTypeLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InfoTypeLimitResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2InfoTypeLimitResponse();
        }

        public Builder(GooglePrivacyDlpV2InfoTypeLimitResponse defaults) {
            $ = new GooglePrivacyDlpV2InfoTypeLimitResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param infoType Type of information the findings limit applies to. Only one limit per info_type should be provided. If InfoTypeLimit does not have an info_type, the DLP API applies the limit against all info_types that are found but not specified in another InfoTypeLimit.
         * 
         * @return builder
         * 
         */
        public Builder infoType(GooglePrivacyDlpV2InfoTypeResponse infoType) {
            $.infoType = infoType;
            return this;
        }

        /**
         * @param maxFindings Max findings limit for the given infoType.
         * 
         * @return builder
         * 
         */
        public Builder maxFindings(Integer maxFindings) {
            $.maxFindings = maxFindings;
            return this;
        }

        public GooglePrivacyDlpV2InfoTypeLimitResponse build() {
            $.infoType = Objects.requireNonNull($.infoType, "expected parameter 'infoType' to be non-null");
            $.maxFindings = Objects.requireNonNull($.maxFindings, "expected parameter 'maxFindings' to be non-null");
            return $;
        }
    }

}
