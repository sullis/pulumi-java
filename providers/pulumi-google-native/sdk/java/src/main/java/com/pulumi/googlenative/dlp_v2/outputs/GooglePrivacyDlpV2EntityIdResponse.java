// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2EntityIdResponse {
    /**
     * @return Composite key indicating which field contains the entity identifier.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse field;

    @CustomType.Constructor
    private GooglePrivacyDlpV2EntityIdResponse(@CustomType.Parameter("field") GooglePrivacyDlpV2FieldIdResponse field) {
        this.field = field;
    }

    /**
     * @return Composite key indicating which field contains the entity identifier.
     * 
     */
    public GooglePrivacyDlpV2FieldIdResponse field() {
        return this.field;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2EntityIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldIdResponse field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2EntityIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
        }

        public Builder field(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }        public GooglePrivacyDlpV2EntityIdResponse build() {
            return new GooglePrivacyDlpV2EntityIdResponse(field);
        }
    }
}
