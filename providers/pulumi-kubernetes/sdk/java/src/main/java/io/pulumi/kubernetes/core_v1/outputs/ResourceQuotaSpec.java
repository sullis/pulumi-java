// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ScopeSelector;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceQuotaSpec {
    /**
     * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
     * 
     */
    private final @Nullable Map<String,String> hard;
    /**
     * scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
     * 
     */
    private final @Nullable ScopeSelector scopeSelector;
    /**
     * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
     * 
     */
    private final @Nullable List<String> scopes;

    @OutputCustomType.Constructor
    private ResourceQuotaSpec(
        @OutputCustomType.Parameter("hard") @Nullable Map<String,String> hard,
        @OutputCustomType.Parameter("scopeSelector") @Nullable ScopeSelector scopeSelector,
        @OutputCustomType.Parameter("scopes") @Nullable List<String> scopes) {
        this.hard = hard;
        this.scopeSelector = scopeSelector;
        this.scopes = scopes;
    }

    /**
     * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
     * 
    */
    public Map<String,String> getHard() {
        return this.hard == null ? Map.of() : this.hard;
    }
    /**
     * scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
     * 
    */
    public Optional<ScopeSelector> getScopeSelector() {
        return Optional.ofNullable(this.scopeSelector);
    }
    /**
     * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
     * 
    */
    public List<String> getScopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceQuotaSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> hard;
        private @Nullable ScopeSelector scopeSelector;
        private @Nullable List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceQuotaSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hard = defaults.hard;
    	      this.scopeSelector = defaults.scopeSelector;
    	      this.scopes = defaults.scopes;
        }

        public Builder setHard(@Nullable Map<String,String> hard) {
            this.hard = hard;
            return this;
        }

        public Builder setScopeSelector(@Nullable ScopeSelector scopeSelector) {
            this.scopeSelector = scopeSelector;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public ResourceQuotaSpec build() {
            return new ResourceQuotaSpec(hard, scopeSelector, scopes);
        }
    }
}
