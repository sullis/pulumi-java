// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Active Directory
 * 
 */
public final class ActiveDirectoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActiveDirectoryArgs Empty = new ActiveDirectoryArgs();

    /**
     * Id of the Active Directory
     * 
     */
    @InputImport(name="activeDirectoryId")
      private final @Nullable Input<String> activeDirectoryId;

    public Input<String> getActiveDirectoryId() {
        return this.activeDirectoryId == null ? Input.empty() : this.activeDirectoryId;
    }

    /**
     * Name of the active directory machine. This optional parameter is used only while creating kerberos volume
     * 
     */
    @InputImport(name="adName")
      private final @Nullable Input<String> adName;

    public Input<String> getAdName() {
        return this.adName == null ? Input.empty() : this.adName;
    }

    /**
     * If enabled, AES encryption will be enabled for SMB communication.
     * 
     */
    @InputImport(name="aesEncryption")
      private final @Nullable Input<Boolean> aesEncryption;

    public Input<Boolean> getAesEncryption() {
        return this.aesEncryption == null ? Input.empty() : this.aesEncryption;
    }

    /**
     *  If enabled, NFS client local users can also (in addition to LDAP users) access the NFS volumes.
     * 
     */
    @InputImport(name="allowLocalNfsUsersWithLdap")
      private final @Nullable Input<Boolean> allowLocalNfsUsersWithLdap;

    public Input<Boolean> getAllowLocalNfsUsersWithLdap() {
        return this.allowLocalNfsUsersWithLdap == null ? Input.empty() : this.allowLocalNfsUsersWithLdap;
    }

    /**
     * Users to be added to the Built-in Backup Operator active directory group. A list of unique usernames without domain specifier
     * 
     */
    @InputImport(name="backupOperators")
      private final @Nullable Input<List<String>> backupOperators;

    public Input<List<String>> getBackupOperators() {
        return this.backupOperators == null ? Input.empty() : this.backupOperators;
    }

    /**
     * Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory domain
     * 
     */
    @InputImport(name="dns")
      private final @Nullable Input<String> dns;

    public Input<String> getDns() {
        return this.dns == null ? Input.empty() : this.dns;
    }

    /**
     * Name of the Active Directory domain
     * 
     */
    @InputImport(name="domain")
      private final @Nullable Input<String> domain;

    public Input<String> getDomain() {
        return this.domain == null ? Input.empty() : this.domain;
    }

    /**
     * kdc server IP addresses for the active directory machine. This optional parameter is used only while creating kerberos volume.
     * 
     */
    @InputImport(name="kdcIP")
      private final @Nullable Input<String> kdcIP;

    public Input<String> getKdcIP() {
        return this.kdcIP == null ? Input.empty() : this.kdcIP;
    }

    /**
     * Specifies whether or not the LDAP traffic needs to be secured via TLS.
     * 
     */
    @InputImport(name="ldapOverTLS")
      private final @Nullable Input<Boolean> ldapOverTLS;

    public Input<Boolean> getLdapOverTLS() {
        return this.ldapOverTLS == null ? Input.empty() : this.ldapOverTLS;
    }

    /**
     * Specifies whether or not the LDAP traffic needs to be signed.
     * 
     */
    @InputImport(name="ldapSigning")
      private final @Nullable Input<Boolean> ldapSigning;

    public Input<Boolean> getLdapSigning() {
        return this.ldapSigning == null ? Input.empty() : this.ldapSigning;
    }

    /**
     * The Organizational Unit (OU) within the Windows Active Directory
     * 
     */
    @InputImport(name="organizationalUnit")
      private final @Nullable Input<String> organizationalUnit;

    public Input<String> getOrganizationalUnit() {
        return this.organizationalUnit == null ? Input.empty() : this.organizationalUnit;
    }

    /**
     * Plain text password of Active Directory domain administrator, value is masked in the response
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Domain Users in the Active directory to be given SeSecurityPrivilege privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain specifier
     * 
     */
    @InputImport(name="securityOperators")
      private final @Nullable Input<List<String>> securityOperators;

    public Input<List<String>> getSecurityOperators() {
        return this.securityOperators == null ? Input.empty() : this.securityOperators;
    }

    /**
     * When LDAP over SSL/TLS is enabled, the LDAP client is required to have base64 encoded Active Directory Certificate Service's self-signed root CA certificate, this optional parameter is used only for dual protocol with LDAP user-mapping volumes.
     * 
     */
    @InputImport(name="serverRootCACertificate")
      private final @Nullable Input<String> serverRootCACertificate;

    public Input<String> getServerRootCACertificate() {
        return this.serverRootCACertificate == null ? Input.empty() : this.serverRootCACertificate;
    }

    /**
     * The Active Directory site the service will limit Domain Controller discovery to
     * 
     */
    @InputImport(name="site")
      private final @Nullable Input<String> site;

    public Input<String> getSite() {
        return this.site == null ? Input.empty() : this.site;
    }

    /**
     * NetBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes
     * 
     */
    @InputImport(name="smbServerName")
      private final @Nullable Input<String> smbServerName;

    public Input<String> getSmbServerName() {
        return this.smbServerName == null ? Input.empty() : this.smbServerName;
    }

    /**
     * Username of Active Directory domain administrator
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public ActiveDirectoryArgs(
        @Nullable Input<String> activeDirectoryId,
        @Nullable Input<String> adName,
        @Nullable Input<Boolean> aesEncryption,
        @Nullable Input<Boolean> allowLocalNfsUsersWithLdap,
        @Nullable Input<List<String>> backupOperators,
        @Nullable Input<String> dns,
        @Nullable Input<String> domain,
        @Nullable Input<String> kdcIP,
        @Nullable Input<Boolean> ldapOverTLS,
        @Nullable Input<Boolean> ldapSigning,
        @Nullable Input<String> organizationalUnit,
        @Nullable Input<String> password,
        @Nullable Input<List<String>> securityOperators,
        @Nullable Input<String> serverRootCACertificate,
        @Nullable Input<String> site,
        @Nullable Input<String> smbServerName,
        @Nullable Input<String> username) {
        this.activeDirectoryId = activeDirectoryId;
        this.adName = adName;
        this.aesEncryption = aesEncryption;
        this.allowLocalNfsUsersWithLdap = allowLocalNfsUsersWithLdap;
        this.backupOperators = backupOperators;
        this.dns = dns;
        this.domain = domain;
        this.kdcIP = kdcIP;
        this.ldapOverTLS = ldapOverTLS;
        this.ldapSigning = ldapSigning;
        this.organizationalUnit = organizationalUnit == null ? Input.ofNullable("CN=Computers") : organizationalUnit;
        this.password = password;
        this.securityOperators = securityOperators;
        this.serverRootCACertificate = serverRootCACertificate;
        this.site = site;
        this.smbServerName = smbServerName;
        this.username = username;
    }

    private ActiveDirectoryArgs() {
        this.activeDirectoryId = Input.empty();
        this.adName = Input.empty();
        this.aesEncryption = Input.empty();
        this.allowLocalNfsUsersWithLdap = Input.empty();
        this.backupOperators = Input.empty();
        this.dns = Input.empty();
        this.domain = Input.empty();
        this.kdcIP = Input.empty();
        this.ldapOverTLS = Input.empty();
        this.ldapSigning = Input.empty();
        this.organizationalUnit = Input.empty();
        this.password = Input.empty();
        this.securityOperators = Input.empty();
        this.serverRootCACertificate = Input.empty();
        this.site = Input.empty();
        this.smbServerName = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> activeDirectoryId;
        private @Nullable Input<String> adName;
        private @Nullable Input<Boolean> aesEncryption;
        private @Nullable Input<Boolean> allowLocalNfsUsersWithLdap;
        private @Nullable Input<List<String>> backupOperators;
        private @Nullable Input<String> dns;
        private @Nullable Input<String> domain;
        private @Nullable Input<String> kdcIP;
        private @Nullable Input<Boolean> ldapOverTLS;
        private @Nullable Input<Boolean> ldapSigning;
        private @Nullable Input<String> organizationalUnit;
        private @Nullable Input<String> password;
        private @Nullable Input<List<String>> securityOperators;
        private @Nullable Input<String> serverRootCACertificate;
        private @Nullable Input<String> site;
        private @Nullable Input<String> smbServerName;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveDirectoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryId = defaults.activeDirectoryId;
    	      this.adName = defaults.adName;
    	      this.aesEncryption = defaults.aesEncryption;
    	      this.allowLocalNfsUsersWithLdap = defaults.allowLocalNfsUsersWithLdap;
    	      this.backupOperators = defaults.backupOperators;
    	      this.dns = defaults.dns;
    	      this.domain = defaults.domain;
    	      this.kdcIP = defaults.kdcIP;
    	      this.ldapOverTLS = defaults.ldapOverTLS;
    	      this.ldapSigning = defaults.ldapSigning;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.password = defaults.password;
    	      this.securityOperators = defaults.securityOperators;
    	      this.serverRootCACertificate = defaults.serverRootCACertificate;
    	      this.site = defaults.site;
    	      this.smbServerName = defaults.smbServerName;
    	      this.username = defaults.username;
        }

        public Builder setActiveDirectoryId(@Nullable Input<String> activeDirectoryId) {
            this.activeDirectoryId = activeDirectoryId;
            return this;
        }

        public Builder setActiveDirectoryId(@Nullable String activeDirectoryId) {
            this.activeDirectoryId = Input.ofNullable(activeDirectoryId);
            return this;
        }

        public Builder setAdName(@Nullable Input<String> adName) {
            this.adName = adName;
            return this;
        }

        public Builder setAdName(@Nullable String adName) {
            this.adName = Input.ofNullable(adName);
            return this;
        }

        public Builder setAesEncryption(@Nullable Input<Boolean> aesEncryption) {
            this.aesEncryption = aesEncryption;
            return this;
        }

        public Builder setAesEncryption(@Nullable Boolean aesEncryption) {
            this.aesEncryption = Input.ofNullable(aesEncryption);
            return this;
        }

        public Builder setAllowLocalNfsUsersWithLdap(@Nullable Input<Boolean> allowLocalNfsUsersWithLdap) {
            this.allowLocalNfsUsersWithLdap = allowLocalNfsUsersWithLdap;
            return this;
        }

        public Builder setAllowLocalNfsUsersWithLdap(@Nullable Boolean allowLocalNfsUsersWithLdap) {
            this.allowLocalNfsUsersWithLdap = Input.ofNullable(allowLocalNfsUsersWithLdap);
            return this;
        }

        public Builder setBackupOperators(@Nullable Input<List<String>> backupOperators) {
            this.backupOperators = backupOperators;
            return this;
        }

        public Builder setBackupOperators(@Nullable List<String> backupOperators) {
            this.backupOperators = Input.ofNullable(backupOperators);
            return this;
        }

        public Builder setDns(@Nullable Input<String> dns) {
            this.dns = dns;
            return this;
        }

        public Builder setDns(@Nullable String dns) {
            this.dns = Input.ofNullable(dns);
            return this;
        }

        public Builder setDomain(@Nullable Input<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = Input.ofNullable(domain);
            return this;
        }

        public Builder setKdcIP(@Nullable Input<String> kdcIP) {
            this.kdcIP = kdcIP;
            return this;
        }

        public Builder setKdcIP(@Nullable String kdcIP) {
            this.kdcIP = Input.ofNullable(kdcIP);
            return this;
        }

        public Builder setLdapOverTLS(@Nullable Input<Boolean> ldapOverTLS) {
            this.ldapOverTLS = ldapOverTLS;
            return this;
        }

        public Builder setLdapOverTLS(@Nullable Boolean ldapOverTLS) {
            this.ldapOverTLS = Input.ofNullable(ldapOverTLS);
            return this;
        }

        public Builder setLdapSigning(@Nullable Input<Boolean> ldapSigning) {
            this.ldapSigning = ldapSigning;
            return this;
        }

        public Builder setLdapSigning(@Nullable Boolean ldapSigning) {
            this.ldapSigning = Input.ofNullable(ldapSigning);
            return this;
        }

        public Builder setOrganizationalUnit(@Nullable Input<String> organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder setOrganizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = Input.ofNullable(organizationalUnit);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setSecurityOperators(@Nullable Input<List<String>> securityOperators) {
            this.securityOperators = securityOperators;
            return this;
        }

        public Builder setSecurityOperators(@Nullable List<String> securityOperators) {
            this.securityOperators = Input.ofNullable(securityOperators);
            return this;
        }

        public Builder setServerRootCACertificate(@Nullable Input<String> serverRootCACertificate) {
            this.serverRootCACertificate = serverRootCACertificate;
            return this;
        }

        public Builder setServerRootCACertificate(@Nullable String serverRootCACertificate) {
            this.serverRootCACertificate = Input.ofNullable(serverRootCACertificate);
            return this;
        }

        public Builder setSite(@Nullable Input<String> site) {
            this.site = site;
            return this;
        }

        public Builder setSite(@Nullable String site) {
            this.site = Input.ofNullable(site);
            return this;
        }

        public Builder setSmbServerName(@Nullable Input<String> smbServerName) {
            this.smbServerName = smbServerName;
            return this;
        }

        public Builder setSmbServerName(@Nullable String smbServerName) {
            this.smbServerName = Input.ofNullable(smbServerName);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public ActiveDirectoryArgs build() {
            return new ActiveDirectoryArgs(activeDirectoryId, adName, aesEncryption, allowLocalNfsUsersWithLdap, backupOperators, dns, domain, kdcIP, ldapOverTLS, ldapSigning, organizationalUnit, password, securityOperators, serverRootCACertificate, site, smbServerName, username);
        }
    }
}