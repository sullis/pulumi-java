// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPartnerRegistrationResult {
    /**
     * List of Azure subscription Ids that are authorized to create a partner namespace
     * associated with this partner registration. This is an optional property. Creating
     * partner namespaces is always permitted under the same Azure subscription as the one used
     * for creating the partner registration.
     * 
     */
    private final @Nullable List<String> authorizedAzureSubscriptionIds;
    /**
     * The extension of the customer service URI of the publisher.
     * 
     */
    private final @Nullable String customerServiceUri;
    /**
     * Fully qualified identifier of the resource.
     * 
     */
    private final String id;
    /**
     * Location of the resource.
     * 
     */
    private final String location;
    /**
     * URI of the logo.
     * 
     */
    private final @Nullable String logoUri;
    /**
     * Long description for the custom scenarios and integration to be displayed in the portal if needed.
     * Length of this description should not exceed 2048 characters.
     * 
     */
    private final @Nullable String longDescription;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    /**
     * The extension of the customer service number of the publisher. Only digits are allowed and number of digits should not exceed 10.
     * 
     */
    private final @Nullable String partnerCustomerServiceExtension;
    /**
     * The customer service number of the publisher. The expected phone format should start with a '+' sign
     * followed by the country code. The remaining digits are then followed. Only digits and spaces are allowed and its
     * length cannot exceed 16 digits including country code. Examples of valid phone numbers are: +1 515 123 4567 and
     * +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515) 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43
     * 
     */
    private final @Nullable String partnerCustomerServiceNumber;
    /**
     * Official name of the partner name. For example: "Contoso".
     * 
     */
    private final @Nullable String partnerName;
    /**
     * Short description of the partner resource type. The length of this description should not exceed 256 characters.
     * 
     */
    private final @Nullable String partnerResourceTypeDescription;
    /**
     * Display name of the partner resource type.
     * 
     */
    private final @Nullable String partnerResourceTypeDisplayName;
    /**
     * Name of the partner resource type.
     * 
     */
    private final @Nullable String partnerResourceTypeName;
    /**
     * Provisioning state of the partner registration.
     * 
     */
    private final String provisioningState;
    /**
     * URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     * 
     */
    private final @Nullable String setupUri;
    /**
     * The system metadata relating to Partner Registration resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Type of the resource.
     * 
     */
    private final String type;
    /**
     * Visibility state of the partner registration.
     * 
     */
    private final @Nullable String visibilityState;

    @OutputCustomType.Constructor({"authorizedAzureSubscriptionIds","customerServiceUri","id","location","logoUri","longDescription","name","partnerCustomerServiceExtension","partnerCustomerServiceNumber","partnerName","partnerResourceTypeDescription","partnerResourceTypeDisplayName","partnerResourceTypeName","provisioningState","setupUri","systemData","tags","type","visibilityState"})
    private GetPartnerRegistrationResult(
        @Nullable List<String> authorizedAzureSubscriptionIds,
        @Nullable String customerServiceUri,
        String id,
        String location,
        @Nullable String logoUri,
        @Nullable String longDescription,
        String name,
        @Nullable String partnerCustomerServiceExtension,
        @Nullable String partnerCustomerServiceNumber,
        @Nullable String partnerName,
        @Nullable String partnerResourceTypeDescription,
        @Nullable String partnerResourceTypeDisplayName,
        @Nullable String partnerResourceTypeName,
        String provisioningState,
        @Nullable String setupUri,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String visibilityState) {
        this.authorizedAzureSubscriptionIds = authorizedAzureSubscriptionIds;
        this.customerServiceUri = customerServiceUri;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.logoUri = logoUri;
        this.longDescription = longDescription;
        this.name = Objects.requireNonNull(name);
        this.partnerCustomerServiceExtension = partnerCustomerServiceExtension;
        this.partnerCustomerServiceNumber = partnerCustomerServiceNumber;
        this.partnerName = partnerName;
        this.partnerResourceTypeDescription = partnerResourceTypeDescription;
        this.partnerResourceTypeDisplayName = partnerResourceTypeDisplayName;
        this.partnerResourceTypeName = partnerResourceTypeName;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.setupUri = setupUri;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.visibilityState = visibilityState;
    }

    /**
     * List of Azure subscription Ids that are authorized to create a partner namespace
     * associated with this partner registration. This is an optional property. Creating
     * partner namespaces is always permitted under the same Azure subscription as the one used
     * for creating the partner registration.
     * 
     */
    public List<String> getAuthorizedAzureSubscriptionIds() {
        return this.authorizedAzureSubscriptionIds == null ? List.of() : this.authorizedAzureSubscriptionIds;
    }
    /**
     * The extension of the customer service URI of the publisher.
     * 
     */
    public Optional<String> getCustomerServiceUri() {
        return Optional.ofNullable(this.customerServiceUri);
    }
    /**
     * Fully qualified identifier of the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Location of the resource.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * URI of the logo.
     * 
     */
    public Optional<String> getLogoUri() {
        return Optional.ofNullable(this.logoUri);
    }
    /**
     * Long description for the custom scenarios and integration to be displayed in the portal if needed.
     * Length of this description should not exceed 2048 characters.
     * 
     */
    public Optional<String> getLongDescription() {
        return Optional.ofNullable(this.longDescription);
    }
    /**
     * Name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The extension of the customer service number of the publisher. Only digits are allowed and number of digits should not exceed 10.
     * 
     */
    public Optional<String> getPartnerCustomerServiceExtension() {
        return Optional.ofNullable(this.partnerCustomerServiceExtension);
    }
    /**
     * The customer service number of the publisher. The expected phone format should start with a '+' sign
     * followed by the country code. The remaining digits are then followed. Only digits and spaces are allowed and its
     * length cannot exceed 16 digits including country code. Examples of valid phone numbers are: +1 515 123 4567 and
     * +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515) 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43
     * 
     */
    public Optional<String> getPartnerCustomerServiceNumber() {
        return Optional.ofNullable(this.partnerCustomerServiceNumber);
    }
    /**
     * Official name of the partner name. For example: "Contoso".
     * 
     */
    public Optional<String> getPartnerName() {
        return Optional.ofNullable(this.partnerName);
    }
    /**
     * Short description of the partner resource type. The length of this description should not exceed 256 characters.
     * 
     */
    public Optional<String> getPartnerResourceTypeDescription() {
        return Optional.ofNullable(this.partnerResourceTypeDescription);
    }
    /**
     * Display name of the partner resource type.
     * 
     */
    public Optional<String> getPartnerResourceTypeDisplayName() {
        return Optional.ofNullable(this.partnerResourceTypeDisplayName);
    }
    /**
     * Name of the partner resource type.
     * 
     */
    public Optional<String> getPartnerResourceTypeName() {
        return Optional.ofNullable(this.partnerResourceTypeName);
    }
    /**
     * Provisioning state of the partner registration.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     * 
     */
    public Optional<String> getSetupUri() {
        return Optional.ofNullable(this.setupUri);
    }
    /**
     * The system metadata relating to Partner Registration resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Tags of the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Visibility state of the partner registration.
     * 
     */
    public Optional<String> getVisibilityState() {
        return Optional.ofNullable(this.visibilityState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartnerRegistrationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> authorizedAzureSubscriptionIds;
        private @Nullable String customerServiceUri;
        private String id;
        private String location;
        private @Nullable String logoUri;
        private @Nullable String longDescription;
        private String name;
        private @Nullable String partnerCustomerServiceExtension;
        private @Nullable String partnerCustomerServiceNumber;
        private @Nullable String partnerName;
        private @Nullable String partnerResourceTypeDescription;
        private @Nullable String partnerResourceTypeDisplayName;
        private @Nullable String partnerResourceTypeName;
        private String provisioningState;
        private @Nullable String setupUri;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String visibilityState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartnerRegistrationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedAzureSubscriptionIds = defaults.authorizedAzureSubscriptionIds;
    	      this.customerServiceUri = defaults.customerServiceUri;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.logoUri = defaults.logoUri;
    	      this.longDescription = defaults.longDescription;
    	      this.name = defaults.name;
    	      this.partnerCustomerServiceExtension = defaults.partnerCustomerServiceExtension;
    	      this.partnerCustomerServiceNumber = defaults.partnerCustomerServiceNumber;
    	      this.partnerName = defaults.partnerName;
    	      this.partnerResourceTypeDescription = defaults.partnerResourceTypeDescription;
    	      this.partnerResourceTypeDisplayName = defaults.partnerResourceTypeDisplayName;
    	      this.partnerResourceTypeName = defaults.partnerResourceTypeName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.setupUri = defaults.setupUri;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.visibilityState = defaults.visibilityState;
        }

        public Builder setAuthorizedAzureSubscriptionIds(@Nullable List<String> authorizedAzureSubscriptionIds) {
            this.authorizedAzureSubscriptionIds = authorizedAzureSubscriptionIds;
            return this;
        }

        public Builder setCustomerServiceUri(@Nullable String customerServiceUri) {
            this.customerServiceUri = customerServiceUri;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLogoUri(@Nullable String logoUri) {
            this.logoUri = logoUri;
            return this;
        }

        public Builder setLongDescription(@Nullable String longDescription) {
            this.longDescription = longDescription;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPartnerCustomerServiceExtension(@Nullable String partnerCustomerServiceExtension) {
            this.partnerCustomerServiceExtension = partnerCustomerServiceExtension;
            return this;
        }

        public Builder setPartnerCustomerServiceNumber(@Nullable String partnerCustomerServiceNumber) {
            this.partnerCustomerServiceNumber = partnerCustomerServiceNumber;
            return this;
        }

        public Builder setPartnerName(@Nullable String partnerName) {
            this.partnerName = partnerName;
            return this;
        }

        public Builder setPartnerResourceTypeDescription(@Nullable String partnerResourceTypeDescription) {
            this.partnerResourceTypeDescription = partnerResourceTypeDescription;
            return this;
        }

        public Builder setPartnerResourceTypeDisplayName(@Nullable String partnerResourceTypeDisplayName) {
            this.partnerResourceTypeDisplayName = partnerResourceTypeDisplayName;
            return this;
        }

        public Builder setPartnerResourceTypeName(@Nullable String partnerResourceTypeName) {
            this.partnerResourceTypeName = partnerResourceTypeName;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSetupUri(@Nullable String setupUri) {
            this.setupUri = setupUri;
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVisibilityState(@Nullable String visibilityState) {
            this.visibilityState = visibilityState;
            return this;
        }

        public GetPartnerRegistrationResult build() {
            return new GetPartnerRegistrationResult(authorizedAzureSubscriptionIds, customerServiceUri, id, location, logoUri, longDescription, name, partnerCustomerServiceExtension, partnerCustomerServiceNumber, partnerName, partnerResourceTypeDescription, partnerResourceTypeDisplayName, partnerResourceTypeName, provisioningState, setupUri, systemData, tags, type, visibilityState);
        }
    }
}
