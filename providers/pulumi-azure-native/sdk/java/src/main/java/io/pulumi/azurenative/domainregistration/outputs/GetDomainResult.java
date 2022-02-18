// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.outputs;

import io.pulumi.azurenative.domainregistration.outputs.HostNameResponse;
import io.pulumi.azurenative.domainregistration.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDomainResult {
    private final @Nullable String authCode;
    /**
     * <code>true</code> if the domain should be automatically renewed; otherwise, <code>false</code>.
     * 
     */
    private final @Nullable Boolean autoRenew;
    /**
     * Domain creation timestamp.
     * 
     */
    private final String createdTime;
    /**
     * Current DNS type
     * 
     */
    private final @Nullable String dnsType;
    /**
     * Azure DNS Zone to use
     * 
     */
    private final @Nullable String dnsZoneId;
    /**
     * Reasons why domain is not renewable.
     * 
     */
    private final List<String> domainNotRenewableReasons;
    /**
     * Domain expiration timestamp.
     * 
     */
    private final String expirationTime;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Timestamp when the domain was renewed last time.
     * 
     */
    private final String lastRenewedTime;
    /**
     * Resource Location.
     * 
     */
    private final String location;
    /**
     * All hostnames derived from the domain and assigned to Azure resources.
     * 
     */
    private final List<HostNameResponse> managedHostNames;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Name servers.
     * 
     */
    private final List<String> nameServers;
    /**
     * <code>true</code> if domain privacy is enabled for this domain; otherwise, <code>false</code>.
     * 
     */
    private final @Nullable Boolean privacy;
    /**
     * Domain provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * <code>true</code> if Azure can assign this domain to App Service apps; otherwise, <code>false</code>. This value will be <code>true</code> if domain registration status is active and
     *  it is hosted on name servers Azure has programmatic access to.
     * 
     */
    private final Boolean readyForDnsRecordManagement;
    /**
     * Domain registration status.
     * 
     */
    private final String registrationStatus;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Target DNS type (would be used for migration)
     * 
     */
    private final @Nullable String targetDnsType;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"authCode","autoRenew","createdTime","dnsType","dnsZoneId","domainNotRenewableReasons","expirationTime","id","kind","lastRenewedTime","location","managedHostNames","name","nameServers","privacy","provisioningState","readyForDnsRecordManagement","registrationStatus","systemData","tags","targetDnsType","type"})
    private GetDomainResult(
        @Nullable String authCode,
        @Nullable Boolean autoRenew,
        String createdTime,
        @Nullable String dnsType,
        @Nullable String dnsZoneId,
        List<String> domainNotRenewableReasons,
        String expirationTime,
        String id,
        @Nullable String kind,
        String lastRenewedTime,
        String location,
        List<HostNameResponse> managedHostNames,
        String name,
        List<String> nameServers,
        @Nullable Boolean privacy,
        String provisioningState,
        Boolean readyForDnsRecordManagement,
        String registrationStatus,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        @Nullable String targetDnsType,
        String type) {
        this.authCode = authCode;
        this.autoRenew = autoRenew;
        this.createdTime = Objects.requireNonNull(createdTime);
        this.dnsType = dnsType;
        this.dnsZoneId = dnsZoneId;
        this.domainNotRenewableReasons = Objects.requireNonNull(domainNotRenewableReasons);
        this.expirationTime = Objects.requireNonNull(expirationTime);
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.lastRenewedTime = Objects.requireNonNull(lastRenewedTime);
        this.location = Objects.requireNonNull(location);
        this.managedHostNames = Objects.requireNonNull(managedHostNames);
        this.name = Objects.requireNonNull(name);
        this.nameServers = Objects.requireNonNull(nameServers);
        this.privacy = privacy;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.readyForDnsRecordManagement = Objects.requireNonNull(readyForDnsRecordManagement);
        this.registrationStatus = Objects.requireNonNull(registrationStatus);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.targetDnsType = targetDnsType;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAuthCode() {
        return Optional.ofNullable(this.authCode);
    }
    /**
     * <code>true</code> if the domain should be automatically renewed; otherwise, <code>false</code>.
     * 
     */
    public Optional<Boolean> getAutoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }
    /**
     * Domain creation timestamp.
     * 
     */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Current DNS type
     * 
     */
    public Optional<String> getDnsType() {
        return Optional.ofNullable(this.dnsType);
    }
    /**
     * Azure DNS Zone to use
     * 
     */
    public Optional<String> getDnsZoneId() {
        return Optional.ofNullable(this.dnsZoneId);
    }
    /**
     * Reasons why domain is not renewable.
     * 
     */
    public List<String> getDomainNotRenewableReasons() {
        return this.domainNotRenewableReasons;
    }
    /**
     * Domain expiration timestamp.
     * 
     */
    public String getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Timestamp when the domain was renewed last time.
     * 
     */
    public String getLastRenewedTime() {
        return this.lastRenewedTime;
    }
    /**
     * Resource Location.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * All hostnames derived from the domain and assigned to Azure resources.
     * 
     */
    public List<HostNameResponse> getManagedHostNames() {
        return this.managedHostNames;
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Name servers.
     * 
     */
    public List<String> getNameServers() {
        return this.nameServers;
    }
    /**
     * <code>true</code> if domain privacy is enabled for this domain; otherwise, <code>false</code>.
     * 
     */
    public Optional<Boolean> getPrivacy() {
        return Optional.ofNullable(this.privacy);
    }
    /**
     * Domain provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * <code>true</code> if Azure can assign this domain to App Service apps; otherwise, <code>false</code>. This value will be <code>true</code> if domain registration status is active and
     *  it is hosted on name servers Azure has programmatic access to.
     * 
     */
    public Boolean getReadyForDnsRecordManagement() {
        return this.readyForDnsRecordManagement;
    }
    /**
     * Domain registration status.
     * 
     */
    public String getRegistrationStatus() {
        return this.registrationStatus;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Target DNS type (would be used for migration)
     * 
     */
    public Optional<String> getTargetDnsType() {
        return Optional.ofNullable(this.targetDnsType);
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authCode;
        private @Nullable Boolean autoRenew;
        private String createdTime;
        private @Nullable String dnsType;
        private @Nullable String dnsZoneId;
        private List<String> domainNotRenewableReasons;
        private String expirationTime;
        private String id;
        private @Nullable String kind;
        private String lastRenewedTime;
        private String location;
        private List<HostNameResponse> managedHostNames;
        private String name;
        private List<String> nameServers;
        private @Nullable Boolean privacy;
        private String provisioningState;
        private Boolean readyForDnsRecordManagement;
        private String registrationStatus;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetDnsType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authCode = defaults.authCode;
    	      this.autoRenew = defaults.autoRenew;
    	      this.createdTime = defaults.createdTime;
    	      this.dnsType = defaults.dnsType;
    	      this.dnsZoneId = defaults.dnsZoneId;
    	      this.domainNotRenewableReasons = defaults.domainNotRenewableReasons;
    	      this.expirationTime = defaults.expirationTime;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastRenewedTime = defaults.lastRenewedTime;
    	      this.location = defaults.location;
    	      this.managedHostNames = defaults.managedHostNames;
    	      this.name = defaults.name;
    	      this.nameServers = defaults.nameServers;
    	      this.privacy = defaults.privacy;
    	      this.provisioningState = defaults.provisioningState;
    	      this.readyForDnsRecordManagement = defaults.readyForDnsRecordManagement;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.targetDnsType = defaults.targetDnsType;
    	      this.type = defaults.type;
        }

        public Builder setAuthCode(@Nullable String authCode) {
            this.authCode = authCode;
            return this;
        }

        public Builder setAutoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDnsType(@Nullable String dnsType) {
            this.dnsType = dnsType;
            return this;
        }

        public Builder setDnsZoneId(@Nullable String dnsZoneId) {
            this.dnsZoneId = dnsZoneId;
            return this;
        }

        public Builder setDomainNotRenewableReasons(List<String> domainNotRenewableReasons) {
            this.domainNotRenewableReasons = Objects.requireNonNull(domainNotRenewableReasons);
            return this;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLastRenewedTime(String lastRenewedTime) {
            this.lastRenewedTime = Objects.requireNonNull(lastRenewedTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagedHostNames(List<HostNameResponse> managedHostNames) {
            this.managedHostNames = Objects.requireNonNull(managedHostNames);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }

        public Builder setPrivacy(@Nullable Boolean privacy) {
            this.privacy = privacy;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setReadyForDnsRecordManagement(Boolean readyForDnsRecordManagement) {
            this.readyForDnsRecordManagement = Objects.requireNonNull(readyForDnsRecordManagement);
            return this;
        }

        public Builder setRegistrationStatus(String registrationStatus) {
            this.registrationStatus = Objects.requireNonNull(registrationStatus);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetDnsType(@Nullable String targetDnsType) {
            this.targetDnsType = targetDnsType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDomainResult build() {
            return new GetDomainResult(authCode, autoRenew, createdTime, dnsType, dnsZoneId, domainNotRenewableReasons, expirationTime, id, kind, lastRenewedTime, location, managedHostNames, name, nameServers, privacy, provisioningState, readyForDnsRecordManagement, registrationStatus, systemData, tags, targetDnsType, type);
        }
    }
}
