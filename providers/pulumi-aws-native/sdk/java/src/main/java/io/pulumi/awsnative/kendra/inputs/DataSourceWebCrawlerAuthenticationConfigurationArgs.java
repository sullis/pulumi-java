// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerBasicAuthenticationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceWebCrawlerAuthenticationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceWebCrawlerAuthenticationConfigurationArgs Empty = new DataSourceWebCrawlerAuthenticationConfigurationArgs();

    @InputImport(name="basicAuthentication")
    private final @Nullable Input<List<DataSourceWebCrawlerBasicAuthenticationArgs>> basicAuthentication;

    public Input<List<DataSourceWebCrawlerBasicAuthenticationArgs>> getBasicAuthentication() {
        return this.basicAuthentication == null ? Input.empty() : this.basicAuthentication;
    }

    public DataSourceWebCrawlerAuthenticationConfigurationArgs(@Nullable Input<List<DataSourceWebCrawlerBasicAuthenticationArgs>> basicAuthentication) {
        this.basicAuthentication = basicAuthentication;
    }

    private DataSourceWebCrawlerAuthenticationConfigurationArgs() {
        this.basicAuthentication = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerAuthenticationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DataSourceWebCrawlerBasicAuthenticationArgs>> basicAuthentication;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerAuthenticationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuthentication = defaults.basicAuthentication;
        }

        public Builder setBasicAuthentication(@Nullable Input<List<DataSourceWebCrawlerBasicAuthenticationArgs>> basicAuthentication) {
            this.basicAuthentication = basicAuthentication;
            return this;
        }

        public Builder setBasicAuthentication(@Nullable List<DataSourceWebCrawlerBasicAuthenticationArgs> basicAuthentication) {
            this.basicAuthentication = Input.ofNullable(basicAuthentication);
            return this;
        }

        public DataSourceWebCrawlerAuthenticationConfigurationArgs build() {
            return new DataSourceWebCrawlerAuthenticationConfigurationArgs(basicAuthentication);
        }
    }
}
