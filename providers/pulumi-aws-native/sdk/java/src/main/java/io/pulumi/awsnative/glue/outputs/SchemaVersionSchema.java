// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SchemaVersionSchema {
    /**
     * Name of the registry to identify where the Schema is located.
     * 
     */
    private final @Nullable String registryName;
    /**
     * Amazon Resource Name for the Schema. This attribute can be used to uniquely represent the Schema.
     * 
     */
    private final @Nullable String schemaArn;
    /**
     * Name of the schema. This parameter requires RegistryName to be provided.
     * 
     */
    private final @Nullable String schemaName;

    @OutputCustomType.Constructor({"registryName","schemaArn","schemaName"})
    private SchemaVersionSchema(
        @Nullable String registryName,
        @Nullable String schemaArn,
        @Nullable String schemaName) {
        this.registryName = registryName;
        this.schemaArn = schemaArn;
        this.schemaName = schemaName;
    }

    /**
     * Name of the registry to identify where the Schema is located.
     * 
    */
    public Optional<String> getRegistryName() {
        return Optional.ofNullable(this.registryName);
    }
    /**
     * Amazon Resource Name for the Schema. This attribute can be used to uniquely represent the Schema.
     * 
    */
    public Optional<String> getSchemaArn() {
        return Optional.ofNullable(this.schemaArn);
    }
    /**
     * Name of the schema. This parameter requires RegistryName to be provided.
     * 
    */
    public Optional<String> getSchemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaVersionSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String registryName;
        private @Nullable String schemaArn;
        private @Nullable String schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaVersionSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.schemaArn = defaults.schemaArn;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder setRegistryName(@Nullable String registryName) {
            this.registryName = registryName;
            return this;
        }

        public Builder setSchemaArn(@Nullable String schemaArn) {
            this.schemaArn = schemaArn;
            return this;
        }

        public Builder setSchemaName(@Nullable String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public SchemaVersionSchema build() {
            return new SchemaVersionSchema(registryName, schemaArn, schemaName);
        }
    }
}