// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Settings related to NLU.
 * 
 */
public final class GoogleCloudDialogflowCxV3NluSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3NluSettingsResponse Empty = new GoogleCloudDialogflowCxV3NluSettingsResponse();

    /**
     * To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold. If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
     * 
     */
    @Import(name="classificationThreshold", required=true)
    private Double classificationThreshold;

    /**
     * @return To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold. If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
     * 
     */
    public Double classificationThreshold() {
        return this.classificationThreshold;
    }

    /**
     * Indicates NLU model training mode.
     * 
     */
    @Import(name="modelTrainingMode", required=true)
    private String modelTrainingMode;

    /**
     * @return Indicates NLU model training mode.
     * 
     */
    public String modelTrainingMode() {
        return this.modelTrainingMode;
    }

    /**
     * Indicates the type of NLU model.
     * 
     */
    @Import(name="modelType", required=true)
    private String modelType;

    /**
     * @return Indicates the type of NLU model.
     * 
     */
    public String modelType() {
        return this.modelType;
    }

    private GoogleCloudDialogflowCxV3NluSettingsResponse() {}

    private GoogleCloudDialogflowCxV3NluSettingsResponse(GoogleCloudDialogflowCxV3NluSettingsResponse $) {
        this.classificationThreshold = $.classificationThreshold;
        this.modelTrainingMode = $.modelTrainingMode;
        this.modelType = $.modelType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3NluSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3NluSettingsResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3NluSettingsResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3NluSettingsResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3NluSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param classificationThreshold To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold. If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
         * 
         * @return builder
         * 
         */
        public Builder classificationThreshold(Double classificationThreshold) {
            $.classificationThreshold = classificationThreshold;
            return this;
        }

        /**
         * @param modelTrainingMode Indicates NLU model training mode.
         * 
         * @return builder
         * 
         */
        public Builder modelTrainingMode(String modelTrainingMode) {
            $.modelTrainingMode = modelTrainingMode;
            return this;
        }

        /**
         * @param modelType Indicates the type of NLU model.
         * 
         * @return builder
         * 
         */
        public Builder modelType(String modelType) {
            $.modelType = modelType;
            return this;
        }

        public GoogleCloudDialogflowCxV3NluSettingsResponse build() {
            $.classificationThreshold = Objects.requireNonNull($.classificationThreshold, "expected parameter 'classificationThreshold' to be non-null");
            $.modelTrainingMode = Objects.requireNonNull($.modelTrainingMode, "expected parameter 'modelTrainingMode' to be non-null");
            $.modelType = Objects.requireNonNull($.modelType, "expected parameter 'modelType' to be non-null");
            return $;
        }
    }

}
