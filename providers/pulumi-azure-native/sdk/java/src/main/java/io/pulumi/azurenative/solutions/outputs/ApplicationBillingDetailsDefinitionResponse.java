// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationBillingDetailsDefinitionResponse {
    /**
     * The managed application resource usage Id.
     * 
     */
    private final @Nullable String resourceUsageId;

    @OutputCustomType.Constructor({"resourceUsageId"})
    private ApplicationBillingDetailsDefinitionResponse(@Nullable String resourceUsageId) {
        this.resourceUsageId = resourceUsageId;
    }

    /**
     * The managed application resource usage Id.
     * 
     */
    public Optional<String> getResourceUsageId() {
        return Optional.ofNullable(this.resourceUsageId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationBillingDetailsDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceUsageId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationBillingDetailsDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUsageId = defaults.resourceUsageId;
        }

        public Builder setResourceUsageId(@Nullable String resourceUsageId) {
            this.resourceUsageId = resourceUsageId;
            return this;
        }

        public ApplicationBillingDetailsDefinitionResponse build() {
            return new ApplicationBillingDetailsDefinitionResponse(resourceUsageId);
        }
    }
}
