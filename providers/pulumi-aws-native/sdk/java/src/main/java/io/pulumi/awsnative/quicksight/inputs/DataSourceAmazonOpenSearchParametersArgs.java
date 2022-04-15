// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Amazon OpenSearch Service parameters.</p>
 * 
 */
public final class DataSourceAmazonOpenSearchParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceAmazonOpenSearchParametersArgs Empty = new DataSourceAmazonOpenSearchParametersArgs();

    /**
     * <p>The Amazon OpenSearch Service domain.</p>
     * 
     */
    @Import(name="domain", required=true)
      private final Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    public DataSourceAmazonOpenSearchParametersArgs(Output<String> domain) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
    }

    private DataSourceAmazonOpenSearchParametersArgs() {
        this.domain = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAmazonOpenSearchParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domain;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAmazonOpenSearchParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        public Builder domain(Output<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }        public DataSourceAmazonOpenSearchParametersArgs build() {
            return new DataSourceAmazonOpenSearchParametersArgs(domain);
        }
    }
}
