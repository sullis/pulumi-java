// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.DataSourceSalesforceKnowledgeArticleState;
import io.pulumi.awsnative.kendra.outputs.DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceSalesforceKnowledgeArticleConfiguration {
    private final @Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations;
    private final List<DataSourceSalesforceKnowledgeArticleState> includedStates;
    private final @Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration;

    @CustomType.Constructor
    private DataSourceSalesforceKnowledgeArticleConfiguration(
        @CustomType.Parameter("customKnowledgeArticleTypeConfigurations") @Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations,
        @CustomType.Parameter("includedStates") List<DataSourceSalesforceKnowledgeArticleState> includedStates,
        @CustomType.Parameter("standardKnowledgeArticleTypeConfiguration") @Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration) {
        this.customKnowledgeArticleTypeConfigurations = customKnowledgeArticleTypeConfigurations;
        this.includedStates = includedStates;
        this.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
    }

    public List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> getCustomKnowledgeArticleTypeConfigurations() {
        return this.customKnowledgeArticleTypeConfigurations == null ? List.of() : this.customKnowledgeArticleTypeConfigurations;
    }
    public List<DataSourceSalesforceKnowledgeArticleState> getIncludedStates() {
        return this.includedStates;
    }
    public Optional<DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration> getStandardKnowledgeArticleTypeConfiguration() {
        return Optional.ofNullable(this.standardKnowledgeArticleTypeConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceKnowledgeArticleConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations;
        private List<DataSourceSalesforceKnowledgeArticleState> includedStates;
        private @Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceKnowledgeArticleConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customKnowledgeArticleTypeConfigurations = defaults.customKnowledgeArticleTypeConfigurations;
    	      this.includedStates = defaults.includedStates;
    	      this.standardKnowledgeArticleTypeConfiguration = defaults.standardKnowledgeArticleTypeConfiguration;
        }

        public Builder customKnowledgeArticleTypeConfigurations(@Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations) {
            this.customKnowledgeArticleTypeConfigurations = customKnowledgeArticleTypeConfigurations;
            return this;
        }
        public Builder customKnowledgeArticleTypeConfigurations(DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration... customKnowledgeArticleTypeConfigurations) {
            return customKnowledgeArticleTypeConfigurations(List.of(customKnowledgeArticleTypeConfigurations));
        }
        public Builder includedStates(List<DataSourceSalesforceKnowledgeArticleState> includedStates) {
            this.includedStates = Objects.requireNonNull(includedStates);
            return this;
        }
        public Builder includedStates(DataSourceSalesforceKnowledgeArticleState... includedStates) {
            return includedStates(List.of(includedStates));
        }
        public Builder standardKnowledgeArticleTypeConfiguration(@Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration) {
            this.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
            return this;
        }        public DataSourceSalesforceKnowledgeArticleConfiguration build() {
            return new DataSourceSalesforceKnowledgeArticleConfiguration(customKnowledgeArticleTypeConfigurations, includedStates, standardKnowledgeArticleTypeConfiguration);
        }
    }
}
