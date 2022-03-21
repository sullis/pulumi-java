// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.BuildSignatureResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BuildResponse {
    /**
     * Immutable. Version of the builder which produced this build.
     * 
     */
    private final String builderVersion;
    /**
     * Signature of the build in occurrences pointing to this build note containing build details.
     * 
     */
    private final BuildSignatureResponse signature;

    @CustomType.Constructor
    private BuildResponse(
        @CustomType.Parameter("builderVersion") String builderVersion,
        @CustomType.Parameter("signature") BuildSignatureResponse signature) {
        this.builderVersion = builderVersion;
        this.signature = signature;
    }

    /**
     * Immutable. Version of the builder which produced this build.
     * 
    */
    public String getBuilderVersion() {
        return this.builderVersion;
    }
    /**
     * Signature of the build in occurrences pointing to this build note containing build details.
     * 
    */
    public BuildSignatureResponse getSignature() {
        return this.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String builderVersion;
        private BuildSignatureResponse signature;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
    	      this.signature = defaults.signature;
        }

        public Builder builderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }
        public Builder signature(BuildSignatureResponse signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }        public BuildResponse build() {
            return new BuildResponse(builderVersion, signature);
        }
    }
}
