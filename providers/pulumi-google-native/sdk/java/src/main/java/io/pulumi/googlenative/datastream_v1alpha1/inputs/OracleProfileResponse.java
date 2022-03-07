// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Oracle database profile.
 * 
 */
public final class OracleProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final OracleProfileResponse Empty = new OracleProfileResponse();

    /**
     * Connection string attributes
     * 
     */
    @InputImport(name="connectionAttributes", required=true)
      private final Map<String,String> connectionAttributes;

    public Map<String,String> getConnectionAttributes() {
        return this.connectionAttributes;
    }

    /**
     * Database for the Oracle connection.
     * 
     */
    @InputImport(name="databaseService", required=true)
      private final String databaseService;

    public String getDatabaseService() {
        return this.databaseService;
    }

    /**
     * Hostname for the Oracle connection.
     * 
     */
    @InputImport(name="hostname", required=true)
      private final String hostname;

    public String getHostname() {
        return this.hostname;
    }

    /**
     * Password for the Oracle connection.
     * 
     */
    @InputImport(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * Port for the Oracle connection, default value is 1521.
     * 
     */
    @InputImport(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * Username for the Oracle connection.
     * 
     */
    @InputImport(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public OracleProfileResponse(
        Map<String,String> connectionAttributes,
        String databaseService,
        String hostname,
        String password,
        Integer port,
        String username) {
        this.connectionAttributes = Objects.requireNonNull(connectionAttributes, "expected parameter 'connectionAttributes' to be non-null");
        this.databaseService = Objects.requireNonNull(databaseService, "expected parameter 'databaseService' to be non-null");
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private OracleProfileResponse() {
        this.connectionAttributes = Map.of();
        this.databaseService = null;
        this.hostname = null;
        this.password = null;
        this.port = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> connectionAttributes;
        private String databaseService;
        private String hostname;
        private String password;
        private Integer port;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionAttributes = defaults.connectionAttributes;
    	      this.databaseService = defaults.databaseService;
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.username = defaults.username;
        }

        public Builder setConnectionAttributes(Map<String,String> connectionAttributes) {
            this.connectionAttributes = Objects.requireNonNull(connectionAttributes);
            return this;
        }

        public Builder setDatabaseService(String databaseService) {
            this.databaseService = Objects.requireNonNull(databaseService);
            return this;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public OracleProfileResponse build() {
            return new OracleProfileResponse(connectionAttributes, databaseService, hostname, password, port, username);
        }
    }
}