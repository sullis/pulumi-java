// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssignmentLockSettingsResponse {
    /**
     * @return List of management operations that are excluded from blueprint locks. Up to 200 actions are permitted. If the lock mode is set to &#39;AllResourcesReadOnly&#39;, then the following actions are automatically appended to &#39;excludedActions&#39;: &#39;*{@literal /}read&#39;, &#39;Microsoft.Network/virtualNetworks/subnets/join/action&#39; and &#39;Microsoft.Authorization/locks/delete&#39;. If the lock mode is set to &#39;AllResourcesDoNotDelete&#39;, then the following actions are automatically appended to &#39;excludedActions&#39;: &#39;Microsoft.Authorization/locks/delete&#39;. Duplicate actions will get removed.
     * 
     */
    private final @Nullable List<String> excludedActions;
    /**
     * @return List of AAD principals excluded from blueprint locks. Up to 5 principals are permitted.
     * 
     */
    private final @Nullable List<String> excludedPrincipals;
    /**
     * @return Lock mode.
     * 
     */
    private final @Nullable String mode;

    @CustomType.Constructor
    private AssignmentLockSettingsResponse(
        @CustomType.Parameter("excludedActions") @Nullable List<String> excludedActions,
        @CustomType.Parameter("excludedPrincipals") @Nullable List<String> excludedPrincipals,
        @CustomType.Parameter("mode") @Nullable String mode) {
        this.excludedActions = excludedActions;
        this.excludedPrincipals = excludedPrincipals;
        this.mode = mode;
    }

    /**
     * @return List of management operations that are excluded from blueprint locks. Up to 200 actions are permitted. If the lock mode is set to &#39;AllResourcesReadOnly&#39;, then the following actions are automatically appended to &#39;excludedActions&#39;: &#39;*{@literal /}read&#39;, &#39;Microsoft.Network/virtualNetworks/subnets/join/action&#39; and &#39;Microsoft.Authorization/locks/delete&#39;. If the lock mode is set to &#39;AllResourcesDoNotDelete&#39;, then the following actions are automatically appended to &#39;excludedActions&#39;: &#39;Microsoft.Authorization/locks/delete&#39;. Duplicate actions will get removed.
     * 
     */
    public List<String> excludedActions() {
        return this.excludedActions == null ? List.of() : this.excludedActions;
    }
    /**
     * @return List of AAD principals excluded from blueprint locks. Up to 5 principals are permitted.
     * 
     */
    public List<String> excludedPrincipals() {
        return this.excludedPrincipals == null ? List.of() : this.excludedPrincipals;
    }
    /**
     * @return Lock mode.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentLockSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedActions;
        private @Nullable List<String> excludedPrincipals;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentLockSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedActions = defaults.excludedActions;
    	      this.excludedPrincipals = defaults.excludedPrincipals;
    	      this.mode = defaults.mode;
        }

        public Builder excludedActions(@Nullable List<String> excludedActions) {
            this.excludedActions = excludedActions;
            return this;
        }
        public Builder excludedActions(String... excludedActions) {
            return excludedActions(List.of(excludedActions));
        }
        public Builder excludedPrincipals(@Nullable List<String> excludedPrincipals) {
            this.excludedPrincipals = excludedPrincipals;
            return this;
        }
        public Builder excludedPrincipals(String... excludedPrincipals) {
            return excludedPrincipals(List.of(excludedPrincipals));
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }        public AssignmentLockSettingsResponse build() {
            return new AssignmentLockSettingsResponse(excludedActions, excludedPrincipals, mode);
        }
    }
}
