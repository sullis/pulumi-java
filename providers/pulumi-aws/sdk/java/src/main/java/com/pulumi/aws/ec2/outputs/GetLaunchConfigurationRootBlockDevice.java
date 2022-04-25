// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchConfigurationRootBlockDevice {
    /**
     * @return Whether the EBS Volume will be deleted on instance termination.
     * 
     */
    private final Boolean deleteOnTermination;
    /**
     * @return Whether the volume is Encrypted.
     * 
     */
    private final Boolean encrypted;
    /**
     * @return The provisioned IOPs of the volume.
     * 
     */
    private final Integer iops;
    /**
     * @return The Throughput of the volume.
     * 
     */
    private final Boolean throughput;
    /**
     * @return The Size of the volume.
     * 
     */
    private final Integer volumeSize;
    /**
     * @return The Type of the volume.
     * 
     */
    private final String volumeType;

    @CustomType.Constructor
    private GetLaunchConfigurationRootBlockDevice(
        @CustomType.Parameter("deleteOnTermination") Boolean deleteOnTermination,
        @CustomType.Parameter("encrypted") Boolean encrypted,
        @CustomType.Parameter("iops") Integer iops,
        @CustomType.Parameter("throughput") Boolean throughput,
        @CustomType.Parameter("volumeSize") Integer volumeSize,
        @CustomType.Parameter("volumeType") String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * @return Whether the EBS Volume will be deleted on instance termination.
     * 
     */
    public Boolean deleteOnTermination() {
        return this.deleteOnTermination;
    }
    /**
     * @return Whether the volume is Encrypted.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * @return The provisioned IOPs of the volume.
     * 
     */
    public Integer iops() {
        return this.iops;
    }
    /**
     * @return The Throughput of the volume.
     * 
     */
    public Boolean throughput() {
        return this.throughput;
    }
    /**
     * @return The Size of the volume.
     * 
     */
    public Integer volumeSize() {
        return this.volumeSize;
    }
    /**
     * @return The Type of the volume.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteOnTermination;
        private Boolean encrypted;
        private Integer iops;
        private Boolean throughput;
        private Integer volumeSize;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
            return this;
        }
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        public Builder throughput(Boolean throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }
        public Builder volumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }        public GetLaunchConfigurationRootBlockDevice build() {
            return new GetLaunchConfigurationRootBlockDevice(deleteOnTermination, encrypted, iops, throughput, volumeSize, volumeType);
        }
    }
}
