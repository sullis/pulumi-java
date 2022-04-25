// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.AsyncOptionsResponse;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.InputMappingResponse;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.ValidationOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Options allows customized resource handling by Deployment Manager.
 * 
 */
public final class OptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final OptionsResponse Empty = new OptionsResponse();

    /**
     * Options regarding how to thread async requests.
     * 
     */
    @Import(name="asyncOptions", required=true)
    private List<AsyncOptionsResponse> asyncOptions;

    /**
     * @return Options regarding how to thread async requests.
     * 
     */
    public List<AsyncOptionsResponse> asyncOptions() {
        return this.asyncOptions;
    }

    /**
     * The mappings that apply for requests.
     * 
     */
    @Import(name="inputMappings", required=true)
    private List<InputMappingResponse> inputMappings;

    /**
     * @return The mappings that apply for requests.
     * 
     */
    public List<InputMappingResponse> inputMappings() {
        return this.inputMappings;
    }

    /**
     * The json path to the field in the resource JSON body into which the resource name should be mapped. Leaving this empty indicates that there should be no mapping performed.
     * 
     */
    @Import(name="nameProperty", required=true)
    private String nameProperty;

    /**
     * @return The json path to the field in the resource JSON body into which the resource name should be mapped. Leaving this empty indicates that there should be no mapping performed.
     * 
     */
    public String nameProperty() {
        return this.nameProperty;
    }

    /**
     * Options for how to validate and process properties on a resource.
     * 
     */
    @Import(name="validationOptions", required=true)
    private ValidationOptionsResponse validationOptions;

    /**
     * @return Options for how to validate and process properties on a resource.
     * 
     */
    public ValidationOptionsResponse validationOptions() {
        return this.validationOptions;
    }

    private OptionsResponse() {}

    private OptionsResponse(OptionsResponse $) {
        this.asyncOptions = $.asyncOptions;
        this.inputMappings = $.inputMappings;
        this.nameProperty = $.nameProperty;
        this.validationOptions = $.validationOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OptionsResponse $;

        public Builder() {
            $ = new OptionsResponse();
        }

        public Builder(OptionsResponse defaults) {
            $ = new OptionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param asyncOptions Options regarding how to thread async requests.
         * 
         * @return builder
         * 
         */
        public Builder asyncOptions(List<AsyncOptionsResponse> asyncOptions) {
            $.asyncOptions = asyncOptions;
            return this;
        }

        /**
         * @param asyncOptions Options regarding how to thread async requests.
         * 
         * @return builder
         * 
         */
        public Builder asyncOptions(AsyncOptionsResponse... asyncOptions) {
            return asyncOptions(List.of(asyncOptions));
        }

        /**
         * @param inputMappings The mappings that apply for requests.
         * 
         * @return builder
         * 
         */
        public Builder inputMappings(List<InputMappingResponse> inputMappings) {
            $.inputMappings = inputMappings;
            return this;
        }

        /**
         * @param inputMappings The mappings that apply for requests.
         * 
         * @return builder
         * 
         */
        public Builder inputMappings(InputMappingResponse... inputMappings) {
            return inputMappings(List.of(inputMappings));
        }

        /**
         * @param nameProperty The json path to the field in the resource JSON body into which the resource name should be mapped. Leaving this empty indicates that there should be no mapping performed.
         * 
         * @return builder
         * 
         */
        public Builder nameProperty(String nameProperty) {
            $.nameProperty = nameProperty;
            return this;
        }

        /**
         * @param validationOptions Options for how to validate and process properties on a resource.
         * 
         * @return builder
         * 
         */
        public Builder validationOptions(ValidationOptionsResponse validationOptions) {
            $.validationOptions = validationOptions;
            return this;
        }

        public OptionsResponse build() {
            $.asyncOptions = Objects.requireNonNull($.asyncOptions, "expected parameter 'asyncOptions' to be non-null");
            $.inputMappings = Objects.requireNonNull($.inputMappings, "expected parameter 'inputMappings' to be non-null");
            $.nameProperty = Objects.requireNonNull($.nameProperty, "expected parameter 'nameProperty' to be non-null");
            $.validationOptions = Objects.requireNonNull($.validationOptions, "expected parameter 'validationOptions' to be non-null");
            return $;
        }
    }

}
