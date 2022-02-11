// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerBasicAuthentication;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWebCrawlerAuthenticationConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceWebCrawlerAuthenticationConfiguration Empty = new DataSourceWebCrawlerAuthenticationConfiguration();

    @InputImport(name="basicAuthentication")
    private final @Nullable List<DataSourceWebCrawlerBasicAuthentication> basicAuthentication;

    public List<DataSourceWebCrawlerBasicAuthentication> getBasicAuthentication() {
        return this.basicAuthentication == null ? List.of() : this.basicAuthentication;
    }

    public DataSourceWebCrawlerAuthenticationConfiguration(@Nullable List<DataSourceWebCrawlerBasicAuthentication> basicAuthentication) {
        this.basicAuthentication = basicAuthentication;
    }

    private DataSourceWebCrawlerAuthenticationConfiguration() {
        this.basicAuthentication = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerAuthenticationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataSourceWebCrawlerBasicAuthentication> basicAuthentication;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerAuthenticationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuthentication = defaults.basicAuthentication;
        }

        public Builder setBasicAuthentication(@Nullable List<DataSourceWebCrawlerBasicAuthentication> basicAuthentication) {
            this.basicAuthentication = basicAuthentication;
            return this;
        }

        public DataSourceWebCrawlerAuthenticationConfiguration build() {
            return new DataSourceWebCrawlerAuthenticationConfiguration(basicAuthentication);
        }
    }
}
