// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.firebaseml_v1beta2.inputs.StatusResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * State common to all model types. Includes publishing and validation information.
 * 
 */
public final class ModelStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ModelStateResponse Empty = new ModelStateResponse();

    /**
     * Indicates if this model has been published.
     * 
     */
    @Import(name="published", required=true)
      private final Boolean published;

    public Boolean getPublished() {
        return this.published;
    }

    /**
     * Indicates the latest validation error on the model if any. A model may have validation errors if there were problems during the model creation/update. e.g. in the case of a TfLiteModel, if a tflite model file was missing or in the wrong format. This field will be empty for valid models.
     * 
     */
    @Import(name="validationError", required=true)
      private final StatusResponse validationError;

    public StatusResponse getValidationError() {
        return this.validationError;
    }

    public ModelStateResponse(
        Boolean published,
        StatusResponse validationError) {
        this.published = Objects.requireNonNull(published, "expected parameter 'published' to be non-null");
        this.validationError = Objects.requireNonNull(validationError, "expected parameter 'validationError' to be non-null");
    }

    private ModelStateResponse() {
        this.published = null;
        this.validationError = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean published;
        private StatusResponse validationError;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.published = defaults.published;
    	      this.validationError = defaults.validationError;
        }

        public Builder published(Boolean published) {
            this.published = Objects.requireNonNull(published);
            return this;
        }
        public Builder validationError(StatusResponse validationError) {
            this.validationError = Objects.requireNonNull(validationError);
            return this;
        }        public ModelStateResponse build() {
            return new ModelStateResponse(published, validationError);
        }
    }
}
