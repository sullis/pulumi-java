// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DataSourceWebCrawlerSiteMapsConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceWebCrawlerSiteMapsConfiguration Empty = new DataSourceWebCrawlerSiteMapsConfiguration();

    @InputImport(name="siteMaps", required=true)
    private final List<String> siteMaps;

    public List<String> getSiteMaps() {
        return this.siteMaps;
    }

    public DataSourceWebCrawlerSiteMapsConfiguration(List<String> siteMaps) {
        this.siteMaps = Objects.requireNonNull(siteMaps, "expected parameter 'siteMaps' to be non-null");
    }

    private DataSourceWebCrawlerSiteMapsConfiguration() {
        this.siteMaps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerSiteMapsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> siteMaps;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerSiteMapsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteMaps = defaults.siteMaps;
        }

        public Builder setSiteMaps(List<String> siteMaps) {
            this.siteMaps = Objects.requireNonNull(siteMaps);
            return this;
        }

        public DataSourceWebCrawlerSiteMapsConfiguration build() {
            return new DataSourceWebCrawlerSiteMapsConfiguration(siteMaps);
        }
    }
}
