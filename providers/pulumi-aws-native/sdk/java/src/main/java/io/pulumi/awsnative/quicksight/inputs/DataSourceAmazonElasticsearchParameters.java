// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Amazon Elasticsearch Service parameters.</p>
 * 
 */
public final class DataSourceAmazonElasticsearchParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceAmazonElasticsearchParameters Empty = new DataSourceAmazonElasticsearchParameters();

    /**
     * <p>The Amazon Elasticsearch Service domain.</p>
     * 
     */
    @Import(name="domain", required=true)
      private final String domain;

    public String getDomain() {
        return this.domain;
    }

    public DataSourceAmazonElasticsearchParameters(String domain) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
    }

    private DataSourceAmazonElasticsearchParameters() {
        this.domain = null;
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

        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }        public DataSourceAmazonElasticsearchParameters build() {
            return new DataSourceAmazonElasticsearchParameters(domain);
        }
    }
}
