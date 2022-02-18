// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourcePrestoParameters {
    /**
     * <p>Catalog.</p>
     * 
     */
    private final String catalog;
    /**
     * <p>Host.</p>
     * 
     */
    private final String host;
    /**
     * <p>Port.</p>
     * 
     */
    private final Double port;

    @OutputCustomType.Constructor({"catalog","host","port"})
    private DataSourcePrestoParameters(
        String catalog,
        String host,
        Double port) {
        this.catalog = Objects.requireNonNull(catalog);
        this.host = Objects.requireNonNull(host);
        this.port = Objects.requireNonNull(port);
    }

    /**
     * <p>Catalog.</p>
     * 
     */
    public String getCatalog() {
        return this.catalog;
    }
    /**
     * <p>Host.</p>
     * 
     */
    public String getHost() {
        return this.host;
    }
    /**
     * <p>Port.</p>
     * 
     */
    public Double getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourcePrestoParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalog;
        private String host;
        private Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourcePrestoParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setCatalog(String catalog) {
            this.catalog = Objects.requireNonNull(catalog);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPort(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public DataSourcePrestoParameters build() {
            return new DataSourcePrestoParameters(catalog, host, port);
        }
    }
}
