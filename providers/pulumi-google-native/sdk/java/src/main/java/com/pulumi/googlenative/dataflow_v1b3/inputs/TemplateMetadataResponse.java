// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataflow_v1b3.inputs.ParameterMetadataResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Metadata describing a template.
 * 
 */
public final class TemplateMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final TemplateMetadataResponse Empty = new TemplateMetadataResponse();

    /**
     * Optional. A description of the template.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return Optional. A description of the template.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * The name of the template.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the template.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The parameters for the template.
     * 
     */
    @Import(name="parameters", required=true)
    private List<ParameterMetadataResponse> parameters;

    /**
     * @return The parameters for the template.
     * 
     */
    public List<ParameterMetadataResponse> parameters() {
        return this.parameters;
    }

    private TemplateMetadataResponse() {}

    private TemplateMetadataResponse(TemplateMetadataResponse $) {
        this.description = $.description;
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateMetadataResponse $;

        public Builder() {
            $ = new TemplateMetadataResponse();
        }

        public Builder(TemplateMetadataResponse defaults) {
            $ = new TemplateMetadataResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. A description of the template.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param name The name of the template.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param parameters The parameters for the template.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<ParameterMetadataResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters for the template.
         * 
         * @return builder
         * 
         */
        public Builder parameters(ParameterMetadataResponse... parameters) {
            return parameters(List.of(parameters));
        }

        public TemplateMetadataResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
