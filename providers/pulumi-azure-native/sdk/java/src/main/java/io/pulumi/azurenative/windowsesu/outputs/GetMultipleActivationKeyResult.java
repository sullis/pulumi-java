// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.windowsesu.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMultipleActivationKeyResult {
    /**
     * Agreement number under which the key is requested.
     * 
     */
    private final @Nullable String agreementNumber;
    /**
     * End of support of security updates activated by the MAK key.
     * 
     */
    private final String expirationDate;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Number of activations/servers using the MAK key.
     * 
     */
    private final @Nullable Integer installedServerNumber;
    /**
     * <code> true </code> if user has eligible on-premises Windows physical or virtual machines, and that the requested key will only be used in their organization; <code> false </code> otherwise.
     * 
     */
    private final @Nullable Boolean isEligible;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * MAK 5x5 key.
     * 
     */
    private final String multipleActivationKey;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Type of OS for which the key is requested.
     * 
     */
    private final @Nullable String osType;
    private final String provisioningState;
    /**
     * Type of support
     * 
     */
    private final @Nullable String supportType;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"agreementNumber","expirationDate","id","installedServerNumber","isEligible","location","multipleActivationKey","name","osType","provisioningState","supportType","tags","type"})
    private GetMultipleActivationKeyResult(
        @Nullable String agreementNumber,
        String expirationDate,
        String id,
        @Nullable Integer installedServerNumber,
        @Nullable Boolean isEligible,
        String location,
        String multipleActivationKey,
        String name,
        @Nullable String osType,
        String provisioningState,
        @Nullable String supportType,
        @Nullable Map<String,String> tags,
        String type) {
        this.agreementNumber = agreementNumber;
        this.expirationDate = Objects.requireNonNull(expirationDate);
        this.id = Objects.requireNonNull(id);
        this.installedServerNumber = installedServerNumber;
        this.isEligible = isEligible;
        this.location = Objects.requireNonNull(location);
        this.multipleActivationKey = Objects.requireNonNull(multipleActivationKey);
        this.name = Objects.requireNonNull(name);
        this.osType = osType;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.supportType = supportType;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Agreement number under which the key is requested.
     * 
    */
    public Optional<String> getAgreementNumber() {
        return Optional.ofNullable(this.agreementNumber);
    }
    /**
     * End of support of security updates activated by the MAK key.
     * 
    */
    public String getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Number of activations/servers using the MAK key.
     * 
    */
    public Optional<Integer> getInstalledServerNumber() {
        return Optional.ofNullable(this.installedServerNumber);
    }
    /**
     * <code> true </code> if user has eligible on-premises Windows physical or virtual machines, and that the requested key will only be used in their organization; <code> false </code> otherwise.
     * 
    */
    public Optional<Boolean> getIsEligible() {
        return Optional.ofNullable(this.isEligible);
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * MAK 5x5 key.
     * 
    */
    public String getMultipleActivationKey() {
        return this.multipleActivationKey;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Type of OS for which the key is requested.
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of support
     * 
    */
    public Optional<String> getSupportType() {
        return Optional.ofNullable(this.supportType);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMultipleActivationKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agreementNumber;
        private String expirationDate;
        private String id;
        private @Nullable Integer installedServerNumber;
        private @Nullable Boolean isEligible;
        private String location;
        private String multipleActivationKey;
        private String name;
        private @Nullable String osType;
        private String provisioningState;
        private @Nullable String supportType;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMultipleActivationKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreementNumber = defaults.agreementNumber;
    	      this.expirationDate = defaults.expirationDate;
    	      this.id = defaults.id;
    	      this.installedServerNumber = defaults.installedServerNumber;
    	      this.isEligible = defaults.isEligible;
    	      this.location = defaults.location;
    	      this.multipleActivationKey = defaults.multipleActivationKey;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.supportType = defaults.supportType;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAgreementNumber(@Nullable String agreementNumber) {
            this.agreementNumber = agreementNumber;
            return this;
        }

        public Builder setExpirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstalledServerNumber(@Nullable Integer installedServerNumber) {
            this.installedServerNumber = installedServerNumber;
            return this;
        }

        public Builder setIsEligible(@Nullable Boolean isEligible) {
            this.isEligible = isEligible;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMultipleActivationKey(String multipleActivationKey) {
            this.multipleActivationKey = Objects.requireNonNull(multipleActivationKey);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSupportType(@Nullable String supportType) {
            this.supportType = supportType;
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
        public GetMultipleActivationKeyResult build() {
            return new GetMultipleActivationKeyResult(agreementNumber, expirationDate, id, installedServerNumber, isEligible, location, multipleActivationKey, name, osType, provisioningState, supportType, tags, type);
        }
    }
}