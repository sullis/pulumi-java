// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnterpriseChannelNodeResponse {
    /**
     * The location of the Enterprise Channel Node.
     * 
     */
    private final String azureLocation;
    /**
     * The sku of the Enterprise Channel Node.
     * 
     */
    private final String azureSku;
    /**
     * Id of Enterprise Channel Node. This is generated by the Bot Framework.
     * 
     */
    private final String id;
    /**
     * The name of the Enterprise Channel Node.
     * 
     */
    private final String name;
    /**
     * The current state of the Enterprise Channel Node.
     * 
     */
    private final @Nullable String state;

    @OutputCustomType.Constructor({"azureLocation","azureSku","id","name","state"})
    private EnterpriseChannelNodeResponse(
        String azureLocation,
        String azureSku,
        String id,
        String name,
        @Nullable String state) {
        this.azureLocation = Objects.requireNonNull(azureLocation);
        this.azureSku = Objects.requireNonNull(azureSku);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.state = state;
    }

    /**
     * The location of the Enterprise Channel Node.
     * 
    */
    public String getAzureLocation() {
        return this.azureLocation;
    }
    /**
     * The sku of the Enterprise Channel Node.
     * 
    */
    public String getAzureSku() {
        return this.azureSku;
    }
    /**
     * Id of Enterprise Channel Node. This is generated by the Bot Framework.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the Enterprise Channel Node.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The current state of the Enterprise Channel Node.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseChannelNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureLocation;
        private String azureSku;
        private String id;
        private String name;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseChannelNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureLocation = defaults.azureLocation;
    	      this.azureSku = defaults.azureSku;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder setAzureLocation(String azureLocation) {
            this.azureLocation = Objects.requireNonNull(azureLocation);
            return this;
        }

        public Builder setAzureSku(String azureSku) {
            this.azureSku = Objects.requireNonNull(azureSku);
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

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }
        public EnterpriseChannelNodeResponse build() {
            return new EnterpriseChannelNodeResponse(azureLocation, azureSku, id, name, state);
        }
    }
}