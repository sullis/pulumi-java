// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The basic card message. Useful for displaying information.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse();

    /**
     * Optional. The collection of card buttons.
     * 
     */
    @Import(name="buttons", required=true)
      private final List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons;

    public List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> getButtons() {
        return this.buttons;
    }

    /**
     * Required, unless image is present. The body text of the card.
     * 
     */
    @Import(name="formattedText", required=true)
      private final String formattedText;

    public String getFormattedText() {
        return this.formattedText;
    }

    /**
     * Optional. The image for the card.
     * 
     */
    @Import(name="image", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;

    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse getImage() {
        return this.image;
    }

    /**
     * Optional. The subtitle of the card.
     * 
     */
    @Import(name="subtitle", required=true)
      private final String subtitle;

    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * Optional. The title of the card.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse(
        List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons,
        String formattedText,
        GoogleCloudDialogflowV2beta1IntentMessageImageResponse image,
        String subtitle,
        String title) {
        this.buttons = Objects.requireNonNull(buttons, "expected parameter 'buttons' to be non-null");
        this.formattedText = Objects.requireNonNull(formattedText, "expected parameter 'formattedText' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.subtitle = Objects.requireNonNull(subtitle, "expected parameter 'subtitle' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse() {
        this.buttons = List.of();
        this.formattedText = null;
        this.image = null;
        this.subtitle = null;
        this.title = null;
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
