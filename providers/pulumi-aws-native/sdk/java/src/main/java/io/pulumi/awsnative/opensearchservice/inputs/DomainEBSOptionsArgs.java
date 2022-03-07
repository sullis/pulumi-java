// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainEBSOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainEBSOptionsArgs Empty = new DomainEBSOptionsArgs();

    @InputImport(name="eBSEnabled")
      private final @Nullable Input<Boolean> eBSEnabled;

    public Input<Boolean> getEBSEnabled() {
        return this.eBSEnabled == null ? Input.empty() : this.eBSEnabled;
    }

    @InputImport(name="iops")
      private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    @InputImport(name="volumeSize")
      private final @Nullable Input<Integer> volumeSize;

    public Input<Integer> getVolumeSize() {
        return this.volumeSize == null ? Input.empty() : this.volumeSize;
    }

    @InputImport(name="volumeType")
      private final @Nullable Input<String> volumeType;

    public Input<String> getVolumeType() {
        return this.volumeType == null ? Input.empty() : this.volumeType;
    }

    public DomainEBSOptionsArgs(
        @Nullable Input<Boolean> eBSEnabled,
        @Nullable Input<Integer> iops,
        @Nullable Input<Integer> volumeSize,
        @Nullable Input<String> volumeType) {
        this.eBSEnabled = eBSEnabled;
        this.iops = iops;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private DomainEBSOptionsArgs() {
        this.eBSEnabled = Input.empty();
        this.iops = Input.empty();
        this.volumeSize = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEBSOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> eBSEnabled;
        private @Nullable Input<Integer> iops;
        private @Nullable Input<Integer> volumeSize;
        private @Nullable Input<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEBSOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eBSEnabled = defaults.eBSEnabled;
    	      this.iops = defaults.iops;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setEBSEnabled(@Nullable Input<Boolean> eBSEnabled) {
            this.eBSEnabled = eBSEnabled;
            return this;
        }

        public Builder setEBSEnabled(@Nullable Boolean eBSEnabled) {
            this.eBSEnabled = Input.ofNullable(eBSEnabled);
            return this;
        }

        public Builder setIops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
            return this;
        }

        public Builder setVolumeSize(@Nullable Input<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder setVolumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Input.ofNullable(volumeSize);
            return this;
        }

        public Builder setVolumeType(@Nullable Input<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = Input.ofNullable(volumeType);
            return this;
        }
        public DomainEBSOptionsArgs build() {
            return new DomainEBSOptionsArgs(eBSEnabled, iops, volumeSize, volumeType);
        }
    }
}