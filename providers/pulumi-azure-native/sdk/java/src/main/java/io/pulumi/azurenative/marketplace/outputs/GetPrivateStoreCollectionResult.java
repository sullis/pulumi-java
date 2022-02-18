// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.outputs;

import io.pulumi.azurenative.marketplace.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateStoreCollectionResult {
    /**
     * Indicating whether all subscriptions are selected (=true) or not (=false).
     * 
     */
    private final @Nullable Boolean allSubscriptions;
    /**
     * Gets or sets the association with Commercial's Billing Account.
     * 
     */
    private final @Nullable String claim;
    /**
     * Gets collection Id.
     * 
     */
    private final String collectionId;
    /**
     * Gets or sets collection name.
     * 
     */
    private final @Nullable String collectionName;
    /**
     * Indicating whether the collection is enabled or disabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Gets the number of offers associated with the collection.
     * 
     */
    private final Double numberOfOffers;
    /**
     * Gets or sets subscription ids list. Empty list indicates all subscriptions are selected, null indicates no update is done, explicit list indicates the explicit selected subscriptions. On insert, null is considered as bad request
     * 
     */
    private final @Nullable List<String> subscriptionsList;
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"allSubscriptions","claim","collectionId","collectionName","enabled","id","name","numberOfOffers","subscriptionsList","systemData","type"})
    private GetPrivateStoreCollectionResult(
        @Nullable Boolean allSubscriptions,
        @Nullable String claim,
        String collectionId,
        @Nullable String collectionName,
        @Nullable Boolean enabled,
        String id,
        String name,
        Double numberOfOffers,
        @Nullable List<String> subscriptionsList,
        SystemDataResponse systemData,
        String type) {
        this.allSubscriptions = allSubscriptions;
        this.claim = claim;
        this.collectionId = Objects.requireNonNull(collectionId);
        this.collectionName = collectionName;
        this.enabled = enabled;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.numberOfOffers = Objects.requireNonNull(numberOfOffers);
        this.subscriptionsList = subscriptionsList;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Indicating whether all subscriptions are selected (=true) or not (=false).
     * 
     */
    public Optional<Boolean> getAllSubscriptions() {
        return Optional.ofNullable(this.allSubscriptions);
    }
    /**
     * Gets or sets the association with Commercial's Billing Account.
     * 
     */
    public Optional<String> getClaim() {
        return Optional.ofNullable(this.claim);
    }
    /**
     * Gets collection Id.
     * 
     */
    public String getCollectionId() {
        return this.collectionId;
    }
    /**
     * Gets or sets collection name.
     * 
     */
    public Optional<String> getCollectionName() {
        return Optional.ofNullable(this.collectionName);
    }
    /**
     * Indicating whether the collection is enabled or disabled.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the number of offers associated with the collection.
     * 
     */
    public Double getNumberOfOffers() {
        return this.numberOfOffers;
    }
    /**
     * Gets or sets subscription ids list. Empty list indicates all subscriptions are selected, null indicates no update is done, explicit list indicates the explicit selected subscriptions. On insert, null is considered as bad request
     * 
     */
    public List<String> getSubscriptionsList() {
        return this.subscriptionsList == null ? List.of() : this.subscriptionsList;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateStoreCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allSubscriptions;
        private @Nullable String claim;
        private String collectionId;
        private @Nullable String collectionName;
        private @Nullable Boolean enabled;
        private String id;
        private String name;
        private Double numberOfOffers;
        private @Nullable List<String> subscriptionsList;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateStoreCollectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allSubscriptions = defaults.allSubscriptions;
    	      this.claim = defaults.claim;
    	      this.collectionId = defaults.collectionId;
    	      this.collectionName = defaults.collectionName;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.numberOfOffers = defaults.numberOfOffers;
    	      this.subscriptionsList = defaults.subscriptionsList;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setAllSubscriptions(@Nullable Boolean allSubscriptions) {
            this.allSubscriptions = allSubscriptions;
            return this;
        }

        public Builder setClaim(@Nullable String claim) {
            this.claim = claim;
            return this;
        }

        public Builder setCollectionId(String collectionId) {
            this.collectionId = Objects.requireNonNull(collectionId);
            return this;
        }

        public Builder setCollectionName(@Nullable String collectionName) {
            this.collectionName = collectionName;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNumberOfOffers(Double numberOfOffers) {
            this.numberOfOffers = Objects.requireNonNull(numberOfOffers);
            return this;
        }

        public Builder setSubscriptionsList(@Nullable List<String> subscriptionsList) {
            this.subscriptionsList = subscriptionsList;
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

        public GetPrivateStoreCollectionResult build() {
            return new GetPrivateStoreCollectionResult(allSubscriptions, claim, collectionId, collectionName, enabled, id, name, numberOfOffers, subscriptionsList, systemData, type);
        }
    }
}
