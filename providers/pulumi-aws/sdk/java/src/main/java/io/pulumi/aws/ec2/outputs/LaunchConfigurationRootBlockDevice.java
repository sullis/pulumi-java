// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchConfigurationRootBlockDevice {
    private final @Nullable Boolean deleteOnTermination;
    private final @Nullable Boolean encrypted;
    private final @Nullable Integer iops;
    private final @Nullable Integer throughput;
    private final @Nullable Integer volumeSize;
    private final @Nullable String volumeType;

    @CustomType.Constructor
    private LaunchConfigurationRootBlockDevice(
        @CustomType.Parameter("deleteOnTermination") @Nullable Boolean deleteOnTermination,
        @CustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @CustomType.Parameter("iops") @Nullable Integer iops,
        @CustomType.Parameter("throughput") @Nullable Integer throughput,
        @CustomType.Parameter("volumeSize") @Nullable Integer volumeSize,
        @CustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }
    public Optional<Integer> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }        public LaunchConfigurationRootBlockDevice build() {
            return new LaunchConfigurationRootBlockDevice(deleteOnTermination, encrypted, iops, throughput, volumeSize, volumeType);
        }
    }
}
