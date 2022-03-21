// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.awsnative.dynamodb.inputs.GlobalTableKeySchemaArgs;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableProjectionArgs;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableWriteProvisionedThroughputSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalTableGlobalSecondaryIndexArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableGlobalSecondaryIndexArgs Empty = new GlobalTableGlobalSecondaryIndexArgs();

    @Import(name="indexName", required=true)
      private final Output<String> indexName;

    public Output<String> getIndexName() {
        return this.indexName;
    }

    @Import(name="keySchema", required=true)
      private final Output<List<GlobalTableKeySchemaArgs>> keySchema;

    public Output<List<GlobalTableKeySchemaArgs>> getKeySchema() {
        return this.keySchema;
    }

    @Import(name="projection", required=true)
      private final Output<GlobalTableProjectionArgs> projection;

    public Output<GlobalTableProjectionArgs> getProjection() {
        return this.projection;
    }

    @Import(name="writeProvisionedThroughputSettings")
      private final @Nullable Output<GlobalTableWriteProvisionedThroughputSettingsArgs> writeProvisionedThroughputSettings;

    public Output<GlobalTableWriteProvisionedThroughputSettingsArgs> getWriteProvisionedThroughputSettings() {
        return this.writeProvisionedThroughputSettings == null ? Output.empty() : this.writeProvisionedThroughputSettings;
    }

    public GlobalTableGlobalSecondaryIndexArgs(
        Output<String> indexName,
        Output<List<GlobalTableKeySchemaArgs>> keySchema,
        Output<GlobalTableProjectionArgs> projection,
        @Nullable Output<GlobalTableWriteProvisionedThroughputSettingsArgs> writeProvisionedThroughputSettings) {
        this.indexName = Objects.requireNonNull(indexName, "expected parameter 'indexName' to be non-null");
        this.keySchema = Objects.requireNonNull(keySchema, "expected parameter 'keySchema' to be non-null");
        this.projection = Objects.requireNonNull(projection, "expected parameter 'projection' to be non-null");
        this.writeProvisionedThroughputSettings = writeProvisionedThroughputSettings;
    }

    private GlobalTableGlobalSecondaryIndexArgs() {
        this.indexName = Output.empty();
        this.keySchema = Output.empty();
        this.projection = Output.empty();
        this.writeProvisionedThroughputSettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableGlobalSecondaryIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> indexName;
        private Output<List<GlobalTableKeySchemaArgs>> keySchema;
        private Output<GlobalTableProjectionArgs> projection;
        private @Nullable Output<GlobalTableWriteProvisionedThroughputSettingsArgs> writeProvisionedThroughputSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableGlobalSecondaryIndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexName = defaults.indexName;
    	      this.keySchema = defaults.keySchema;
    	      this.projection = defaults.projection;
    	      this.writeProvisionedThroughputSettings = defaults.writeProvisionedThroughputSettings;
        }

        public Builder indexName(Output<String> indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }
        public Builder indexName(String indexName) {
            this.indexName = Output.of(Objects.requireNonNull(indexName));
            return this;
        }
        public Builder keySchema(Output<List<GlobalTableKeySchemaArgs>> keySchema) {
            this.keySchema = Objects.requireNonNull(keySchema);
            return this;
        }
        public Builder keySchema(List<GlobalTableKeySchemaArgs> keySchema) {
            this.keySchema = Output.of(Objects.requireNonNull(keySchema));
            return this;
        }
        public Builder keySchema(GlobalTableKeySchemaArgs... keySchema) {
            return keySchema(List.of(keySchema));
        }
        public Builder projection(Output<GlobalTableProjectionArgs> projection) {
            this.projection = Objects.requireNonNull(projection);
            return this;
        }
        public Builder projection(GlobalTableProjectionArgs projection) {
            this.projection = Output.of(Objects.requireNonNull(projection));
            return this;
        }
        public Builder writeProvisionedThroughputSettings(@Nullable Output<GlobalTableWriteProvisionedThroughputSettingsArgs> writeProvisionedThroughputSettings) {
            this.writeProvisionedThroughputSettings = writeProvisionedThroughputSettings;
            return this;
        }
        public Builder writeProvisionedThroughputSettings(@Nullable GlobalTableWriteProvisionedThroughputSettingsArgs writeProvisionedThroughputSettings) {
            this.writeProvisionedThroughputSettings = Output.ofNullable(writeProvisionedThroughputSettings);
            return this;
        }        public GlobalTableGlobalSecondaryIndexArgs build() {
            return new GlobalTableGlobalSecondaryIndexArgs(indexName, keySchema, projection, writeProvisionedThroughputSettings);
        }
    }
}
