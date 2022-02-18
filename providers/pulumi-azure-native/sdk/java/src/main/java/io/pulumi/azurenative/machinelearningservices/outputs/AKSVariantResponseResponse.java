// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ServiceResponseBaseResponseError;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AKSVariantResponseResponse {
    /**
     * The compute environment type for the service.
     * Expected value is 'Custom'.
     * 
     */
    private final String computeType;
    /**
     * The deployment type for the service.
     * 
     */
    private final @Nullable String deploymentType;
    /**
     * The service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The error details.
     * 
     */
    private final ServiceResponseBaseResponseError error;
    /**
     * Is this the default variant.
     * 
     */
    private final @Nullable Boolean isDefault;
    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    private final @Nullable Map<String,String> kvTags;
    /**
     * The service property dictionary. Properties are immutable.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * The current state of the service.
     * 
     */
    private final String state;
    /**
     * The amount of traffic variant receives.
     * 
     */
    private final @Nullable Double trafficPercentile;
    /**
     * The type of the variant.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"computeType","deploymentType","description","error","isDefault","kvTags","properties","state","trafficPercentile","type"})
    private AKSVariantResponseResponse(
        String computeType,
        @Nullable String deploymentType,
        @Nullable String description,
        ServiceResponseBaseResponseError error,
        @Nullable Boolean isDefault,
        @Nullable Map<String,String> kvTags,
        @Nullable Map<String,String> properties,
        String state,
        @Nullable Double trafficPercentile,
        @Nullable String type) {
        this.computeType = Objects.requireNonNull(computeType);
        this.deploymentType = deploymentType;
        this.description = description;
        this.error = Objects.requireNonNull(error);
        this.isDefault = isDefault;
        this.kvTags = kvTags;
        this.properties = properties;
        this.state = Objects.requireNonNull(state);
        this.trafficPercentile = trafficPercentile;
        this.type = type;
    }

    /**
     * The compute environment type for the service.
     * Expected value is 'Custom'.
     * 
     */
    public String getComputeType() {
        return this.computeType;
    }
    /**
     * The deployment type for the service.
     * 
     */
    public Optional<String> getDeploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }
    /**
     * The service description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The error details.
     * 
     */
    public ServiceResponseBaseResponseError getError() {
        return this.error;
    }
    /**
     * Is this the default variant.
     * 
     */
    public Optional<Boolean> getIsDefault() {
        return Optional.ofNullable(this.isDefault);
    }
    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    public Map<String,String> getKvTags() {
        return this.kvTags == null ? Map.of() : this.kvTags;
    }
    /**
     * The service property dictionary. Properties are immutable.
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * The current state of the service.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The amount of traffic variant receives.
     * 
     */
    public Optional<Double> getTrafficPercentile() {
        return Optional.ofNullable(this.trafficPercentile);
    }
    /**
     * The type of the variant.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSVariantResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computeType;
        private @Nullable String deploymentType;
        private @Nullable String description;
        private ServiceResponseBaseResponseError error;
        private @Nullable Boolean isDefault;
        private @Nullable Map<String,String> kvTags;
        private @Nullable Map<String,String> properties;
        private String state;
        private @Nullable Double trafficPercentile;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSVariantResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.error = defaults.error;
    	      this.isDefault = defaults.isDefault;
    	      this.kvTags = defaults.kvTags;
    	      this.properties = defaults.properties;
    	      this.state = defaults.state;
    	      this.trafficPercentile = defaults.trafficPercentile;
    	      this.type = defaults.type;
        }

        public Builder setComputeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setDeploymentType(@Nullable String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setError(ServiceResponseBaseResponseError error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setIsDefault(@Nullable Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder setKvTags(@Nullable Map<String,String> kvTags) {
            this.kvTags = kvTags;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTrafficPercentile(@Nullable Double trafficPercentile) {
            this.trafficPercentile = trafficPercentile;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public AKSVariantResponseResponse build() {
            return new AKSVariantResponseResponse(computeType, deploymentType, description, error, isDefault, kvTags, properties, state, trafficPercentile, type);
        }
    }
}
