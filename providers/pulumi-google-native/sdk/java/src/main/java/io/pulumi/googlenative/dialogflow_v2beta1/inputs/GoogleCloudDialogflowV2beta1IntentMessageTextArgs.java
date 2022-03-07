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
 * The text response message.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTextArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageTextArgs();

    /**
     * Optional. The collection of the agent's responses.
     * 
     */
    @InputImport(name="text")
      private final @Nullable Input<List<String>> text;

    public Input<List<String>> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTextArgs(@Nullable Input<List<String>> text) {
        this.text = text;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTextArgs() {
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(@Nullable Input<List<String>> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable List<String> text) {
            this.text = Input.ofNullable(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTextArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTextArgs(text);
        }
    }
}