// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelArgs Empty = new ModelArgs();

    /**
     * The content type for the model.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * A description that identifies this model.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A name for the model. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the model name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of a REST API with which to associate this model.
     * 
     */
    @Import(name="restApiId", required=true)
      private final Output<String> restApiId;

    public Output<String> restApiId() {
        return this.restApiId;
    }

    /**
     * The schema to use to transform data to one or more output formats. Specify null ({}) if you don't want to specify a schema.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<Object> schema;

    public Output<Object> schema() {
        return this.schema == null ? Codegen.empty() : this.schema;
    }

    public ModelArgs(
        @Nullable Output<String> contentType,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> restApiId,
        @Nullable Output<Object> schema) {
        this.contentType = contentType;
        this.description = description;
        this.name = name;
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
        this.schema = schema;
    }

    private ModelArgs() {
        this.contentType = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.restApiId = Codegen.empty();
        this.schema = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> restApiId;
        private @Nullable Output<Object> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.restApiId = defaults.restApiId;
    	      this.schema = defaults.schema;
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder restApiId(Output<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public Builder restApiId(String restApiId) {
            this.restApiId = Output.of(Objects.requireNonNull(restApiId));
            return this;
        }
        public Builder schema(@Nullable Output<Object> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable Object schema) {
            this.schema = Codegen.ofNullable(schema);
            return this;
        }        public ModelArgs build() {
            return new ModelArgs(contentType, description, name, restApiId, schema);
        }
    }
}
