// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContactChannelTargetInfo {
    /**
     * The Amazon Resource Name (ARN) of the contact channel.
     * 
     */
    private final String channelId;
    /**
     * The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
     * 
     */
    private final Integer retryIntervalInMinutes;

    @OutputCustomType.Constructor({"channelId","retryIntervalInMinutes"})
    private ContactChannelTargetInfo(
        String channelId,
        Integer retryIntervalInMinutes) {
        this.channelId = Objects.requireNonNull(channelId);
        this.retryIntervalInMinutes = Objects.requireNonNull(retryIntervalInMinutes);
    }

    /**
     * The Amazon Resource Name (ARN) of the contact channel.
     * 
     */
    public String getChannelId() {
        return this.channelId;
    }
    /**
     * The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
     * 
     */
    public Integer getRetryIntervalInMinutes() {
        return this.retryIntervalInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactChannelTargetInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelId;
        private Integer retryIntervalInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactChannelTargetInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelId = defaults.channelId;
    	      this.retryIntervalInMinutes = defaults.retryIntervalInMinutes;
        }

        public Builder setChannelId(String channelId) {
            this.channelId = Objects.requireNonNull(channelId);
            return this;
        }

        public Builder setRetryIntervalInMinutes(Integer retryIntervalInMinutes) {
            this.retryIntervalInMinutes = Objects.requireNonNull(retryIntervalInMinutes);
            return this;
        }

        public ContactChannelTargetInfo build() {
            return new ContactChannelTargetInfo(channelId, retryIntervalInMinutes);
        }
    }
}
