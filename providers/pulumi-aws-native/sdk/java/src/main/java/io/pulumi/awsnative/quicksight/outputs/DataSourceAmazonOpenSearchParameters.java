// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceAmazonOpenSearchParameters {
    /**
     * <p>The Amazon OpenSearch Service domain.</p>
     * 
     */
    private final String domain;

    @OutputCustomType.Constructor
    private DataSourceAmazonOpenSearchParameters(@OutputCustomType.Parameter("domain") String domain) {
        this.domain = domain;
    }

    /**
     * <p>The Amazon OpenSearch Service domain.</p>
     * 
    */
    public String getDomain() {
        return this.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAmazonOpenSearchParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAmazonOpenSearchParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public DataSourceAmazonOpenSearchParameters build() {
            return new DataSourceAmazonOpenSearchParameters(domain);
        }
    }
}
