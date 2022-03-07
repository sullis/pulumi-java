// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue;

import io.pulumi.awsnative.glue.enums.SchemaCompatibility;
import io.pulumi.awsnative.glue.enums.SchemaDataFormat;
import io.pulumi.awsnative.glue.inputs.SchemaRegistryArgs;
import io.pulumi.awsnative.glue.inputs.SchemaTagArgs;
import io.pulumi.awsnative.glue.inputs.SchemaVersionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    @InputImport(name="checkpointVersion")
      private final @Nullable Input<SchemaVersionArgs> checkpointVersion;

    public Input<SchemaVersionArgs> getCheckpointVersion() {
        return this.checkpointVersion == null ? Input.empty() : this.checkpointVersion;
    }

    /**
     * Compatibility setting for the schema.
     * 
     */
    @InputImport(name="compatibility", required=true)
      private final Input<SchemaCompatibility> compatibility;

    public Input<SchemaCompatibility> getCompatibility() {
        return this.compatibility;
    }

    /**
     * Data format name to use for the schema. Accepted values: 'AVRO', 'JSON', 'PROTOBUF'
     * 
     */
    @InputImport(name="dataFormat", required=true)
      private final Input<SchemaDataFormat> dataFormat;

    public Input<SchemaDataFormat> getDataFormat() {
        return this.dataFormat;
    }

    /**
     * A description of the schema. If description is not provided, there will not be any default value for this.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the schema.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="registry")
      private final @Nullable Input<SchemaRegistryArgs> registry;

    public Input<SchemaRegistryArgs> getRegistry() {
        return this.registry == null ? Input.empty() : this.registry;
    }

    /**
     * Definition for the initial schema version in plain-text.
     * 
     */
    @InputImport(name="schemaDefinition", required=true)
      private final Input<String> schemaDefinition;

    public Input<String> getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * List of tags to tag the schema
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<SchemaTagArgs>> tags;

    public Input<List<SchemaTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SchemaArgs(
        @Nullable Input<SchemaVersionArgs> checkpointVersion,
        Input<SchemaCompatibility> compatibility,
        Input<SchemaDataFormat> dataFormat,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<SchemaRegistryArgs> registry,
        Input<String> schemaDefinition,
        @Nullable Input<List<SchemaTagArgs>> tags) {
        this.checkpointVersion = checkpointVersion;
        this.compatibility = Objects.requireNonNull(compatibility, "expected parameter 'compatibility' to be non-null");
        this.dataFormat = Objects.requireNonNull(dataFormat, "expected parameter 'dataFormat' to be non-null");
        this.description = description;
        this.name = name;
        this.registry = registry;
        this.schemaDefinition = Objects.requireNonNull(schemaDefinition, "expected parameter 'schemaDefinition' to be non-null");
        this.tags = tags;
    }

    private SchemaArgs() {
        this.checkpointVersion = Input.empty();
        this.compatibility = Input.empty();
        this.dataFormat = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.registry = Input.empty();
        this.schemaDefinition = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SchemaVersionArgs> checkpointVersion;
        private Input<SchemaCompatibility> compatibility;
        private Input<SchemaDataFormat> dataFormat;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<SchemaRegistryArgs> registry;
        private Input<String> schemaDefinition;
        private @Nullable Input<List<SchemaTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointVersion = defaults.checkpointVersion;
    	      this.compatibility = defaults.compatibility;
    	      this.dataFormat = defaults.dataFormat;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.registry = defaults.registry;
    	      this.schemaDefinition = defaults.schemaDefinition;
    	      this.tags = defaults.tags;
        }

        public Builder setCheckpointVersion(@Nullable Input<SchemaVersionArgs> checkpointVersion) {
            this.checkpointVersion = checkpointVersion;
            return this;
        }

        public Builder setCheckpointVersion(@Nullable SchemaVersionArgs checkpointVersion) {
            this.checkpointVersion = Input.ofNullable(checkpointVersion);
            return this;
        }

        public Builder setCompatibility(Input<SchemaCompatibility> compatibility) {
            this.compatibility = Objects.requireNonNull(compatibility);
            return this;
        }

        public Builder setCompatibility(SchemaCompatibility compatibility) {
            this.compatibility = Input.of(Objects.requireNonNull(compatibility));
            return this;
        }

        public Builder setDataFormat(Input<SchemaDataFormat> dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }

        public Builder setDataFormat(SchemaDataFormat dataFormat) {
            this.dataFormat = Input.of(Objects.requireNonNull(dataFormat));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRegistry(@Nullable Input<SchemaRegistryArgs> registry) {
            this.registry = registry;
            return this;
        }

        public Builder setRegistry(@Nullable SchemaRegistryArgs registry) {
            this.registry = Input.ofNullable(registry);
            return this;
        }

        public Builder setSchemaDefinition(Input<String> schemaDefinition) {
            this.schemaDefinition = Objects.requireNonNull(schemaDefinition);
            return this;
        }

        public Builder setSchemaDefinition(String schemaDefinition) {
            this.schemaDefinition = Input.of(Objects.requireNonNull(schemaDefinition));
            return this;
        }

        public Builder setTags(@Nullable Input<List<SchemaTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<SchemaTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public SchemaArgs build() {
            return new SchemaArgs(checkpointVersion, compatibility, dataFormat, description, name, registry, schemaDefinition, tags);
        }
    }
}