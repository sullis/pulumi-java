// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAddonResult {
    /**
     * The type of private cloud addon
     * 
     */
    private final @Nullable String addonType;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The SRM license
     * 
     */
    private final @Nullable String licenseKey;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The state of the addon provisioning
     * 
     */
    private final String provisioningState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"addonType","id","licenseKey","name","provisioningState","type"})
    private GetAddonResult(
        @Nullable String addonType,
        String id,
        @Nullable String licenseKey,
        String name,
        String provisioningState,
        String type) {
        this.addonType = addonType;
        this.id = Objects.requireNonNull(id);
        this.licenseKey = licenseKey;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The type of private cloud addon
     * 
    */
    public Optional<String> getAddonType() {
        return Optional.ofNullable(this.addonType);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The SRM license
     * 
    */
    public Optional<String> getLicenseKey() {
        return Optional.ofNullable(this.licenseKey);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The state of the addon provisioning
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
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

    public static Builder builder(GetAddonResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addonType;
        private String id;
        private @Nullable String licenseKey;
        private String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddonResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonType = defaults.addonType;
    	      this.id = defaults.id;
    	      this.licenseKey = defaults.licenseKey;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAddonType(@Nullable String addonType) {
            this.addonType = addonType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLicenseKey(@Nullable String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAddonResult build() {
            return new GetAddonResult(addonType, id, licenseKey, name, provisioningState, type);
        }
    }
}