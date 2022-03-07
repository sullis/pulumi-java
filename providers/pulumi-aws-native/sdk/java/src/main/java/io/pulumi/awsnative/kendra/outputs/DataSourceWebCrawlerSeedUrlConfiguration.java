// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceWebCrawlerSeedUrlConfiguration {
    private final List<String> seedUrls;
    private final @Nullable DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode webCrawlerMode;

    @OutputCustomType.Constructor({"seedUrls","webCrawlerMode"})
    private DataSourceWebCrawlerSeedUrlConfiguration(
        List<String> seedUrls,
        @Nullable DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode webCrawlerMode) {
        this.seedUrls = Objects.requireNonNull(seedUrls);
        this.webCrawlerMode = webCrawlerMode;
    }

    public List<String> getSeedUrls() {
        return this.seedUrls;
    }
    public Optional<DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode> getWebCrawlerMode() {
        return Optional.ofNullable(this.webCrawlerMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerSeedUrlConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> seedUrls;
        private @Nullable DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode webCrawlerMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerSeedUrlConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seedUrls = defaults.seedUrls;
    	      this.webCrawlerMode = defaults.webCrawlerMode;
        }

        public Builder setSeedUrls(List<String> seedUrls) {
            this.seedUrls = Objects.requireNonNull(seedUrls);
            return this;
        }

        public Builder setWebCrawlerMode(@Nullable DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode webCrawlerMode) {
            this.webCrawlerMode = webCrawlerMode;
            return this;
        }
        public DataSourceWebCrawlerSeedUrlConfiguration build() {
            return new DataSourceWebCrawlerSeedUrlConfiguration(seedUrls, webCrawlerMode);
        }
    }
}