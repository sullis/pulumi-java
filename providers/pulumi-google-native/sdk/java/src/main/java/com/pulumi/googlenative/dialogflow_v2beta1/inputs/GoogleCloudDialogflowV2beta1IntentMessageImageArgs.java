// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The image response message.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageImageArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageImageArgs();

    /**
     * A text description of the image to be used for accessibility, e.g., screen readers. Required if image_uri is set for CarouselSelect.
     * 
     */
    @Import(name="accessibilityText")
    private @Nullable Output<String> accessibilityText;

    /**
     * @return A text description of the image to be used for accessibility, e.g., screen readers. Required if image_uri is set for CarouselSelect.
     * 
     */
    public Optional<Output<String>> accessibilityText() {
        return Optional.ofNullable(this.accessibilityText);
    }

    /**
     * Optional. The public URI to an image file.
     * 
     */
    @Import(name="imageUri")
    private @Nullable Output<String> imageUri;

    /**
     * @return Optional. The public URI to an image file.
     * 
     */
    public Optional<Output<String>> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }

    private GoogleCloudDialogflowV2beta1IntentMessageImageArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageImageArgs(GoogleCloudDialogflowV2beta1IntentMessageImageArgs $) {
        this.accessibilityText = $.accessibilityText;
        this.imageUri = $.imageUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageImageArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageImageArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageImageArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessibilityText A text description of the image to be used for accessibility, e.g., screen readers. Required if image_uri is set for CarouselSelect.
         * 
         * @return builder
         * 
         */
        public Builder accessibilityText(@Nullable Output<String> accessibilityText) {
            $.accessibilityText = accessibilityText;
            return this;
        }

        /**
         * @param accessibilityText A text description of the image to be used for accessibility, e.g., screen readers. Required if image_uri is set for CarouselSelect.
         * 
         * @return builder
         * 
         */
        public Builder accessibilityText(String accessibilityText) {
            return accessibilityText(Output.of(accessibilityText));
        }

        /**
         * @param imageUri Optional. The public URI to an image file.
         * 
         * @return builder
         * 
         */
        public Builder imageUri(@Nullable Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        /**
         * @param imageUri Optional. The public URI to an image file.
         * 
         * @return builder
         * 
         */
        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageImageArgs build() {
            return $;
        }
    }

}
