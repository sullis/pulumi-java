// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerSeedUrlConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerSiteMapsConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceWebCrawlerUrlsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceWebCrawlerUrlsArgs Empty = new DataSourceWebCrawlerUrlsArgs();

    @InputImport(name="seedUrlConfiguration")
    private final @Nullable Input<DataSourceWebCrawlerSeedUrlConfigurationArgs> seedUrlConfiguration;

    public Input<DataSourceWebCrawlerSeedUrlConfigurationArgs> getSeedUrlConfiguration() {
        return this.seedUrlConfiguration == null ? Input.empty() : this.seedUrlConfiguration;
    }

    @InputImport(name="siteMapsConfiguration")
    private final @Nullable Input<DataSourceWebCrawlerSiteMapsConfigurationArgs> siteMapsConfiguration;

    public Input<DataSourceWebCrawlerSiteMapsConfigurationArgs> getSiteMapsConfiguration() {
        return this.siteMapsConfiguration == null ? Input.empty() : this.siteMapsConfiguration;
    }

    public DataSourceWebCrawlerUrlsArgs(
        @Nullable Input<DataSourceWebCrawlerSeedUrlConfigurationArgs> seedUrlConfiguration,
        @Nullable Input<DataSourceWebCrawlerSiteMapsConfigurationArgs> siteMapsConfiguration) {
        this.seedUrlConfiguration = seedUrlConfiguration;
        this.siteMapsConfiguration = siteMapsConfiguration;
    }

    private DataSourceWebCrawlerUrlsArgs() {
        this.seedUrlConfiguration = Input.empty();
        this.siteMapsConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerUrlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataSourceWebCrawlerSeedUrlConfigurationArgs> seedUrlConfiguration;
        private @Nullable Input<DataSourceWebCrawlerSiteMapsConfigurationArgs> siteMapsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerUrlsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seedUrlConfiguration = defaults.seedUrlConfiguration;
    	      this.siteMapsConfiguration = defaults.siteMapsConfiguration;
        }

        public Builder setSeedUrlConfiguration(@Nullable Input<DataSourceWebCrawlerSeedUrlConfigurationArgs> seedUrlConfiguration) {
            this.seedUrlConfiguration = seedUrlConfiguration;
            return this;
        }

        public Builder setSeedUrlConfiguration(@Nullable DataSourceWebCrawlerSeedUrlConfigurationArgs seedUrlConfiguration) {
            this.seedUrlConfiguration = Input.ofNullable(seedUrlConfiguration);
            return this;
        }

        public Builder setSiteMapsConfiguration(@Nullable Input<DataSourceWebCrawlerSiteMapsConfigurationArgs> siteMapsConfiguration) {
            this.siteMapsConfiguration = siteMapsConfiguration;
            return this;
        }

        public Builder setSiteMapsConfiguration(@Nullable DataSourceWebCrawlerSiteMapsConfigurationArgs siteMapsConfiguration) {
            this.siteMapsConfiguration = Input.ofNullable(siteMapsConfiguration);
            return this;
        }

        public DataSourceWebCrawlerUrlsArgs build() {
            return new DataSourceWebCrawlerUrlsArgs(seedUrlConfiguration, siteMapsConfiguration);
        }
    }
}
