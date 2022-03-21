// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The description of differences between original and replayed agent output.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse Empty = new GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse();

    /**
     * A description of the diff, showing the actual output vs expected output.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The type of diff.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse(
        String description,
        String type) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse() {
        this.description = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.type = defaults.type;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse build() {
            return new GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse(description, type);
        }
    }
}
