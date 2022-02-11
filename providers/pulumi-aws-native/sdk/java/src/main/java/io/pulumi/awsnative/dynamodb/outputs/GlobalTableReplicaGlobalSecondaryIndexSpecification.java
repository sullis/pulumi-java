// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.awsnative.dynamodb.outputs.GlobalTableContributorInsightsSpecification;
import io.pulumi.awsnative.dynamodb.outputs.GlobalTableReadProvisionedThroughputSettings;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalTableReplicaGlobalSecondaryIndexSpecification {
    private final @Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification;
    private final String indexName;
    private final @Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings;

    @OutputCustomType.Constructor({"contributorInsightsSpecification","indexName","readProvisionedThroughputSettings"})
    private GlobalTableReplicaGlobalSecondaryIndexSpecification(
        @Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification,
        String indexName,
        @Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings) {
        this.contributorInsightsSpecification = contributorInsightsSpecification;
        this.indexName = Objects.requireNonNull(indexName);
        this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
    }

    public Optional<GlobalTableContributorInsightsSpecification> getContributorInsightsSpecification() {
        return Optional.ofNullable(this.contributorInsightsSpecification);
    }
    public String getIndexName() {
        return this.indexName;
    }
    public Optional<GlobalTableReadProvisionedThroughputSettings> getReadProvisionedThroughputSettings() {
        return Optional.ofNullable(this.readProvisionedThroughputSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReplicaGlobalSecondaryIndexSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification;
        private String indexName;
        private @Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReplicaGlobalSecondaryIndexSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contributorInsightsSpecification = defaults.contributorInsightsSpecification;
    	      this.indexName = defaults.indexName;
    	      this.readProvisionedThroughputSettings = defaults.readProvisionedThroughputSettings;
        }

        public Builder setContributorInsightsSpecification(@Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification) {
            this.contributorInsightsSpecification = contributorInsightsSpecification;
            return this;
        }

        public Builder setIndexName(String indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }

        public Builder setReadProvisionedThroughputSettings(@Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings) {
            this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
            return this;
        }

        public GlobalTableReplicaGlobalSecondaryIndexSpecification build() {
            return new GlobalTableReplicaGlobalSecondaryIndexSpecification(contributorInsightsSpecification, indexName, readProvisionedThroughputSettings);
        }
    }
}
