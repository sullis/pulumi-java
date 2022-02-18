// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceSalesforceChatterFeedConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceSalesforceKnowledgeArticleConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceSalesforceStandardObjectAttachmentConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceSalesforceStandardObjectConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceSalesforceConfiguration {
    private final @Nullable DataSourceSalesforceChatterFeedConfiguration chatterFeedConfiguration;
    private final @Nullable Boolean crawlAttachments;
    private final @Nullable List<String> excludeAttachmentFilePatterns;
    private final @Nullable List<String> includeAttachmentFilePatterns;
    private final @Nullable DataSourceSalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration;
    private final String secretArn;
    private final String serverUrl;
    private final @Nullable DataSourceSalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration;
    private final @Nullable List<DataSourceSalesforceStandardObjectConfiguration> standardObjectConfigurations;

    @OutputCustomType.Constructor({"chatterFeedConfiguration","crawlAttachments","excludeAttachmentFilePatterns","includeAttachmentFilePatterns","knowledgeArticleConfiguration","secretArn","serverUrl","standardObjectAttachmentConfiguration","standardObjectConfigurations"})
    private DataSourceSalesforceConfiguration(
        @Nullable DataSourceSalesforceChatterFeedConfiguration chatterFeedConfiguration,
        @Nullable Boolean crawlAttachments,
        @Nullable List<String> excludeAttachmentFilePatterns,
        @Nullable List<String> includeAttachmentFilePatterns,
        @Nullable DataSourceSalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration,
        String secretArn,
        String serverUrl,
        @Nullable DataSourceSalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration,
        @Nullable List<DataSourceSalesforceStandardObjectConfiguration> standardObjectConfigurations) {
        this.chatterFeedConfiguration = chatterFeedConfiguration;
        this.crawlAttachments = crawlAttachments;
        this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
        this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
        this.secretArn = Objects.requireNonNull(secretArn);
        this.serverUrl = Objects.requireNonNull(serverUrl);
        this.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
        this.standardObjectConfigurations = standardObjectConfigurations;
    }

    public Optional<DataSourceSalesforceChatterFeedConfiguration> getChatterFeedConfiguration() {
        return Optional.ofNullable(this.chatterFeedConfiguration);
    }
    public Optional<Boolean> getCrawlAttachments() {
        return Optional.ofNullable(this.crawlAttachments);
    }
    public List<String> getExcludeAttachmentFilePatterns() {
        return this.excludeAttachmentFilePatterns == null ? List.of() : this.excludeAttachmentFilePatterns;
    }
    public List<String> getIncludeAttachmentFilePatterns() {
        return this.includeAttachmentFilePatterns == null ? List.of() : this.includeAttachmentFilePatterns;
    }
    public Optional<DataSourceSalesforceKnowledgeArticleConfiguration> getKnowledgeArticleConfiguration() {
        return Optional.ofNullable(this.knowledgeArticleConfiguration);
    }
    public String getSecretArn() {
        return this.secretArn;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }
    public Optional<DataSourceSalesforceStandardObjectAttachmentConfiguration> getStandardObjectAttachmentConfiguration() {
        return Optional.ofNullable(this.standardObjectAttachmentConfiguration);
    }
    public List<DataSourceSalesforceStandardObjectConfiguration> getStandardObjectConfigurations() {
        return this.standardObjectConfigurations == null ? List.of() : this.standardObjectConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceSalesforceChatterFeedConfiguration chatterFeedConfiguration;
        private @Nullable Boolean crawlAttachments;
        private @Nullable List<String> excludeAttachmentFilePatterns;
        private @Nullable List<String> includeAttachmentFilePatterns;
        private @Nullable DataSourceSalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration;
        private String secretArn;
        private String serverUrl;
        private @Nullable DataSourceSalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration;
        private @Nullable List<DataSourceSalesforceStandardObjectConfiguration> standardObjectConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chatterFeedConfiguration = defaults.chatterFeedConfiguration;
    	      this.crawlAttachments = defaults.crawlAttachments;
    	      this.excludeAttachmentFilePatterns = defaults.excludeAttachmentFilePatterns;
    	      this.includeAttachmentFilePatterns = defaults.includeAttachmentFilePatterns;
    	      this.knowledgeArticleConfiguration = defaults.knowledgeArticleConfiguration;
    	      this.secretArn = defaults.secretArn;
    	      this.serverUrl = defaults.serverUrl;
    	      this.standardObjectAttachmentConfiguration = defaults.standardObjectAttachmentConfiguration;
    	      this.standardObjectConfigurations = defaults.standardObjectConfigurations;
        }

        public Builder setChatterFeedConfiguration(@Nullable DataSourceSalesforceChatterFeedConfiguration chatterFeedConfiguration) {
            this.chatterFeedConfiguration = chatterFeedConfiguration;
            return this;
        }

        public Builder setCrawlAttachments(@Nullable Boolean crawlAttachments) {
            this.crawlAttachments = crawlAttachments;
            return this;
        }

        public Builder setExcludeAttachmentFilePatterns(@Nullable List<String> excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
            return this;
        }

        public Builder setIncludeAttachmentFilePatterns(@Nullable List<String> includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
            return this;
        }

        public Builder setKnowledgeArticleConfiguration(@Nullable DataSourceSalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
            this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
            return this;
        }

        public Builder setSecretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder setServerUrl(String serverUrl) {
            this.serverUrl = Objects.requireNonNull(serverUrl);
            return this;
        }

        public Builder setStandardObjectAttachmentConfiguration(@Nullable DataSourceSalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration) {
            this.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
            return this;
        }

        public Builder setStandardObjectConfigurations(@Nullable List<DataSourceSalesforceStandardObjectConfiguration> standardObjectConfigurations) {
            this.standardObjectConfigurations = standardObjectConfigurations;
            return this;
        }

        public DataSourceSalesforceConfiguration build() {
            return new DataSourceSalesforceConfiguration(chatterFeedConfiguration, crawlAttachments, excludeAttachmentFilePatterns, includeAttachmentFilePatterns, knowledgeArticleConfiguration, secretArn, serverUrl, standardObjectAttachmentConfiguration, standardObjectConfigurations);
        }
    }
}
