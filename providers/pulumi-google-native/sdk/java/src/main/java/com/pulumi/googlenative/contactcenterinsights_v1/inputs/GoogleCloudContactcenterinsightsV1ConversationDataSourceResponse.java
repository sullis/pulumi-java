// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1DialogflowSourceResponse;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1GcsSourceResponse;
import java.util.Objects;


/**
 * The conversation source, which is a combination of transcript and audio.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse Empty = new GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse();

    /**
     * The source when the conversation comes from Dialogflow.
     * 
     */
    @Import(name="dialogflowSource", required=true)
    private GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource;

    /**
     * @return The source when the conversation comes from Dialogflow.
     * 
     */
    public GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource() {
        return this.dialogflowSource;
    }

    /**
     * A Cloud Storage location specification for the audio and transcript.
     * 
     */
    @Import(name="gcsSource", required=true)
    private GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource;

    /**
     * @return A Cloud Storage location specification for the audio and transcript.
     * 
     */
    public GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource() {
        return this.gcsSource;
    }

    private GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse() {}

    private GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse(GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse $) {
        this.dialogflowSource = $.dialogflowSource;
        this.gcsSource = $.gcsSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dialogflowSource The source when the conversation comes from Dialogflow.
         * 
         * @return builder
         * 
         */
        public Builder dialogflowSource(GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource) {
            $.dialogflowSource = dialogflowSource;
            return this;
        }

        /**
         * @param gcsSource A Cloud Storage location specification for the audio and transcript.
         * 
         * @return builder
         * 
         */
        public Builder gcsSource(GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource) {
            $.gcsSource = gcsSource;
            return this;
        }

        public GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse build() {
            $.dialogflowSource = Objects.requireNonNull($.dialogflowSource, "expected parameter 'dialogflowSource' to be non-null");
            $.gcsSource = Objects.requireNonNull($.gcsSource, "expected parameter 'gcsSource' to be non-null");
            return $;
        }
    }

}
