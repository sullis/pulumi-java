// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Max findings configuration per infoType, per content item or long running DlpJob.
 * 
 */
public final class GooglePrivacyDlpV2InfoTypeLimitResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InfoTypeLimitResponse Empty = new GooglePrivacyDlpV2InfoTypeLimitResponse();

    /**
     * Type of information the findings limit applies to. Only one limit per info_type should be provided. If InfoTypeLimit does not have an info_type, the DLP API applies the limit against all info_types that are found but not specified in another InfoTypeLimit.
     * 
     */
    @InputImport(name="infoType", required=true)
      private final GooglePrivacyDlpV2InfoTypeResponse infoType;

    public GooglePrivacyDlpV2InfoTypeResponse getInfoType() {
        return this.infoType;
    }

    /**
     * Max findings limit for the given infoType.
     * 
     */
    @InputImport(name="maxFindings", required=true)
      private final Integer maxFindings;

    public Integer getMaxFindings() {
        return this.maxFindings;
    }

    public GooglePrivacyDlpV2InfoTypeLimitResponse(
        GooglePrivacyDlpV2InfoTypeResponse infoType,
        Integer maxFindings) {
        this.infoType = Objects.requireNonNull(infoType, "expected parameter 'infoType' to be non-null");
        this.maxFindings = Objects.requireNonNull(maxFindings, "expected parameter 'maxFindings' to be non-null");
    }

    private GooglePrivacyDlpV2InfoTypeLimitResponse() {
        this.infoType = null;
        this.maxFindings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InfoTypeLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InfoTypeResponse infoType;
        private Integer maxFindings;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InfoTypeLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoType = defaults.infoType;
    	      this.maxFindings = defaults.maxFindings;
        }

        public Builder setInfoType(GooglePrivacyDlpV2InfoTypeResponse infoType) {
            this.infoType = Objects.requireNonNull(infoType);
            return this;
        }

        public Builder setMaxFindings(Integer maxFindings) {
            this.maxFindings = Objects.requireNonNull(maxFindings);
            return this;
        }
        public GooglePrivacyDlpV2InfoTypeLimitResponse build() {
            return new GooglePrivacyDlpV2InfoTypeLimitResponse(infoType, maxFindings);
        }
    }
}