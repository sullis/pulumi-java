// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2IntentMessageMediaContentMediaType;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The media content card for Actions on Google.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageMediaContentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageMediaContentArgs Empty = new GoogleCloudDialogflowV2IntentMessageMediaContentArgs();

    /**
     * List of media objects.
     * 
     */
    @Import(name="mediaObjects", required=true)
      private final Output<List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs>> mediaObjects;

    public Output<List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs>> getMediaObjects() {
        return this.mediaObjects;
    }

    /**
     * Optional. What type of media is the content (ie "audio").
     * 
     */
    @Import(name="mediaType")
      private final @Nullable Output<GoogleCloudDialogflowV2IntentMessageMediaContentMediaType> mediaType;

    public Output<GoogleCloudDialogflowV2IntentMessageMediaContentMediaType> getMediaType() {
        return this.mediaType == null ? Output.empty() : this.mediaType;
    }

    public GoogleCloudDialogflowV2IntentMessageMediaContentArgs(
        Output<List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs>> mediaObjects,
        @Nullable Output<GoogleCloudDialogflowV2IntentMessageMediaContentMediaType> mediaType) {
        this.mediaObjects = Objects.requireNonNull(mediaObjects, "expected parameter 'mediaObjects' to be non-null");
        this.mediaType = mediaType;
    }

    private GoogleCloudDialogflowV2IntentMessageMediaContentArgs() {
        this.mediaObjects = Output.empty();
        this.mediaType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageMediaContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs>> mediaObjects;
        private @Nullable Output<GoogleCloudDialogflowV2IntentMessageMediaContentMediaType> mediaType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageMediaContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mediaObjects = defaults.mediaObjects;
    	      this.mediaType = defaults.mediaType;
        }

        public Builder mediaObjects(Output<List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs>> mediaObjects) {
            this.mediaObjects = Objects.requireNonNull(mediaObjects);
            return this;
        }
        public Builder mediaObjects(List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs> mediaObjects) {
            this.mediaObjects = Output.of(Objects.requireNonNull(mediaObjects));
            return this;
        }
        public Builder mediaObjects(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs... mediaObjects) {
            return mediaObjects(List.of(mediaObjects));
        }
        public Builder mediaType(@Nullable Output<GoogleCloudDialogflowV2IntentMessageMediaContentMediaType> mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public Builder mediaType(@Nullable GoogleCloudDialogflowV2IntentMessageMediaContentMediaType mediaType) {
            this.mediaType = Output.ofNullable(mediaType);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageMediaContentArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageMediaContentArgs(mediaObjects, mediaType);
        }
    }
}
