// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace;

import io.pulumi.azurenative.marketplace.inputs.PlanArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateStoreCollectionOfferArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateStoreCollectionOfferArgs Empty = new PrivateStoreCollectionOfferArgs();

    /**
     * The collection ID
     * 
     */
    @InputImport(name="collectionId", required=true)
      private final Input<String> collectionId;

    public Input<String> getCollectionId() {
        return this.collectionId;
    }

    /**
     * Identifier for purposes of race condition
     * 
     */
    @InputImport(name="eTag")
      private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * Icon File Uris
     * 
     */
    @InputImport(name="iconFileUris")
      private final @Nullable Input<Map<String,String>> iconFileUris;

    public Input<Map<String,String>> getIconFileUris() {
        return this.iconFileUris == null ? Input.empty() : this.iconFileUris;
    }

    /**
     * The offer ID to update or delete
     * 
     */
    @InputImport(name="offerId")
      private final @Nullable Input<String> offerId;

    public Input<String> getOfferId() {
        return this.offerId == null ? Input.empty() : this.offerId;
    }

    /**
     * Offer plans
     * 
     */
    @InputImport(name="plans")
      private final @Nullable Input<List<PlanArgs>> plans;

    public Input<List<PlanArgs>> getPlans() {
        return this.plans == null ? Input.empty() : this.plans;
    }

    /**
     * The store ID - must use the tenant ID
     * 
     */
    @InputImport(name="privateStoreId", required=true)
      private final Input<String> privateStoreId;

    public Input<String> getPrivateStoreId() {
        return this.privateStoreId;
    }

    /**
     * Plan ids limitation for this offer
     * 
     */
    @InputImport(name="specificPlanIdsLimitation")
      private final @Nullable Input<List<String>> specificPlanIdsLimitation;

    public Input<List<String>> getSpecificPlanIdsLimitation() {
        return this.specificPlanIdsLimitation == null ? Input.empty() : this.specificPlanIdsLimitation;
    }

    /**
     * Indicating whether the offer was not updated to db (true = not updated). If the allow list is identical to the existed one in db, the offer would not be updated.
     * 
     */
    @InputImport(name="updateSuppressedDueIdempotence")
      private final @Nullable Input<Boolean> updateSuppressedDueIdempotence;

    public Input<Boolean> getUpdateSuppressedDueIdempotence() {
        return this.updateSuppressedDueIdempotence == null ? Input.empty() : this.updateSuppressedDueIdempotence;
    }

    public PrivateStoreCollectionOfferArgs(
        Input<String> collectionId,
        @Nullable Input<String> eTag,
        @Nullable Input<Map<String,String>> iconFileUris,
        @Nullable Input<String> offerId,
        @Nullable Input<List<PlanArgs>> plans,
        Input<String> privateStoreId,
        @Nullable Input<List<String>> specificPlanIdsLimitation,
        @Nullable Input<Boolean> updateSuppressedDueIdempotence) {
        this.collectionId = Objects.requireNonNull(collectionId, "expected parameter 'collectionId' to be non-null");
        this.eTag = eTag;
        this.iconFileUris = iconFileUris;
        this.offerId = offerId;
        this.plans = plans;
        this.privateStoreId = Objects.requireNonNull(privateStoreId, "expected parameter 'privateStoreId' to be non-null");
        this.specificPlanIdsLimitation = specificPlanIdsLimitation;
        this.updateSuppressedDueIdempotence = updateSuppressedDueIdempotence;
    }

    private PrivateStoreCollectionOfferArgs() {
        this.collectionId = Input.empty();
        this.eTag = Input.empty();
        this.iconFileUris = Input.empty();
        this.offerId = Input.empty();
        this.plans = Input.empty();
        this.privateStoreId = Input.empty();
        this.specificPlanIdsLimitation = Input.empty();
        this.updateSuppressedDueIdempotence = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateStoreCollectionOfferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> collectionId;
        private @Nullable Input<String> eTag;
        private @Nullable Input<Map<String,String>> iconFileUris;
        private @Nullable Input<String> offerId;
        private @Nullable Input<List<PlanArgs>> plans;
        private Input<String> privateStoreId;
        private @Nullable Input<List<String>> specificPlanIdsLimitation;
        private @Nullable Input<Boolean> updateSuppressedDueIdempotence;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateStoreCollectionOfferArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionId = defaults.collectionId;
    	      this.eTag = defaults.eTag;
    	      this.iconFileUris = defaults.iconFileUris;
    	      this.offerId = defaults.offerId;
    	      this.plans = defaults.plans;
    	      this.privateStoreId = defaults.privateStoreId;
    	      this.specificPlanIdsLimitation = defaults.specificPlanIdsLimitation;
    	      this.updateSuppressedDueIdempotence = defaults.updateSuppressedDueIdempotence;
        }

        public Builder setCollectionId(Input<String> collectionId) {
            this.collectionId = Objects.requireNonNull(collectionId);
            return this;
        }

        public Builder setCollectionId(String collectionId) {
            this.collectionId = Input.of(Objects.requireNonNull(collectionId));
            return this;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setIconFileUris(@Nullable Input<Map<String,String>> iconFileUris) {
            this.iconFileUris = iconFileUris;
            return this;
        }

        public Builder setIconFileUris(@Nullable Map<String,String> iconFileUris) {
            this.iconFileUris = Input.ofNullable(iconFileUris);
            return this;
        }

        public Builder setOfferId(@Nullable Input<String> offerId) {
            this.offerId = offerId;
            return this;
        }

        public Builder setOfferId(@Nullable String offerId) {
            this.offerId = Input.ofNullable(offerId);
            return this;
        }

        public Builder setPlans(@Nullable Input<List<PlanArgs>> plans) {
            this.plans = plans;
            return this;
        }

        public Builder setPlans(@Nullable List<PlanArgs> plans) {
            this.plans = Input.ofNullable(plans);
            return this;
        }

        public Builder setPrivateStoreId(Input<String> privateStoreId) {
            this.privateStoreId = Objects.requireNonNull(privateStoreId);
            return this;
        }

        public Builder setPrivateStoreId(String privateStoreId) {
            this.privateStoreId = Input.of(Objects.requireNonNull(privateStoreId));
            return this;
        }

        public Builder setSpecificPlanIdsLimitation(@Nullable Input<List<String>> specificPlanIdsLimitation) {
            this.specificPlanIdsLimitation = specificPlanIdsLimitation;
            return this;
        }

        public Builder setSpecificPlanIdsLimitation(@Nullable List<String> specificPlanIdsLimitation) {
            this.specificPlanIdsLimitation = Input.ofNullable(specificPlanIdsLimitation);
            return this;
        }

        public Builder setUpdateSuppressedDueIdempotence(@Nullable Input<Boolean> updateSuppressedDueIdempotence) {
            this.updateSuppressedDueIdempotence = updateSuppressedDueIdempotence;
            return this;
        }

        public Builder setUpdateSuppressedDueIdempotence(@Nullable Boolean updateSuppressedDueIdempotence) {
            this.updateSuppressedDueIdempotence = Input.ofNullable(updateSuppressedDueIdempotence);
            return this;
        }
        public PrivateStoreCollectionOfferArgs build() {
            return new PrivateStoreCollectionOfferArgs(collectionId, eTag, iconFileUris, offerId, plans, privateStoreId, specificPlanIdsLimitation, updateSuppressedDueIdempotence);
        }
    }
}