// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.gkehub.inputs.FeatureSpecMulticlusteringressArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureSpecArgs Empty = new FeatureSpecArgs();

    /**
     * Multicluster Ingress-specific spec.
     * The `multiclusteringress` block supports:
     * 
     */
    @InputImport(name="multiclusteringress")
    private final @Nullable Input<FeatureSpecMulticlusteringressArgs> multiclusteringress;

    public Input<FeatureSpecMulticlusteringressArgs> getMulticlusteringress() {
        return this.multiclusteringress == null ? Input.empty() : this.multiclusteringress;
    }

    public FeatureSpecArgs(@Nullable Input<FeatureSpecMulticlusteringressArgs> multiclusteringress) {
        this.multiclusteringress = multiclusteringress;
    }

    private FeatureSpecArgs() {
        this.multiclusteringress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FeatureSpecMulticlusteringressArgs> multiclusteringress;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiclusteringress = defaults.multiclusteringress;
        }

        public Builder setMulticlusteringress(@Nullable Input<FeatureSpecMulticlusteringressArgs> multiclusteringress) {
            this.multiclusteringress = multiclusteringress;
            return this;
        }

        public Builder setMulticlusteringress(@Nullable FeatureSpecMulticlusteringressArgs multiclusteringress) {
            this.multiclusteringress = Input.ofNullable(multiclusteringress);
            return this;
        }

        public FeatureSpecArgs build() {
            return new FeatureSpecArgs(multiclusteringress);
        }
    }
}
