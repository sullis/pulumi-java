// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Dialogflow interaction data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse Empty = new GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse();

    /**
     * The confidence of the match ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    @Import(name="confidence", required=true)
    private Double confidence;

    /**
     * @return The confidence of the match ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    public Double confidence() {
        return this.confidence;
    }

    /**
     * The Dialogflow intent resource path. Format: projects/{project}/agent/{agent}/intents/{intent}
     * 
     */
    @Import(name="dialogflowIntentId", required=true)
    private String dialogflowIntentId;

    /**
     * @return The Dialogflow intent resource path. Format: projects/{project}/agent/{agent}/intents/{intent}
     * 
     */
    public String dialogflowIntentId() {
        return this.dialogflowIntentId;
    }

    private GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse() {}

    private GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse(GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse $) {
        this.confidence = $.confidence;
        this.dialogflowIntentId = $.dialogflowIntentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param confidence The confidence of the match ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
         * 
         * @return builder
         * 
         */
        public Builder confidence(Double confidence) {
            $.confidence = confidence;
            return this;
        }

        /**
         * @param dialogflowIntentId The Dialogflow intent resource path. Format: projects/{project}/agent/{agent}/intents/{intent}
         * 
         * @return builder
         * 
         */
        public Builder dialogflowIntentId(String dialogflowIntentId) {
            $.dialogflowIntentId = dialogflowIntentId;
            return this;
        }

        public GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse build() {
            $.confidence = Objects.requireNonNull($.confidence, "expected parameter 'confidence' to be non-null");
            $.dialogflowIntentId = Objects.requireNonNull($.dialogflowIntentId, "expected parameter 'dialogflowIntentId' to be non-null");
            return $;
        }
    }

}
