// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FeatureSpecMulticlusteringressGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureSpecMulticlusteringressGetArgs Empty = new FeatureSpecMulticlusteringressGetArgs();

    /**
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    @InputImport(name="configMembership", required=true)
    private final Input<String> configMembership;

    public Input<String> getConfigMembership() {
        return this.configMembership;
    }

    public FeatureSpecMulticlusteringressGetArgs(Input<String> configMembership) {
        this.configMembership = Objects.requireNonNull(configMembership, "expected parameter 'configMembership' to be non-null");
    }

    private FeatureSpecMulticlusteringressGetArgs() {
        this.configMembership = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureSpecMulticlusteringressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> configMembership;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureSpecMulticlusteringressGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMembership = defaults.configMembership;
        }

        public Builder setConfigMembership(Input<String> configMembership) {
            this.configMembership = Objects.requireNonNull(configMembership);
            return this;
        }

        public Builder setConfigMembership(String configMembership) {
            this.configMembership = Input.of(Objects.requireNonNull(configMembership));
            return this;
        }

        public FeatureSpecMulticlusteringressGetArgs build() {
            return new FeatureSpecMulticlusteringressGetArgs(configMembership);
        }
    }
}
