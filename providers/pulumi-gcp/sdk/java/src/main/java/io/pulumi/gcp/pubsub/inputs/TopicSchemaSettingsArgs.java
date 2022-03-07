// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicSchemaSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicSchemaSettingsArgs Empty = new TopicSchemaSettingsArgs();

    /**
     * The encoding of messages validated against schema.
     * Default value is `ENCODING_UNSPECIFIED`.
     * Possible values are `ENCODING_UNSPECIFIED`, `JSON`, and `BINARY`.
     * 
     */
    @InputImport(name="encoding")
      private final @Nullable Input<String> encoding;

    public Input<String> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    /**
     * The name of the schema that messages published should be
     * validated against. Format is projects/{project}/schemas/{schema}.
     * The value of this field will be _deleted-schema_
     * if the schema has been deleted.
     * 
     */
    @InputImport(name="schema", required=true)
      private final Input<String> schema;

    public Input<String> getSchema() {
        return this.schema;
    }

    public TopicSchemaSettingsArgs(
        @Nullable Input<String> encoding,
        Input<String> schema) {
        this.encoding = encoding;
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
    }

    private TopicSchemaSettingsArgs() {
        this.encoding = Input.empty();
        this.schema = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicSchemaSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> encoding;
        private Input<String> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicSchemaSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.schema = defaults.schema;
        }

        public Builder setEncoding(@Nullable Input<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setSchema(Input<String> schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSchema(String schema) {
            this.schema = Input.of(Objects.requireNonNull(schema));
            return this;
        }
        public TopicSchemaSettingsArgs build() {
            return new TopicSchemaSettingsArgs(encoding, schema);
        }
    }
}