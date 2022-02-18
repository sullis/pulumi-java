// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelLogConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelLogConfigurationArgs Empty = new ChannelLogConfigurationArgs();

    /**
     * Sets a custom AWS CloudWatch log group name for access logs. If a log group name isn't specified, the defaults are used: /aws/MediaPackage/EgressAccessLogs for egress access logs and /aws/MediaPackage/IngressAccessLogs for ingress access logs.
     * 
     */
    @InputImport(name="logGroupName")
    private final @Nullable Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName == null ? Input.empty() : this.logGroupName;
    }

    public ChannelLogConfigurationArgs(@Nullable Input<String> logGroupName) {
        this.logGroupName = logGroupName;
    }

    private ChannelLogConfigurationArgs() {
        this.logGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> logGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelLogConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
        }

        public Builder setLogGroupName(@Nullable Input<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = Input.ofNullable(logGroupName);
            return this;
        }

        public ChannelLogConfigurationArgs build() {
            return new ChannelLogConfigurationArgs(logGroupName);
        }
    }
}
