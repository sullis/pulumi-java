// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class GetClusterAddonsConfigHttpLoadBalancing extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterAddonsConfigHttpLoadBalancing Empty = new GetClusterAddonsConfigHttpLoadBalancing();

    @InputImport(name="disabled", required=true)
      private final Boolean disabled;

    public Boolean getDisabled() {
        return this.disabled;
    }

    public GetClusterAddonsConfigHttpLoadBalancing(Boolean disabled) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private GetClusterAddonsConfigHttpLoadBalancing() {
        this.disabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAddonsConfigHttpLoadBalancing defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAddonsConfigHttpLoadBalancing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public GetClusterAddonsConfigHttpLoadBalancing build() {
            return new GetClusterAddonsConfigHttpLoadBalancing(disabled);
        }
    }
}