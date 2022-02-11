// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceAmazonElasticsearchParameters {
    private final String domain;

    @OutputCustomType.Constructor({"domain"})
    private DataSourceAmazonElasticsearchParameters(String domain) {
        this.domain = Objects.requireNonNull(domain);
    }

    public String getDomain() {
        return this.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAmazonElasticsearchParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAmazonElasticsearchParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public DataSourceAmazonElasticsearchParameters build() {
            return new DataSourceAmazonElasticsearchParameters(domain);
        }
    }
}
