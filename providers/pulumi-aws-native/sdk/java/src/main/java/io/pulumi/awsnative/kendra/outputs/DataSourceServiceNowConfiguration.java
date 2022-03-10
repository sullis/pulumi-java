// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.DataSourceServiceNowAuthenticationType;
import io.pulumi.awsnative.kendra.enums.DataSourceServiceNowBuildVersionType;
import io.pulumi.awsnative.kendra.outputs.DataSourceServiceNowKnowledgeArticleConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceServiceNowServiceCatalogConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceServiceNowConfiguration {
    private final @Nullable DataSourceServiceNowAuthenticationType authenticationType;
    private final String hostUrl;
    private final @Nullable DataSourceServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration;
    private final String secretArn;
    private final @Nullable DataSourceServiceNowServiceCatalogConfiguration serviceCatalogConfiguration;
    private final DataSourceServiceNowBuildVersionType serviceNowBuildVersion;

    @OutputCustomType.Constructor
    private DataSourceServiceNowConfiguration(
        @OutputCustomType.Parameter("authenticationType") @Nullable DataSourceServiceNowAuthenticationType authenticationType,
        @OutputCustomType.Parameter("hostUrl") String hostUrl,
        @OutputCustomType.Parameter("knowledgeArticleConfiguration") @Nullable DataSourceServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration,
        @OutputCustomType.Parameter("secretArn") String secretArn,
        @OutputCustomType.Parameter("serviceCatalogConfiguration") @Nullable DataSourceServiceNowServiceCatalogConfiguration serviceCatalogConfiguration,
        @OutputCustomType.Parameter("serviceNowBuildVersion") DataSourceServiceNowBuildVersionType serviceNowBuildVersion) {
        this.authenticationType = authenticationType;
        this.hostUrl = hostUrl;
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
        this.secretArn = secretArn;
        this.serviceCatalogConfiguration = serviceCatalogConfiguration;
        this.serviceNowBuildVersion = serviceNowBuildVersion;
    }

    public Optional<DataSourceServiceNowAuthenticationType> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    public String getHostUrl() {
        return this.hostUrl;
    }
    public Optional<DataSourceServiceNowKnowledgeArticleConfiguration> getKnowledgeArticleConfiguration() {
        return Optional.ofNullable(this.knowledgeArticleConfiguration);
    }
    public String getSecretArn() {
        return this.secretArn;
    }
    public Optional<DataSourceServiceNowServiceCatalogConfiguration> getServiceCatalogConfiguration() {
        return Optional.ofNullable(this.serviceCatalogConfiguration);
    }
    public DataSourceServiceNowBuildVersionType getServiceNowBuildVersion() {
        return this.serviceNowBuildVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceServiceNowConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceServiceNowAuthenticationType authenticationType;
        private String hostUrl;
        private @Nullable DataSourceServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration;
        private String secretArn;
        private @Nullable DataSourceServiceNowServiceCatalogConfiguration serviceCatalogConfiguration;
        private DataSourceServiceNowBuildVersionType serviceNowBuildVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceServiceNowConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.hostUrl = defaults.hostUrl;
    	      this.knowledgeArticleConfiguration = defaults.knowledgeArticleConfiguration;
    	      this.secretArn = defaults.secretArn;
    	      this.serviceCatalogConfiguration = defaults.serviceCatalogConfiguration;
    	      this.serviceNowBuildVersion = defaults.serviceNowBuildVersion;
        }

        public Builder setAuthenticationType(@Nullable DataSourceServiceNowAuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setHostUrl(String hostUrl) {
            this.hostUrl = Objects.requireNonNull(hostUrl);
            return this;
        }

        public Builder setKnowledgeArticleConfiguration(@Nullable DataSourceServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
            this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
            return this;
        }

        public Builder setSecretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder setServiceCatalogConfiguration(@Nullable DataSourceServiceNowServiceCatalogConfiguration serviceCatalogConfiguration) {
            this.serviceCatalogConfiguration = serviceCatalogConfiguration;
            return this;
        }

        public Builder setServiceNowBuildVersion(DataSourceServiceNowBuildVersionType serviceNowBuildVersion) {
            this.serviceNowBuildVersion = Objects.requireNonNull(serviceNowBuildVersion);
            return this;
        }
        public DataSourceServiceNowConfiguration build() {
            return new DataSourceServiceNowConfiguration(authenticationType, hostUrl, knowledgeArticleConfiguration, secretArn, serviceCatalogConfiguration, serviceNowBuildVersion);
        }
    }
}
