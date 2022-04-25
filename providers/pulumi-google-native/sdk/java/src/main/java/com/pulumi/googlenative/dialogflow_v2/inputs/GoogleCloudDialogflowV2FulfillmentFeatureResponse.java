// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Whether fulfillment is enabled for the specific feature.
 * 
 */
public final class GoogleCloudDialogflowV2FulfillmentFeatureResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2FulfillmentFeatureResponse Empty = new GoogleCloudDialogflowV2FulfillmentFeatureResponse();

    /**
     * The type of the feature that enabled for fulfillment.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of the feature that enabled for fulfillment.
     * 
     */
    public String type() {
        return this.type;
    }

    private GoogleCloudDialogflowV2FulfillmentFeatureResponse() {}

    private GoogleCloudDialogflowV2FulfillmentFeatureResponse(GoogleCloudDialogflowV2FulfillmentFeatureResponse $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2FulfillmentFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2FulfillmentFeatureResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2FulfillmentFeatureResponse();
        }

        public Builder(GoogleCloudDialogflowV2FulfillmentFeatureResponse defaults) {
            $ = new GoogleCloudDialogflowV2FulfillmentFeatureResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of the feature that enabled for fulfillment.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GoogleCloudDialogflowV2FulfillmentFeatureResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
