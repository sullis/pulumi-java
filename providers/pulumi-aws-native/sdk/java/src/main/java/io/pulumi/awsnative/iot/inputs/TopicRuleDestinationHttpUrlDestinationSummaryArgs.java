// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleDestinationHttpUrlDestinationSummaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleDestinationHttpUrlDestinationSummaryArgs Empty = new TopicRuleDestinationHttpUrlDestinationSummaryArgs();

    @InputImport(name="confirmationUrl")
    private final @Nullable Input<String> confirmationUrl;

    public Input<String> getConfirmationUrl() {
        return this.confirmationUrl == null ? Input.empty() : this.confirmationUrl;
    }

    public TopicRuleDestinationHttpUrlDestinationSummaryArgs(@Nullable Input<String> confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
    }

    private TopicRuleDestinationHttpUrlDestinationSummaryArgs() {
        this.confirmationUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDestinationHttpUrlDestinationSummaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> confirmationUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDestinationHttpUrlDestinationSummaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confirmationUrl = defaults.confirmationUrl;
        }

        public Builder setConfirmationUrl(@Nullable Input<String> confirmationUrl) {
            this.confirmationUrl = confirmationUrl;
            return this;
        }

        public Builder setConfirmationUrl(@Nullable String confirmationUrl) {
            this.confirmationUrl = Input.ofNullable(confirmationUrl);
            return this;
        }

        public TopicRuleDestinationHttpUrlDestinationSummaryArgs build() {
            return new TopicRuleDestinationHttpUrlDestinationSummaryArgs(confirmationUrl);
        }
    }
}
