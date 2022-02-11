// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.TopicRuleDestinationStatus;
import io.pulumi.awsnative.iot.inputs.TopicRuleDestinationHttpUrlDestinationSummaryArgs;
import io.pulumi.awsnative.iot.inputs.TopicRuleDestinationVpcDestinationPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleDestinationArgs Empty = new TopicRuleDestinationArgs();

    @InputImport(name="httpUrlProperties")
    private final @Nullable Input<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties;

    public Input<TopicRuleDestinationHttpUrlDestinationSummaryArgs> getHttpUrlProperties() {
        return this.httpUrlProperties == null ? Input.empty() : this.httpUrlProperties;
    }

    @InputImport(name="status")
    private final @Nullable Input<TopicRuleDestinationStatus> status;

    public Input<TopicRuleDestinationStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="vpcProperties")
    private final @Nullable Input<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties;

    public Input<TopicRuleDestinationVpcDestinationPropertiesArgs> getVpcProperties() {
        return this.vpcProperties == null ? Input.empty() : this.vpcProperties;
    }

    public TopicRuleDestinationArgs(
        @Nullable Input<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties,
        @Nullable Input<TopicRuleDestinationStatus> status,
        @Nullable Input<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties) {
        this.httpUrlProperties = httpUrlProperties;
        this.status = status;
        this.vpcProperties = vpcProperties;
    }

    private TopicRuleDestinationArgs() {
        this.httpUrlProperties = Input.empty();
        this.status = Input.empty();
        this.vpcProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties;
        private @Nullable Input<TopicRuleDestinationStatus> status;
        private @Nullable Input<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpUrlProperties = defaults.httpUrlProperties;
    	      this.status = defaults.status;
    	      this.vpcProperties = defaults.vpcProperties;
        }

        public Builder setHttpUrlProperties(@Nullable Input<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties) {
            this.httpUrlProperties = httpUrlProperties;
            return this;
        }

        public Builder setHttpUrlProperties(@Nullable TopicRuleDestinationHttpUrlDestinationSummaryArgs httpUrlProperties) {
            this.httpUrlProperties = Input.ofNullable(httpUrlProperties);
            return this;
        }

        public Builder setStatus(@Nullable Input<TopicRuleDestinationStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable TopicRuleDestinationStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setVpcProperties(@Nullable Input<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties) {
            this.vpcProperties = vpcProperties;
            return this;
        }

        public Builder setVpcProperties(@Nullable TopicRuleDestinationVpcDestinationPropertiesArgs vpcProperties) {
            this.vpcProperties = Input.ofNullable(vpcProperties);
            return this;
        }

        public TopicRuleDestinationArgs build() {
            return new TopicRuleDestinationArgs(httpUrlProperties, status, vpcProperties);
        }
    }
}
