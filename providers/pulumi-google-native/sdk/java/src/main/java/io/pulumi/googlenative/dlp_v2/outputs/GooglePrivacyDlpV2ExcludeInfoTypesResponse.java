// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2ExcludeInfoTypesResponse {
    /**
     * InfoType list in ExclusionRule rule drops a finding when it overlaps or contained within with a finding of an infoType from this list. For example, for `InspectionRuleSet.info_types` containing "PHONE_NUMBER"`and`exclusion_rule`containing`exclude_info_types.info_types` with "EMAIL_ADDRESS" the phone number findings are dropped if they overlap with EMAIL_ADDRESS finding. That leads to "555-222-2222@example.org" to generate only a single finding, namely email address.
     * 
     */
    private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

    @OutputCustomType.Constructor({"infoTypes"})
    private GooglePrivacyDlpV2ExcludeInfoTypesResponse(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
        this.infoTypes = Objects.requireNonNull(infoTypes);
    }

    /**
     * InfoType list in ExclusionRule rule drops a finding when it overlaps or contained within with a finding of an infoType from this list. For example, for `InspectionRuleSet.info_types` containing "PHONE_NUMBER"`and`exclusion_rule`containing`exclude_info_types.info_types` with "EMAIL_ADDRESS" the phone number findings are dropped if they overlap with EMAIL_ADDRESS finding. That leads to "555-222-2222@example.org" to generate only a single finding, namely email address.
     * 
    */
    public List<GooglePrivacyDlpV2InfoTypeResponse> getInfoTypes() {
        return this.infoTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ExcludeInfoTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ExcludeInfoTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
        }

        public Builder setInfoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }
        public GooglePrivacyDlpV2ExcludeInfoTypesResponse build() {
            return new GooglePrivacyDlpV2ExcludeInfoTypesResponse(infoTypes);
        }
    }
}