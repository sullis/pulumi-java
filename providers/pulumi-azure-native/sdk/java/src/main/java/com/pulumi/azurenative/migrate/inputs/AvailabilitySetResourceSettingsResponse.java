// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gets or sets the availability set resource settings.
 * 
 */
public final class AvailabilitySetResourceSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AvailabilitySetResourceSettingsResponse Empty = new AvailabilitySetResourceSettingsResponse();

    /**
     * Gets or sets the target fault domain.
     * 
     */
    @Import(name="faultDomain")
      private final @Nullable Integer faultDomain;

    public Optional<Integer> faultDomain() {
        return this.faultDomain == null ? Optional.empty() : Optional.ofNullable(this.faultDomain);
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/availabilitySets'.
     * 
     */
    @Import(name="resourceType", required=true)
      private final String resourceType;

    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
      private final String targetResourceName;

    public String targetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Gets or sets the target update domain.
     * 
     */
    @Import(name="updateDomain")
      private final @Nullable Integer updateDomain;

    public Optional<Integer> updateDomain() {
        return this.updateDomain == null ? Optional.empty() : Optional.ofNullable(this.updateDomain);
    }

    public AvailabilitySetResourceSettingsResponse(
        @Nullable Integer faultDomain,
        String resourceType,
        String targetResourceName,
        @Nullable Integer updateDomain) {
        this.faultDomain = faultDomain;
        this.resourceType = Codegen.stringProp("resourceType").arg(resourceType).require();
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
        this.updateDomain = updateDomain;
    }

    private AvailabilitySetResourceSettingsResponse() {
        this.faultDomain = null;
        this.resourceType = null;
        this.targetResourceName = null;
        this.updateDomain = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilitySetResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer faultDomain;
        private String resourceType;
        private String targetResourceName;
        private @Nullable Integer updateDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilitySetResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.faultDomain = defaults.faultDomain;
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.updateDomain = defaults.updateDomain;
        }

        public Builder faultDomain(@Nullable Integer faultDomain) {
            this.faultDomain = faultDomain;
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }
        public Builder updateDomain(@Nullable Integer updateDomain) {
            this.updateDomain = updateDomain;
            return this;
        }        public AvailabilitySetResourceSettingsResponse build() {
            return new AvailabilitySetResourceSettingsResponse(faultDomain, resourceType, targetResourceName, updateDomain);
        }
    }
}
