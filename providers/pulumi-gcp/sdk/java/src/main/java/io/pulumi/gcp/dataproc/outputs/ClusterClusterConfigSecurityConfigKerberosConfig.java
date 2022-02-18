// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterClusterConfigSecurityConfigKerberosConfig {
    /**
     * The admin server (IP or hostname) for the
     * remote trusted realm in a cross realm trust relationship.
     * 
     */
    private final @Nullable String crossRealmTrustAdminServer;
    /**
     * The KDC (IP or hostname) for the
     * remote trusted realm in a cross realm trust relationship.
     * 
     */
    private final @Nullable String crossRealmTrustKdc;
    /**
     * The remote realm the Dataproc on-cluster KDC will
     * trust, should the user enable cross realm trust.
     * 
     */
    private final @Nullable String crossRealmTrustRealm;
    /**
     * The Cloud Storage URI of a KMS
     * encrypted file containing the shared password between the on-cluster Kerberos realm
     * and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    private final @Nullable String crossRealmTrustSharedPasswordUri;
    /**
     * Flag to indicate whether to Kerberize the cluster.
     * 
     */
    private final @Nullable Boolean enableKerberos;
    /**
     * The Cloud Storage URI of a KMS encrypted file containing
     * the master key of the KDC database.
     * 
     */
    private final @Nullable String kdcDbKeyUri;
    /**
     * The Cloud Storage URI of a KMS encrypted file containing
     * the password to the user provided key. For the self-signed certificate, this password
     * is generated by Dataproc.
     * 
     */
    private final @Nullable String keyPasswordUri;
    /**
     * The Cloud Storage URI of a KMS encrypted file containing
     * the password to the user provided keystore. For the self-signed certificated, the password
     * is generated by Dataproc.
     * 
     */
    private final @Nullable String keystorePasswordUri;
    /**
     * The Cloud Storage URI of the keystore file used for SSL encryption.
     * If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    private final @Nullable String keystoreUri;
    /**
     * The URI of the KMS key used to encrypt various sensitive files.
     * 
     */
    private final String kmsKeyUri;
    /**
     * The name of the on-cluster Kerberos realm. If not specified, the
     * uppercased domain of hostnames will be the realm.
     * 
     */
    private final @Nullable String realm;
    /**
     * The Cloud Storage URI of a KMS encrypted file
     * containing the root principal password.
     * 
     */
    private final String rootPrincipalPasswordUri;
    /**
     * The lifetime of the ticket granting ticket, in hours.
     * 
     */
    private final @Nullable Integer tgtLifetimeHours;
    /**
     * The Cloud Storage URI of a KMS encrypted file
     * containing the password to the user provided truststore. For the self-signed
     * certificate, this password is generated by Dataproc.
     * 
     */
    private final @Nullable String truststorePasswordUri;
    /**
     * The Cloud Storage URI of the truststore file used for
     * SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    private final @Nullable String truststoreUri;

    @OutputCustomType.Constructor({"crossRealmTrustAdminServer","crossRealmTrustKdc","crossRealmTrustRealm","crossRealmTrustSharedPasswordUri","enableKerberos","kdcDbKeyUri","keyPasswordUri","keystorePasswordUri","keystoreUri","kmsKeyUri","realm","rootPrincipalPasswordUri","tgtLifetimeHours","truststorePasswordUri","truststoreUri"})
    private ClusterClusterConfigSecurityConfigKerberosConfig(
        @Nullable String crossRealmTrustAdminServer,
        @Nullable String crossRealmTrustKdc,
        @Nullable String crossRealmTrustRealm,
        @Nullable String crossRealmTrustSharedPasswordUri,
        @Nullable Boolean enableKerberos,
        @Nullable String kdcDbKeyUri,
        @Nullable String keyPasswordUri,
        @Nullable String keystorePasswordUri,
        @Nullable String keystoreUri,
        String kmsKeyUri,
        @Nullable String realm,
        String rootPrincipalPasswordUri,
        @Nullable Integer tgtLifetimeHours,
        @Nullable String truststorePasswordUri,
        @Nullable String truststoreUri) {
        this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
        this.crossRealmTrustKdc = crossRealmTrustKdc;
        this.crossRealmTrustRealm = crossRealmTrustRealm;
        this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
        this.enableKerberos = enableKerberos;
        this.kdcDbKeyUri = kdcDbKeyUri;
        this.keyPasswordUri = keyPasswordUri;
        this.keystorePasswordUri = keystorePasswordUri;
        this.keystoreUri = keystoreUri;
        this.kmsKeyUri = Objects.requireNonNull(kmsKeyUri);
        this.realm = realm;
        this.rootPrincipalPasswordUri = Objects.requireNonNull(rootPrincipalPasswordUri);
        this.tgtLifetimeHours = tgtLifetimeHours;
        this.truststorePasswordUri = truststorePasswordUri;
        this.truststoreUri = truststoreUri;
    }

    /**
     * The admin server (IP or hostname) for the
     * remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<String> getCrossRealmTrustAdminServer() {
        return Optional.ofNullable(this.crossRealmTrustAdminServer);
    }
    /**
     * The KDC (IP or hostname) for the
     * remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<String> getCrossRealmTrustKdc() {
        return Optional.ofNullable(this.crossRealmTrustKdc);
    }
    /**
     * The remote realm the Dataproc on-cluster KDC will
     * trust, should the user enable cross realm trust.
     * 
     */
    public Optional<String> getCrossRealmTrustRealm() {
        return Optional.ofNullable(this.crossRealmTrustRealm);
    }
    /**
     * The Cloud Storage URI of a KMS
     * encrypted file containing the shared password between the on-cluster Kerberos realm
     * and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    public Optional<String> getCrossRealmTrustSharedPasswordUri() {
        return Optional.ofNullable(this.crossRealmTrustSharedPasswordUri);
    }
    /**
     * Flag to indicate whether to Kerberize the cluster.
     * 
     */
    public Optional<Boolean> getEnableKerberos() {
        return Optional.ofNullable(this.enableKerberos);
    }
    /**
     * The Cloud Storage URI of a KMS encrypted file containing
     * the master key of the KDC database.
     * 
     */
    public Optional<String> getKdcDbKeyUri() {
        return Optional.ofNullable(this.kdcDbKeyUri);
    }
    /**
     * The Cloud Storage URI of a KMS encrypted file containing
     * the password to the user provided key. For the self-signed certificate, this password
     * is generated by Dataproc.
     * 
     */
    public Optional<String> getKeyPasswordUri() {
        return Optional.ofNullable(this.keyPasswordUri);
    }
    /**
     * The Cloud Storage URI of a KMS encrypted file containing
     * the password to the user provided keystore. For the self-signed certificated, the password
     * is generated by Dataproc.
     * 
     */
    public Optional<String> getKeystorePasswordUri() {
        return Optional.ofNullable(this.keystorePasswordUri);
    }
    /**
     * The Cloud Storage URI of the keystore file used for SSL encryption.
     * If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<String> getKeystoreUri() {
        return Optional.ofNullable(this.keystoreUri);
    }
    /**
     * The URI of the KMS key used to encrypt various sensitive files.
     * 
     */
    public String getKmsKeyUri() {
        return this.kmsKeyUri;
    }
    /**
     * The name of the on-cluster Kerberos realm. If not specified, the
     * uppercased domain of hostnames will be the realm.
     * 
     */
    public Optional<String> getRealm() {
        return Optional.ofNullable(this.realm);
    }
    /**
     * The Cloud Storage URI of a KMS encrypted file
     * containing the root principal password.
     * 
     */
    public String getRootPrincipalPasswordUri() {
        return this.rootPrincipalPasswordUri;
    }
    /**
     * The lifetime of the ticket granting ticket, in hours.
     * 
     */
    public Optional<Integer> getTgtLifetimeHours() {
        return Optional.ofNullable(this.tgtLifetimeHours);
    }
    /**
     * The Cloud Storage URI of a KMS encrypted file
     * containing the password to the user provided truststore. For the self-signed
     * certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<String> getTruststorePasswordUri() {
        return Optional.ofNullable(this.truststorePasswordUri);
    }
    /**
     * The Cloud Storage URI of the truststore file used for
     * SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<String> getTruststoreUri() {
        return Optional.ofNullable(this.truststoreUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigSecurityConfigKerberosConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String crossRealmTrustAdminServer;
        private @Nullable String crossRealmTrustKdc;
        private @Nullable String crossRealmTrustRealm;
        private @Nullable String crossRealmTrustSharedPasswordUri;
        private @Nullable Boolean enableKerberos;
        private @Nullable String kdcDbKeyUri;
        private @Nullable String keyPasswordUri;
        private @Nullable String keystorePasswordUri;
        private @Nullable String keystoreUri;
        private String kmsKeyUri;
        private @Nullable String realm;
        private String rootPrincipalPasswordUri;
        private @Nullable Integer tgtLifetimeHours;
        private @Nullable String truststorePasswordUri;
        private @Nullable String truststoreUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigSecurityConfigKerberosConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossRealmTrustAdminServer = defaults.crossRealmTrustAdminServer;
    	      this.crossRealmTrustKdc = defaults.crossRealmTrustKdc;
    	      this.crossRealmTrustRealm = defaults.crossRealmTrustRealm;
    	      this.crossRealmTrustSharedPasswordUri = defaults.crossRealmTrustSharedPasswordUri;
    	      this.enableKerberos = defaults.enableKerberos;
    	      this.kdcDbKeyUri = defaults.kdcDbKeyUri;
    	      this.keyPasswordUri = defaults.keyPasswordUri;
    	      this.keystorePasswordUri = defaults.keystorePasswordUri;
    	      this.keystoreUri = defaults.keystoreUri;
    	      this.kmsKeyUri = defaults.kmsKeyUri;
    	      this.realm = defaults.realm;
    	      this.rootPrincipalPasswordUri = defaults.rootPrincipalPasswordUri;
    	      this.tgtLifetimeHours = defaults.tgtLifetimeHours;
    	      this.truststorePasswordUri = defaults.truststorePasswordUri;
    	      this.truststoreUri = defaults.truststoreUri;
        }

        public Builder setCrossRealmTrustAdminServer(@Nullable String crossRealmTrustAdminServer) {
            this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            return this;
        }

        public Builder setCrossRealmTrustKdc(@Nullable String crossRealmTrustKdc) {
            this.crossRealmTrustKdc = crossRealmTrustKdc;
            return this;
        }

        public Builder setCrossRealmTrustRealm(@Nullable String crossRealmTrustRealm) {
            this.crossRealmTrustRealm = crossRealmTrustRealm;
            return this;
        }

        public Builder setCrossRealmTrustSharedPasswordUri(@Nullable String crossRealmTrustSharedPasswordUri) {
            this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
            return this;
        }

        public Builder setEnableKerberos(@Nullable Boolean enableKerberos) {
            this.enableKerberos = enableKerberos;
            return this;
        }

        public Builder setKdcDbKeyUri(@Nullable String kdcDbKeyUri) {
            this.kdcDbKeyUri = kdcDbKeyUri;
            return this;
        }

        public Builder setKeyPasswordUri(@Nullable String keyPasswordUri) {
            this.keyPasswordUri = keyPasswordUri;
            return this;
        }

        public Builder setKeystorePasswordUri(@Nullable String keystorePasswordUri) {
            this.keystorePasswordUri = keystorePasswordUri;
            return this;
        }

        public Builder setKeystoreUri(@Nullable String keystoreUri) {
            this.keystoreUri = keystoreUri;
            return this;
        }

        public Builder setKmsKeyUri(String kmsKeyUri) {
            this.kmsKeyUri = Objects.requireNonNull(kmsKeyUri);
            return this;
        }

        public Builder setRealm(@Nullable String realm) {
            this.realm = realm;
            return this;
        }

        public Builder setRootPrincipalPasswordUri(String rootPrincipalPasswordUri) {
            this.rootPrincipalPasswordUri = Objects.requireNonNull(rootPrincipalPasswordUri);
            return this;
        }

        public Builder setTgtLifetimeHours(@Nullable Integer tgtLifetimeHours) {
            this.tgtLifetimeHours = tgtLifetimeHours;
            return this;
        }

        public Builder setTruststorePasswordUri(@Nullable String truststorePasswordUri) {
            this.truststorePasswordUri = truststorePasswordUri;
            return this;
        }

        public Builder setTruststoreUri(@Nullable String truststoreUri) {
            this.truststoreUri = truststoreUri;
            return this;
        }

        public ClusterClusterConfigSecurityConfigKerberosConfig build() {
            return new ClusterClusterConfigSecurityConfigKerberosConfig(crossRealmTrustAdminServer, crossRealmTrustKdc, crossRealmTrustRealm, crossRealmTrustSharedPasswordUri, enableKerberos, kdcDbKeyUri, keyPasswordUri, keystorePasswordUri, keystoreUri, kmsKeyUri, realm, rootPrincipalPasswordUri, tgtLifetimeHours, truststorePasswordUri, truststoreUri);
        }
    }
}
