// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Read-replica configuration specific to MySQL databases.
 * 
 */
public final class MySqlReplicaConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final MySqlReplicaConfigurationResponse Empty = new MySqlReplicaConfigurationResponse();

    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
     */
    @InputImport(name="caCertificate", required=true)
      private final String caCertificate;

    public String getCaCertificate() {
        return this.caCertificate;
    }

    /**
     * PEM representation of the replica's x509 certificate.
     * 
     */
    @InputImport(name="clientCertificate", required=true)
      private final String clientCertificate;

    public String getClientCertificate() {
        return this.clientCertificate;
    }

    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
     */
    @InputImport(name="clientKey", required=true)
      private final String clientKey;

    public String getClientKey() {
        return this.clientKey;
    }

    /**
     * Seconds to wait between connect retries. MySQL's default is 60 seconds.
     * 
     */
    @InputImport(name="connectRetryInterval", required=true)
      private final Integer connectRetryInterval;

    public Integer getConnectRetryInterval() {
        return this.connectRetryInterval;
    }

    /**
     * Path to a SQL dump file in Google Cloud Storage from which the replica instance is to be created. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are also supported. Dumps have the binlog co-ordinates from which replication begins. This can be accomplished by setting --master-data to 1 when using mysqldump.
     * 
     */
    @InputImport(name="dumpFilePath", required=true)
      private final String dumpFilePath;

    public String getDumpFilePath() {
        return this.dumpFilePath;
    }

    /**
     * This is always `sql#mysqlReplicaConfiguration`.
     * 
     */
    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Interval in milliseconds between replication heartbeats.
     * 
     */
    @InputImport(name="masterHeartbeatPeriod", required=true)
      private final String masterHeartbeatPeriod;

    public String getMasterHeartbeatPeriod() {
        return this.masterHeartbeatPeriod;
    }

    /**
     * The password for the replication connection.
     * 
     */
    @InputImport(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * A list of permissible ciphers to use for SSL encryption.
     * 
     */
    @InputImport(name="sslCipher", required=true)
      private final String sslCipher;

    public String getSslCipher() {
        return this.sslCipher;
    }

    /**
     * The username for the replication connection.
     * 
     */
    @InputImport(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    /**
     * Whether or not to check the primary instance's Common Name value in the certificate that it sends during the SSL handshake.
     * 
     */
    @InputImport(name="verifyServerCertificate", required=true)
      private final Boolean verifyServerCertificate;

    public Boolean getVerifyServerCertificate() {
        return this.verifyServerCertificate;
    }

    public MySqlReplicaConfigurationResponse(
        String caCertificate,
        String clientCertificate,
        String clientKey,
        Integer connectRetryInterval,
        String dumpFilePath,
        String kind,
        String masterHeartbeatPeriod,
        String password,
        String sslCipher,
        String username,
        Boolean verifyServerCertificate) {
        this.caCertificate = Objects.requireNonNull(caCertificate, "expected parameter 'caCertificate' to be non-null");
        this.clientCertificate = Objects.requireNonNull(clientCertificate, "expected parameter 'clientCertificate' to be non-null");
        this.clientKey = Objects.requireNonNull(clientKey, "expected parameter 'clientKey' to be non-null");
        this.connectRetryInterval = Objects.requireNonNull(connectRetryInterval, "expected parameter 'connectRetryInterval' to be non-null");
        this.dumpFilePath = Objects.requireNonNull(dumpFilePath, "expected parameter 'dumpFilePath' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.masterHeartbeatPeriod = Objects.requireNonNull(masterHeartbeatPeriod, "expected parameter 'masterHeartbeatPeriod' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.sslCipher = Objects.requireNonNull(sslCipher, "expected parameter 'sslCipher' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
        this.verifyServerCertificate = Objects.requireNonNull(verifyServerCertificate, "expected parameter 'verifyServerCertificate' to be non-null");
    }

    private MySqlReplicaConfigurationResponse() {
        this.caCertificate = null;
        this.clientCertificate = null;
        this.clientKey = null;
        this.connectRetryInterval = null;
        this.dumpFilePath = null;
        this.kind = null;
        this.masterHeartbeatPeriod = null;
        this.password = null;
        this.sslCipher = null;
        this.username = null;
        this.verifyServerCertificate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlReplicaConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificate;
        private String clientCertificate;
        private String clientKey;
        private Integer connectRetryInterval;
        private String dumpFilePath;
        private String kind;
        private String masterHeartbeatPeriod;
        private String password;
        private String sslCipher;
        private String username;
        private Boolean verifyServerCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(MySqlReplicaConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.connectRetryInterval = defaults.connectRetryInterval;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.kind = defaults.kind;
    	      this.masterHeartbeatPeriod = defaults.masterHeartbeatPeriod;
    	      this.password = defaults.password;
    	      this.sslCipher = defaults.sslCipher;
    	      this.username = defaults.username;
    	      this.verifyServerCertificate = defaults.verifyServerCertificate;
        }

        public Builder setCaCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }

        public Builder setClientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }

        public Builder setClientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }

        public Builder setConnectRetryInterval(Integer connectRetryInterval) {
            this.connectRetryInterval = Objects.requireNonNull(connectRetryInterval);
            return this;
        }

        public Builder setDumpFilePath(String dumpFilePath) {
            this.dumpFilePath = Objects.requireNonNull(dumpFilePath);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMasterHeartbeatPeriod(String masterHeartbeatPeriod) {
            this.masterHeartbeatPeriod = Objects.requireNonNull(masterHeartbeatPeriod);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setSslCipher(String sslCipher) {
            this.sslCipher = Objects.requireNonNull(sslCipher);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setVerifyServerCertificate(Boolean verifyServerCertificate) {
            this.verifyServerCertificate = Objects.requireNonNull(verifyServerCertificate);
            return this;
        }
        public MySqlReplicaConfigurationResponse build() {
            return new MySqlReplicaConfigurationResponse(caCertificate, clientCertificate, clientKey, connectRetryInterval, dumpFilePath, kind, masterHeartbeatPeriod, password, sslCipher, username, verifyServerCertificate);
        }
    }
}