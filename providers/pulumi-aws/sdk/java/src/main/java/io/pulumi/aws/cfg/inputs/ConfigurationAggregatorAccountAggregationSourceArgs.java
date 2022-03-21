// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationAggregatorAccountAggregationSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationAggregatorAccountAggregationSourceArgs Empty = new ConfigurationAggregatorAccountAggregationSourceArgs();

    /**
     * List of 12-digit account IDs of the account(s) being aggregated.
     * 
     */
    @Import(name="accountIds", required=true)
      private final Output<List<String>> accountIds;

    public Output<List<String>> getAccountIds() {
        return this.accountIds;
    }

    /**
     * If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    @Import(name="allRegions")
      private final @Nullable Output<Boolean> allRegions;

    public Output<Boolean> getAllRegions() {
        return this.allRegions == null ? Output.empty() : this.allRegions;
    }

    /**
     * List of source regions being aggregated.
     * 
     */
    @Import(name="regions")
      private final @Nullable Output<List<String>> regions;

    public Output<List<String>> getRegions() {
        return this.regions == null ? Output.empty() : this.regions;
    }

    public ConfigurationAggregatorAccountAggregationSourceArgs(
        Output<List<String>> accountIds,
        @Nullable Output<Boolean> allRegions,
        @Nullable Output<List<String>> regions) {
        this.accountIds = Objects.requireNonNull(accountIds, "expected parameter 'accountIds' to be non-null");
        this.allRegions = allRegions;
        this.regions = regions;
    }

    private ConfigurationAggregatorAccountAggregationSourceArgs() {
        this.accountIds = Output.empty();
        this.allRegions = Output.empty();
        this.regions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorAccountAggregationSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> accountIds;
        private @Nullable Output<Boolean> allRegions;
        private @Nullable Output<List<String>> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorAccountAggregationSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountIds = defaults.accountIds;
    	      this.allRegions = defaults.allRegions;
    	      this.regions = defaults.regions;
        }

        public Builder accountIds(Output<List<String>> accountIds) {
            this.accountIds = Objects.requireNonNull(accountIds);
            return this;
        }
        public Builder accountIds(List<String> accountIds) {
            this.accountIds = Output.of(Objects.requireNonNull(accountIds));
            return this;
        }
        public Builder accountIds(String... accountIds) {
            return accountIds(List.of(accountIds));
        }
        public Builder allRegions(@Nullable Output<Boolean> allRegions) {
            this.allRegions = allRegions;
            return this;
        }
        public Builder allRegions(@Nullable Boolean allRegions) {
            this.allRegions = Output.ofNullable(allRegions);
            return this;
        }
        public Builder regions(@Nullable Output<List<String>> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(@Nullable List<String> regions) {
            this.regions = Output.ofNullable(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }        public ConfigurationAggregatorAccountAggregationSourceArgs build() {
            return new ConfigurationAggregatorAccountAggregationSourceArgs(accountIds, allRegions, regions);
        }
    }
}
