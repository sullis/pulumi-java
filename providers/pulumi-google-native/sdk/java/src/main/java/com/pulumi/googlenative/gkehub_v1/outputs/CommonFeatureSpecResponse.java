// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.gkehub_v1.outputs.AppDevExperienceFeatureSpecResponse;
import com.pulumi.googlenative.gkehub_v1.outputs.MultiClusterIngressFeatureSpecResponse;
import java.util.Objects;

@CustomType
public final class CommonFeatureSpecResponse {
    /**
     * @return Appdevexperience specific spec.
     * 
     */
    private final AppDevExperienceFeatureSpecResponse appdevexperience;
    /**
     * @return Multicluster Ingress-specific spec.
     * 
     */
    private final MultiClusterIngressFeatureSpecResponse multiclusteringress;

    @CustomType.Constructor
    private CommonFeatureSpecResponse(
        @CustomType.Parameter("appdevexperience") AppDevExperienceFeatureSpecResponse appdevexperience,
        @CustomType.Parameter("multiclusteringress") MultiClusterIngressFeatureSpecResponse multiclusteringress) {
        this.appdevexperience = appdevexperience;
        this.multiclusteringress = multiclusteringress;
    }

    /**
     * @return Appdevexperience specific spec.
     * 
     */
    public AppDevExperienceFeatureSpecResponse appdevexperience() {
        return this.appdevexperience;
    }
    /**
     * @return Multicluster Ingress-specific spec.
     * 
     */
    public MultiClusterIngressFeatureSpecResponse multiclusteringress() {
        return this.multiclusteringress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonFeatureSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppDevExperienceFeatureSpecResponse appdevexperience;
        private MultiClusterIngressFeatureSpecResponse multiclusteringress;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonFeatureSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appdevexperience = defaults.appdevexperience;
    	      this.multiclusteringress = defaults.multiclusteringress;
        }

        public Builder appdevexperience(AppDevExperienceFeatureSpecResponse appdevexperience) {
            this.appdevexperience = Objects.requireNonNull(appdevexperience);
            return this;
        }
        public Builder multiclusteringress(MultiClusterIngressFeatureSpecResponse multiclusteringress) {
            this.multiclusteringress = Objects.requireNonNull(multiclusteringress);
            return this;
        }        public CommonFeatureSpecResponse build() {
            return new CommonFeatureSpecResponse(appdevexperience, multiclusteringress);
        }
    }
}
