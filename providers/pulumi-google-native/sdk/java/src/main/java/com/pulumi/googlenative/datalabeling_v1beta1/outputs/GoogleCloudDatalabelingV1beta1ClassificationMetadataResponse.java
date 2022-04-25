// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse {
    /**
     * @return Whether the classification task is multi-label or not.
     * 
     */
    private final Boolean isMultiLabel;

    @CustomType.Constructor
    private GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse(@CustomType.Parameter("isMultiLabel") Boolean isMultiLabel) {
        this.isMultiLabel = isMultiLabel;
    }

    /**
     * @return Whether the classification task is multi-label or not.
     * 
     */
    public Boolean isMultiLabel() {
        return this.isMultiLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isMultiLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isMultiLabel = defaults.isMultiLabel;
        }

        public Builder isMultiLabel(Boolean isMultiLabel) {
            this.isMultiLabel = Objects.requireNonNull(isMultiLabel);
            return this;
        }        public GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse build() {
            return new GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse(isMultiLabel);
        }
    }
}
