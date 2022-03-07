// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlConnectionInfoResponse {
    /**
     * Additional connection settings
     * 
     */
    private final @Nullable String additionalSettings;
    /**
     * Authentication type to use for connection
     * 
     */
    private final @Nullable String authentication;
    /**
     * Data source in the format Protocol:MachineName\SQLServerInstanceName,PortNumber
     * 
     */
    private final String dataSource;
    /**
     * Whether to encrypt the connection
     * 
     */
    private final @Nullable Boolean encryptConnection;
    /**
     * Password credential.
     * 
     */
    private final @Nullable String password;
    /**
     * Server platform type for connection
     * 
     */
    private final @Nullable String platform;
    /**
     * Whether to trust the server certificate
     * 
     */
    private final @Nullable Boolean trustServerCertificate;
    /**
     * Type of connection info
     * Expected value is 'SqlConnectionInfo'.
     * 
     */
    private final String type;
    /**
     * User name
     * 
     */
    private final @Nullable String userName;

    @OutputCustomType.Constructor({"additionalSettings","authentication","dataSource","encryptConnection","password","platform","trustServerCertificate","type","userName"})
    private SqlConnectionInfoResponse(
        @Nullable String additionalSettings,
        @Nullable String authentication,
        String dataSource,
        @Nullable Boolean encryptConnection,
        @Nullable String password,
        @Nullable String platform,
        @Nullable Boolean trustServerCertificate,
        String type,
        @Nullable String userName) {
        this.additionalSettings = additionalSettings;
        this.authentication = authentication;
        this.dataSource = Objects.requireNonNull(dataSource);
        this.encryptConnection = encryptConnection;
        this.password = password;
        this.platform = platform;
        this.trustServerCertificate = trustServerCertificate;
        this.type = Objects.requireNonNull(type);
        this.userName = userName;
    }

    /**
     * Additional connection settings
     * 
    */
    public Optional<String> getAdditionalSettings() {
        return Optional.ofNullable(this.additionalSettings);
    }
    /**
     * Authentication type to use for connection
     * 
    */
    public Optional<String> getAuthentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * Data source in the format Protocol:MachineName\SQLServerInstanceName,PortNumber
     * 
    */
    public String getDataSource() {
        return this.dataSource;
    }
    /**
     * Whether to encrypt the connection
     * 
    */
    public Optional<Boolean> getEncryptConnection() {
        return Optional.ofNullable(this.encryptConnection);
    }
    /**
     * Password credential.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Server platform type for connection
     * 
    */
    public Optional<String> getPlatform() {
        return Optional.ofNullable(this.platform);
    }
    /**
     * Whether to trust the server certificate
     * 
    */
    public Optional<Boolean> getTrustServerCertificate() {
        return Optional.ofNullable(this.trustServerCertificate);
    }
    /**
     * Type of connection info
     * Expected value is 'SqlConnectionInfo'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * User name
     * 
    */
    public Optional<String> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String additionalSettings;
        private @Nullable String authentication;
        private String dataSource;
        private @Nullable Boolean encryptConnection;
        private @Nullable String password;
        private @Nullable String platform;
        private @Nullable Boolean trustServerCertificate;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalSettings = defaults.additionalSettings;
    	      this.authentication = defaults.authentication;
    	      this.dataSource = defaults.dataSource;
    	      this.encryptConnection = defaults.encryptConnection;
    	      this.password = defaults.password;
    	      this.platform = defaults.platform;
    	      this.trustServerCertificate = defaults.trustServerCertificate;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setAdditionalSettings(@Nullable String additionalSettings) {
            this.additionalSettings = additionalSettings;
            return this;
        }

        public Builder setAuthentication(@Nullable String authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setDataSource(String dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }

        public Builder setEncryptConnection(@Nullable Boolean encryptConnection) {
            this.encryptConnection = encryptConnection;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setPlatform(@Nullable String platform) {
            this.platform = platform;
            return this;
        }

        public Builder setTrustServerCertificate(@Nullable Boolean trustServerCertificate) {
            this.trustServerCertificate = trustServerCertificate;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public SqlConnectionInfoResponse build() {
            return new SqlConnectionInfoResponse(additionalSettings, authentication, dataSource, encryptConnection, password, platform, trustServerCertificate, type, userName);
        }
    }
}