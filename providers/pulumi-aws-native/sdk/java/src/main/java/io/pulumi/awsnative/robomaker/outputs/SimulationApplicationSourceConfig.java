// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.outputs;

import io.pulumi.awsnative.robomaker.enums.SimulationApplicationSourceConfigArchitecture;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SimulationApplicationSourceConfig {
    /**
     * The target processor architecture for the application.
     * 
     */
    private final SimulationApplicationSourceConfigArchitecture architecture;
    /**
     * The Amazon S3 bucket name.
     * 
     */
    private final String s3Bucket;
    /**
     * The s3 object key.
     * 
     */
    private final String s3Key;

    @OutputCustomType.Constructor
    private SimulationApplicationSourceConfig(
        @OutputCustomType.Parameter("architecture") SimulationApplicationSourceConfigArchitecture architecture,
        @OutputCustomType.Parameter("s3Bucket") String s3Bucket,
        @OutputCustomType.Parameter("s3Key") String s3Key) {
        this.architecture = architecture;
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
    }

    /**
     * The target processor architecture for the application.
     * 
    */
    public SimulationApplicationSourceConfigArchitecture getArchitecture() {
        return this.architecture;
    }
    /**
     * The Amazon S3 bucket name.
     * 
    */
    public String getS3Bucket() {
        return this.s3Bucket;
    }
    /**
     * The s3 object key.
     * 
    */
    public String getS3Key() {
        return this.s3Key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationSourceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimulationApplicationSourceConfigArchitecture architecture;
        private String s3Bucket;
        private String s3Key;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationSourceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
        }

        public Builder setArchitecture(SimulationApplicationSourceConfigArchitecture architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder setS3Bucket(String s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }

        public Builder setS3Key(String s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key);
            return this;
        }
        public SimulationApplicationSourceConfig build() {
            return new SimulationApplicationSourceConfig(architecture, s3Bucket, s3Key);
        }
    }
}
