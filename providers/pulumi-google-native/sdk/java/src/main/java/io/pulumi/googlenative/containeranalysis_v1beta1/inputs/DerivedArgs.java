// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.FingerprintArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.LayerArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Derived describes the derived image portion (Occurrence) of the DockerImage relationship. This image would be produced from a Dockerfile with FROM .
 * 
 */
public final class DerivedArgs extends io.pulumi.resources.ResourceArgs {

    public static final DerivedArgs Empty = new DerivedArgs();

    /**
     * The fingerprint of the derived image.
     * 
     */
    @InputImport(name="fingerprint", required=true)
      private final Input<FingerprintArgs> fingerprint;

    public Input<FingerprintArgs> getFingerprint() {
        return this.fingerprint;
    }

    /**
     * This contains layer-specific metadata, if populated it has length "distance" and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
     * 
     */
    @InputImport(name="layerInfo")
      private final @Nullable Input<List<LayerArgs>> layerInfo;

    public Input<List<LayerArgs>> getLayerInfo() {
        return this.layerInfo == null ? Input.empty() : this.layerInfo;
    }

    public DerivedArgs(
        Input<FingerprintArgs> fingerprint,
        @Nullable Input<List<LayerArgs>> layerInfo) {
        this.fingerprint = Objects.requireNonNull(fingerprint, "expected parameter 'fingerprint' to be non-null");
        this.layerInfo = layerInfo;
    }

    private DerivedArgs() {
        this.fingerprint = Input.empty();
        this.layerInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DerivedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FingerprintArgs> fingerprint;
        private @Nullable Input<List<LayerArgs>> layerInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(DerivedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.layerInfo = defaults.layerInfo;
        }

        public Builder setFingerprint(Input<FingerprintArgs> fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setFingerprint(FingerprintArgs fingerprint) {
            this.fingerprint = Input.of(Objects.requireNonNull(fingerprint));
            return this;
        }

        public Builder setLayerInfo(@Nullable Input<List<LayerArgs>> layerInfo) {
            this.layerInfo = layerInfo;
            return this;
        }

        public Builder setLayerInfo(@Nullable List<LayerArgs> layerInfo) {
            this.layerInfo = Input.ofNullable(layerInfo);
            return this;
        }
        public DerivedArgs build() {
            return new DerivedArgs(fingerprint, layerInfo);
        }
    }
}