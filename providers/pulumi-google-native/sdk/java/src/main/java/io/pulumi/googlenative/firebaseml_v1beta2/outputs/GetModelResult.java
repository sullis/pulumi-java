// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.ModelStateResponse;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.OperationResponse;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.TfLiteModelResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetModelResult {
    /**
     * Lists operation ids associated with this model whose status is NOT done.
     * 
     */
    private final List<OperationResponse> activeOperations;
    /**
     * Timestamp when this model was created in Firebase ML.
     * 
     */
    private final String createTime;
    /**
     * The name of the model to create. The name can be up to 32 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscores(_) and ASCII digits 0-9. It must start with a letter.
     * 
     */
    private final String displayName;
    /**
     * See RFC7232 https://tools.ietf.org/html/rfc7232#section-2.3
     * 
     */
    private final String etag;
    /**
     * The model_hash will change if a new file is available for download.
     * 
     */
    private final String modelHash;
    /**
     * The resource name of the Model. Model names have the form `projects/{project_id}/models/{model_id}` The name is ignored when creating a model.
     * 
     */
    private final String name;
    /**
     * State common to all model types. Includes publishing and validation information.
     * 
     */
    private final ModelStateResponse state;
    /**
     * User defined tags which can be used to group/filter models during listing
     * 
     */
    private final List<String> tags;
    /**
     * A TFLite Model
     * 
     */
    private final TfLiteModelResponse tfliteModel;
    /**
     * Timestamp when this model was updated in Firebase ML.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"activeOperations","createTime","displayName","etag","modelHash","name","state","tags","tfliteModel","updateTime"})
    private GetModelResult(
        List<OperationResponse> activeOperations,
        String createTime,
        String displayName,
        String etag,
        String modelHash,
        String name,
        ModelStateResponse state,
        List<String> tags,
        TfLiteModelResponse tfliteModel,
        String updateTime) {
        this.activeOperations = Objects.requireNonNull(activeOperations);
        this.createTime = Objects.requireNonNull(createTime);
        this.displayName = Objects.requireNonNull(displayName);
        this.etag = Objects.requireNonNull(etag);
        this.modelHash = Objects.requireNonNull(modelHash);
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.tags = Objects.requireNonNull(tags);
        this.tfliteModel = Objects.requireNonNull(tfliteModel);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Lists operation ids associated with this model whose status is NOT done.
     * 
    */
    public List<OperationResponse> getActiveOperations() {
        return this.activeOperations;
    }
    /**
     * Timestamp when this model was created in Firebase ML.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The name of the model to create. The name can be up to 32 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscores(_) and ASCII digits 0-9. It must start with a letter.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * See RFC7232 https://tools.ietf.org/html/rfc7232#section-2.3
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The model_hash will change if a new file is available for download.
     * 
    */
    public String getModelHash() {
        return this.modelHash;
    }
    /**
     * The resource name of the Model. Model names have the form `projects/{project_id}/models/{model_id}` The name is ignored when creating a model.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State common to all model types. Includes publishing and validation information.
     * 
    */
    public ModelStateResponse getState() {
        return this.state;
    }
    /**
     * User defined tags which can be used to group/filter models during listing
     * 
    */
    public List<String> getTags() {
        return this.tags;
    }
    /**
     * A TFLite Model
     * 
    */
    public TfLiteModelResponse getTfliteModel() {
        return this.tfliteModel;
    }
    /**
     * Timestamp when this model was updated in Firebase ML.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OperationResponse> activeOperations;
        private String createTime;
        private String displayName;
        private String etag;
        private String modelHash;
        private String name;
        private ModelStateResponse state;
        private List<String> tags;
        private TfLiteModelResponse tfliteModel;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeOperations = defaults.activeOperations;
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.modelHash = defaults.modelHash;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tfliteModel = defaults.tfliteModel;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setActiveOperations(List<OperationResponse> activeOperations) {
            this.activeOperations = Objects.requireNonNull(activeOperations);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setModelHash(String modelHash) {
            this.modelHash = Objects.requireNonNull(modelHash);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(ModelStateResponse state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTfliteModel(TfLiteModelResponse tfliteModel) {
            this.tfliteModel = Objects.requireNonNull(tfliteModel);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetModelResult build() {
            return new GetModelResult(activeOperations, createTime, displayName, etag, modelHash, name, state, tags, tfliteModel, updateTime);
        }
    }
}