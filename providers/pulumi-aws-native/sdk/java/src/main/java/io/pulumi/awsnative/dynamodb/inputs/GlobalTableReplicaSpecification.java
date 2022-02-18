// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.awsnative.dynamodb.inputs.GlobalTableContributorInsightsSpecification;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTablePointInTimeRecoverySpecification;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableReadProvisionedThroughputSettings;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableReplicaGlobalSecondaryIndexSpecification;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableReplicaSSESpecification;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableTag;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableReplicaSpecification extends io.pulumi.resources.InvokeArgs {

    public static final GlobalTableReplicaSpecification Empty = new GlobalTableReplicaSpecification();

    @InputImport(name="contributorInsightsSpecification")
    private final @Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification;

    public Optional<GlobalTableContributorInsightsSpecification> getContributorInsightsSpecification() {
        return this.contributorInsightsSpecification == null ? Optional.empty() : Optional.ofNullable(this.contributorInsightsSpecification);
    }

    @InputImport(name="globalSecondaryIndexes")
    private final @Nullable List<GlobalTableReplicaGlobalSecondaryIndexSpecification> globalSecondaryIndexes;

    public List<GlobalTableReplicaGlobalSecondaryIndexSpecification> getGlobalSecondaryIndexes() {
        return this.globalSecondaryIndexes == null ? List.of() : this.globalSecondaryIndexes;
    }

    @InputImport(name="pointInTimeRecoverySpecification")
    private final @Nullable GlobalTablePointInTimeRecoverySpecification pointInTimeRecoverySpecification;

    public Optional<GlobalTablePointInTimeRecoverySpecification> getPointInTimeRecoverySpecification() {
        return this.pointInTimeRecoverySpecification == null ? Optional.empty() : Optional.ofNullable(this.pointInTimeRecoverySpecification);
    }

    @InputImport(name="readProvisionedThroughputSettings")
    private final @Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings;

    public Optional<GlobalTableReadProvisionedThroughputSettings> getReadProvisionedThroughputSettings() {
        return this.readProvisionedThroughputSettings == null ? Optional.empty() : Optional.ofNullable(this.readProvisionedThroughputSettings);
    }

    @InputImport(name="region", required=true)
    private final String region;

    public String getRegion() {
        return this.region;
    }

    @InputImport(name="sSESpecification")
    private final @Nullable GlobalTableReplicaSSESpecification sSESpecification;

    public Optional<GlobalTableReplicaSSESpecification> getSSESpecification() {
        return this.sSESpecification == null ? Optional.empty() : Optional.ofNullable(this.sSESpecification);
    }

    @InputImport(name="tags")
    private final @Nullable List<GlobalTableTag> tags;

    public List<GlobalTableTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public GlobalTableReplicaSpecification(
        @Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification,
        @Nullable List<GlobalTableReplicaGlobalSecondaryIndexSpecification> globalSecondaryIndexes,
        @Nullable GlobalTablePointInTimeRecoverySpecification pointInTimeRecoverySpecification,
        @Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings,
        String region,
        @Nullable GlobalTableReplicaSSESpecification sSESpecification,
        @Nullable List<GlobalTableTag> tags) {
        this.contributorInsightsSpecification = contributorInsightsSpecification;
        this.globalSecondaryIndexes = globalSecondaryIndexes;
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
        this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.sSESpecification = sSESpecification;
        this.tags = tags;
    }

    private GlobalTableReplicaSpecification() {
        this.contributorInsightsSpecification = null;
        this.globalSecondaryIndexes = List.of();
        this.pointInTimeRecoverySpecification = null;
        this.readProvisionedThroughputSettings = null;
        this.region = null;
        this.sSESpecification = null;
        this.tags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReplicaSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification;
        private @Nullable List<GlobalTableReplicaGlobalSecondaryIndexSpecification> globalSecondaryIndexes;
        private @Nullable GlobalTablePointInTimeRecoverySpecification pointInTimeRecoverySpecification;
        private @Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings;
        private String region;
        private @Nullable GlobalTableReplicaSSESpecification sSESpecification;
        private @Nullable List<GlobalTableTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReplicaSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contributorInsightsSpecification = defaults.contributorInsightsSpecification;
    	      this.globalSecondaryIndexes = defaults.globalSecondaryIndexes;
    	      this.pointInTimeRecoverySpecification = defaults.pointInTimeRecoverySpecification;
    	      this.readProvisionedThroughputSettings = defaults.readProvisionedThroughputSettings;
    	      this.region = defaults.region;
    	      this.sSESpecification = defaults.sSESpecification;
    	      this.tags = defaults.tags;
        }

        public Builder setContributorInsightsSpecification(@Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification) {
            this.contributorInsightsSpecification = contributorInsightsSpecification;
            return this;
        }

        public Builder setGlobalSecondaryIndexes(@Nullable List<GlobalTableReplicaGlobalSecondaryIndexSpecification> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = globalSecondaryIndexes;
            return this;
        }

        public Builder setPointInTimeRecoverySpecification(@Nullable GlobalTablePointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
            this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
            return this;
        }

        public Builder setReadProvisionedThroughputSettings(@Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings) {
            this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSSESpecification(@Nullable GlobalTableReplicaSSESpecification sSESpecification) {
            this.sSESpecification = sSESpecification;
            return this;
        }

        public Builder setTags(@Nullable List<GlobalTableTag> tags) {
            this.tags = tags;
            return this;
        }

        public GlobalTableReplicaSpecification build() {
            return new GlobalTableReplicaSpecification(contributorInsightsSpecification, globalSecondaryIndexes, pointInTimeRecoverySpecification, readProvisionedThroughputSettings, region, sSESpecification, tags);
        }
    }
}
