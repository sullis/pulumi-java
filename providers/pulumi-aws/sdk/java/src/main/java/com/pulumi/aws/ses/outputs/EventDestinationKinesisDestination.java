// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventDestinationKinesisDestination {
    /**
     * @return The ARN of the role that has permissions to access the Kinesis Stream
     * 
     */
    private final String roleArn;
    /**
     * @return The ARN of the Kinesis Stream
     * 
     */
    private final String streamArn;

    @CustomType.Constructor
    private EventDestinationKinesisDestination(
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("streamArn") String streamArn) {
        this.roleArn = roleArn;
        this.streamArn = streamArn;
    }

    /**
     * @return The ARN of the role that has permissions to access the Kinesis Stream
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The ARN of the Kinesis Stream
     * 
     */
    public String streamArn() {
        return this.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationKinesisDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private String streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventDestinationKinesisDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder streamArn(String streamArn) {
            this.streamArn = Objects.requireNonNull(streamArn);
            return this;
        }        public EventDestinationKinesisDestination build() {
            return new EventDestinationKinesisDestination(roleArn, streamArn);
        }
    }
}
