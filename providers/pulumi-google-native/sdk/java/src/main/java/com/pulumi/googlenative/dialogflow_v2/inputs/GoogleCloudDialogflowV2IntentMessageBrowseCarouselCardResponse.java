// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Browse Carousel Card for Actions on Google. https://developers.google.com/actions/assistant/responses#browsing_carousel
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse Empty = new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse();

    /**
     * Optional. Settings for displaying the image. Applies to every image in items.
     * 
     */
    @Import(name="imageDisplayOptions", required=true)
    private String imageDisplayOptions;

    /**
     * @return Optional. Settings for displaying the image. Applies to every image in items.
     * 
     */
    public String imageDisplayOptions() {
        return this.imageDisplayOptions;
    }

    /**
     * List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
     * 
     */
    @Import(name="items", required=true)
    private List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items;

    /**
     * @return List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items() {
        return this.items;
    }

    private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse() {}

    private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse $) {
        this.imageDisplayOptions = $.imageDisplayOptions;
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageDisplayOptions Optional. Settings for displaying the image. Applies to every image in items.
         * 
         * @return builder
         * 
         */
        public Builder imageDisplayOptions(String imageDisplayOptions) {
            $.imageDisplayOptions = imageDisplayOptions;
            return this;
        }

        /**
         * @param items List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
         * 
         * @return builder
         * 
         */
        public Builder items(List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
         * 
         * @return builder
         * 
         */
        public Builder items(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse... items) {
            return items(List.of(items));
        }

        public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse build() {
            $.imageDisplayOptions = Objects.requireNonNull($.imageDisplayOptions, "expected parameter 'imageDisplayOptions' to be non-null");
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
