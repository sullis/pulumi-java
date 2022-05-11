// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccountAzureFilesAuthenticationActiveDirectory {
    /**
     * @return Specifies the domain GUID.
     * 
     */
    private final String domainGuid;
    /**
     * @return Specifies the primary domain that the AD DNS server is authoritative for.
     * 
     */
    private final String domainName;
    /**
     * @return Specifies the security identifier (SID).
     * 
     */
    private final String domainSid;
    /**
     * @return Specifies the Active Directory forest.
     * 
     */
    private final String forestName;
    /**
     * @return Specifies the NetBIOS domain name.
     * 
     */
    private final String netbiosDomainName;
    /**
     * @return Specifies the security identifier (SID) for Azure Storage.
     * 
     */
    private final String storageSid;

    @CustomType.Constructor
    private AccountAzureFilesAuthenticationActiveDirectory(
        @CustomType.Parameter("domainGuid") String domainGuid,
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("domainSid") String domainSid,
        @CustomType.Parameter("forestName") String forestName,
        @CustomType.Parameter("netbiosDomainName") String netbiosDomainName,
        @CustomType.Parameter("storageSid") String storageSid) {
        this.domainGuid = domainGuid;
        this.domainName = domainName;
        this.domainSid = domainSid;
        this.forestName = forestName;
        this.netbiosDomainName = netbiosDomainName;
        this.storageSid = storageSid;
    }

    /**
     * @return Specifies the domain GUID.
     * 
     */
    public String domainGuid() {
        return this.domainGuid;
    }
    /**
     * @return Specifies the primary domain that the AD DNS server is authoritative for.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return Specifies the security identifier (SID).
     * 
     */
    public String domainSid() {
        return this.domainSid;
    }
    /**
     * @return Specifies the Active Directory forest.
     * 
     */
    public String forestName() {
        return this.forestName;
    }
    /**
     * @return Specifies the NetBIOS domain name.
     * 
     */
    public String netbiosDomainName() {
        return this.netbiosDomainName;
    }
    /**
     * @return Specifies the security identifier (SID) for Azure Storage.
     * 
     */
    public String storageSid() {
        return this.storageSid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAzureFilesAuthenticationActiveDirectory defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainGuid;
        private String domainName;
        private String domainSid;
        private String forestName;
        private String netbiosDomainName;
        private String storageSid;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAzureFilesAuthenticationActiveDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainGuid = defaults.domainGuid;
    	      this.domainName = defaults.domainName;
    	      this.domainSid = defaults.domainSid;
    	      this.forestName = defaults.forestName;
    	      this.netbiosDomainName = defaults.netbiosDomainName;
    	      this.storageSid = defaults.storageSid;
        }

        public Builder domainGuid(String domainGuid) {
            this.domainGuid = Objects.requireNonNull(domainGuid);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainSid(String domainSid) {
            this.domainSid = Objects.requireNonNull(domainSid);
            return this;
        }
        public Builder forestName(String forestName) {
            this.forestName = Objects.requireNonNull(forestName);
            return this;
        }
        public Builder netbiosDomainName(String netbiosDomainName) {
            this.netbiosDomainName = Objects.requireNonNull(netbiosDomainName);
            return this;
        }
        public Builder storageSid(String storageSid) {
            this.storageSid = Objects.requireNonNull(storageSid);
            return this;
        }        public AccountAzureFilesAuthenticationActiveDirectory build() {
            return new AccountAzureFilesAuthenticationActiveDirectory(domainGuid, domainName, domainSid, forestName, netbiosDomainName, storageSid);
        }
    }
}
