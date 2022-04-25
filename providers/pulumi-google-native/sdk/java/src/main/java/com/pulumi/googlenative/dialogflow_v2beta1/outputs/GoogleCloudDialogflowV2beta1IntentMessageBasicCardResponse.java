// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse;
import com.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse {
    /**
     * @return Optional. The collection of card buttons.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons;
    /**
     * @return Required, unless image is present. The body text of the card.
     * 
     */
    private final String formattedText;
    /**
     * @return Optional. The image for the card.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
    /**
     * @return Optional. The subtitle of the card.
     * 
     */
    private final String subtitle;
    /**
     * @return Optional. The title of the card.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse(
        @CustomType.Parameter("buttons") List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons,
        @CustomType.Parameter("formattedText") String formattedText,
        @CustomType.Parameter("image") GoogleCloudDialogflowV2beta1IntentMessageImageResponse image,
        @CustomType.Parameter("subtitle") String subtitle,
        @CustomType.Parameter("title") String title) {
        this.buttons = buttons;
        this.formattedText = formattedText;
        this.image = image;
        this.subtitle = subtitle;
        this.title = title;
    }

    /**
     * @return Optional. The collection of card buttons.
     * 
     */
    public List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons() {
        return this.buttons;
    }
    /**
     * @return Required, unless image is present. The body text of the card.
     * 
     */
    public String formattedText() {
        return this.formattedText;
    }
    /**
     * @return Optional. The image for the card.
     * 
     */
    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse image() {
        return this.image;
    }
    /**
     * @return Optional. The subtitle of the card.
     * 
     */
    public String subtitle() {
        return this.subtitle;
    }
    /**
     * @return Optional. The title of the card.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons;
        private String formattedText;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.formattedText = defaults.formattedText;
    	      this.image = defaults.image;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder buttons(List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons) {
            this.buttons = Objects.requireNonNull(buttons);
            return this;
        }
        public Builder buttons(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse... buttons) {
            return buttons(List.of(buttons));
        }
        public Builder formattedText(String formattedText) {
            this.formattedText = Objects.requireNonNull(formattedText);
            return this;
        }
        public Builder image(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder subtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse(buttons, formattedText, image, subtitle, title);
        }
    }
}
