// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue;

import com.pulumi.awsnative.glue.inputs.SchemaVersionSchemaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SchemaVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaVersionArgs Empty = new SchemaVersionArgs();

    @Import(name="schema", required=true)
    private Output<SchemaVersionSchemaArgs> schema;

    public Output<SchemaVersionSchemaArgs> schema() {
        return this.schema;
    }

    /**
     * Complete definition of the schema in plain-text.
     * 
     */
    @Import(name="schemaDefinition", required=true)
    private Output<String> schemaDefinition;

    /**
     * @return Complete definition of the schema in plain-text.
     * 
     */
    public Output<String> schemaDefinition() {
        return this.schemaDefinition;
    }

    private SchemaVersionArgs() {}

    private SchemaVersionArgs(SchemaVersionArgs $) {
        this.schema = $.schema;
        this.schemaDefinition = $.schemaDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaVersionArgs $;

        public Builder() {
            $ = new SchemaVersionArgs();
        }

        public Builder(SchemaVersionArgs defaults) {
            $ = new SchemaVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder schema(Output<SchemaVersionSchemaArgs> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(SchemaVersionSchemaArgs schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param schemaDefinition Complete definition of the schema in plain-text.
         * 
         * @return builder
         * 
         */
        public Builder schemaDefinition(Output<String> schemaDefinition) {
            $.schemaDefinition = schemaDefinition;
            return this;
        }

        /**
         * @param schemaDefinition Complete definition of the schema in plain-text.
         * 
         * @return builder
         * 
         */
        public Builder schemaDefinition(String schemaDefinition) {
            return schemaDefinition(Output.of(schemaDefinition));
        }

        public SchemaVersionArgs build() {
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            $.schemaDefinition = Objects.requireNonNull($.schemaDefinition, "expected parameter 'schemaDefinition' to be non-null");
            return $;
        }
    }

}
