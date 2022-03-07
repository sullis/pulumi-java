// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventStreamState extends io.pulumi.resources.ResourceArgs {

    public static final EventStreamState Empty = new EventStreamState();

    /**
     * The application ID.
     * 
     */
    @InputImport(name="applicationId")
      private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
     * 
     */
    @InputImport(name="destinationStreamArn")
      private final @Nullable Input<String> destinationStreamArn;

    public Input<String> getDestinationStreamArn() {
        return this.destinationStreamArn == null ? Input.empty() : this.destinationStreamArn;
    }

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     * 
     */
    @InputImport(name="roleArn")
      private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    public EventStreamState(
        @Nullable Input<String> applicationId,
        @Nullable Input<String> destinationStreamArn,
        @Nullable Input<String> roleArn) {
        this.applicationId = applicationId;
        this.destinationStreamArn = destinationStreamArn;
        this.roleArn = roleArn;
    }

    private EventStreamState() {
        this.applicationId = Input.empty();
        this.destinationStreamArn = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> destinationStreamArn;
        private @Nullable Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventStreamState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.destinationStreamArn = defaults.destinationStreamArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder setDestinationStreamArn(@Nullable Input<String> destinationStreamArn) {
            this.destinationStreamArn = destinationStreamArn;
            return this;
        }

        public Builder setDestinationStreamArn(@Nullable String destinationStreamArn) {
            this.destinationStreamArn = Input.ofNullable(destinationStreamArn);
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }
        public EventStreamState build() {
            return new EventStreamState(applicationId, destinationStreamArn, roleArn);
        }
    }
}