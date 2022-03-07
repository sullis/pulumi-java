// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerSeedUrlConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerSiteMapsConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWebCrawlerUrls extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceWebCrawlerUrls Empty = new DataSourceWebCrawlerUrls();

    @InputImport(name="seedUrlConfiguration")
      private final @Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration;

    public Optional<DataSourceWebCrawlerSeedUrlConfiguration> getSeedUrlConfiguration() {
        return this.seedUrlConfiguration == null ? Optional.empty() : Optional.ofNullable(this.seedUrlConfiguration);
    }

    @InputImport(name="siteMapsConfiguration")
      private final @Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration;

    public Optional<DataSourceWebCrawlerSiteMapsConfiguration> getSiteMapsConfiguration() {
        return this.siteMapsConfiguration == null ? Optional.empty() : Optional.ofNullable(this.siteMapsConfiguration);
    }

    public DataSourceWebCrawlerUrls(
        @Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration,
        @Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration) {
        this.seedUrlConfiguration = seedUrlConfiguration;
        this.siteMapsConfiguration = siteMapsConfiguration;
    }

    private DataSourceWebCrawlerUrls() {
        this.seedUrlConfiguration = null;
        this.siteMapsConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerUrls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration;
        private @Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerUrls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seedUrlConfiguration = defaults.seedUrlConfiguration;
    	      this.siteMapsConfiguration = defaults.siteMapsConfiguration;
        }

        public Builder setSeedUrlConfiguration(@Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration) {
            this.seedUrlConfiguration = seedUrlConfiguration;
            return this;
        }

        public Builder setSiteMapsConfiguration(@Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration) {
            this.siteMapsConfiguration = siteMapsConfiguration;
            return this;
        }
        public DataSourceWebCrawlerUrls build() {
            return new DataSourceWebCrawlerUrls(seedUrlConfiguration, siteMapsConfiguration);
        }
    }
}