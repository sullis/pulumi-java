// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageSuggestionResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageSuggestionsResponse {
    /**
     * @return The list of suggested replies.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageSuggestionsResponse(@CustomType.Parameter("suggestions") List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions) {
        this.suggestions = suggestions;
    }

    /**
     * @return The list of suggested replies.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions() {
        return this.suggestions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSuggestionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSuggestionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.suggestions = defaults.suggestions;
        }

        public Builder suggestions(List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }
        public Builder suggestions(GoogleCloudDialogflowV2IntentMessageSuggestionResponse... suggestions) {
            return suggestions(List.of(suggestions));
        }        public GoogleCloudDialogflowV2IntentMessageSuggestionsResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageSuggestionsResponse(suggestions);
        }
    }
}
