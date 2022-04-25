// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Oracle database profile.
 * 
 */
public final class OracleProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final OracleProfileArgs Empty = new OracleProfileArgs();

    /**
     * Connection string attributes
     * 
     */
    @Import(name="connectionAttributes")
    private @Nullable Output<Map<String,String>> connectionAttributes;

    /**
     * @return Connection string attributes
     * 
     */
    public Optional<Output<Map<String,String>>> connectionAttributes() {
        return Optional.ofNullable(this.connectionAttributes);
    }

    /**
     * Database for the Oracle connection.
     * 
     */
    @Import(name="databaseService", required=true)
    private Output<String> databaseService;

    /**
     * @return Database for the Oracle connection.
     * 
     */
    public Output<String> databaseService() {
        return this.databaseService;
    }

    /**
     * Hostname for the Oracle connection.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return Hostname for the Oracle connection.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * Password for the Oracle connection.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password for the Oracle connection.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Port for the Oracle connection, default value is 1521.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port for the Oracle connection, default value is 1521.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Username for the Oracle connection.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username for the Oracle connection.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private OracleProfileArgs() {}

    private OracleProfileArgs(OracleProfileArgs $) {
        this.connectionAttributes = $.connectionAttributes;
        this.databaseService = $.databaseService;
        this.hostname = $.hostname;
        this.password = $.password;
        this.port = $.port;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OracleProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleProfileArgs $;

        public Builder() {
            $ = new OracleProfileArgs();
        }

        public Builder(OracleProfileArgs defaults) {
            $ = new OracleProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionAttributes Connection string attributes
         * 
         * @return builder
         * 
         */
        public Builder connectionAttributes(@Nullable Output<Map<String,String>> connectionAttributes) {
            $.connectionAttributes = connectionAttributes;
            return this;
        }

        /**
         * @param connectionAttributes Connection string attributes
         * 
         * @return builder
         * 
         */
        public Builder connectionAttributes(Map<String,String> connectionAttributes) {
            return connectionAttributes(Output.of(connectionAttributes));
        }

        /**
         * @param databaseService Database for the Oracle connection.
         * 
         * @return builder
         * 
         */
        public Builder databaseService(Output<String> databaseService) {
            $.databaseService = databaseService;
            return this;
        }

        /**
         * @param databaseService Database for the Oracle connection.
         * 
         * @return builder
         * 
         */
        public Builder databaseService(String databaseService) {
            return databaseService(Output.of(databaseService));
        }

        /**
         * @param hostname Hostname for the Oracle connection.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Hostname for the Oracle connection.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param password Password for the Oracle connection.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for the Oracle connection.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port Port for the Oracle connection, default value is 1521.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port for the Oracle connection, default value is 1521.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param username Username for the Oracle connection.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for the Oracle connection.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public OracleProfileArgs build() {
            $.databaseService = Objects.requireNonNull($.databaseService, "expected parameter 'databaseService' to be non-null");
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
