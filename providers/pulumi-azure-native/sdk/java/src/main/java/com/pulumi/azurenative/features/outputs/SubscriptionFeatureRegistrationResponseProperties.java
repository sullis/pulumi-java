// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.features.outputs;

import com.pulumi.azurenative.features.outputs.AuthorizationProfileResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubscriptionFeatureRegistrationResponseProperties {
    /**
     * @return The feature approval type.
     * 
     */
    private final String approvalType;
    /**
     * @return Authorization Profile
     * 
     */
    private final @Nullable AuthorizationProfileResponse authorizationProfile;
    /**
     * @return The feature description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The featureDisplayName.
     * 
     */
    private final String displayName;
    /**
     * @return The feature documentation link.
     * 
     */
    private final String documentationLink;
    /**
     * @return The featureName.
     * 
     */
    private final String featureName;
    /**
     * @return Key-value pairs for meta data.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * @return The providerNamespace.
     * 
     */
    private final String providerNamespace;
    /**
     * @return The feature registration date.
     * 
     */
    private final String registrationDate;
    /**
     * @return The feature release date.
     * 
     */
    private final String releaseDate;
    /**
     * @return Indicates whether feature should be displayed in Portal.
     * 
     */
    private final @Nullable Boolean shouldFeatureDisplayInPortal;
    /**
     * @return The state.
     * 
     */
    private final @Nullable String state;
    /**
     * @return The subscriptionId.
     * 
     */
    private final String subscriptionId;
    /**
     * @return The tenantId.
     * 
     */
    private final String tenantId;

    @CustomType.Constructor
    private SubscriptionFeatureRegistrationResponseProperties(
        @CustomType.Parameter("approvalType") String approvalType,
        @CustomType.Parameter("authorizationProfile") @Nullable AuthorizationProfileResponse authorizationProfile,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("documentationLink") String documentationLink,
        @CustomType.Parameter("featureName") String featureName,
        @CustomType.Parameter("metadata") @Nullable Map<String,String> metadata,
        @CustomType.Parameter("providerNamespace") String providerNamespace,
        @CustomType.Parameter("registrationDate") String registrationDate,
        @CustomType.Parameter("releaseDate") String releaseDate,
        @CustomType.Parameter("shouldFeatureDisplayInPortal") @Nullable Boolean shouldFeatureDisplayInPortal,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.approvalType = approvalType;
        this.authorizationProfile = authorizationProfile;
        this.description = description;
        this.displayName = displayName;
        this.documentationLink = documentationLink;
        this.featureName = featureName;
        this.metadata = metadata;
        this.providerNamespace = providerNamespace;
        this.registrationDate = registrationDate;
        this.releaseDate = releaseDate;
        this.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal;
        this.state = state;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
    }

    /**
     * @return The feature approval type.
     * 
     */
    public String approvalType() {
        return this.approvalType;
    }
    /**
     * @return Authorization Profile
     * 
     */
    public Optional<AuthorizationProfileResponse> authorizationProfile() {
        return Optional.ofNullable(this.authorizationProfile);
    }
    /**
     * @return The feature description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The featureDisplayName.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The feature documentation link.
     * 
     */
    public String documentationLink() {
        return this.documentationLink;
    }
    /**
     * @return The featureName.
     * 
     */
    public String featureName() {
        return this.featureName;
    }
    /**
     * @return Key-value pairs for meta data.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * @return The providerNamespace.
     * 
     */
    public String providerNamespace() {
        return this.providerNamespace;
    }
    /**
     * @return The feature registration date.
     * 
     */
    public String registrationDate() {
        return this.registrationDate;
    }
    /**
     * @return The feature release date.
     * 
     */
    public String releaseDate() {
        return this.releaseDate;
    }
    /**
     * @return Indicates whether feature should be displayed in Portal.
     * 
     */
    public Optional<Boolean> shouldFeatureDisplayInPortal() {
        return Optional.ofNullable(this.shouldFeatureDisplayInPortal);
    }
    /**
     * @return The state.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The subscriptionId.
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * @return The tenantId.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionFeatureRegistrationResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String approvalType;
        private @Nullable AuthorizationProfileResponse authorizationProfile;
        private @Nullable String description;
        private String displayName;
        private String documentationLink;
        private String featureName;
        private @Nullable Map<String,String> metadata;
        private String providerNamespace;
        private String registrationDate;
        private String releaseDate;
        private @Nullable Boolean shouldFeatureDisplayInPortal;
        private @Nullable String state;
        private String subscriptionId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionFeatureRegistrationResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalType = defaults.approvalType;
    	      this.authorizationProfile = defaults.authorizationProfile;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.documentationLink = defaults.documentationLink;
    	      this.featureName = defaults.featureName;
    	      this.metadata = defaults.metadata;
    	      this.providerNamespace = defaults.providerNamespace;
    	      this.registrationDate = defaults.registrationDate;
    	      this.releaseDate = defaults.releaseDate;
    	      this.shouldFeatureDisplayInPortal = defaults.shouldFeatureDisplayInPortal;
    	      this.state = defaults.state;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder approvalType(String approvalType) {
            this.approvalType = Objects.requireNonNull(approvalType);
            return this;
        }
        public Builder authorizationProfile(@Nullable AuthorizationProfileResponse authorizationProfile) {
            this.authorizationProfile = authorizationProfile;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder documentationLink(String documentationLink) {
            this.documentationLink = Objects.requireNonNull(documentationLink);
            return this;
        }
        public Builder featureName(String featureName) {
            this.featureName = Objects.requireNonNull(featureName);
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder providerNamespace(String providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }
        public Builder registrationDate(String registrationDate) {
            this.registrationDate = Objects.requireNonNull(registrationDate);
            return this;
        }
        public Builder releaseDate(String releaseDate) {
            this.releaseDate = Objects.requireNonNull(releaseDate);
            return this;
        }
        public Builder shouldFeatureDisplayInPortal(@Nullable Boolean shouldFeatureDisplayInPortal) {
            this.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public SubscriptionFeatureRegistrationResponseProperties build() {
            return new SubscriptionFeatureRegistrationResponseProperties(approvalType, authorizationProfile, description, displayName, documentationLink, featureName, metadata, providerNamespace, registrationDate, releaseDate, shouldFeatureDisplayInPortal, state, subscriptionId, tenantId);
        }
    }
}
