// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse {
    /**
     * @return Optional. Description of the carousel item. Maximum of four lines of text.
     * 
     */
    private final String description;
    /**
     * @return Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of text.
     * 
     */
    private final String footer;
    /**
     * @return Optional. Hero image for the carousel item.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageImageResponse image;
    /**
     * @return Action to present to the user.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse openUriAction;
    /**
     * @return Title of the carousel item. Maximum of two lines of text.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("footer") String footer,
        @CustomType.Parameter("image") GoogleCloudDialogflowV2IntentMessageImageResponse image,
        @CustomType.Parameter("openUriAction") GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse openUriAction,
        @CustomType.Parameter("title") String title) {
        this.description = description;
        this.footer = footer;
        this.image = image;
        this.openUriAction = openUriAction;
        this.title = title;
    }

    /**
     * @return Optional. Description of the carousel item. Maximum of four lines of text.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of text.
     * 
     */
    public String footer() {
        return this.footer;
    }
    /**
     * @return Optional. Hero image for the carousel item.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageImageResponse image() {
        return this.image;
    }
    /**
     * @return Action to present to the user.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse openUriAction() {
        return this.openUriAction;
    }
    /**
     * @return Title of the carousel item. Maximum of two lines of text.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String footer;
        private GoogleCloudDialogflowV2IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse openUriAction;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.footer = defaults.footer;
    	      this.image = defaults.image;
    	      this.openUriAction = defaults.openUriAction;
    	      this.title = defaults.title;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder footer(String footer) {
            this.footer = Objects.requireNonNull(footer);
            return this;
        }
        public Builder image(GoogleCloudDialogflowV2IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder openUriAction(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse openUriAction) {
            this.openUriAction = Objects.requireNonNull(openUriAction);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse(description, footer, image, openUriAction, title);
        }
    }
}
