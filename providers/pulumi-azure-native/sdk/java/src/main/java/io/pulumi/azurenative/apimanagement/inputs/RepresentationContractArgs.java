// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.ParameterContractArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Operation request/response representation details.
 * 
 */
public final class RepresentationContractArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepresentationContractArgs Empty = new RepresentationContractArgs();

    /**
     * Specifies a registered or custom content type for this representation, e.g. application/xml.
     * 
     */
    @InputImport(name="contentType", required=true)
    private final Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType;
    }

    /**
     * Collection of form parameters. Required if 'contentType' value is either 'application/x-www-form-urlencoded' or 'multipart/form-data'..
     * 
     */
    @InputImport(name="formParameters")
    private final @Nullable Input<List<ParameterContractArgs>> formParameters;

    public Input<List<ParameterContractArgs>> getFormParameters() {
        return this.formParameters == null ? Input.empty() : this.formParameters;
    }

    /**
     * An example of the representation.
     * 
     */
    @InputImport(name="sample")
    private final @Nullable Input<String> sample;

    public Input<String> getSample() {
        return this.sample == null ? Input.empty() : this.sample;
    }

    /**
     * Schema identifier. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     * 
     */
    @InputImport(name="schemaId")
    private final @Nullable Input<String> schemaId;

    public Input<String> getSchemaId() {
        return this.schemaId == null ? Input.empty() : this.schemaId;
    }

    /**
     * Type name defined by the schema. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     * 
     */
    @InputImport(name="typeName")
    private final @Nullable Input<String> typeName;

    public Input<String> getTypeName() {
        return this.typeName == null ? Input.empty() : this.typeName;
    }

    public RepresentationContractArgs(
        Input<String> contentType,
        @Nullable Input<List<ParameterContractArgs>> formParameters,
        @Nullable Input<String> sample,
        @Nullable Input<String> schemaId,
        @Nullable Input<String> typeName) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.formParameters = formParameters;
        this.sample = sample;
        this.schemaId = schemaId;
        this.typeName = typeName;
    }

    private RepresentationContractArgs() {
        this.contentType = Input.empty();
        this.formParameters = Input.empty();
        this.sample = Input.empty();
        this.schemaId = Input.empty();
        this.typeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepresentationContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contentType;
        private @Nullable Input<List<ParameterContractArgs>> formParameters;
        private @Nullable Input<String> sample;
        private @Nullable Input<String> schemaId;
        private @Nullable Input<String> typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepresentationContractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.formParameters = defaults.formParameters;
    	      this.sample = defaults.sample;
    	      this.schemaId = defaults.schemaId;
    	      this.typeName = defaults.typeName;
        }

        public Builder setContentType(Input<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Input.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder setFormParameters(@Nullable Input<List<ParameterContractArgs>> formParameters) {
            this.formParameters = formParameters;
            return this;
        }

        public Builder setFormParameters(@Nullable List<ParameterContractArgs> formParameters) {
            this.formParameters = Input.ofNullable(formParameters);
            return this;
        }

        public Builder setSample(@Nullable Input<String> sample) {
            this.sample = sample;
            return this;
        }

        public Builder setSample(@Nullable String sample) {
            this.sample = Input.ofNullable(sample);
            return this;
        }

        public Builder setSchemaId(@Nullable Input<String> schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public Builder setSchemaId(@Nullable String schemaId) {
            this.schemaId = Input.ofNullable(schemaId);
            return this;
        }

        public Builder setTypeName(@Nullable Input<String> typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder setTypeName(@Nullable String typeName) {
            this.typeName = Input.ofNullable(typeName);
            return this;
        }

        public RepresentationContractArgs build() {
            return new RepresentationContractArgs(contentType, formParameters, sample, schemaId, typeName);
        }
    }
}
