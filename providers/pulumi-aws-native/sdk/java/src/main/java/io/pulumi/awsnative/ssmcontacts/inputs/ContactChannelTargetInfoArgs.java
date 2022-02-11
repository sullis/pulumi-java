// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ContactChannelTargetInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactChannelTargetInfoArgs Empty = new ContactChannelTargetInfoArgs();

    @InputImport(name="channelId", required=true)
    private final Input<String> channelId;

    public Input<String> getChannelId() {
        return this.channelId;
    }

    @InputImport(name="retryIntervalInMinutes", required=true)
    private final Input<Integer> retryIntervalInMinutes;

    public Input<Integer> getRetryIntervalInMinutes() {
        return this.retryIntervalInMinutes;
    }

    public ContactChannelTargetInfoArgs(
        Input<String> channelId,
        Input<Integer> retryIntervalInMinutes) {
        this.channelId = Objects.requireNonNull(channelId, "expected parameter 'channelId' to be non-null");
        this.retryIntervalInMinutes = Objects.requireNonNull(retryIntervalInMinutes, "expected parameter 'retryIntervalInMinutes' to be non-null");
    }

    private ContactChannelTargetInfoArgs() {
        this.channelId = Input.empty();
        this.retryIntervalInMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactChannelTargetInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> channelId;
        private Input<Integer> retryIntervalInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactChannelTargetInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelId = defaults.channelId;
    	      this.retryIntervalInMinutes = defaults.retryIntervalInMinutes;
        }

        public Builder setChannelId(Input<String> channelId) {
            this.channelId = Objects.requireNonNull(channelId);
            return this;
        }

        public Builder setChannelId(String channelId) {
            this.channelId = Input.of(Objects.requireNonNull(channelId));
            return this;
        }

        public Builder setRetryIntervalInMinutes(Input<Integer> retryIntervalInMinutes) {
            this.retryIntervalInMinutes = Objects.requireNonNull(retryIntervalInMinutes);
            return this;
        }

        public Builder setRetryIntervalInMinutes(Integer retryIntervalInMinutes) {
            this.retryIntervalInMinutes = Input.of(Objects.requireNonNull(retryIntervalInMinutes));
            return this;
        }

        public ContactChannelTargetInfoArgs build() {
            return new ContactChannelTargetInfoArgs(channelId, retryIntervalInMinutes);
        }
    }
}
