// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.BuildpackBindingLaunchPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a buildpack binding
 * 
 */
public final class BuildpackBindingPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuildpackBindingPropertiesResponse Empty = new BuildpackBindingPropertiesResponse();

    /**
     * Buildpack Binding Type
     * 
     */
    @InputImport(name="bindingType")
    private final @Nullable String bindingType;

    public Optional<String> getBindingType() {
        return this.bindingType == null ? Optional.empty() : Optional.ofNullable(this.bindingType);
    }

    /**
     * The object describes the buildpack binding launch properties
     * 
     */
    @InputImport(name="launchProperties")
    private final @Nullable BuildpackBindingLaunchPropertiesResponse launchProperties;

    public Optional<BuildpackBindingLaunchPropertiesResponse> getLaunchProperties() {
        return this.launchProperties == null ? Optional.empty() : Optional.ofNullable(this.launchProperties);
    }

    /**
     * State of the Buildpack Binding.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public BuildpackBindingPropertiesResponse(
        @Nullable String bindingType,
        @Nullable BuildpackBindingLaunchPropertiesResponse launchProperties,
        String provisioningState) {
        this.bindingType = bindingType;
        this.launchProperties = launchProperties;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private BuildpackBindingPropertiesResponse() {
        this.bindingType = null;
        this.launchProperties = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpackBindingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bindingType;
        private @Nullable BuildpackBindingLaunchPropertiesResponse launchProperties;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpackBindingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindingType = defaults.bindingType;
    	      this.launchProperties = defaults.launchProperties;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setBindingType(@Nullable String bindingType) {
            this.bindingType = bindingType;
            return this;
        }

        public Builder setLaunchProperties(@Nullable BuildpackBindingLaunchPropertiesResponse launchProperties) {
            this.launchProperties = launchProperties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public BuildpackBindingPropertiesResponse build() {
            return new BuildpackBindingPropertiesResponse(bindingType, launchProperties, provisioningState);
        }
    }
}
