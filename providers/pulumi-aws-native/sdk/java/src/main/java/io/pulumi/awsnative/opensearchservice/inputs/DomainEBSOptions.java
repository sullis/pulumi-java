// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainEBSOptions extends io.pulumi.resources.InvokeArgs {

    public static final DomainEBSOptions Empty = new DomainEBSOptions();

    @InputImport(name="eBSEnabled")
      private final @Nullable Boolean eBSEnabled;

    public Optional<Boolean> getEBSEnabled() {
        return this.eBSEnabled == null ? Optional.empty() : Optional.ofNullable(this.eBSEnabled);
    }

    @InputImport(name="iops")
      private final @Nullable Integer iops;

    public Optional<Integer> getIops() {
        return this.iops == null ? Optional.empty() : Optional.ofNullable(this.iops);
    }

    @InputImport(name="volumeSize")
      private final @Nullable Integer volumeSize;

    public Optional<Integer> getVolumeSize() {
        return this.volumeSize == null ? Optional.empty() : Optional.ofNullable(this.volumeSize);
    }

    @InputImport(name="volumeType")
      private final @Nullable String volumeType;

    public Optional<String> getVolumeType() {
        return this.volumeType == null ? Optional.empty() : Optional.ofNullable(this.volumeType);
    }

    public DomainEBSOptions(
        @Nullable Boolean eBSEnabled,
        @Nullable Integer iops,
        @Nullable Integer volumeSize,
        @Nullable String volumeType) {
        this.eBSEnabled = eBSEnabled;
        this.iops = iops;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private DomainEBSOptions() {
        this.eBSEnabled = null;
        this.iops = null;
        this.volumeSize = null;
        this.volumeType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEBSOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean eBSEnabled;
        private @Nullable Integer iops;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEBSOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eBSEnabled = defaults.eBSEnabled;
    	      this.iops = defaults.iops;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setEBSEnabled(@Nullable Boolean eBSEnabled) {
            this.eBSEnabled = eBSEnabled;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder setVolumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public DomainEBSOptions build() {
            return new DomainEBSOptions(eBSEnabled, iops, volumeSize, volumeType);
        }
    }
}