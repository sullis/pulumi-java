// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the properties for manual resolution.
 * 
 */
public final class ManualResolutionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManualResolutionPropertiesResponse Empty = new ManualResolutionPropertiesResponse();

    /**
     * Gets or sets the target resource ARM ID of the dependent resource if the resource type is Manual.
     * 
     */
    @InputImport(name="targetId")
    private final @Nullable String targetId;

    public Optional<String> getTargetId() {
        return this.targetId == null ? Optional.empty() : Optional.ofNullable(this.targetId);
    }

    public ManualResolutionPropertiesResponse(@Nullable String targetId) {
        this.targetId = targetId;
    }

    private ManualResolutionPropertiesResponse() {
        this.targetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualResolutionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualResolutionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetId = defaults.targetId;
        }

        public Builder setTargetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }

        public ManualResolutionPropertiesResponse build() {
            return new ManualResolutionPropertiesResponse(targetId);
        }
    }
}
