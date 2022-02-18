// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDefaultRolloutArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDefaultRolloutArgs Empty = new GetDefaultRolloutArgs();

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @InputImport(name="providerNamespace", required=true)
    private final String providerNamespace;

    public String getProviderNamespace() {
        return this.providerNamespace;
    }

    /**
     * The rollout name.
     * 
     */
    @InputImport(name="rolloutName", required=true)
    private final String rolloutName;

    public String getRolloutName() {
        return this.rolloutName;
    }

    public GetDefaultRolloutArgs(
        String providerNamespace,
        String rolloutName) {
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
        this.rolloutName = Objects.requireNonNull(rolloutName, "expected parameter 'rolloutName' to be non-null");
    }

    private GetDefaultRolloutArgs() {
        this.providerNamespace = null;
        this.rolloutName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String providerNamespace;
        private String rolloutName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultRolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providerNamespace = defaults.providerNamespace;
    	      this.rolloutName = defaults.rolloutName;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }

        public Builder setRolloutName(String rolloutName) {
            this.rolloutName = Objects.requireNonNull(rolloutName);
            return this;
        }

        public GetDefaultRolloutArgs build() {
            return new GetDefaultRolloutArgs(providerNamespace, rolloutName);
        }
    }
}
