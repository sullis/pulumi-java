// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicSchemaSettings {
    /**
     * The encoding of messages validated against schema.
     * Default value is `ENCODING_UNSPECIFIED`.
     * Possible values are `ENCODING_UNSPECIFIED`, `JSON`, and `BINARY`.
     * 
     */
    private final @Nullable String encoding;
    /**
     * The name of the schema that messages published should be
     * validated against. Format is projects/{project}/schemas/{schema}.
     * The value of this field will be _deleted-schema_
     * if the schema has been deleted.
     * 
     */
    private final String schema;

    @OutputCustomType.Constructor({"encoding","schema"})
    private TopicSchemaSettings(
        @Nullable String encoding,
        String schema) {
        this.encoding = encoding;
        this.schema = Objects.requireNonNull(schema);
    }

    /**
     * The encoding of messages validated against schema.
     * Default value is `ENCODING_UNSPECIFIED`.
     * Possible values are `ENCODING_UNSPECIFIED`, `JSON`, and `BINARY`.
     * 
     */
    public Optional<String> getEncoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * The name of the schema that messages published should be
     * validated against. Format is projects/{project}/schemas/{schema}.
     * The value of this field will be _deleted-schema_
     * if the schema has been deleted.
     * 
     */
    public String getSchema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicSchemaSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encoding;
        private String schema;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicSchemaSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.schema = defaults.schema;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setSchema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public TopicSchemaSettings build() {
            return new TopicSchemaSettings(encoding, schema);
        }
    }
}
