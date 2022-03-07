// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.azurenative.storagecache.outputs.CacheUsernameDownloadSettingsResponseCredentials;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CacheUsernameDownloadSettingsResponse {
    /**
     * Determines if the certificate should be automatically downloaded. This applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     * 
     */
    private final @Nullable Boolean autoDownloadCertificate;
    /**
     * The URI of the CA certificate to validate the LDAP secure connection. This field must be populated when 'requireValidCertificate' is set to true.
     * 
     */
    private final @Nullable String caCertificateURI;
    /**
     * When present, these are the credentials for the secure LDAP connection.
     * 
     */
    private final @Nullable CacheUsernameDownloadSettingsResponseCredentials credentials;
    /**
     * Whether or not the LDAP connection should be encrypted.
     * 
     */
    private final @Nullable Boolean encryptLdapConnection;
    /**
     * Whether or not Extended Groups is enabled.
     * 
     */
    private final @Nullable Boolean extendedGroups;
    /**
     * The URI of the file containing group information (in /etc/group file format). This field must be populated when 'usernameSource' is set to 'File'.
     * 
     */
    private final @Nullable String groupFileURI;
    /**
     * The base distinguished name for the LDAP domain.
     * 
     */
    private final @Nullable String ldapBaseDN;
    /**
     * The fully qualified domain name or IP address of the LDAP server to use.
     * 
     */
    private final @Nullable String ldapServer;
    /**
     * Determines if the certificates must be validated by a certificate authority. When true, caCertificateURI must be provided.
     * 
     */
    private final @Nullable Boolean requireValidCertificate;
    /**
     * The URI of the file containing user information (in /etc/passwd file format). This field must be populated when 'usernameSource' is set to 'File'.
     * 
     */
    private final @Nullable String userFileURI;
    /**
     * Indicates whether or not the HPC Cache has performed the username download successfully.
     * 
     */
    private final String usernameDownloaded;
    /**
     * This setting determines how the cache gets username and group names for clients.
     * 
     */
    private final @Nullable String usernameSource;

    @OutputCustomType.Constructor({"autoDownloadCertificate","caCertificateURI","credentials","encryptLdapConnection","extendedGroups","groupFileURI","ldapBaseDN","ldapServer","requireValidCertificate","userFileURI","usernameDownloaded","usernameSource"})
    private CacheUsernameDownloadSettingsResponse(
        @Nullable Boolean autoDownloadCertificate,
        @Nullable String caCertificateURI,
        @Nullable CacheUsernameDownloadSettingsResponseCredentials credentials,
        @Nullable Boolean encryptLdapConnection,
        @Nullable Boolean extendedGroups,
        @Nullable String groupFileURI,
        @Nullable String ldapBaseDN,
        @Nullable String ldapServer,
        @Nullable Boolean requireValidCertificate,
        @Nullable String userFileURI,
        String usernameDownloaded,
        @Nullable String usernameSource) {
        this.autoDownloadCertificate = autoDownloadCertificate;
        this.caCertificateURI = caCertificateURI;
        this.credentials = credentials;
        this.encryptLdapConnection = encryptLdapConnection;
        this.extendedGroups = extendedGroups;
        this.groupFileURI = groupFileURI;
        this.ldapBaseDN = ldapBaseDN;
        this.ldapServer = ldapServer;
        this.requireValidCertificate = requireValidCertificate;
        this.userFileURI = userFileURI;
        this.usernameDownloaded = Objects.requireNonNull(usernameDownloaded);
        this.usernameSource = usernameSource;
    }

    /**
     * Determines if the certificate should be automatically downloaded. This applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     * 
    */
    public Optional<Boolean> getAutoDownloadCertificate() {
        return Optional.ofNullable(this.autoDownloadCertificate);
    }
    /**
     * The URI of the CA certificate to validate the LDAP secure connection. This field must be populated when 'requireValidCertificate' is set to true.
     * 
    */
    public Optional<String> getCaCertificateURI() {
        return Optional.ofNullable(this.caCertificateURI);
    }
    /**
     * When present, these are the credentials for the secure LDAP connection.
     * 
    */
    public Optional<CacheUsernameDownloadSettingsResponseCredentials> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * Whether or not the LDAP connection should be encrypted.
     * 
    */
    public Optional<Boolean> getEncryptLdapConnection() {
        return Optional.ofNullable(this.encryptLdapConnection);
    }
    /**
     * Whether or not Extended Groups is enabled.
     * 
    */
    public Optional<Boolean> getExtendedGroups() {
        return Optional.ofNullable(this.extendedGroups);
    }
    /**
     * The URI of the file containing group information (in /etc/group file format). This field must be populated when 'usernameSource' is set to 'File'.
     * 
    */
    public Optional<String> getGroupFileURI() {
        return Optional.ofNullable(this.groupFileURI);
    }
    /**
     * The base distinguished name for the LDAP domain.
     * 
    */
    public Optional<String> getLdapBaseDN() {
        return Optional.ofNullable(this.ldapBaseDN);
    }
    /**
     * The fully qualified domain name or IP address of the LDAP server to use.
     * 
    */
    public Optional<String> getLdapServer() {
        return Optional.ofNullable(this.ldapServer);
    }
    /**
     * Determines if the certificates must be validated by a certificate authority. When true, caCertificateURI must be provided.
     * 
    */
    public Optional<Boolean> getRequireValidCertificate() {
        return Optional.ofNullable(this.requireValidCertificate);
    }
    /**
     * The URI of the file containing user information (in /etc/passwd file format). This field must be populated when 'usernameSource' is set to 'File'.
     * 
    */
    public Optional<String> getUserFileURI() {
        return Optional.ofNullable(this.userFileURI);
    }
    /**
     * Indicates whether or not the HPC Cache has performed the username download successfully.
     * 
    */
    public String getUsernameDownloaded() {
        return this.usernameDownloaded;
    }
    /**
     * This setting determines how the cache gets username and group names for clients.
     * 
    */
    public Optional<String> getUsernameSource() {
        return Optional.ofNullable(this.usernameSource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheUsernameDownloadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoDownloadCertificate;
        private @Nullable String caCertificateURI;
        private @Nullable CacheUsernameDownloadSettingsResponseCredentials credentials;
        private @Nullable Boolean encryptLdapConnection;
        private @Nullable Boolean extendedGroups;
        private @Nullable String groupFileURI;
        private @Nullable String ldapBaseDN;
        private @Nullable String ldapServer;
        private @Nullable Boolean requireValidCertificate;
        private @Nullable String userFileURI;
        private String usernameDownloaded;
        private @Nullable String usernameSource;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheUsernameDownloadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDownloadCertificate = defaults.autoDownloadCertificate;
    	      this.caCertificateURI = defaults.caCertificateURI;
    	      this.credentials = defaults.credentials;
    	      this.encryptLdapConnection = defaults.encryptLdapConnection;
    	      this.extendedGroups = defaults.extendedGroups;
    	      this.groupFileURI = defaults.groupFileURI;
    	      this.ldapBaseDN = defaults.ldapBaseDN;
    	      this.ldapServer = defaults.ldapServer;
    	      this.requireValidCertificate = defaults.requireValidCertificate;
    	      this.userFileURI = defaults.userFileURI;
    	      this.usernameDownloaded = defaults.usernameDownloaded;
    	      this.usernameSource = defaults.usernameSource;
        }

        public Builder setAutoDownloadCertificate(@Nullable Boolean autoDownloadCertificate) {
            this.autoDownloadCertificate = autoDownloadCertificate;
            return this;
        }

        public Builder setCaCertificateURI(@Nullable String caCertificateURI) {
            this.caCertificateURI = caCertificateURI;
            return this;
        }

        public Builder setCredentials(@Nullable CacheUsernameDownloadSettingsResponseCredentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setEncryptLdapConnection(@Nullable Boolean encryptLdapConnection) {
            this.encryptLdapConnection = encryptLdapConnection;
            return this;
        }

        public Builder setExtendedGroups(@Nullable Boolean extendedGroups) {
            this.extendedGroups = extendedGroups;
            return this;
        }

        public Builder setGroupFileURI(@Nullable String groupFileURI) {
            this.groupFileURI = groupFileURI;
            return this;
        }

        public Builder setLdapBaseDN(@Nullable String ldapBaseDN) {
            this.ldapBaseDN = ldapBaseDN;
            return this;
        }

        public Builder setLdapServer(@Nullable String ldapServer) {
            this.ldapServer = ldapServer;
            return this;
        }

        public Builder setRequireValidCertificate(@Nullable Boolean requireValidCertificate) {
            this.requireValidCertificate = requireValidCertificate;
            return this;
        }

        public Builder setUserFileURI(@Nullable String userFileURI) {
            this.userFileURI = userFileURI;
            return this;
        }

        public Builder setUsernameDownloaded(String usernameDownloaded) {
            this.usernameDownloaded = Objects.requireNonNull(usernameDownloaded);
            return this;
        }

        public Builder setUsernameSource(@Nullable String usernameSource) {
            this.usernameSource = usernameSource;
            return this;
        }
        public CacheUsernameDownloadSettingsResponse build() {
            return new CacheUsernameDownloadSettingsResponse(autoDownloadCertificate, caCertificateURI, credentials, encryptLdapConnection, extendedGroups, groupFileURI, ldapBaseDN, ldapServer, requireValidCertificate, userFileURI, usernameDownloaded, usernameSource);
        }
    }
}