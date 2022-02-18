// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceSalesforceKnowledgeArticleState;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSalesforceKnowledgeArticleConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceSalesforceKnowledgeArticleConfiguration Empty = new DataSourceSalesforceKnowledgeArticleConfiguration();

    @InputImport(name="customKnowledgeArticleTypeConfigurations")
    private final @Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations;

    public List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> getCustomKnowledgeArticleTypeConfigurations() {
        return this.customKnowledgeArticleTypeConfigurations == null ? List.of() : this.customKnowledgeArticleTypeConfigurations;
    }

    @InputImport(name="includedStates", required=true)
    private final List<DataSourceSalesforceKnowledgeArticleState> includedStates;

    public List<DataSourceSalesforceKnowledgeArticleState> getIncludedStates() {
        return this.includedStates;
    }

    @InputImport(name="standardKnowledgeArticleTypeConfiguration")
    private final @Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration;

    public Optional<DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration> getStandardKnowledgeArticleTypeConfiguration() {
        return this.standardKnowledgeArticleTypeConfiguration == null ? Optional.empty() : Optional.ofNullable(this.standardKnowledgeArticleTypeConfiguration);
    }

    public DataSourceSalesforceKnowledgeArticleConfiguration(
        @Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations,
        List<DataSourceSalesforceKnowledgeArticleState> includedStates,
        @Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration) {
        this.customKnowledgeArticleTypeConfigurations = customKnowledgeArticleTypeConfigurations;
        this.includedStates = Objects.requireNonNull(includedStates, "expected parameter 'includedStates' to be non-null");
        this.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
    }

    private DataSourceSalesforceKnowledgeArticleConfiguration() {
        this.customKnowledgeArticleTypeConfigurations = List.of();
        this.includedStates = List.of();
        this.standardKnowledgeArticleTypeConfiguration = null;
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

        public Builder setCustomKnowledgeArticleTypeConfigurations(@Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations) {
            this.customKnowledgeArticleTypeConfigurations = customKnowledgeArticleTypeConfigurations;
            return this;
        }

        public Builder setIncludedStates(List<DataSourceSalesforceKnowledgeArticleState> includedStates) {
            this.includedStates = Objects.requireNonNull(includedStates);
            return this;
        }

        public Builder setStandardKnowledgeArticleTypeConfiguration(@Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration) {
            this.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
            return this;
        }

        public DataSourceSalesforceKnowledgeArticleConfiguration build() {
            return new DataSourceSalesforceKnowledgeArticleConfiguration(customKnowledgeArticleTypeConfigurations, includedStates, standardKnowledgeArticleTypeConfiguration);
        }
    }
}
