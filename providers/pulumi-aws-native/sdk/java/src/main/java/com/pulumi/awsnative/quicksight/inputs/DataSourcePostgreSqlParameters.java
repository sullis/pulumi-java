// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;PostgreSQL parameters.&lt;/p&gt;
 * 
 */
public final class DataSourcePostgreSqlParameters extends com.pulumi.resources.InvokeArgs {

    public static final DataSourcePostgreSqlParameters Empty = new DataSourcePostgreSqlParameters();

    /**
     * &lt;p&gt;Database.&lt;/p&gt;
     * 
     */
    @Import(name="database", required=true)
    private String database;

    /**
     * @return &lt;p&gt;Database.&lt;/p&gt;
     * 
     */
    public String database() {
        return this.database;
    }

    /**
     * &lt;p&gt;Host.&lt;/p&gt;
     * 
     */
    @Import(name="host", required=true)
    private String host;

    /**
     * @return &lt;p&gt;Host.&lt;/p&gt;
     * 
     */
    public String host() {
        return this.host;
    }

    /**
     * &lt;p&gt;Port.&lt;/p&gt;
     * 
     */
    @Import(name="port", required=true)
    private Double port;

    /**
     * @return &lt;p&gt;Port.&lt;/p&gt;
     * 
     */
    public Double port() {
        return this.port;
    }

    private DataSourcePostgreSqlParameters() {}

    private DataSourcePostgreSqlParameters(DataSourcePostgreSqlParameters $) {
        this.database = $.database;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourcePostgreSqlParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourcePostgreSqlParameters $;

        public Builder() {
            $ = new DataSourcePostgreSqlParameters();
        }

        public Builder(DataSourcePostgreSqlParameters defaults) {
            $ = new DataSourcePostgreSqlParameters(Objects.requireNonNull(defaults));
        }

        /**
         * @param database &lt;p&gt;Database.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            $.database = database;
            return this;
        }

        /**
         * @param host &lt;p&gt;Host.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            $.host = host;
            return this;
        }

        /**
         * @param port &lt;p&gt;Port.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder port(Double port) {
            $.port = port;
            return this;
        }

        public DataSourcePostgreSqlParameters build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
