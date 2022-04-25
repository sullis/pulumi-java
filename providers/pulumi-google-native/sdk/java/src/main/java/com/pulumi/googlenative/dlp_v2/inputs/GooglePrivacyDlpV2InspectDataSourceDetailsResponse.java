// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RequestedOptionsResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ResultResponse;
import java.util.Objects;


/**
 * The results of an inspect DataSource job.
 * 
 */
public final class GooglePrivacyDlpV2InspectDataSourceDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectDataSourceDetailsResponse Empty = new GooglePrivacyDlpV2InspectDataSourceDetailsResponse();

    /**
     * The configuration used for this job.
     * 
     */
    @Import(name="requestedOptions", required=true)
    private GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions;

    /**
     * @return The configuration used for this job.
     * 
     */
    public GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions() {
        return this.requestedOptions;
    }

    /**
     * A summary of the outcome of this inspection job.
     * 
     */
    @Import(name="result", required=true)
    private GooglePrivacyDlpV2ResultResponse result;

    /**
     * @return A summary of the outcome of this inspection job.
     * 
     */
    public GooglePrivacyDlpV2ResultResponse result() {
        return this.result;
    }

    private GooglePrivacyDlpV2InspectDataSourceDetailsResponse() {}

    private GooglePrivacyDlpV2InspectDataSourceDetailsResponse(GooglePrivacyDlpV2InspectDataSourceDetailsResponse $) {
        this.requestedOptions = $.requestedOptions;
        this.result = $.result;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2InspectDataSourceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InspectDataSourceDetailsResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2InspectDataSourceDetailsResponse();
        }

        public Builder(GooglePrivacyDlpV2InspectDataSourceDetailsResponse defaults) {
            $ = new GooglePrivacyDlpV2InspectDataSourceDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param requestedOptions The configuration used for this job.
         * 
         * @return builder
         * 
         */
        public Builder requestedOptions(GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions) {
            $.requestedOptions = requestedOptions;
            return this;
        }

        /**
         * @param result A summary of the outcome of this inspection job.
         * 
         * @return builder
         * 
         */
        public Builder result(GooglePrivacyDlpV2ResultResponse result) {
            $.result = result;
            return this;
        }

        public GooglePrivacyDlpV2InspectDataSourceDetailsResponse build() {
            $.requestedOptions = Objects.requireNonNull($.requestedOptions, "expected parameter 'requestedOptions' to be non-null");
            $.result = Objects.requireNonNull($.result, "expected parameter 'result' to be non-null");
            return $;
        }
    }

}
