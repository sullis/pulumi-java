// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.awsnative.dynamodb.inputs.GlobalTableContributorInsightsSpecificationArgs;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTablePointInTimeRecoverySpecificationArgs;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableReadProvisionedThroughputSettingsArgs;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableReplicaSSESpecificationArgs;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalTableReplicaSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableReplicaSpecificationArgs Empty = new GlobalTableReplicaSpecificationArgs();

    @Import(name="contributorInsightsSpecification")
      private final @Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification;

    public Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification() {
        return this.contributorInsightsSpecification == null ? Codegen.empty() : this.contributorInsightsSpecification;
    }

    @Import(name="globalSecondaryIndexes")
      private final @Nullable Output<List<GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs>> globalSecondaryIndexes;

    public Output<List<GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs>> globalSecondaryIndexes() {
        return this.globalSecondaryIndexes == null ? Codegen.empty() : this.globalSecondaryIndexes;
    }

    @Import(name="pointInTimeRecoverySpecification")
      private final @Nullable Output<GlobalTablePointInTimeRecoverySpecificationArgs> pointInTimeRecoverySpecification;

    public Output<GlobalTablePointInTimeRecoverySpecificationArgs> pointInTimeRecoverySpecification() {
        return this.pointInTimeRecoverySpecification == null ? Codegen.empty() : this.pointInTimeRecoverySpecification;
    }

    @Import(name="readProvisionedThroughputSettings")
      private final @Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings;

    public Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings() {
        return this.readProvisionedThroughputSettings == null ? Codegen.empty() : this.readProvisionedThroughputSettings;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="sSESpecification")
      private final @Nullable Output<GlobalTableReplicaSSESpecificationArgs> sSESpecification;

    public Output<GlobalTableReplicaSSESpecificationArgs> sSESpecification() {
        return this.sSESpecification == null ? Codegen.empty() : this.sSESpecification;
    }

    @Import(name="tags")
      private final @Nullable Output<List<GlobalTableTagArgs>> tags;

    public Output<List<GlobalTableTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public GlobalTableReplicaSpecificationArgs(
        @Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification,
        @Nullable Output<List<GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs>> globalSecondaryIndexes,
        @Nullable Output<GlobalTablePointInTimeRecoverySpecificationArgs> pointInTimeRecoverySpecification,
        @Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings,
        Output<String> region,
        @Nullable Output<GlobalTableReplicaSSESpecificationArgs> sSESpecification,
        @Nullable Output<List<GlobalTableTagArgs>> tags) {
        this.contributorInsightsSpecification = contributorInsightsSpecification;
        this.globalSecondaryIndexes = globalSecondaryIndexes;
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
        this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.sSESpecification = sSESpecification;
        this.tags = tags;
    }

    private GlobalTableReplicaSpecificationArgs() {
        this.contributorInsightsSpecification = Codegen.empty();
        this.globalSecondaryIndexes = Codegen.empty();
        this.pointInTimeRecoverySpecification = Codegen.empty();
        this.readProvisionedThroughputSettings = Codegen.empty();
        this.region = Codegen.empty();
        this.sSESpecification = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReplicaSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification;
        private @Nullable Output<List<GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs>> globalSecondaryIndexes;
        private @Nullable Output<GlobalTablePointInTimeRecoverySpecificationArgs> pointInTimeRecoverySpecification;
        private @Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings;
        private Output<String> region;
        private @Nullable Output<GlobalTableReplicaSSESpecificationArgs> sSESpecification;
        private @Nullable Output<List<GlobalTableTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReplicaSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contributorInsightsSpecification = defaults.contributorInsightsSpecification;
    	      this.globalSecondaryIndexes = defaults.globalSecondaryIndexes;
    	      this.pointInTimeRecoverySpecification = defaults.pointInTimeRecoverySpecification;
    	      this.readProvisionedThroughputSettings = defaults.readProvisionedThroughputSettings;
    	      this.region = defaults.region;
    	      this.sSESpecification = defaults.sSESpecification;
    	      this.tags = defaults.tags;
        }

        public Builder contributorInsightsSpecification(@Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification) {
            this.contributorInsightsSpecification = contributorInsightsSpecification;
            return this;
        }
        public Builder contributorInsightsSpecification(@Nullable GlobalTableContributorInsightsSpecificationArgs contributorInsightsSpecification) {
            this.contributorInsightsSpecification = Codegen.ofNullable(contributorInsightsSpecification);
            return this;
        }
        public Builder globalSecondaryIndexes(@Nullable Output<List<GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs>> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = globalSecondaryIndexes;
            return this;
        }
        public Builder globalSecondaryIndexes(@Nullable List<GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = Codegen.ofNullable(globalSecondaryIndexes);
            return this;
        }
        public Builder globalSecondaryIndexes(GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs... globalSecondaryIndexes) {
            return globalSecondaryIndexes(List.of(globalSecondaryIndexes));
        }
        public Builder pointInTimeRecoverySpecification(@Nullable Output<GlobalTablePointInTimeRecoverySpecificationArgs> pointInTimeRecoverySpecification) {
            this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
            return this;
        }
        public Builder pointInTimeRecoverySpecification(@Nullable GlobalTablePointInTimeRecoverySpecificationArgs pointInTimeRecoverySpecification) {
            this.pointInTimeRecoverySpecification = Codegen.ofNullable(pointInTimeRecoverySpecification);
            return this;
        }
        public Builder readProvisionedThroughputSettings(@Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings) {
            this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
            return this;
        }
        public Builder readProvisionedThroughputSettings(@Nullable GlobalTableReadProvisionedThroughputSettingsArgs readProvisionedThroughputSettings) {
            this.readProvisionedThroughputSettings = Codegen.ofNullable(readProvisionedThroughputSettings);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder sSESpecification(@Nullable Output<GlobalTableReplicaSSESpecificationArgs> sSESpecification) {
            this.sSESpecification = sSESpecification;
            return this;
        }
        public Builder sSESpecification(@Nullable GlobalTableReplicaSSESpecificationArgs sSESpecification) {
            this.sSESpecification = Codegen.ofNullable(sSESpecification);
            return this;
        }
        public Builder tags(@Nullable Output<List<GlobalTableTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<GlobalTableTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(GlobalTableTagArgs... tags) {
            return tags(List.of(tags));
        }        public GlobalTableReplicaSpecificationArgs build() {
            return new GlobalTableReplicaSpecificationArgs(contributorInsightsSpecification, globalSecondaryIndexes, pointInTimeRecoverySpecification, readProvisionedThroughputSettings, region, sSESpecification, tags);
        }
    }
}
