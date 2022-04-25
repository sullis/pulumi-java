// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.inputs;

import com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionParameterObjectAttribute;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPipelineDefinitionParameterObject extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineDefinitionParameterObject Empty = new GetPipelineDefinitionParameterObject();

    @Import(name="attributes", required=true)
    private List<GetPipelineDefinitionParameterObjectAttribute> attributes;

    public List<GetPipelineDefinitionParameterObjectAttribute> attributes() {
        return this.attributes;
    }

    /**
     * ID of the object.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return ID of the object.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetPipelineDefinitionParameterObject() {}

    private GetPipelineDefinitionParameterObject(GetPipelineDefinitionParameterObject $) {
        this.attributes = $.attributes;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelineDefinitionParameterObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelineDefinitionParameterObject $;

        public Builder() {
            $ = new GetPipelineDefinitionParameterObject();
        }

        public Builder(GetPipelineDefinitionParameterObject defaults) {
            $ = new GetPipelineDefinitionParameterObject(Objects.requireNonNull(defaults));
        }

        public Builder attributes(List<GetPipelineDefinitionParameterObjectAttribute> attributes) {
            $.attributes = attributes;
            return this;
        }

        public Builder attributes(GetPipelineDefinitionParameterObjectAttribute... attributes) {
            return attributes(List.of(attributes));
        }

        /**
         * @param id ID of the object.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetPipelineDefinitionParameterObject build() {
            $.attributes = Objects.requireNonNull($.attributes, "expected parameter 'attributes' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
