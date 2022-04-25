// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The card for presenting a list of options to select from.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs();

    /**
     * List items.
     * 
     */
    @Import(name="items", required=true)
    private Output<List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs>> items;

    /**
     * @return List items.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs>> items() {
        return this.items;
    }

    /**
     * Optional. Subtitle of the list.
     * 
     */
    @Import(name="subtitle")
    private @Nullable Output<String> subtitle;

    /**
     * @return Optional. Subtitle of the list.
     * 
     */
    public Optional<Output<String>> subtitle() {
        return Optional.ofNullable(this.subtitle);
    }

    /**
     * Optional. The overall title of the list.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Optional. The overall title of the list.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs(GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs $) {
        this.items = $.items;
        this.subtitle = $.subtitle;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items List items.
         * 
         * @return builder
         * 
         */
        public Builder items(Output<List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items List items.
         * 
         * @return builder
         * 
         */
        public Builder items(List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items List items.
         * 
         * @return builder
         * 
         */
        public Builder items(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs... items) {
            return items(List.of(items));
        }

        /**
         * @param subtitle Optional. Subtitle of the list.
         * 
         * @return builder
         * 
         */
        public Builder subtitle(@Nullable Output<String> subtitle) {
            $.subtitle = subtitle;
            return this;
        }

        /**
         * @param subtitle Optional. Subtitle of the list.
         * 
         * @return builder
         * 
         */
        public Builder subtitle(String subtitle) {
            return subtitle(Output.of(subtitle));
        }

        /**
         * @param title Optional. The overall title of the list.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Optional. The overall title of the list.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
