// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetShareSubscriptionResult {
    /**
     * Time at which the share subscription was created.
     * 
     */
    private final String createdAt;
    /**
     * The expiration date of the share subscription.
     * 
     */
    private final @Nullable String expirationDate;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * The invitation id.
     * 
     */
    private final String invitationId;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Email of the provider who created the resource
     * 
     */
    private final String providerEmail;
    /**
     * Name of the provider who created the resource
     * 
     */
    private final String providerName;
    /**
     * Tenant name of the provider who created the resource
     * 
     */
    private final String providerTenantName;
    /**
     * Provisioning state of the share subscription
     * 
     */
    private final String provisioningState;
    /**
     * Description of share
     * 
     */
    private final String shareDescription;
    /**
     * Kind of share
     * 
     */
    private final String shareKind;
    /**
     * Name of the share
     * 
     */
    private final String shareName;
    /**
     * Gets the current status of share subscription.
     * 
     */
    private final String shareSubscriptionStatus;
    /**
     * Terms of a share
     * 
     */
    private final String shareTerms;
    /**
     * Source share location.
     * 
     */
    private final String sourceShareLocation;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;
    /**
     * Email of the user who created the resource
     * 
     */
    private final String userEmail;
    /**
     * Name of the user who created the resource
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"createdAt","expirationDate","id","invitationId","name","providerEmail","providerName","providerTenantName","provisioningState","shareDescription","shareKind","shareName","shareSubscriptionStatus","shareTerms","sourceShareLocation","systemData","type","userEmail","userName"})
    private GetShareSubscriptionResult(
        String createdAt,
        @Nullable String expirationDate,
        String id,
        String invitationId,
        String name,
        String providerEmail,
        String providerName,
        String providerTenantName,
        String provisioningState,
        String shareDescription,
        String shareKind,
        String shareName,
        String shareSubscriptionStatus,
        String shareTerms,
        String sourceShareLocation,
        SystemDataResponse systemData,
        String type,
        String userEmail,
        String userName) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.expirationDate = expirationDate;
        this.id = Objects.requireNonNull(id);
        this.invitationId = Objects.requireNonNull(invitationId);
        this.name = Objects.requireNonNull(name);
        this.providerEmail = Objects.requireNonNull(providerEmail);
        this.providerName = Objects.requireNonNull(providerName);
        this.providerTenantName = Objects.requireNonNull(providerTenantName);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.shareDescription = Objects.requireNonNull(shareDescription);
        this.shareKind = Objects.requireNonNull(shareKind);
        this.shareName = Objects.requireNonNull(shareName);
        this.shareSubscriptionStatus = Objects.requireNonNull(shareSubscriptionStatus);
        this.shareTerms = Objects.requireNonNull(shareTerms);
        this.sourceShareLocation = Objects.requireNonNull(sourceShareLocation);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
        this.userEmail = Objects.requireNonNull(userEmail);
        this.userName = Objects.requireNonNull(userName);
    }

    /**
     * Time at which the share subscription was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The expiration date of the share subscription.
     * 
    */
    public Optional<String> getExpirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The invitation id.
     * 
    */
    public String getInvitationId() {
        return this.invitationId;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Email of the provider who created the resource
     * 
    */
    public String getProviderEmail() {
        return this.providerEmail;
    }
    /**
     * Name of the provider who created the resource
     * 
    */
    public String getProviderName() {
        return this.providerName;
    }
    /**
     * Tenant name of the provider who created the resource
     * 
    */
    public String getProviderTenantName() {
        return this.providerTenantName;
    }
    /**
     * Provisioning state of the share subscription
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Description of share
     * 
    */
    public String getShareDescription() {
        return this.shareDescription;
    }
    /**
     * Kind of share
     * 
    */
    public String getShareKind() {
        return this.shareKind;
    }
    /**
     * Name of the share
     * 
    */
    public String getShareName() {
        return this.shareName;
    }
    /**
     * Gets the current status of share subscription.
     * 
    */
    public String getShareSubscriptionStatus() {
        return this.shareSubscriptionStatus;
    }
    /**
     * Terms of a share
     * 
    */
    public String getShareTerms() {
        return this.shareTerms;
    }
    /**
     * Source share location.
     * 
    */
    public String getSourceShareLocation() {
        return this.sourceShareLocation;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Email of the user who created the resource
     * 
    */
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Name of the user who created the resource
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShareSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private @Nullable String expirationDate;
        private String id;
        private String invitationId;
        private String name;
        private String providerEmail;
        private String providerName;
        private String providerTenantName;
        private String provisioningState;
        private String shareDescription;
        private String shareKind;
        private String shareName;
        private String shareSubscriptionStatus;
        private String shareTerms;
        private String sourceShareLocation;
        private SystemDataResponse systemData;
        private String type;
        private String userEmail;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetShareSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.expirationDate = defaults.expirationDate;
    	      this.id = defaults.id;
    	      this.invitationId = defaults.invitationId;
    	      this.name = defaults.name;
    	      this.providerEmail = defaults.providerEmail;
    	      this.providerName = defaults.providerName;
    	      this.providerTenantName = defaults.providerTenantName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.shareDescription = defaults.shareDescription;
    	      this.shareKind = defaults.shareKind;
    	      this.shareName = defaults.shareName;
    	      this.shareSubscriptionStatus = defaults.shareSubscriptionStatus;
    	      this.shareTerms = defaults.shareTerms;
    	      this.sourceShareLocation = defaults.sourceShareLocation;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.userEmail = defaults.userEmail;
    	      this.userName = defaults.userName;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInvitationId(String invitationId) {
            this.invitationId = Objects.requireNonNull(invitationId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProviderEmail(String providerEmail) {
            this.providerEmail = Objects.requireNonNull(providerEmail);
            return this;
        }

        public Builder setProviderName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder setProviderTenantName(String providerTenantName) {
            this.providerTenantName = Objects.requireNonNull(providerTenantName);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setShareDescription(String shareDescription) {
            this.shareDescription = Objects.requireNonNull(shareDescription);
            return this;
        }

        public Builder setShareKind(String shareKind) {
            this.shareKind = Objects.requireNonNull(shareKind);
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder setShareSubscriptionStatus(String shareSubscriptionStatus) {
            this.shareSubscriptionStatus = Objects.requireNonNull(shareSubscriptionStatus);
            return this;
        }

        public Builder setShareTerms(String shareTerms) {
            this.shareTerms = Objects.requireNonNull(shareTerms);
            return this;
        }

        public Builder setSourceShareLocation(String sourceShareLocation) {
            this.sourceShareLocation = Objects.requireNonNull(sourceShareLocation);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetShareSubscriptionResult build() {
            return new GetShareSubscriptionResult(createdAt, expirationDate, id, invitationId, name, providerEmail, providerName, providerTenantName, provisioningState, shareDescription, shareKind, shareName, shareSubscriptionStatus, shareTerms, sourceShareLocation, systemData, type, userEmail, userName);
        }
    }
}