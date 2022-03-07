// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.Architecture;
import io.pulumi.azurenative.containerregistry.enums.OS;
import io.pulumi.azurenative.containerregistry.enums.Variant;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The platform properties against which the run has to happen.
 * 
 */
public final class PlatformPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlatformPropertiesArgs Empty = new PlatformPropertiesArgs();

    /**
     * The OS architecture.
     * 
     */
    @InputImport(name="architecture")
      private final @Nullable Input<Either<String,Architecture>> architecture;

    public Input<Either<String,Architecture>> getArchitecture() {
        return this.architecture == null ? Input.empty() : this.architecture;
    }

    /**
     * The operating system type required for the run.
     * 
     */
    @InputImport(name="os", required=true)
      private final Input<Either<String,OS>> os;

    public Input<Either<String,OS>> getOs() {
        return this.os;
    }

    /**
     * Variant of the CPU.
     * 
     */
    @InputImport(name="variant")
      private final @Nullable Input<Either<String,Variant>> variant;

    public Input<Either<String,Variant>> getVariant() {
        return this.variant == null ? Input.empty() : this.variant;
    }

    public PlatformPropertiesArgs(
        @Nullable Input<Either<String,Architecture>> architecture,
        Input<Either<String,OS>> os,
        @Nullable Input<Either<String,Variant>> variant) {
        this.architecture = architecture;
        this.os = Objects.requireNonNull(os, "expected parameter 'os' to be non-null");
        this.variant = variant;
    }

    private PlatformPropertiesArgs() {
        this.architecture = Input.empty();
        this.os = Input.empty();
        this.variant = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlatformPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,Architecture>> architecture;
        private Input<Either<String,OS>> os;
        private @Nullable Input<Either<String,Variant>> variant;

        public Builder() {
    	      // Empty
        }

        public Builder(PlatformPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.os = defaults.os;
    	      this.variant = defaults.variant;
        }

        public Builder setArchitecture(@Nullable Input<Either<String,Architecture>> architecture) {
            this.architecture = architecture;
            return this;
        }

        public Builder setArchitecture(@Nullable Either<String,Architecture> architecture) {
            this.architecture = Input.ofNullable(architecture);
            return this;
        }

        public Builder setOs(Input<Either<String,OS>> os) {
            this.os = Objects.requireNonNull(os);
            return this;
        }

        public Builder setOs(Either<String,OS> os) {
            this.os = Input.of(Objects.requireNonNull(os));
            return this;
        }

        public Builder setVariant(@Nullable Input<Either<String,Variant>> variant) {
            this.variant = variant;
            return this;
        }

        public Builder setVariant(@Nullable Either<String,Variant> variant) {
            this.variant = Input.ofNullable(variant);
            return this;
        }
        public PlatformPropertiesArgs build() {
            return new PlatformPropertiesArgs(architecture, os, variant);
        }
    }
}