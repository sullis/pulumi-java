// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.ManagementPolicyActionResponse;
import io.pulumi.azurenative.storage.outputs.ManagementPolicyFilterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementPolicyDefinitionResponse {
    /**
     * An object that defines the action set.
     * 
     */
    private final ManagementPolicyActionResponse actions;
    /**
     * An object that defines the filter set.
     * 
     */
    private final @Nullable ManagementPolicyFilterResponse filters;

    @OutputCustomType.Constructor({"actions","filters"})
    private ManagementPolicyDefinitionResponse(
        ManagementPolicyActionResponse actions,
        @Nullable ManagementPolicyFilterResponse filters) {
        this.actions = Objects.requireNonNull(actions);
        this.filters = filters;
    }

    /**
     * An object that defines the action set.
     * 
     */
    public ManagementPolicyActionResponse getActions() {
        return this.actions;
    }
    /**
     * An object that defines the filter set.
     * 
     */
    public Optional<ManagementPolicyFilterResponse> getFilters() {
        return Optional.ofNullable(this.filters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyActionResponse actions;
        private @Nullable ManagementPolicyFilterResponse filters;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.filters = defaults.filters;
        }

        public Builder setActions(ManagementPolicyActionResponse actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setFilters(@Nullable ManagementPolicyFilterResponse filters) {
            this.filters = filters;
            return this;
        }

        public ManagementPolicyDefinitionResponse build() {
            return new ManagementPolicyDefinitionResponse(actions, filters);
        }
    }
}
