// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamSchemaConfiguration {
    private final @Nullable String catalogId;
    private final @Nullable String databaseName;
    private final @Nullable String region;
    private final @Nullable String roleARN;
    private final @Nullable String tableName;
    private final @Nullable String versionId;

    @OutputCustomType.Constructor({"catalogId","databaseName","region","roleARN","tableName","versionId"})
    private DeliveryStreamSchemaConfiguration(
        @Nullable String catalogId,
        @Nullable String databaseName,
        @Nullable String region,
        @Nullable String roleARN,
        @Nullable String tableName,
        @Nullable String versionId) {
        this.catalogId = catalogId;
        this.databaseName = databaseName;
        this.region = region;
        this.roleARN = roleARN;
        this.tableName = tableName;
        this.versionId = versionId;
    }

    public Optional<String> getCatalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    public Optional<String> getDatabaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> getRoleARN() {
        return Optional.ofNullable(this.roleARN);
    }
    public Optional<String> getTableName() {
        return Optional.ofNullable(this.tableName);
    }
    public Optional<String> getVersionId() {
        return Optional.ofNullable(this.versionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamSchemaConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private @Nullable String databaseName;
        private @Nullable String region;
        private @Nullable String roleARN;
        private @Nullable String tableName;
        private @Nullable String versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamSchemaConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.region = defaults.region;
    	      this.roleARN = defaults.roleARN;
    	      this.tableName = defaults.tableName;
    	      this.versionId = defaults.versionId;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setRoleARN(@Nullable String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = versionId;
            return this;
        }

        public DeliveryStreamSchemaConfiguration build() {
            return new DeliveryStreamSchemaConfiguration(catalogId, databaseName, region, roleARN, tableName, versionId);
        }
    }
}
