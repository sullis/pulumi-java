// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupInsightsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupInsightsConfigurationArgs Empty = new GroupInsightsConfigurationArgs();

    /**
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * 
     */
    @Import(name="insightsEnabled")
      private final @Nullable Output<Boolean> insightsEnabled;

    public Output<Boolean> getInsightsEnabled() {
        return this.insightsEnabled == null ? Output.empty() : this.insightsEnabled;
    }

    /**
     * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on a group with InsightsEnabled set to true.
     * 
     */
    @Import(name="notificationsEnabled")
      private final @Nullable Output<Boolean> notificationsEnabled;

    public Output<Boolean> getNotificationsEnabled() {
        return this.notificationsEnabled == null ? Output.empty() : this.notificationsEnabled;
    }

    public GroupInsightsConfigurationArgs(
        @Nullable Output<Boolean> insightsEnabled,
        @Nullable Output<Boolean> notificationsEnabled) {
        this.insightsEnabled = insightsEnabled;
        this.notificationsEnabled = notificationsEnabled;
    }

    private GroupInsightsConfigurationArgs() {
        this.insightsEnabled = Output.empty();
        this.notificationsEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInsightsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> insightsEnabled;
        private @Nullable Output<Boolean> notificationsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupInsightsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insightsEnabled = defaults.insightsEnabled;
    	      this.notificationsEnabled = defaults.notificationsEnabled;
        }

        public Builder insightsEnabled(@Nullable Output<Boolean> insightsEnabled) {
            this.insightsEnabled = insightsEnabled;
            return this;
        }
        public Builder insightsEnabled(@Nullable Boolean insightsEnabled) {
            this.insightsEnabled = Output.ofNullable(insightsEnabled);
            return this;
        }
        public Builder notificationsEnabled(@Nullable Output<Boolean> notificationsEnabled) {
            this.notificationsEnabled = notificationsEnabled;
            return this;
        }
        public Builder notificationsEnabled(@Nullable Boolean notificationsEnabled) {
            this.notificationsEnabled = Output.ofNullable(notificationsEnabled);
            return this;
        }        public GroupInsightsConfigurationArgs build() {
            return new GroupInsightsConfigurationArgs(insightsEnabled, notificationsEnabled);
        }
    }
}
