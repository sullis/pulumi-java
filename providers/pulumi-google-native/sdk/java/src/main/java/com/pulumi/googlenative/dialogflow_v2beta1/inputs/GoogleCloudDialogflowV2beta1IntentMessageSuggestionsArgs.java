// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs;
import java.util.List;
import java.util.Objects;


/**
 * The collection of suggestions.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs();

    /**
     * The list of suggested replies.
     * 
     */
    @Import(name="suggestions", required=true)
    private Output<List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs>> suggestions;

    /**
     * @return The list of suggested replies.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs>> suggestions() {
        return this.suggestions;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs $) {
        this.suggestions = $.suggestions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param suggestions The list of suggested replies.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(Output<List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs>> suggestions) {
            $.suggestions = suggestions;
            return this;
        }

        /**
         * @param suggestions The list of suggested replies.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs> suggestions) {
            return suggestions(Output.of(suggestions));
        }

        /**
         * @param suggestions The list of suggested replies.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs... suggestions) {
            return suggestions(List.of(suggestions));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs build() {
            $.suggestions = Objects.requireNonNull($.suggestions, "expected parameter 'suggestions' to be non-null");
            return $;
        }
    }

}
