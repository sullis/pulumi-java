// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional info about the select item for when it is triggered in a dialog.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs();

    /**
     * A unique key that will be sent back to the agent if this response is given.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Optional. A list of synonyms that can also be used to trigger this item in dialog.
     * 
     */
    @InputImport(name="synonyms")
      private final @Nullable Input<List<String>> synonyms;

    public Input<List<String>> getSynonyms() {
        return this.synonyms == null ? Input.empty() : this.synonyms;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs(
        Input<String> key,
        @Nullable Input<List<String>> synonyms) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.synonyms = synonyms;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs() {
        this.key = Input.empty();
        this.synonyms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private @Nullable Input<List<String>> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setSynonyms(@Nullable Input<List<String>> synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        public Builder setSynonyms(@Nullable List<String> synonyms) {
            this.synonyms = Input.ofNullable(synonyms);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs(key, synonyms);
        }
    }
}