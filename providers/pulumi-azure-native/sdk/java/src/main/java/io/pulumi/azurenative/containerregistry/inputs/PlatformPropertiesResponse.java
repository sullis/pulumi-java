// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The platform properties against which the run has to happen.
 * 
 */
public final class PlatformPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PlatformPropertiesResponse Empty = new PlatformPropertiesResponse();

    /**
     * The OS architecture.
     * 
     */
    @InputImport(name="architecture")
    private final @Nullable String architecture;

    public Optional<String> getArchitecture() {
        return this.architecture == null ? Optional.empty() : Optional.ofNullable(this.architecture);
    }

    /**
     * The operating system type required for the run.
     * 
     */
    @InputImport(name="os", required=true)
    private final String os;

    public String getOs() {
        return this.os;
    }

    /**
     * Variant of the CPU.
     * 
     */
    @InputImport(name="variant")
    private final @Nullable String variant;

    public Optional<String> getVariant() {
        return this.variant == null ? Optional.empty() : Optional.ofNullable(this.variant);
    }

    public PlatformPropertiesResponse(
        @Nullable String architecture,
        String os,
        @Nullable String variant) {
        this.architecture = architecture;
        this.os = Objects.requireNonNull(os, "expected parameter 'os' to be non-null");
        this.variant = variant;
    }

    private PlatformPropertiesResponse() {
        this.architecture = null;
        this.os = null;
        this.variant = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlatformPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String architecture;
        private String os;
        private @Nullable String variant;

        public Builder() {
    	      // Empty
        }

        public Builder(PlatformPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.os = defaults.os;
    	      this.variant = defaults.variant;
        }

        public Builder setArchitecture(@Nullable String architecture) {
            this.architecture = architecture;
            return this;
        }

        public Builder setOs(String os) {
            this.os = Objects.requireNonNull(os);
            return this;
        }

        public Builder setVariant(@Nullable String variant) {
            this.variant = variant;
            return this;
        }

        public PlatformPropertiesResponse build() {
            return new PlatformPropertiesResponse(architecture, os, variant);
        }
    }
}
