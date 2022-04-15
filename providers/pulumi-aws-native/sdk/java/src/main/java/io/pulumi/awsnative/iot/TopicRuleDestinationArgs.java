// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.TopicRuleDestinationStatus;
import io.pulumi.awsnative.iot.inputs.TopicRuleDestinationHttpUrlDestinationSummaryArgs;
import io.pulumi.awsnative.iot.inputs.TopicRuleDestinationVpcDestinationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleDestinationArgs Empty = new TopicRuleDestinationArgs();

    /**
     * HTTP URL destination properties.
     * 
     */
    @Import(name="httpUrlProperties")
      private final @Nullable Output<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties;

    public Output<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties() {
        return this.httpUrlProperties == null ? Codegen.empty() : this.httpUrlProperties;
    }

    /**
     * The status of the TopicRuleDestination.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<TopicRuleDestinationStatus> status;

    public Output<TopicRuleDestinationStatus> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * VPC destination properties.
     * 
     */
    @Import(name="vpcProperties")
      private final @Nullable Output<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties;

    public Output<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties() {
        return this.vpcProperties == null ? Codegen.empty() : this.vpcProperties;
    }

    public TopicRuleDestinationArgs(
        @Nullable Output<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties,
        @Nullable Output<TopicRuleDestinationStatus> status,
        @Nullable Output<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties) {
        this.httpUrlProperties = httpUrlProperties;
        this.status = status;
        this.vpcProperties = vpcProperties;
    }

    private TopicRuleDestinationArgs() {
        this.httpUrlProperties = Codegen.empty();
        this.status = Codegen.empty();
        this.vpcProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties;
        private @Nullable Output<TopicRuleDestinationStatus> status;
        private @Nullable Output<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpUrlProperties = defaults.httpUrlProperties;
    	      this.status = defaults.status;
    	      this.vpcProperties = defaults.vpcProperties;
        }

        public Builder httpUrlProperties(@Nullable Output<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties) {
            this.httpUrlProperties = httpUrlProperties;
            return this;
        }
        public Builder httpUrlProperties(@Nullable TopicRuleDestinationHttpUrlDestinationSummaryArgs httpUrlProperties) {
            this.httpUrlProperties = Codegen.ofNullable(httpUrlProperties);
            return this;
        }
        public Builder status(@Nullable Output<TopicRuleDestinationStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable TopicRuleDestinationStatus status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder vpcProperties(@Nullable Output<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties) {
            this.vpcProperties = vpcProperties;
            return this;
        }
        public Builder vpcProperties(@Nullable TopicRuleDestinationVpcDestinationPropertiesArgs vpcProperties) {
            this.vpcProperties = Codegen.ofNullable(vpcProperties);
            return this;
        }        public TopicRuleDestinationArgs build() {
            return new TopicRuleDestinationArgs(httpUrlProperties, status, vpcProperties);
        }
    }
}
