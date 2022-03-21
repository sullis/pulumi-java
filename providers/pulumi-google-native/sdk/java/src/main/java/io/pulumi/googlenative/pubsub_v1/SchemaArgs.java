// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.pubsub_v1.enums.SchemaType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    /**
     * The definition of the schema. This should contain a string representing the full definition of the schema that is a valid schema definition of the type specified in `type`.
     * 
     */
    @Import(name="definition")
      private final @Nullable Output<String> definition;

    public Output<String> getDefinition() {
        return this.definition == null ? Output.empty() : this.definition;
    }

    /**
     * Name of the schema. Format is `projects/{project}/schemas/{schema}`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="schemaId")
      private final @Nullable Output<String> schemaId;

    public Output<String> getSchemaId() {
        return this.schemaId == null ? Output.empty() : this.schemaId;
    }

    /**
     * The type of the schema definition.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<SchemaType> type;

    public Output<SchemaType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public SchemaArgs(
        @Nullable Output<String> definition,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> schemaId,
        @Nullable Output<SchemaType> type) {
        this.definition = definition;
        this.name = name;
        this.project = project;
        this.schemaId = schemaId;
        this.type = type;
    }

    private SchemaArgs() {
        this.definition = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.schemaId = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> definition;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> schemaId;
        private @Nullable Output<SchemaType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.schemaId = defaults.schemaId;
    	      this.type = defaults.type;
        }

        public Builder definition(@Nullable Output<String> definition) {
            this.definition = definition;
            return this;
        }
        public Builder definition(@Nullable String definition) {
            this.definition = Output.ofNullable(definition);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder schemaId(@Nullable Output<String> schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public Builder schemaId(@Nullable String schemaId) {
            this.schemaId = Output.ofNullable(schemaId);
            return this;
        }
        public Builder type(@Nullable Output<SchemaType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable SchemaType type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public SchemaArgs build() {
            return new SchemaArgs(definition, name, project, schemaId, type);
        }
    }
}
