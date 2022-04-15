// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatastoreSchemaDefinition;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreParquetConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DatastoreParquetConfiguration Empty = new DatastoreParquetConfiguration();

    @Import(name="schemaDefinition")
      private final @Nullable DatastoreSchemaDefinition schemaDefinition;

    public Optional<DatastoreSchemaDefinition> schemaDefinition() {
        return this.schemaDefinition == null ? Optional.empty() : Optional.ofNullable(this.schemaDefinition);
    }

    public DatastoreParquetConfiguration(@Nullable DatastoreSchemaDefinition schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    private DatastoreParquetConfiguration() {
        this.schemaDefinition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreParquetConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatastoreSchemaDefinition schemaDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreParquetConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schemaDefinition = defaults.schemaDefinition;
        }

        public Builder schemaDefinition(@Nullable DatastoreSchemaDefinition schemaDefinition) {
            this.schemaDefinition = schemaDefinition;
            return this;
        }        public DatastoreParquetConfiguration build() {
            return new DatastoreParquetConfiguration(schemaDefinition);
        }
    }
}
