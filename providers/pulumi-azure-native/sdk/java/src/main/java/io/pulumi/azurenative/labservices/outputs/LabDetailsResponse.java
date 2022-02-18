// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LabDetailsResponse {
    /**
     * The Id of the lab.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the lab
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the lab.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The maximum duration a user can use a VM in this lab.
     * 
     */
    private final String usageQuota;

    @OutputCustomType.Constructor({"id","name","provisioningState","usageQuota"})
    private LabDetailsResponse(
        @Nullable String id,
        @Nullable String name,
        @Nullable String provisioningState,
        String usageQuota) {
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.usageQuota = Objects.requireNonNull(usageQuota);
    }

    /**
     * The Id of the lab.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the lab
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the lab.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The maximum duration a user can use a VM in this lab.
     * 
     */
    public String getUsageQuota() {
        return this.usageQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String provisioningState;
        private String usageQuota;

        public Builder() {
    	      // Empty
        }

        public Builder(LabDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.usageQuota = defaults.usageQuota;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setUsageQuota(String usageQuota) {
            this.usageQuota = Objects.requireNonNull(usageQuota);
            return this;
        }

        public LabDetailsResponse build() {
            return new LabDetailsResponse(id, name, provisioningState, usageQuota);
        }
    }
}
