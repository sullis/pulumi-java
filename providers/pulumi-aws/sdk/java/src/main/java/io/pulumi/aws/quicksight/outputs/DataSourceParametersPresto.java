// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceParametersPresto {
    /**
     * The catalog to which to connect.
     * 
     */
    private final String catalog;
    /**
     * The host to which to connect.
     * 
     */
    private final String host;
    /**
     * The port to which to connect.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private DataSourceParametersPresto(
        @CustomType.Parameter("catalog") String catalog,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Integer port) {
        this.catalog = catalog;
        this.host = host;
        this.port = port;
    }

    /**
     * The catalog to which to connect.
     * 
    */
    public String catalog() {
        return this.catalog;
    }
    /**
     * The host to which to connect.
     * 
    */
    public String host() {
        return this.host;
    }
    /**
     * The port to which to connect.
     * 
    */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersPresto defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalog;
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersPresto defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder catalog(String catalog) {
            this.catalog = Objects.requireNonNull(catalog);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public DataSourceParametersPresto build() {
            return new DataSourceParametersPresto(catalog, host, port);
        }
    }
}
